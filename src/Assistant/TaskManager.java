package Assistant;

import java.io.File;
import java.io.IOException;


public class TaskManager {
    public boolean openTaskManager(String path) throws IOException, InterruptedException {
        if ((new File(path)).exists()) {

            Process p = Runtime
               .getRuntime()
               .exec("rundll32 url.dll,FileProtocolHandler "+path);
            p.waitFor();
            
            return true;
        }
        
        return false;
    }
    
    public void closeApplication(String appName) throws IOException {
        Runtime.getRuntime().exec("taskkill /F /IM "+appName+".exe");
    }
    
    public String getBrowserPath() {
        String string = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe";
        return string;
    }
    
    public String getMediaPlayerPath() {
        String string = "C:\\Program Files (x86)\\VideoLAN\\VLC\\vlc.exe";
        
        return string;
    }
    
    
}
