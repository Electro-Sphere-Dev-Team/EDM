package EDM.edm.main.handler;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import EDM.edm.main.EDMCore;
import EDM.edm.main.handler.enums.EnumArmorMain;
import EDM.edm.main.items.armor.ItemArmorMain;
import static EDM.edm.main.api.ArmorAPI.*;
public class ArmorHandler {

	public static void RegisterArmor()
	{
		
		Black_H = (ItemArmorMain) new ItemArmorMain(10011, EnumArmorMain.Black,RenderingRegistry.addNewArmourRendererPrefix("black"), 0).setUnlocalizedName("Black_Diamond_Helmat").setTextureName("mod_beta:Black_Diamond_Helm").setCreativeTab(CreativeTabs.tabCombat);
	
	}
	
	public static void ArmorToGame()
	{
		LanguageRegistry.addName(Black_H,"Black_Diamond_Helmat");
	}
}
