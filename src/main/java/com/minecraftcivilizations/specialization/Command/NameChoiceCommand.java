package com.minecraftcivilizations.specialization.Command;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Default;
import org.bukkit.entity.Player;
import com.minecraftcivilizations.specialization.util.PlayerUtil;

@CommandAlias("namechoice_removed")
public class NameChoiceCommand extends BaseCommand {

    @Default
    public void disabled(Player sender) {
        PlayerUtil.message(sender, "§cThe name selection system has been removed from this build.");
    }
}
