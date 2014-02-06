package EDM.edm.main.lib;

public class Library 
{
	public static final String PreFix= "EDM:";
	public static final String modID = "Extra_Diamonds_Mod";
	public static final String ID = "EDM";
	public static final String Name = PreFix +"Core";
	public static final String Version = "Pre-3.4.15";
	public static final String URL = "http://www.minecraftforum.net/topic/2059368-";
	public static final String ConfigPath = "/Roborave's Mods/" + modID + ".cfg";
	private Library() 
	{

	}
	
	public static final String modid()
	{
		return modID;
	}
	
	public static final String name()
	{
		return Name;
	}
	
	public static final String version()
	{
		return Version;
	}
	
}
