package EDM.edm.main.items.tools;

import com.google.common.collect.Multimap;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import EDM.edm.main.handler.enums.EnumToolMaterials;
import EDM.edm.main.items.ItemCore;

public class ItemToolMain extends ItemCore{

	private Block[] blocksEffectiveAgainst;
	protected float efficiencyOnProperMaterial = 4.0F;
	private float damageVsEntity;
	protected EnumToolMaterials toolMaterial;
	
	protected ItemToolMain(int par1, int par2, EnumToolMaterials par3EnumToolMaterial, Block[] par4ArrayOfBlock, String name)
	{
         super(par1, name);
         this.toolMaterial = par3EnumToolMaterial;
         this.blocksEffectiveAgainst = par4ArrayOfBlock;
         this.maxStackSize = 1;
         this.setMaxDamage(par3EnumToolMaterial.getMaxUses());
         this.efficiencyOnProperMaterial = par3EnumToolMaterial.getEfficiencyOnProperMaterial();
         this.damageVsEntity = par2 + par3EnumToolMaterial.getDamageVsEntity();
         this.setCreativeTab(CreativeTabs.tabTools);
         this.setTextureName("mod_beta"+":"+name);
	}
	
	public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block){
         for (int var3 = 0; var3 < this.blocksEffectiveAgainst.length; ++var3){
                 if (this.blocksEffectiveAgainst[var3] == par2Block){
                         return this.efficiencyOnProperMaterial;
                 }
         }
         return 1.0F;
	}
	
	public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving)
	{
         par1ItemStack.damageItem(2, par3EntityLiving);
         return true;
	}
	
	 public boolean onBlockDestroyed(ItemStack par1ItemStack, World par2World, int par3, int par4, int par5, int par6, EntityLivingBase par7EntityLivingBase)
	    {
	        if ((double)Block.blocksList[par3].getBlockHardness(par2World, par4, par5, par6) != 0.0D)
	        {
	            par1ItemStack.damageItem(1, par7EntityLivingBase);
	        }

	        return true;
	    }

	public Multimap getItemAttributeModifiers()
    {
        Multimap multimap = super.getItemAttributeModifiers();
        multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Tool modifier", (double)this.damageVsEntity, 0));
        return multimap;
    }
	public float getDamageVsEntity(Entity par1Entity)
	{
         return this.damageVsEntity;
	}
	
	public boolean isFull3D()
	{
         return true;
	}
	
	public int getItemEnchantability()
	{
         return this.toolMaterial.getEnchantability();
	}
	
	public String getToolMaterialName()
	{
         return this.toolMaterial.toString();
	}
}