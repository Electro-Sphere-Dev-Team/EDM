package EDM.edm.main.lib;

public class Library 
{
	public static final String PreFix= "EDM:";
	public static final String modID = " Extra_Diamonds_Mod";
	public static final String Name = PreFix +"Core";
	public static final String Version = "Pre-3.1.0 Build 5";
	
	
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
