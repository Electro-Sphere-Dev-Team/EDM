package EDM.edm.main.items.tools.shovel;

import net.minecraft.block.Block;
import EDM.edm.main.handler.enums.EnumToolMaterials;
import EDM.edm.main.items.tools.ItemToolBlack;

public class ItemSpadeBlack extends ItemToolBlack
{

	private static Block[] blocksEffectiveAgainst = new Block[] 
	{
		Block.grass, 
		Block.dirt, 
		Block.sand, 
		Block.gravel, 
		Block.snow, 
		Block.blockSnow, 
		Block.blockClay, 
		Block.tilledField, 
		Block.slowSand, 
		Block.mycelium
	};
	
	public ItemSpadeBlack(int par1, EnumToolMaterials par2EnumToolMaterial)
	{
         super(par1, 1, par2EnumToolMaterial, blocksEffectiveAgainst);
	}
	
	public boolean canHarvestBlock(Block par1Block)
	{
         return par1Block == Block.snow ? true : par1Block == Block.blockSnow;
	}
}