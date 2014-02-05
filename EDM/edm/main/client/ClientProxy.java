package EDM.edm.main.client;

import net.minecraft.block.Block;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.LanguageRegistry;
import EDM.edm.main.EDMCore;
import EDM.edm.main.api.BTMAPI;
import EDM.edm.main.api.ItemAPI;
import EDM.edm.main.creativetabs.MainTab;
import EDM.edm.main.handler.ArmorHandler;
import EDM.edm.main.handler.BlockHandler;
import EDM.edm.main.handler.ItemHandler;
import EDM.edm.main.handler.OreHandler;
import EDM.edm.main.handler.ToolHandler;
import EDM.edm.main.handler.WorldGenHandler;
import EDM.edm.main.api.ArmorMaterialAPI;
public class ClientProxy 
{
	

	
	public static void Load()
	{
		EDMCore.tabEDMBlocks = new MainTab("EDM:Blocks");
		
		ClientProxy.HandleArmorMaterials();
		ClientProxy.HandleBlock();
		ClientProxy.HandleItem();
		ClientProxy.HandleAddons();
		ClientProxy.HandleTools();
		ClientProxy.HandleArmor();
		ClientProxy.HandleOres();
		ClientProxy.HandleWorldGen();
		
		LanguageRegistry.instance().addStringLocalization("itemGroup.EDM:Blocks", "EDM:Blocks");
		
	}
	public static void HandleArmorMaterials()
	{
		ArmorMaterialAPI.Black_Diamonds = EnumHelper.addArmorMaterial("Black", 30,new int[] { 1, 6, 4, 1 }, 10);
		 ArmorMaterialAPI.Blue_Diamonds = EnumHelper.addArmorMaterial("Blue", 35, new int[] { 3, 8, 6, 3 }, 15);
		 ArmorMaterialAPI.Gray_Diamonds = EnumHelper.addArmorMaterial("Gray", 40, new int[] { 5, 10,8, 5 }, 20);
		ArmorMaterialAPI.Green_Diamonds= EnumHelper.addArmorMaterial("Green", 45, new int[] { 7, 12,10,7 }, 25);

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
	//TODO find use
	/*public static void HandleBTM()
	{
		if(ClientProxy.HandleAddons()== true)
		{
		        BTMAPI.addRecipe(new ItemStack(Block.bedrock, 2), new Object[] {"X", "X", "X", "X", ('X'), Block.cobblestone});
		}
		else
		{
		        System.out.println("This mod requires BetterWorkbench.");
		}
	}*/
	public static void HandleWorldGen()
	{
		WorldGenHandler.GenRegister();
	}
	
	public static void HandleTools()
	{
		ToolHandler.handleTools();
	}
	
	public static void HandleArmor()
	{
		ArmorMaterialAPI.Black_Diamonds.customCraftingMaterial = ItemAPI.Black;
		  //registering 
		ArmorHandler.RegisterArmor();
		ArmorHandler.ArmorToGame();
	}
	
	public static void HandleOres()
	{
		OreHandler.RegisterOres();
		OreHandler.OresToGame();
	}
}
