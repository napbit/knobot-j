package main.java.id.nap.discord.commands;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class WOTDCommand extends Command {

	@Override
	public void onCommand(MessageReceivedEvent event, String[] args) {
		
	}

	@Override
	public String getCommand() {
		return "!wotd";
	}
}