package EDM.edm.main.block;

import java.util.Random;

import EDM.edm.main.EDMCore;
import EDM.edm.main.api.ItemAPI;
import EDM.edm.main.api.OreAPI;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockOre extends Block
{
    public BlockOre(int par1)
    {
        super(par1, Material.rock);
        this.setCreativeTab(EDMCore.tabEDMBlocks);
    }

    @Override
    public int getExpDrop(World par1World, int par5, int par7)
    {
        if (this.idDropped(par5, par1World.rand, par7) != this.blockID)
        {
            int j1 = 0;

            if (this.blockID == OreAPI.Black_O.blockID)
            {
                j1 = MathHelper.getRandomIntegerInRange(par1World.rand, 0, 2);
            }
            else if (this.blockID == Block.oreDiamond.blockID)
            {
                j1 = MathHelper.getRandomIntegerInRange(par1World.rand, 3, 7);
            }
            else if (this.blockID == Block.oreEmerald.blockID)
            {
                j1 = MathHelper.getRandomIntegerInRange(par1World.rand, 3, 7);
            }
            else if (this.blockID == Block.oreLapis.blockID)
            {
                j1 = MathHelper.getRandomIntegerInRange(par1World.rand, 2, 5);
            }
            else if (this.blockID == Block.oreNetherQuartz.blockID)
            {
                j1 = MathHelper.getRandomIntegerInRange(par1World.rand, 2, 5);
            }
            return j1;
        }

        return 0;
    }
}
