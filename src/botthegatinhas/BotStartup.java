package botthegatinhas;

import javax.security.auth.login.LoginException;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;



public class BotStartup {
    
    public static void botStartup() throws LoginException, InterruptedException{
        
        String token = "OTA1ODQ3MTM3MzI4MzAwMDYy.YYQB4w.tKQlMvhheo94c3mCoIWvNzSyctQ";
        
        JDA jda = JDABuilder.createDefault(token).build().awaitReady();
        
        jda.getPresence().setActivity(Activity.watching("As gatinhas"));
        jda.getPresence().setStatus(OnlineStatus.ONLINE);
        jda.addEventListener(new Commands());
        
        
        
    } 
    
    public static void main(String[] args) throws LoginException, InterruptedException  {
        
        botStartup(); 
        
    }
    
}
