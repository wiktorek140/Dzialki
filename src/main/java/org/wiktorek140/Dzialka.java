package org.wiktorek140;


import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.*;
import com.sk89q.worldguard.bukkit.*;

public class Dzialka extends JavaPlugin{

public void onEnable(){	
	
}

private WorldGuardPlugin getWorldGuard() {
    Plugin plugin = getServer().getPluginManager().getPlugin("WorldGuard");
 
    // WorldGuard may not be loaded
    if (plugin == null || !(plugin instanceof WorldGuardPlugin)) {
        return null; // Maybe you want throw an exception instead
    }
 
    return (WorldGuardPlugin) plugin;
}

public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
{
	String name = ((Player) sender).getLocation().getWorld().getName();
	sender.sendMessage(name);
	
if ((sender instanceof Player) && (name.equalsIgnoreCase("world") == true)){
	if (cmd.getName().equalsIgnoreCase("dzialka")){
		if (args.length == 0){
		sender.sendMessage("]========================[");
		sender.sendMessage("]   Dzialka v.1.2 by misio345            [ ");
		sender.sendMessage("]   Przepisana na plugin by wiktorek140  [ ");
		sender.sendMessage("]========================[ ");
		if(sender.hasPermission("dzialka.tworzenie")){
			sender.sendMessage("Komenda &c/dzialka stworz &fzajmuje teren 3x3 chunki z srodkowym na ktorym stoisz. ");}
		if (sender.hasPermission("dzialka.tworzenieV")){
			sender.sendMessage("Komenda &c/dzialka stworzVIP &fzajmuje teren 7x7 chunki z srodkowym na ktorym stoisz.");}
		if(sender.hasPermission("dzialka.tworzenieS")) {
			sender.sendMessage("Komenda &c/dzialka stworzSVIP &fzajmuje teren 9x9 chunki z srodkowym na ktorym stoisz. ");}
		
	    sender.sendMessage("Komenda &c/dzialka usun &fusuwa dzialke. ");
		sender.sendMessage("Komenda &c/dzialka zapros nick &fdodaje osobe do dzialki. ");
		sender.sendMessage("Komenda &c/dzialka wypros nick &fusuwa osobe z dzialki. ");
		}
		else if (args[0].equalsIgnoreCase("stworz") == true) {
			//TODO sprawdzenie bloków
			
			sender.sendMessage("Tak");
						
			
			if (sender.hasPermission("dzialka.tworzenie") && checkChunk((Player) sender, 17)){
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "pex user "+sender.getName()+" add worldedit.selection.chunk");
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "pex user "+sender.getName()+" add worldedit.selection.expand");
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "pex user "+sender.getName()+" add worldguard.region.define");
				Bukkit.getServer().dispatchCommand(sender, "/chunk");
				Bukkit.getServer().dispatchCommand(sender, "/expand 16 16 east");
				Bukkit.getServer().dispatchCommand(sender, "/expand 16 16 north");
				Bukkit.getServer().dispatchCommand(sender, "rg define "+sender.getName()+" "+sender.getName());
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "pex user "+sender.getName()+" remove worldedit.selection.expand");
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "pex user "+sender.getName()+" remove worldedit.selection.expand");
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "pex user "+sender.getName()+" remove worldedit.selection.expand");
			} else sender.sendMessage("Nie masz uprawnien aby stworzyc dzialke.");
		}
		else if (args[0].equalsIgnoreCase("stworzVIP") == true){
			//TODO sprawdzenie bloków
			
			sender.sendMessage("Tak");
			
			
			
			if (sender.hasPermission("dzialka.tworzenie") && checkChunk((Player) sender, 50)){
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "pex user "+sender.getName()+" add worldedit.selection.chunk");
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "pex user "+sender.getName()+" add worldedit.selection.expand");
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "pex user "+sender.getName()+" add worldguard.region.define");
				Bukkit.getServer().dispatchCommand(sender, "/chunk");
				Bukkit.getServer().dispatchCommand(sender, "/expand 48 48 east");
				Bukkit.getServer().dispatchCommand(sender, "/expand 48 48 north");
				Bukkit.getServer().dispatchCommand(sender, "rg define "+sender.getName()+" "+sender.getName());
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "pex user "+sender.getName()+" remove worldedit.selection.expand");
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "pex user "+sender.getName()+" remove worldedit.selection.expand");
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "pex user "+sender.getName()+" remove worldedit.selection.expand");
			} else sender.sendMessage("Nie masz uprawnien aby stworzyc dzialke.");
		}
		else if (args[0].equalsIgnoreCase("stworzSVIP") == true){
			//TODO sprawdzenie bloków
			
			sender.sendMessage("Tak");
			
			
			
			if (sender.hasPermission("dzialka.tworzenie")&& checkChunk((Player) sender, 70)){
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "pex user "+sender.getName()+" add worldedit.selection.chunk");
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "pex user "+sender.getName()+" add worldedit.selection.expand");
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "pex user "+sender.getName()+" add worldguard.region.define");
				Bukkit.getServer().dispatchCommand(sender, "/chunk");
				Bukkit.getServer().dispatchCommand(sender, "/expand 64 64 east");
				Bukkit.getServer().dispatchCommand(sender, "/expand 64 64 north");
				Bukkit.getServer().dispatchCommand(sender, "rg define "+sender.getName()+" "+sender.getName());
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "pex user "+sender.getName()+" remove worldedit.selection.expand");
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "pex user "+sender.getName()+" remove worldedit.selection.expand");
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "pex user "+sender.getName()+" remove worldedit.selection.expand");
				return true;
			} else sender.sendMessage("Nie masz uprawnien aby stworzyc dzialke.");return false;
		}
		else if (args[0].equalsIgnoreCase("usun") == true){
			if(sender.hasPermission("dzialka.zarzadzanie")){
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "pex user "+sender.getName()+" add worldguard.region.remove.*");
				Bukkit.getServer().dispatchCommand(sender, "rg delete "+sender.getName());
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "pex user "+sender.getName()+" remove worldguard.region.remove.*");
				return true;
			}
			else sender.sendMessage("Nie masz uprawnien aby stworzyc dzialke.");return false;
		}
		else if (args[0].equalsIgnoreCase("zapros") == true){
			if(sender.hasPermission("dzialka.zarzadzanie")){
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "pex user "+sender.getName()+" add worldguard.region.remove.*");
				Bukkit.getServer().dispatchCommand(sender, "rg addmember "+sender.getName()+" "+args[1]);
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "pex user "+sender.getName()+" remove worldguard.region.remove.*");
				return true;
			}
			else sender.sendMessage("Nie masz uprawnien aby stworzyc dzialke.");return false;		
		}
		else if (args[0].equalsIgnoreCase("wypros") == true){
			if(sender.hasPermission("dzialka.zarzadzanie")){
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "pex user "+sender.getName()+" add worldguard.region.remove.*");
				Bukkit.getServer().dispatchCommand(sender, "rg removemember "+sender.getName()+" "+args[1]);
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "pex user "+sender.getName()+" remove worldguard.region.remove.*");
				return true;
			}
			else sender.sendMessage("Nie masz uprawnien aby stworzyc dzialke.");return false;			
		}
	}		
}
else sender.sendMessage("W tym swiecie nie mozna tworzyc dzialek."); return false;
}

