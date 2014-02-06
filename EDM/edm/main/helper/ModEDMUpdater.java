package EDM.edm.main.helper;
import java.awt.BorderLayout;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ModEDMUpdater extends JFrame {

private static final long serialVersionUID = 1L;
private static String title = "ModName_Updater";
private Thread thread;

// just like the version url page in "UpdateInfo" but this page will contain
// the "Direct Download Link" inside [url] [/url] tags
private static String mod_download_page = "";

// we need to detect what system the user is on so we can locate the correct
// mods folder location
private static String ModsLoc = OSCheck();

private static JTextArea console;

public ModEDMUpdater() {
// if it fails to set path lets just exit, waste of trying to install a
// mod into nowhere
if (ModsLoc.equals("unable to set path")) {
JOptionPane.showMessageDialog(null, "Unable to detect your system \nPlease manually download mod");
System.exit(1);
} else {
setTitle(title);
setLayout(new BorderLayout());
console = new JTextArea();
add(new JScrollPane(console), BorderLayout.CENTER);

//this will start the download of the mod
downloadMod();
}
}

private void downloadMod() {
thread = new Thread(new Runnable(){
public void run(){
try{
//this will get the download from webpage & then download it
downloadFile(getDownloadFromWebPage());
}catch(Exception e)
{
e.printStackTrace();
//if there happens to be a problem, this will popup letting you know the download failed
JOptionPane.showMessageDialog(null, "An error occurred while performing update! try again later...");
}
}
});
thread.start();
}

private void downloadFile(String link) throws MalformedURLException, IOException
{
URL url = new URL(link);
URLConnection conn = url.openConnection();
InputStream is = conn.getInputStream();

//this is just a little information showing the download size of the file
int max = conn.getContentLength();
console.setText(console.getText() + "\ndownload file... \nupdatesize: " + max + " bytes");

//this will output the download to the mods folder 
BufferedOutputStream fout = new BufferedOutputStream(new FileOutputStream(new File(ModsLoc)));
byte[] buffer = new byte[32 * 1024];
int bytesRead = 0;
int in = 0;

while ((bytesRead = is.read(buffer)) != -1) {
in += bytesRead;
fout.write(buffer, 0, bytesRead);
}

fout.flush();
fout.close();
is.close();

//after its finished we will print to our console
console.setText(console.getText() + "\ndownload complete");
}

private String getDownloadFromWebPage() throws MalformedURLException, IOException
{
//this is the link to your webpage
URL url = new URL(mod_download_page);
InputStream html = null;
html = url.openStream();

int c = 0;
StringBuilder buffer = new StringBuilder("");

while (c != -1) {
c = html.read();
buffer.append((char) c);
}

return buffer.substring(buffer.indexOf("[url]") + 5, buffer.indexOf("[/url]"));
}

// this checks the current system & sets the path
private static String OSCheck() {
if (System.getProperty("os.name").toLowerCase().contains("win")) {
return ModsLoc = System.getenv("APPDATA") + File.separator + ".minecraft" + File.separator + "mods" + File.separator;
} else if (System.getProperty("os.name").toLowerCase().contains("mac")) {
return ModsLoc = System.getProperty("user.home", ".") + "Library" + File.separator + "Application Support" + File.separator + "minecraft" + File.separator + "mods" + File.separator;
} else if (System.getProperty("os.name").toLowerCase().contains("lin")) {
return ModsLoc = System.getProperty("user.home", ".") + File.separator + ".minecraft" + File.separator + "mods" + File.separator;
}

return "unable to set path";
}

public static void main(String[] args) {
ModEDMUpdater frame = new ModEDMUpdater();

// size can be anything you want
frame.setSize(350, 350);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLocationRelativeTo(null);
frame.setVisible(true);
}

}