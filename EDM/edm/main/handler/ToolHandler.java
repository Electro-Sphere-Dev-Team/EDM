package EDM.edm.main.handler;

import static EDM.edm.main.api.ToolAPI.*;
import net.minecraft.creativetab.CreativeTabs;
import EDM.edm.main.handler.enums.EnumToolMaterials;
import EDM.edm.main.items.tools.axe.ItemAxeMain;
import EDM.edm.main.items.tools.pickaxe.ItemPickaxeMain;
import EDM.edm.main.items.tools.shovel.ItemSpadeMain;
import EDM.edm.main.items.tools.sword.ItemSwordMain;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ToolHandler 
{
	
	public static void handleTools()
	{
		//Black Diamond
		Black_Pickaxe = new ItemPickaxeMain(17000, EnumToolMaterials.Black).setCreativeTab(CreativeTabs.tabTools).setUnlocalizedName("Black_Diamond_Pick").setTextureName("mod_beta:Black_Diamond_Pick");
		
		Black_Axe= new ItemAxeMain(17001,EnumToolMaterials.Black).setCreativeTab(CreativeTabs.tabTools).setUnlocalizedName("Black_Diamond_Axe").setTextureName("mod_beta:Black_Diamond_Axe");
		
		Black_Shovel= new ItemSpadeMain(17002, EnumToolMaterials.Black).setCreativeTab(CreativeTabs.tabTools).setUnlocalizedName("Black_Diamond_Shovel").setTextureName("mod_beta:Black_Diamond_Shovel");
		
		Black_Sword= new ItemSwordMain(17003, EnumToolMaterials.Black).setCreativeTab(CreativeTabs.tabTools).setUnlocalizedName("Black_Diamond_Sword").setTextureName("mod_beta:Black_Diamond_Sword");
		
		//Pickaxes
		LanguageRegistry.addName(Black_Pickaxe, "Black Diamond Pickaxe");
		
		//Axes
		LanguageRegistry.addName(Black_Axe, "Black Diamond Axe");
		
		//Shovels
		LanguageRegistry.addName(Black_Shovel, "Black Diamond Shovel");
		
		//swords
		LanguageRegistry.addName(Black_Sword, "Black Diamond Sword");
		
		
	}
}
