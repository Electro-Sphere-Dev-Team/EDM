package EDM.edm.main.client;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Loader;
import EDM.edm.main.api.BTMAPI;
import EDM.edm.main.handler.BlockHandler;
import EDM.edm.main.handler.ItemHandler;
import EDM.edm.main.handler.ToolHandler;

public class ClientProxy 
{

	public static void Load()
	{
		ClientProxy.HandleBlock();
		ClientProxy.HandleItem();
		ClientProxy.HandleAddons();
		ClientProxy.HandleTools();
		
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
}
