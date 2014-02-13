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
		 new BlockBase(4050, "Black_diamond_Block").setHardness(2.0F).setResistance(5.0F);
		 new BlockBase(4051, "Blue_diamond_Block").setHardness(2.0F).setResistance(5.0F);
		 new BlockBase(4052, "Gold_diamond_Block").setHardness(2.0F).setResistance(5.0F);
		 new BlockBase(4053, "Gray_diamond_Block").setHardness(2.0F).setResistance(5.0F);
		 new BlockBase(4054, "Green_diamond_Block").setHardness(2.0F).setResistance(5.0F);
		 new BlockBase(4055, "Orange_diamond_Block").setHardness(2.0F).setResistance(5.0F);
		 new BlockBase(4056, "Pink_diamond_Block").setHardness(2.0F).setResistance(5.0F);
		 new BlockBase(4057, "Purple_diamond_Block").setHardness(2.0F).setResistance(5.0F);
		 new BlockBase(4058, "White_diamond_Block").setHardness(2.0F).setResistance(5.0F);
		 new BlockBase(4059, "Yellow_diamond_Block").setHardness(2.0F).setResistance(5.0F);
		 
	
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
