package EDM.edm.main.items;

import cpw.mods.fml.common.registry.GameRegistry;
import EDM.edm.main.lib.Library;
import net.minecraft.item.Item;

public class ItemCore extends Item{

	public ItemCore(int par1, String name) {
		super(par1);
		this.setUnlocalizedName(name);
		this.setTextureName("mod_beta"+":"+name);
		GameRegistry.registerItem(this, name, Library.modID);
		
		// TODO Auto-generated constructor stub
	}

}
