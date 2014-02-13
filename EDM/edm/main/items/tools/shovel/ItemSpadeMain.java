package EDM.edm.main.items.tools.shovel;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import EDM.edm.main.handler.enums.EnumToolMaterials;
import EDM.edm.main.items.tools.ItemToolMain;

public class ItemSpadeMain extends ItemToolMain
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
	
	public ItemSpadeMain(int par1, EnumToolMaterials par2EnumToolMaterial, String name)
	{
         super(par1, 1, par2EnumToolMaterial, blocksEffectiveAgainst, name);
         this.setTextureName("mod_beta"+":"+name);
	}
	
	public boolean canHarvestBlock(Block par1Block)
	{
         return par1Block == Block.snow ? true : par1Block == Block.blockSnow;
	}
	
	public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving)
	{
         par1ItemStack.damageItem(1, par3EntityLiving);
         return true;
	}
}