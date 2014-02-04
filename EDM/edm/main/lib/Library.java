package EDM.edm.main.lib;

public class Library 
{
	public static final String PreFix= "EDM:";
	public static final String modID = " Extra_Diamonds_Mod";
	public static final String Name = PreFix +"Core";
	public static final String Version = "Pre-3.1.4 Build 8";
	
	public static String Main="3";
	public static String rev="1";
	public static String api="3";
	public static String build="Build 7";

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
