package EDM.edm.main.helper;

import EDM.edm.main.lib.Library;

public class CheckVersion {

public CheckVersion()
{
System.out.println(Library.modID + " is checking for updates!");

try{
if(Integer.parseInt(UpdateInfo.getLatestVersion()) > UpdateInfo.currentVersion)
{
System.out.println(Library.modID + " Found Update!");
new Update();
}else
{
System.out.println(Library.modID + " Didnt find any update!");
}
}catch(Exception e)
{
System.out.println(Library.modID + " Failed to check for updates!");
e.printStackTrace();
}
}

}