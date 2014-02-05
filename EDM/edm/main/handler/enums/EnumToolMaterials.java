package EDM.edm.main.handler.enums;

import net.minecraft.item.Item;
import EDM.edm.main.api.ItemAPI;

public enum EnumToolMaterials
{
	Black( 3, 1000 , 10.0F , 10, 15),
	Blue ( 3, 1500 , 15.0F , 15, 20);

	private final int harvestLevel;
	private final int maxUses;
	private final float efficiencyOnProperMaterial;
	private final float damageVsEntity;
	private final int enchantability;
	public Item customCraftingMaterial = null;
	
	private EnumToolMaterials(int par3, int par4, float par5, int par6, int par7)
	{
         this.harvestLevel = par3;
         this.maxUses = par4;
         this.efficiencyOnProperMaterial = par5;
         this.damageVsEntity = par6;
         this.enchantability = par7;
	}
	
	public int getMaxUses()
	{
         return this.maxUses;
	}

	public float getEfficiencyOnProperMaterial()
	{
         return this.efficiencyOnProperMaterial;
	}
	
	public float getDamageVsEntity()
	{
		return this.damageVsEntity;
	}
	
	public int getHarvestLevel()
	{
         return this.harvestLevel;
	}

	public int getEnchantability()
	{
         return this.enchantability;
	}
	
	 public int getToolCraftingMaterial()
	    {
	        switch (this)
	        {
	            case Black:    return ItemAPI.Black.itemID;
	            default:      return (customCraftingMaterial == null ? 0 : customCraftingMaterial.itemID);
	        }
	    }
}