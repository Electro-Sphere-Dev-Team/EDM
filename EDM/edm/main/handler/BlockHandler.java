package EDM.edm.main.handler;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import EDM.edm.main.block.*;
import cpw.mods.fml.common.registry.*;

public class BlockHandler {
	
	public static final Block Black_B = new Block_Black(4050, Material.rock).setUnlocalizedName("Black_diamond_Block").setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setTextureName("mod_beta:"+ "Black_diamond_Block");;
	public static final Block Blue_B = new Block_Blue(4051, Material.rock).setUnlocalizedName("Blue_diamond_Block").setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setTextureName("mod_beta:"+ "Blue_diamond_Block");;
	public static final Block Gold_B= new Block_Gold(4052, Material.rock).setUnlocalizedName("Gold_diamond_Block").setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setTextureName("mod_beta:"+ "Gold_diamond_Block");
	public static final Block Gray_B= new Block_Gray(4053, Material.rock).setUnlocalizedName("Gray_diamond_Block").setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setTextureName("mod_beta:"+ "Gray_diamond_Block");
	public static final Block Green_B= new Block_Green(4054, Material.rock).setUnlocalizedName("Green_diamond_Block").setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setTextureName("mod_beta:"+ "Green_diamond_Block");
	public static final Block Orange_B= new BlockBase(4055, Material.rock).setUnlocalizedName("Orange_diamond_Block").setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setTextureName("mod_beta:"+ "Orange_diamond_Block");
	public static final Block Pink_B= new BlockBase(4056, Material.rock).setUnlocalizedName("Pink_diamond_Block").setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setTextureName("mod_beta:"+ "Pink_diamond_Block");
	public static final Block Purple_B= new BlockBase(4057, Material.rock).setUnlocalizedName("Purple_diamond_Block").setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setTextureName("mod_beta:"+ "Purple_diamond_Block");
	public static final Block Red_B= new BlockBase(4058, Material.rock).setUnlocalizedName("Red_diamond_Block").setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setTextureName("mod_beta:"+ "Red_diamond_Block");
	public static final Block White_B= new BlockBase(4059, Material.rock).setUnlocalizedName("White_diamond_Block").setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setTextureName("mod_beta:"+ "White_diamond_Block");
	public static final Block Yellow_B= new BlockBase(4060, Material.rock).setUnlocalizedName("Yellow_diamond_Block").setHardness(2.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock).setTextureName("mod_beta:"+ "Yellow_diamond_Block");
	
	public static void RegisterBlocks()
	{
		
	}
	public static void BlockToGame()
	{
		GameRegistry.registerBlock(BlockHandler.Black_B, "Black_diamond_Block");
		LanguageRegistry.addName(Black_B, "Black Diamond Block");
		
		GameRegistry.registerBlock(BlockHandler.Blue_B, "Blue_diamond_Block");
		LanguageRegistry.addName(BlockHandler.Blue_B, "Blue Diamond Block");
		
		GameRegistry.registerBlock(BlockHandler.Gold_B, "Gold_diamond_Block");
		LanguageRegistry.addName(BlockHandler.Gold_B, "Gold Diamond Block");
		
		GameRegistry.registerBlock(BlockHandler.Gray_B, "Gray_diamond_Block");
		LanguageRegistry.addName(BlockHandler.Gray_B, "Gray Diamond Block");
		
		GameRegistry.registerBlock(BlockHandler.Green_B, "Green_diamond_Block");
		LanguageRegistry.addName(BlockHandler.Green_B, "Green Diamond Block");
		
		GameRegistry.registerBlock(BlockHandler.Orange_B, "Orange_diamond_Block");
		LanguageRegistry.addName(BlockHandler.Orange_B, "Orange Diamond Block");
		
		GameRegistry.registerBlock(BlockHandler.Pink_B, "Pink_diamond_Block");
		LanguageRegistry.addName(BlockHandler.Pink_B, "Pink Diamond Block");
		
		GameRegistry.registerBlock(BlockHandler.Purple_B, "Purple_diamond_Block");
		LanguageRegistry.addName(BlockHandler.Purple_B, "Purple Diamond Block");
		
		GameRegistry.registerBlock(BlockHandler.Red_B, "Red_diamond_Block");
		LanguageRegistry.addName(BlockHandler.Red_B, "Red Diamond Block");
		
		GameRegistry.registerBlock(BlockHandler.White_B, "White_diamond_Block");
		LanguageRegistry.addName(BlockHandler.White_B, "White Diamond Block");
		
		GameRegistry.registerBlock(BlockHandler.Yellow_B, "Yellow_diamond_Block1");
		LanguageRegistry.addName(BlockHandler.Yellow_B, "Yellow Diamond Block");
		
	}
}
