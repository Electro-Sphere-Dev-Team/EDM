package EDM.edm.main.handler.enums;

import net.minecraft.item.Item;
import EDM.edm.main.api.ItemAPI;

public enum EnumToolMaterials
{
	Black( 3, 1000 , 6.0F , 3.0F, 10),
	Blue ( 3, 1500 , 8.0F , 5.0F, 12),
	Gray( 3, 2000 , 10.0F , 7.0F, 14),
	Gold( 3, 2500 , 12.0F , 9.0F, 16),
	Green( 3, 3000 , 14.0F , 11.0F, 18);

	private final int harvestLevel;
	private final int maxUses;
	private final float efficiencyOnProperMaterial;
	private final float damageVsEntity;
	private final int enchantability;
	public Item customCraftingMaterial = null;
	
	private EnumToolMaterials(int par3, int par4, float par5, float par6, int par7)
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
	
	 
}