package EDM.edm.main.handler;

import EDM.edm.main.world.WorldGenBlack;
import EDM.edm.main.world.WorldGenBlue;
import cpw.mods.fml.common.registry.GameRegistry;

public class WorldGenHandler {

	public static void GenRegister(){
		GameRegistry.registerWorldGenerator(new WorldGenBlack());
		GameRegistry.registerWorldGenerator(new WorldGenBlue());


	}
}
