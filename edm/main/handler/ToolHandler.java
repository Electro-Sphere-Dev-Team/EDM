package EDM.edm.main.handler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import EDM.edm.main.handler.enums.EnumToolMaterials;
import EDM.edm.main.items.tools.axe.ItemAxeBlack;
import EDM.edm.main.items.tools.pickaxe.ItemPickaxeBlack;
import EDM.edm.main.items.tools.shovel.ItemSpadeBlack;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ToolHandler 
{
	//Pickaxe's
	public static Item Black_Pickaxe;
	// Axe's
	public static Item Black_Axe;
	//Shovel's
	public static Item Black_Shovel;
	//Sword's
	public static Item Black_Sword;

	public static void handleTools()
	{
		Black_Pickaxe = new ItemPickaxeBlack(17000, EnumToolMaterials.Black).setCreativeTab(CreativeTabs.tabTools).setUnlocalizedName("Black_Diamond_Pick").setTextureName("mod_beta:"+"Black_Diamond_Pick");
		
		Black_Axe= new ItemAxeBlack(17001,EnumToolMaterials.Black).setUnlocalizedName("Black_Diamond_Axe").setTextureName("mod_beta:"+"Black_Diamond_Axe");
		
		Black_Shovel= new ItemSpadeBlack(17002, EnumToolMaterials.Black).setUnlocalizedName("Black_Diamond_Shovel").setTextureName("mod_beta:"+"Black_Diamond_Shovel");
		
		//Pickaxes
		LanguageRegistry.addName(Black_Pickaxe, "Black Diamond Pickaxe");
		//Axes
		LanguageRegistry.addName(Black_Axe, "Black Diamond Axe");
		//Shovels
		LanguageRegistry.addName(Black_Shovel, "Black Diamond Shovel");
		
		
	}
}
