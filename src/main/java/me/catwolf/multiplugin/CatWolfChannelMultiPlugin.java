package me.catwolf.multiplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class CatWolfChannelMultiPlugin extends JavaPlugin implements CommandExecutor {

    @Override
        public void onEnable() {
                this.getCommand("belohnung").setExecutor(this);
                        getLogger().info("Cat-WolfChannelMultiPlugin erfolgreich aktiviert!");
                            }

                                @Override
                                    public void onDisable() {
                                            getLogger().info("Cat-WolfChannelMultiPlugin wurde deaktiviert.");
                                                }

                                                    @Override
                                                        public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
                                                                if (sender instanceof Player) {
                                                                            Player player = (Player) sender;

                                                                                        // §6 = Dunkelgold/Braun, §7 = Grau für die Klammern, §a = Grün
                                                                                                    String prefix = "§7[§6Cat-WolfChannel§7] §r";
                                                                                                                String nachricht = "§aDu konntest dir deine Belohnung erfolgreich abholen!";

                                                                                                                            player.sendMessage(prefix + nachricht);
                                                                                                                                        return true;
                                                                                                                                                } else {
                                                                                                                                                            sender.sendMessage("Dieser Befehl kann nur von Spielern genutzt werden!");
                                                                                                                                                                        return true;
                                                                                                                                                                                }
                                                                                                                                                                                    }
                                                                                                                                                                                    }
                                                                                                                                                                                    