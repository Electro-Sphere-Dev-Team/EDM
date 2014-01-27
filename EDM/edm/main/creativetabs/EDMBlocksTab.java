package EDM.edm.main.creativetabs;

import EDM.edm.main.api.BlockAPI;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EDMBlocksTab extends CreativeTabs 
{

        public EDMBlocksTab(String label) 
        {
                super(label);
        }

        @SideOnly(Side.CLIENT)
        @Override
        public int getTabIconItemIndex()
        {
                return BlockAPI.Black_B.blockID;
        }
}