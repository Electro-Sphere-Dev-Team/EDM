package EDM.edm.main.handler.enums;

import net.minecraft.item.Item;
import EDM.edm.main.api.ItemAPI;

public enum EnumToolMaterials
{
	Black( 6, 1000 , 6.0F , 4, 10),
	Blue ( 8, 1500 , 8.0F , 6, 12),
	Gray( 10, 2000 , 10.0F , 8, 14);

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