public boolean checkChunk(Player player, int length){
    // Set one corner of the cube to the given location.
    // Uses getBlockN() instead of getN() to avoid casting to an int later.
    Location loc = player.getLocation();
	int x1 = loc.getBlockX(); 
    int y1 = loc.getBlockY();
    int z1 = loc.getBlockZ();
 
    // Figure out the opposite corner of the cube by taking the corner and adding length to all coordinates.
    int x2 = x1 + length;
    int z2 = z1 + length;
 
    int x3 = x1 - length;
    int z3 = z1 - length;
 
    int x4 = x1 + length;
    int z4 = z1 - length;
    
    int x5 = x1 - length;
    int z5 = z1 + length;
    World world = loc.getWorld();
    boolean bool = true;
    // Loop over the cube in the x dimension.
    for (int xPoint = x1; xPoint <= x2; xPoint++) { 
            // Loop over the cube in the z dimension.
            for (int zPoint = z1; zPoint <= z2; zPoint++) {
                // Get the block that we are currently looping over.
                Block currentBlock = world.getBlockAt(xPoint, y1, zPoint);
                // Set the block to type 57 (Diamond block!)
                if (!getWorldGuard().canBuild(player, currentBlock)) {bool = false;}
        }
    }
    if (bool){
    for (int xPoint = x1; xPoint >= x3; xPoint--) { 
        // Loop over the cube in the z dimension.
        for (int zPoint = z1; zPoint >= z3; zPoint--) {
            // Get the block that we are currently looping over.
            Block currentBlock = world.getBlockAt(xPoint, y1, zPoint);
            // Set the block to type 57 (Diamond block!)
            if (!getWorldGuard().canBuild(player, currentBlock)) {bool=  false;}
        
        }
       }}
    if (bool){
    for (int xPoint = x1; xPoint <= x4; xPoint++) { 
        // Loop over the cube in the z dimension.
        for (int zPoint = z1; zPoint >= z4; zPoint--) {
            // Get the block that we are currently looping over.
            Block currentBlock = world.getBlockAt(xPoint, y1, zPoint);
            // Set the block to type 57 (Diamond block!)
            if (!getWorldGuard().canBuild(player, currentBlock)) {bool = false;}
        
    }
}}
    if (bool){
    for (int xPoint = x1; xPoint >= x5; xPoint--) { 
        // Loop over the cube in the z dimension.
        for (int zPoint = z1; zPoint <= z5; zPoint++) {
            // Get the block that we are currently looping over.
            Block currentBlock = world.getBlockAt(xPoint, y1, zPoint);
            // Set the block to type 57 (Diamond block!)
           if (!getWorldGuard().canBuild(player, currentBlock)) {bool = false;}
        
    }
}}
    return bool;
}

}
