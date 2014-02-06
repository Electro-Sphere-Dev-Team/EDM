package EDM.edm.main.helper;

import java.io.InputStream;
import java.net.URL;

public class UpdateInfo {

	//this number will get higher for every update your mod has
	public static int currentVersion = 15;

	//This url needs changing to your own url
	public static final String versionURL = "https://dl.dropboxusercontent.com/u/100336313/minecraft/mods/EDM/version/1.6.4/1.6.4.html";

	public static String getLatestVersion() throws Exception 
	{
		String data = getData(versionURL);
		return data.substring(data.indexOf("[version]") + 9, data.indexOf("[/version]"));
	}
	
	private static String getData(String address) throws Exception 
	{
		URL url = new URL(address);
		InputStream html = null;
		html = url.openStream();
		int c = 0;
		StringBuffer buffer = new StringBuffer("");
		
		while (c != -1) 
		{
			c = html.read();
			buffer.append((char) c);
		}
			return buffer.toString();
		}
	}