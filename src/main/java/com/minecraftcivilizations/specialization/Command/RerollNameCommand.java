package com.minecraftcivilizations.specialization.Command;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.CommandPermission;
import co.aikar.commands.annotation.Default;
import com.minecraftcivilizations.specialization.util.PlayerUtil;
import org.bukkit.entity.Player;

@CommandAlias("rerollname|reroll")
@CommandPermission("specialization.rerollname")
public class RerollNameCommand extends BaseCommand {

    @Default
    public void disabled(Player sender) {
        PlayerUtil.message(sender, "§cThe reroll name command has been disabled. The server uses standard Minecraft player names.");
    }
}
