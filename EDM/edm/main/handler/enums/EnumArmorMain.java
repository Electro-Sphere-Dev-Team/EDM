package EDM.edm.main.handler.enums;

import net.minecraft.item.ItemArmor;

public enum EnumArmorMain{
Black("Black", 20, 10, new int[] {2, 7, 5, 3}, 9);

private int maxDamageFactor;
private int damageReductionAmountArray[];
private int enchantability;
private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};

private EnumArmorMain(String par1String, int par1, int par2, int par3[], int par4){
         maxDamageFactor = par2;
         damageReductionAmountArray = par3;
         enchantability = par4;
}

	public int func_40576_a(int i)
	{
         return EnumArmorMain.getMaxDamageArray()[i] * maxDamageFactor;
	}
	
    public int getDamageReductionAmount(int i)
    {
         return damageReductionAmountArray[i];
    }

    public int getEnchantability()
    {
         return enchantability;
    }
    
	public static int[] getMaxDamageArray()
	{
    return maxDamageArray;
	}
}