package com.minecraftcivilizations.specialization.Command;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.CommandPermission;
import co.aikar.commands.annotation.Default;
import org.bukkit.entity.Player;
import com.minecraftcivilizations.specialization.util.PlayerUtil;

@CommandAlias("SimulateNameRoll")
public class RandomNameBulkTestCommand extends BaseCommand {

    @Default
    @CommandPermission("specialization.rollallnames")
    public void disabled(Player sender, int totalRolls) {
        PlayerUtil.message(sender, "§cThis command has been disabled. Name-generation has been removed from the plugin.");
    }
}
