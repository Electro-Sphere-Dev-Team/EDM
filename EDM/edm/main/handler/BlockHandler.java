package EDM.edm.main.handler;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import EDM.edm.main.EDMCore;
import EDM.edm.main.api.BlockAPI;
import EDM.edm.main.block.*;
import static EDM.edm.main.api.BlockAPI.*;
import cpw.mods.fml.common.registry.*;

public class BlockHandler {
	
	 
	
	public static void RegisterBlocks()
	{
		 Black_B = new Block_Black().setUnlocalizedName("Black_diamond_Block").setHardness(2.0F).setResistance(5.0F).setCreativeTab(EDMCore.tabEDMBlocks).setLightValue(4.0F).setTextureName("mod_beta:"+ "Black_diamond_Block");
		 
		 Blue_B = new Block_Blue().setUnlocalizedName("Blue_diamond_Block").setHardness(2.0F).setResistance(5.0F).setCreativeTab(EDMCore.tabEDMBlocks).setTextureName("mod_beta:"+ "Blue_diamond_Block");;
		 
		 Gold_B= new Block_Gold().setUnlocalizedName("Gold_diamond_Block").setHardness(2.0F).setResistance(5.0F).setCreativeTab(EDMCore.tabEDMBlocks).setTextureName("mod_beta:"+ "Gold_diamond_Block");
		 
		 Gray_B= new Block_Gray(4053, Material.rock).setUnlocalizedName("Gray_diamond_Block").setHardness(2.0F).setResistance(5.0F).setCreativeTab(EDMCore.tabEDMBlocks).setTextureName("mod_beta:"+ "Gray_diamond_Block");
		 
		 Green_B= new Block_Green(4054, Material.rock).setUnlocalizedName("Green_diamond_Block").setHardness(2.0F).setResistance(5.0F).setCreativeTab(EDMCore.tabEDMBlocks).setTextureName("mod_beta:"+ "Green_diamond_Block");
		 
		 Orange_B= new BlockBase(4055, Material.rock).setUnlocalizedName("Orange_diamond_Block").setHardness(2.0F).setResistance(5.0F).setCreativeTab(EDMCore.tabEDMBlocks).setTextureName("mod_beta:"+ "Orange_diamond_Block");
		 
		 Pink_B= new BlockBase(4056, Material.rock).setUnlocalizedName("Pink_diamond_Block").setHardness(2.0F).setResistance(5.0F).setCreativeTab(EDMCore.tabEDMBlocks).setTextureName("mod_beta:"+ "Pink_diamond_Block");
		 
		 Purple_B= new BlockBase(4057, Material.rock).setUnlocalizedName("Purple_diamond_Block").setHardness(2.0F).setResistance(5.0F).setCreativeTab(EDMCore.tabEDMBlocks).setTextureName("mod_beta:"+ "Purple_diamond_Block");
		 
		 Red_B= new BlockBase(4058, Material.rock).setUnlocalizedName("Red_diamond_Block").setHardness(2.0F).setResistance(5.0F).setCreativeTab(EDMCore.tabEDMBlocks).setTextureName("mod_beta:"+ "Red_diamond_Block");
		 
		 White_B= new BlockBase(4059, Material.rock).setUnlocalizedName("White_diamond_Block").setHardness(2.0F).setResistance(5.0F).setCreativeTab(EDMCore.tabEDMBlocks).setTextureName("mod_beta:"+ "White_diamond_Block");
		 
		 Yellow_B= new BlockBase(4060, Material.rock).setUnlocalizedName("Yellow_diamond_Block").setHardness(2.0F).setResistance(5.0F).setCreativeTab(EDMCore.tabEDMBlocks).setTextureName("mod_beta:"+ "Yellow_diamond_Block");
	}
	
	public static void BlockToGame()
	{
		/*
		GameRegistry.registerBlock(Black_B, "Black_diamond_Block");
		LanguageRegistry.addName(Black_B, "Black Diamond Block");
		
		GameRegistry.registerBlock(Blue_B, "Blue_diamond_Block");
		LanguageRegistry.addName(Blue_B, "Blue Diamond Block");
		
		GameRegistry.registerBlock(Gold_B, "Gold_diamond_Block");
		LanguageRegistry.addName(Gold_B, "Gold Diamond Block");
		
		GameRegistry.registerBlock(Gray_B, "Gray_diamond_Block");
		LanguageRegistry.addName(Gray_B, "Gray Diamond Block");
		
		GameRegistry.registerBlock(Green_B, "Green_diamond_Block");
		LanguageRegistry.addName(Green_B, "Green Diamond Block");
		
		GameRegistry.registerBlock(Orange_B, "Orange_diamond_Block");
		LanguageRegistry.addName(Orange_B, "Orange Diamond Block");
		
		GameRegistry.registerBlock(Pink_B, "Pink_diamond_Block");
		LanguageRegistry.addName(Pink_B, "Pink Diamond Block");
		
		GameRegistry.registerBlock(Purple_B, "Purple_diamond_Block");
		LanguageRegistry.addName(Purple_B, "Purple Diamond Block");
		
		GameRegistry.registerBlock(Red_B, "Red_diamond_Block");
		LanguageRegistry.addName(Red_B, "Red Diamond Block");
		
		GameRegistry.registerBlock(White_B, "White_diamond_Block");
		LanguageRegistry.addName(White_B, "White Diamond Block");
		
		GameRegistry.registerBlock(Yellow_B, "Yellow_diamond_Block1");
		LanguageRegistry.addName(Yellow_B, "Yellow Diamond Block");
	*/	
	}
}
