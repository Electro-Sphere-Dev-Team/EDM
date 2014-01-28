package EDM.edm.main.handler.config;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ConfigCore {

	public static void loadConfig(FMLPreInitializationEvent e){
		Configuration config = new Configuration(e.getSuggestedConfigurationFile()); //Gets the file
		config.load();
		//TODO add code here for config
		config.save();
	}
}
