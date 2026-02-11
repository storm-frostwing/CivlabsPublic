package com.minecraftcivilizations.specialization.Player;

import com.minecraftcivilizations.specialization.Specialization;
import org.bukkit.NamespacedKey;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.List;

public class PreJoinEventListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();


        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1f, 1f);


        List<NamespacedKey> alwaysUnlockedRecipes = List.of(
                new NamespacedKey(Specialization.getInstance(), "hearty_soup"),
                new NamespacedKey(Specialization.getInstance(), "cat_spawn_egg"),
                new NamespacedKey(Specialization.getInstance(), "bell")
        );

        for (NamespacedKey key : alwaysUnlockedRecipes) {
            if (!player.hasDiscoveredRecipe(key)) {
                player.discoverRecipe(key);
            }
        }
    }
}
