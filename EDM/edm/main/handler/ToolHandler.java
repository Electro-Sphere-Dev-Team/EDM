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
		new ItemPickaxeMain(17000, EnumToolMaterials.Black, "Black_Diamond_Pick").setCreativeTab(CreativeTabs.tabTools);
		new ItemAxeMain(17001,EnumToolMaterials.Black, "Black_Diamond_Axe").setCreativeTab(CreativeTabs.tabTools);
		new ItemSpadeMain(17002, EnumToolMaterials.Black, "Black_Diamond_Shovel").setCreativeTab(CreativeTabs.tabTools);
		new ItemSwordMain(17003, EnumToolMaterials.Black,"Black_Diamond_Sword").setCreativeTab(CreativeTabs.tabTools);
		//Blue Diamond
		new ItemPickaxeMain(17004, EnumToolMaterials.Blue, "Blue_Diamond_Pick").setCreativeTab(CreativeTabs.tabTools);
		new ItemAxeMain(17005,EnumToolMaterials.Blue, "Blue_Diamond_Axe").setCreativeTab(CreativeTabs.tabTools);
		new ItemSpadeMain(17006, EnumToolMaterials.Blue, "Blue_Diamond_Shovel").setCreativeTab(CreativeTabs.tabTools);
		new ItemSwordMain(17007, EnumToolMaterials.Blue,"Blue_Diamond_Sword").setCreativeTab(CreativeTabs.tabTools);
		//Blue Diamond
		new ItemPickaxeMain(17008, EnumToolMaterials.Gray, "Gray_Diamond_Pick").setCreativeTab(CreativeTabs.tabTools);
		new ItemAxeMain(17009,EnumToolMaterials.Gray, "Gray_Diamond_Axe").setCreativeTab(CreativeTabs.tabTools);
		new ItemSpadeMain(17010, EnumToolMaterials.Gray, "Gray_Diamond_Shovel").setCreativeTab(CreativeTabs.tabTools);
		new ItemSwordMain(17011, EnumToolMaterials.Gray,"Gray_Diamond_Sword").setCreativeTab(CreativeTabs.tabTools);
		
		new ItemPickaxeMain(17012, EnumToolMaterials.Gold, "Gold_Diamond_Pick").setCreativeTab(CreativeTabs.tabTools);
		new ItemAxeMain(17013,EnumToolMaterials.Gold, "Gold_Diamond_Axe").setCreativeTab(CreativeTabs.tabTools);
		new ItemSpadeMain(17014, EnumToolMaterials.Gold, "Gold_Diamond_Shovel").setCreativeTab(CreativeTabs.tabTools);
		new ItemSwordMain(17015, EnumToolMaterials.Gold,"Gold_Diamond_Sword").setCreativeTab(CreativeTabs.tabTools);
		
		new ItemPickaxeMain(17016, EnumToolMaterials.Green, "Green_Diamond_Pick").setCreativeTab(CreativeTabs.tabTools);
		new ItemAxeMain(17017,EnumToolMaterials.Green, "Green_Diamond_Axe").setCreativeTab(CreativeTabs.tabTools);
		new ItemSpadeMain(17018, EnumToolMaterials.Green, "Green_Diamond_Shovel").setCreativeTab(CreativeTabs.tabTools);
		new ItemSwordMain(17019, EnumToolMaterials.Green,"Green_Diamond_Sword").setCreativeTab(CreativeTabs.tabTools);
		
	}
}
