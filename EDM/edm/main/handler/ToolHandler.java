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
		//Blue Diamond
		Blue_Pickaxe = new ItemPickaxeMain(17004, EnumToolMaterials.Blue).setCreativeTab(CreativeTabs.tabTools).setUnlocalizedName("Blue_Diamond_Pick").setTextureName("mod_beta:Blue_Diamond_Pick");
		Blue_Axe= new ItemAxeMain(17005,EnumToolMaterials.Blue).setCreativeTab(CreativeTabs.tabTools).setUnlocalizedName("Blue_Diamond_Axe").setTextureName("mod_beta:Blue_Diamond_Axe");
		Blue_Shovel= new ItemSpadeMain(17006, EnumToolMaterials.Blue).setCreativeTab(CreativeTabs.tabTools).setUnlocalizedName("Blue_Diamond_Shovel").setTextureName("mod_beta:Blue_Diamond_Shovel");
		Blue_Sword= new ItemSwordMain(17007, EnumToolMaterials.Blue).setCreativeTab(CreativeTabs.tabTools).setUnlocalizedName("Blue_Diamond_Sword").setTextureName("mod_beta:Blue_Diamond_Sword");
		
		//Blue Diamond
		Gray_Pickaxe = new ItemPickaxeMain(17008, EnumToolMaterials.Gray).setCreativeTab(CreativeTabs.tabTools).setUnlocalizedName("gGay_Diamond_Pick").setTextureName("mod_beta:Gray_Diamond_Pick");
		Gray_Axe= new ItemAxeMain(17009,EnumToolMaterials.Gray).setCreativeTab(CreativeTabs.tabTools).setUnlocalizedName("Gray_Diamond_Axe").setTextureName("mod_beta:Gray_Diamond_Axe");
		Gray_Shovel= new ItemSpadeMain(17010, EnumToolMaterials.Gray).setCreativeTab(CreativeTabs.tabTools).setUnlocalizedName("Gray_Diamond_Shovel").setTextureName("mod_beta:Gray_Diamond_Shovel");
		Gray_Sword= new ItemSwordMain(17011, EnumToolMaterials.Gray).setCreativeTab(CreativeTabs.tabTools).setUnlocalizedName("Gray_Diamond_Sword").setTextureName("mod_beta:Gray_Diamond_Sword");
				
		LanguageRegistry.addName(Black_Pickaxe, "Black Diamond Pickaxe");
		LanguageRegistry.addName(Black_Axe, "Black Diamond Axe");
		LanguageRegistry.addName(Black_Shovel, "Black Diamond Shovel");
		LanguageRegistry.addName(Black_Sword, "Black Diamond Sword");
		
		LanguageRegistry.addName(Blue_Pickaxe, "Black Diamond Pickaxe");
		LanguageRegistry.addName(Blue_Axe, "Black Diamond Axe");
		LanguageRegistry.addName(Blue_Shovel, "Black Diamond Shovel");
		LanguageRegistry.addName(Blue_Sword, "Black Diamond Sword");
		
		LanguageRegistry.addName(Gray_Pickaxe, "Black Diamond Pickaxe");
		LanguageRegistry.addName(Gray_Axe, "Black Diamond Axe");
		LanguageRegistry.addName(Gray_Shovel, "Black Diamond Shovel");
		LanguageRegistry.addName(Gray_Sword, "Black Diamond Sword");
		
	}
}
