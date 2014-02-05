package EDM.edm.main.handler;

import static EDM.edm.main.api.ArmorAPI.*;
import static EDM.edm.main.api.ArmorMaterialAPI.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemArmor;
import EDM.edm.main.client.ClientProxy;
import cpw.mods.fml.client.registry.*;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ArmorHandler {

	public static void RegisterArmor()
	{
		
		Black_H = (ItemArmor) new ItemArmor(10011, Black_Diamonds, Armor_Prefix(5), 0).setUnlocalizedName("Black_Diamond_Helmat").setTextureName("mod_beta:Black_Diamond_Helm").setCreativeTab(CreativeTabs.tabCombat);
		Black_C = (ItemArmor) new ItemArmor(10012, Black_Diamonds, Armor_Prefix(5), 1).setUnlocalizedName("Black_Diamond_Chest").setTextureName("mod_beta:Black_Diamond_Chest").setCreativeTab(CreativeTabs.tabCombat);
		Black_L = (ItemArmor) new ItemArmor(10013, Black_Diamonds, Armor_Prefix(5), 2).setUnlocalizedName("Black_Diamond_Legs").setTextureName("mod_beta:Black_Diamond_Pants").setCreativeTab(CreativeTabs.tabCombat);
		Black_B = (ItemArmor) new ItemArmor(10014, Black_Diamonds, Armor_Prefix(5), 3).setUnlocalizedName("Black_Diamond_Boots").setTextureName("mod_beta:Black_Diamond_Boots").setCreativeTab(CreativeTabs.tabCombat);

		Blue_H = (ItemArmor) new ItemArmor(10015, Blue_Diamonds, RenderingRegistry.addNewArmourRendererPrefix("blue"), 0).setUnlocalizedName("Blue_Diamond_Helm").setTextureName("mod_beta:Blue_Diamond_Helm").setCreativeTab(CreativeTabs.tabCombat);
		Blue_C = (ItemArmor) new ItemArmor(10016, Blue_Diamonds, RenderingRegistry.addNewArmourRendererPrefix("blue"), 1).setUnlocalizedName("Blue_Diamond_Chest").setTextureName("mod_beta:Blue_Diamond_Chest").setCreativeTab(CreativeTabs.tabCombat);
		Blue_L = (ItemArmor) new ItemArmor(10017, Blue_Diamonds, RenderingRegistry.addNewArmourRendererPrefix("blue"), 2).setUnlocalizedName("Blue_Diamond_Pants").setTextureName("mod_beta:Blue_Diamond_Pants").setCreativeTab(CreativeTabs.tabCombat);
		Blue_B = (ItemArmor) new ItemArmor(10018, Blue_Diamonds, RenderingRegistry.addNewArmourRendererPrefix("blue"), 3).setUnlocalizedName("Blue_Diamond_Boots").setTextureName("mod_beta:Blue_Diamond_Boots").setCreativeTab(CreativeTabs.tabCombat);

		Gray_H = (ItemArmor) new ItemArmor(10019, Gray_Diamonds, RenderingRegistry.addNewArmourRendererPrefix("gray"), 0).setUnlocalizedName("Gray_Diamond_Helm").setTextureName("mod_beta:Gray_Diamond_Helm").setCreativeTab(CreativeTabs.tabCombat);
		Gray_C = (ItemArmor) new ItemArmor(10020, Gray_Diamonds, RenderingRegistry.addNewArmourRendererPrefix("gray"), 1).setUnlocalizedName("Gray_Diamond_Chest").setTextureName("mod_beta:Gray_Diamond_Chest").setCreativeTab(CreativeTabs.tabCombat);
		Gray_L = (ItemArmor) new ItemArmor(10021, Gray_Diamonds, RenderingRegistry.addNewArmourRendererPrefix("gray"), 2).setUnlocalizedName("Gray_Diamond_Pants").setTextureName("mod_beta:Gray_Diamond_Pants").setCreativeTab(CreativeTabs.tabCombat);
		Gray_B = (ItemArmor) new ItemArmor(10022, Gray_Diamonds, RenderingRegistry.addNewArmourRendererPrefix("gray"), 3).setUnlocalizedName("Gray_Diamond_Boots").setTextureName("mod_beta:Gray_Diamond_Boots").setCreativeTab(CreativeTabs.tabCombat);

		Green_H = (ItemArmor) new ItemArmor(10023, Green_Diamonds, RenderingRegistry.addNewArmourRendererPrefix("green"), 0).setUnlocalizedName("Green_Diamond_Helm").setTextureName("mod_beta:Green_Diamond_Helm").setCreativeTab(CreativeTabs.tabCombat);
		Green_C = (ItemArmor) new ItemArmor(10024, Green_Diamonds, RenderingRegistry.addNewArmourRendererPrefix("green"), 1).setUnlocalizedName("Green_Diamond_Chest").setTextureName("mod_beta:Green_Diamond_Chest").setCreativeTab(CreativeTabs.tabCombat);
		Green_L = (ItemArmor) new ItemArmor(10025, Green_Diamonds, RenderingRegistry.addNewArmourRendererPrefix("green"), 2).setUnlocalizedName("Green_Diamond_Pants").setTextureName("mod_beta:Green_Diamond_Pants").setCreativeTab(CreativeTabs.tabCombat);
		Green_B = (ItemArmor) new ItemArmor(10026, Green_Diamonds, RenderingRegistry.addNewArmourRendererPrefix("green"), 3).setUnlocalizedName("Green_Diamond_Boots").setTextureName("mod_beta:Green_Diamond_Boots").setCreativeTab(CreativeTabs.tabCombat);

	}
	
	public static void ArmorToGame()
	{
		LanguageRegistry.addName(Black_H,"Black Diamond Helmat");
		LanguageRegistry.addName(Black_C,"Black Diamond Chest");
		LanguageRegistry.addName(Black_L,"Black Diamond Legs");
		LanguageRegistry.addName(Black_B,"Black Diamond Boots");

		LanguageRegistry.addName(Blue_H,"Blue Diamond Helmat");
		LanguageRegistry.addName(Blue_C,"Blue Diamond Chest");
		LanguageRegistry.addName(Blue_L,"Blue Diamond Legs");
		LanguageRegistry.addName(Blue_B,"Blue Diamond Boots");

		LanguageRegistry.addName(Gray_H,"Gray Diamond Helmat");
		LanguageRegistry.addName(Gray_C,"Gray Diamond Chest");
		LanguageRegistry.addName(Gray_L,"Gray Diamond Legs");
		LanguageRegistry.addName(Gray_B,"Gray Diamond Boots");


	}
	
	public static int Armor_Prefix(int par1)
	{
		
		if(par1==5){
			RenderingRegistry.addNewArmourRendererPrefix("black");
		}else if(par1==6){
			
			RenderingRegistry.addNewArmourRendererPrefix("blue");
			
		}else if(par1==7){
			
			RenderingRegistry.addNewArmourRendererPrefix("gray");
			
		}
		return par1;
	}
}
