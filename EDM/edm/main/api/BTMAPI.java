package EDM.edm.main.api;
import java.util.List;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;

public class BTMAPI
{
        private static final Class BTM = getBTM();

        private static Class getBTM()
        {
                try
                {
                        return Class.forName("bcblocks.bettertable.table.BetterCraftingManager.class");
                }
                catch(ClassNotFoundException e)
                {
                        return null;
                }
        }

        private static void addRecipe(ItemStack stack, Object[] input, boolean shapeless)
        {
                try
                {
                        BTM.getMethod("add" + (shapeless ? "Shapeless" : "") + "Recipe", new Class[] {ItemStack.class, Object[].class}).invoke(null, stack, input);
                }
                catch(Exception e)
                {
                        e.printStackTrace();
                }
        }


        public static boolean getEWInstalled()
        {
                return BTM != null;
        }

        public static void addRecipe(ItemStack stack, Object[] input)
        {
                addRecipe(stack, input, false);
        }

        public static void addShaplessRecipe(ItemStack stack, Object[] input)
        {
                addRecipe(stack, input, true);
        }

        public static List<IRecipe> getRecipeList()
        {
                try
                {
                        return (List<IRecipe>)BTM.getMethod("getRecipeList").invoke(null);
                }
                catch(Exception e)
                {
                        e.printStackTrace();
                        return null;
                }
        }
}