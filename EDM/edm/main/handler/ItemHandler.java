package EDM.edm.main.handler;
import static EDM.edm.main.api.ItemAPI.*;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemHandler 
{
	public static void RegisterItems()
	{
		Black = new Item(10000).setUnlocalizedName("Item_Black_diamond").setFull3D().setCreativeTab(CreativeTabs.tabMaterials).setTextureName("mod_beta:"+"Item_Black_diamond");
		Blue = new Item(10001).setUnlocalizedName("Item_Blue_diamond_").setFull3D().setCreativeTab(CreativeTabs.tabMaterials).setTextureName("mod_beta:"+"Item_Blue_diamond");
		Gold = new Item(10002).setUnlocalizedName("Item_Gold_diamond").setFull3D().setCreativeTab(CreativeTabs.tabMaterials).setTextureName("mod_beta:"+"Item_Gold_diamond");
		Gray = new Item(10003).setUnlocalizedName("Item_Gray_diamond").setFull3D().setCreativeTab(CreativeTabs.tabMaterials).setTextureName("mod_beta:"+"Item_Gray_diamond");
		Green = new Item(10004).setUnlocalizedName("Item_Green_diamond").setFull3D().setCreativeTab(CreativeTabs.tabMaterials).setTextureName("mod_beta:"+"Item_Green_diamond");
		Orange = new Item(10005).setUnlocalizedName("Item_Orange_diamond").setFull3D().setCreativeTab(CreativeTabs.tabMaterials).setTextureName("mod_beta:"+"Item_Orange_diamond");
		Pink = new Item(10006).setUnlocalizedName("Item_Pink_diamond").setFull3D().setCreativeTab(CreativeTabs.tabMaterials).setTextureName("mod_beta:"+"Item_Pink_diamond");
		Purple = new Item(10007).setUnlocalizedName("Item_Purple_diamond").setFull3D().setCreativeTab(CreativeTabs.tabMaterials).setTextureName("mod_beta:"+"Item_Purple_diamond");
		Red = new Item(10008).setUnlocalizedName("Item_Red_diamond").setFull3D().setCreativeTab(CreativeTabs.tabMaterials).setTextureName("mod_beta:"+"Item_Red_diamond");
		White = new Item(10009).setUnlocalizedName("Item_White_diamond").setFull3D().setCreativeTab(CreativeTabs.tabMaterials).setTextureName("mod_beta:"+"Item_White_diamond");
		Yellow = new Item(10010).setUnlocalizedName("Item_Yellow_diamond").setFull3D().setCreativeTab(CreativeTabs.tabMaterials).setTextureName("mod_beta:"+"Item_Yellow_diamond");
		
	}
	
	public static void ItemToGame()
	{
		LanguageRegistry.addName(Black, "Black Diamond");
		
		LanguageRegistry.addName(Blue, "Blue Diamond");
		
		LanguageRegistry.addName(Gold, "Gold Diamond");
		
		LanguageRegistry.addName(Gray, "Black Diamond");
		
		LanguageRegistry.addName(Green, "Green Diamond");
		
		LanguageRegistry.addName(Orange, "Orange Diamond");
		
		LanguageRegistry.addName(Pink, "Pink Diamond");
		
		LanguageRegistry.addName(Purple, "Purple Diamond");
		
		LanguageRegistry.addName(Red, "Red Diamond");
		
		LanguageRegistry.addName(White, "White Diamond");
		
		LanguageRegistry.addName(Yellow, "Yellow Diamond");

	}
}
