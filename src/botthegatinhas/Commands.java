package botthegatinhas;

import java.util.List;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.guild.voice.GuildVoiceJoinEvent;
import net.dv8tion.jda.api.events.guild.voice.GuildVoiceUpdateEvent;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Commands extends ListenerAdapter {
    
    public void sendMessage(TextChannel ch, String msg) {
        
        ch.sendMessage(msg).queue();
    }
    
    public String prefix = "!";
    
    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        
        String[] args = event.getMessage().getContentRaw().split(" ");
        
        if (args[0].equalsIgnoreCase(prefix + "Pet")){
            
            event.getMessage().reply("Nyaaa~~ uwu").queue();
            
        }
        
    }
    
    @Override
    public void onGuildVoiceJoin​(GuildVoiceJoinEvent event){
        
       List<TextChannel> channel = event.getJDA().getTextChannelsByName("chat", true);
       String a = event.getEntity().getAsMention();
       String b = event.getChannelJoined().getAsMention();
       String msg = "A gatinha "+a+" entrou no canal "+b+" Nyaaa ~~";
        
        channel.forEach(ch -> {
            sendMessage(ch, msg);
        });
    }
    
    
}
