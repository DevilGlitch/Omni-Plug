//      Omni-Plug/Plugins/java/Security/src/main/java/com/github/DevilGlitch/Security.java       ||
// ================================================================================================
// Made By                      ||
//  Just_A_Mangled_Corpse.exe   ||
//      ReturnToAsh.exe         ||
//      DevilGlitch             ||
//      TheLostMoon             ||
//      Stray Cat               ||
//      SIN                     ||
//================================

package com.github.DevilGlitch;

import android.content.Context;
import com.aliucord.Utils;
import com.aliucord.annotations.AliucordPlugin;
import com.aliucord.api.CommandsAPI;
import com.aliucord.entities.Plugin;
import com.discord.api.commands.ApplicationCommandType;

import java.util.Arrays;

// Aliucord Plugin annotation. Must be present on the main class of your plugin

@AliucordPlugin(requiresRestart = false) /* Whether your plugin requires a restart after being installed/updated */

// Plugin class. Must extend Plugin and override start and stop
// Learn more: https://github.com/Aliucord/documentation/blob/main/plugin-dev/1_introduction.md#basic-plugin-structure
// Learn more: https://github.com/Aliucord/documentation/blob/main/plugin-dev/2_commands.md

public class Encrytion extends Plugin {
    
    @Override
    public void start(Context context) {

        private String defKey = "A1B5C2frw0wq3#4$!";
        private String msg = "";
        private String s = "tH3-83g/1Ni/nG-0F-tH3-3nD";   
        // Make sure you Change this in ___ Patch too if you decide to do it
        
        /*
        *   ^-------------------------------------------------------------------------
        *   Start Phrase Stating its a Encrypted message.
        *   Can be changed if desired
        *   Just make sure you are warry of break chars and basic java rules
        *   -----------------------
        */
        
        private String s1 = "%Demon%";
        private String s2 = "/Gl/tch/";
        private String s3 = "#crushed!";                // All the s# can be changed too. <SEE ABOVE>
        private String s4 = "^Butter-fly^";
        private String s5 = "H0n3StY";
        private String s6 = "1-3ds$%#2x1.yt?";
        private String s7 = "-R0-S3-";
        private char [] tist;
        private int [] tsar;
        private String [] tran;
        private boolean yeahono;

        public void start(Context context) {                //Set Key CMD
                "setkey",
                "Sets your Encrytion Key",
                Arrays.asList(
                        Utils.createCommandOption(ApplicationCommandType.STRING, "key", "Key String for Encrytion"),
                ), ctx -> {
                    
                    if (ctx.containsArg("key")) {
                        
                        // ^ Check if a user argument was passed
                        
                        var key = ctx.getRequiredString("key");
                        return new CommandsAPI.CommandResult("Key is now: `" + key + "`!");
                        defaultKey = key;
                    
                    } else {
                    
                        // Returns defaultKey if not changed

                        return new CommandsAPI.CommandResult(defKey, null, false);  
                        
                        //Displays key<1> not as a embed<2> only visible to the author<3>

                    }
                }
        );

        commands.registerCommand("viewkey", "Displays current encryption key", ctx -> {                 // View Key CMD
            
            return new CommandsAPI.CommandResult(defKey, null, false);

        });

        commands.registerCommand(
                "encrypt",
                "Encrypt a message",
                Arrays.asList(
                        Utils.createCommandOption(ApplicationCommandType.STRING, "name", "Person to say hello to"),
                        Utils.createCommandOption(ApplicationCommandType.USER, "user", "User to say hello to")
                ),
                ctx -> {
                    // Check if a user argument was passed
                    if (ctx.containsArg("user")) {
                        var user = ctx.getRequiredUser("user");
                        return new CommandsAPI.CommandResult("Hello " + user.getUsername() + "!");
                    } else {
                        // Returns either the argument value if present, or the defaultValue ("World" in this case)
                        var name = ctx.getStringOrDefault("name", "World");
                        return new CommandsAPI.CommandResult("Hello " + name + "!");
                    }
                }
        );
    }

    @Override
    public void stop(Context context) {
        // Unregister all commands
        commands.unregisterAll();
    }
}
