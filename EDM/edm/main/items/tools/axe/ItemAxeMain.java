package EDM.edm.main.items.tools.axe;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import EDM.edm.main.handler.enums.EnumToolMaterials;
import EDM.edm.main.items.tools.ItemToolMain;

public class ItemAxeMain extends ItemToolMain{

	private static Block[] blocksEffectiveAgainst = new Block[] 
	{
		Block.planks, 	
		Block.bookShelf, 
		Block.wood, 
		Block.chest, 
		Block.stoneDoubleSlab, 
		Block.stoneSingleSlab, 
		Block.pumpkin, 
		Block.pumpkinLantern
	};
	
	public ItemAxeMain(int par1, EnumToolMaterials par2EnumToolMaterial, String name)
	{
         super(par1, 3, par2EnumToolMaterial, blocksEffectiveAgainst, name);
         this.setTextureName("mod_beta"+":"+name);
	}
	
	public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
	{
         return par2Block != null && (par2Block.blockMaterial == Material.wood 
        		 || par2Block.blockMaterial == Material.plants 
        		 || par2Block.blockMaterial == Material.vine) ? this.efficiencyOnProperMaterial : 
        			 super.getStrVsBlock(par1ItemStack, par2Block);
	}
}