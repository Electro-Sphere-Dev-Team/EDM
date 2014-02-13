package EDM.edm.main.block;

import EDM.edm.main.lib.Library;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockBase extends Block {

	public BlockBase(int par1, String name) {
		super(par1, Material.rock);
		this.setTextureName(Library.TexName+":"+name);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setUnlocalizedName(name);
		GameRegistry.registerBlock(this, name);
		// TODO Auto-generated constructor stub
	}

}
