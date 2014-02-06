package EDM.edm.main.handler.config;

import java.io.File;

import EDM.edm.main.helper.LogHelper;
import EDM.edm.main.lib.Library;

import net.minecraftforge.common.Configuration;

public class ConfigCore {

	private static Configuration config;
	public static boolean CheckVersion;

	public static void loadConfig(File file) {

		config = new Configuration(file);

		try {

			LogHelper.info(Library.modID, "Loading config file.");

			config.load();

			CheckVersion = config.get(config.CATEGORY_GENERAL, "CheckVersion", true, "Will check the mod's version and will notity you if there are a new version of the mod.").getBoolean(true);

			if (config.hasChanged()) {

				config.save();

			}

			LogHelper.info(Library.modID, "Config file succesfully loaded.");

		} catch (Exception e) {

			LogHelper.info(Library.modID, "Could not load the config file.");

		}
	}
}