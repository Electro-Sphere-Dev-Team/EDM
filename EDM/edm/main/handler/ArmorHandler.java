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

	}
	
	public static void ArmorToGame()
	{
		LanguageRegistry.addName(Black_H,"Black_Diamond_Helmat");
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
