package EDM.edm.main.client;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.LanguageRegistry;
import EDM.edm.main.EDMCore;
import EDM.edm.main.api.BTMAPI;
import EDM.edm.main.creativetabs.MainTab;
import EDM.edm.main.handler.ArmorHandler;
import EDM.edm.main.handler.BlockHandler;
import EDM.edm.main.handler.ItemHandler;
import EDM.edm.main.handler.ToolHandler;

public class ClientProxy 
{

	public static void Load()
	{
		EDMCore.tabEDMBlocks = new MainTab("EDM:Blocks");
		
		ClientProxy.HandleBlock();
		ClientProxy.HandleItem();
		ClientProxy.HandleAddons();
		ClientProxy.HandleTools();
		ClientProxy.HandleArmor();
		
		LanguageRegistry.instance().addStringLocalization("itemGroup.EDM:Blocks", "EDM:Blocks");
		
	}
	public static boolean HandleAddons()
	{
		if(Loader.isModLoaded("BetterTable")) return true; else return false;
	}
	
	public static void HandleBlock()
	{
		BlockHandler.RegisterBlocks();
		BlockHandler.BlockToGame();
	}
	
	public static void HandleItem()
	{
		ItemHandler.RegisterItems();
		ItemHandler.ItemToGame();
	}
	
	public static void HandleBTM()
	{
		if(ClientProxy.HandleAddons()== true)
		{
		        BTMAPI.addRecipe(new ItemStack(Block.bedrock, 2), new Object[] {"X", "X", "X", "X", ('X'), Block.cobblestone});
		}
		else
		{
		        System.out.println("This mod requires BetterWorkbench.");
		}
	}
	
	public static void HandleTools()
	{
		ToolHandler.handleTools();
	}
	public static void HandleArmor()
	{
		ArmorHandler.RegisterArmor();
		ArmorHandler.ArmorToGame();
	}
}
