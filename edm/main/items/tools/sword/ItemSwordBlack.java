package EDM.edm.main.items.tools.sword;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import EDM.edm.main.handler.enums.EnumToolMaterials;
import com.google.common.collect.Multimap;

public class ItemSwordBlack extends Item
{
	
	private float weaponDamage;
	private final EnumToolMaterials toolMaterials;
	
	public ItemSwordBlack(int par1, EnumToolMaterials par2EnumToolMaterials)
	{
         super(par1);
         this.toolMaterials = par2EnumToolMaterials;
         this.maxStackSize = 1;
         this.setMaxDamage(par2EnumToolMaterials.getMaxUses());
         this.setCreativeTab(CreativeTabs.tabCombat);
         this.weaponDamage = 4.0F + par2EnumToolMaterials.getDamageVsEntity();
	}
	
	public float func_82803_g()
	{
         return this.toolMaterials.getDamageVsEntity();
	}
	
	public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
	{
         if (par2Block.blockID == Block.web.blockID){
                 return 15.0F;
         } else {
                 Material var3 = par2Block.blockMaterial;
                 return var3 
                		 != Material.plants && var3 
                		 != Material.vine && var3 
                		 != Material.coral && var3 
                		 != Material.leaves && var3 
                		 != Material.pumpkin ? 1.0F : 1.5F;
         }
	}
	
	public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving)
	{
         par1ItemStack.damageItem(1, par3EntityLiving);
         return true;
	}
	
	public boolean onBlockDestroyed(ItemStack par1ItemStack, World par2World, int par3, int par4, int par5, int par6, EntityLiving par7EntityLiving)
	{
		if ((double)Block.blocksList[par3].getBlockHardness(par2World, par4, par5, par6) != 0.0D){
                 par1ItemStack.damageItem(2, par7EntityLiving);
         }
         return true;
	}
	
	public float getDamageVsEntity(Entity par1Entity)
	{
         return this.weaponDamage;
	}
	
	public boolean isFull3D()
	{
         return true;
	}
	
	public EnumAction getItemUseAction(ItemStack par1ItemStack)
	{
         return EnumAction.block;
	}

	public int getMaxItemUseDuration(ItemStack par1ItemStack)
	{
         return 72000;
	}
	
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
         par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
         return par1ItemStack;
	}
	
	public boolean canHarvestBlock(Block par1Block)
	{
         return par1Block.blockID == Block.web.blockID;
	}
	
	public int getItemEnchantability()
	{
         return this.toolMaterials.getEnchantability();
	}
	/**
     * Return whether this item is repairable in an anvil.
     */
    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
    {
        return this.toolMaterials.getToolCraftingMaterial() == par2ItemStack.itemID ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
    }

    /**
     * Gets a map of item attribute modifiers, used by ItemSword to increase hit damage.
     */
    public Multimap getItemAttributeModifiers()
    {
        Multimap multimap = super.getItemAttributeModifiers();
        multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Weapon modifier", (double)this.weaponDamage, 0));
        return multimap;
    }
	public String getToolBlackName()
	{
         return this.toolMaterials.toString();
	}
}