package EDM.edm.main.handler;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import EDM.edm.main.block.BlockOre;
import static EDM.edm.main.api.OreAPI.*;
public class OreHandler {

	public static void RegisterOres()
	{
		Black_O = (BlockOre) new BlockOre(4061).setUnlocalizedName("Black_Diamond_Ore").setTextureName("mod_beta:Black_diamond_Ore");
		Blue_O = (BlockOre) new BlockOre(4062).setUnlocalizedName("Blue_Diamond_Ore").setTextureName("mod_beta:Blue_diamond_Ore");
		Gray_O = (BlockOre) new BlockOre(4063).setUnlocalizedName("Gray_Diamond_Ore").setTextureName("mod_beta:Gray_diamond_Ore");
		Green_O = (BlockOre) new BlockOre(4064).setUnlocalizedName("Green_Diamond_Ore").setTextureName("mod_beta:Green_diamond_Ore");
		Orange_O = (BlockOre) new BlockOre(4065).setUnlocalizedName("Orange_Diamond_Ore").setTextureName("mod_beta:Orange_diamond_Ore");


	}
	public static void OresToGame()
	{
		GameRegistry.registerBlock(Black_O, Black_O.getUnlocalizedName());
		GameRegistry.registerBlock(Blue_O, Blue_O.getUnlocalizedName());
		GameRegistry.registerBlock(Gray_O, Gray_O.getUnlocalizedName());
		GameRegistry.registerBlock(Green_O, Green_O.getUnlocalizedName());
		GameRegistry.registerBlock(Orange_O, Orange_O.getUnlocalizedName());

		LanguageRegistry.addName(Black_O, "Black Diamond Ore");
		LanguageRegistry.addName(Blue_O, "Blue Diamond Ore");

	}
}
