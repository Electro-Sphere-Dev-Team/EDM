package EDM.edm.main.items.armor;

import EDM.edm.main.EDMCore;
import EDM.edm.main.handler.enums.EnumArmorMain;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemArmorMain extends ItemArmor{

private static final int maxDamageArray[] = {11, 16, 15, 13};
public final int armorType;
public final int damageReduceAmount;
public final int renderIndex;
private final EnumArmorMain material;

public ItemArmorMain(int par1, EnumArmorMain mat, int par2, int par3)
{
         super(par1, EnumArmorMaterial.IRON, par2, par3);
         material = mat;
         armorType = par3;
         renderIndex = par2;
         damageReduceAmount = mat.getDamageReductionAmount(par3);
         setMaxDamage(mat.func_40576_a(par3));
         maxStackSize = 1;
}

public int getItemEnchantability()
{
         return material.getEnchantability();
}

static int[] getMaxDamageArray()
{
         return maxDamageArray;
}


}