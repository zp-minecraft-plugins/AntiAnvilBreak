package pro.zackpollard.antianvilbreak;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author Zack Pollard
 */
public class AntiAnvilBreak extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {

        this.getServer().getPluginManager().registerEvents(this, this);
    }

    public void onDisable() {
    }

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {

        Block block = event.getClickedBlock();

        if(block != null) {

            if (block.getType().equals(Material.ANVIL)) {

                block.setData((byte) 0);
            }
        }
    }
}