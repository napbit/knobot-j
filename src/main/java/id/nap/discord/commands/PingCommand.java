package id.nap.discord.commands;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class PingCommand extends Command {
	@Override
	public void onCommand(MessageReceivedEvent event, String[] args) {
		sendMessage(event, "Pong!");
	}

	@Override
	public String getCommand() {
		return "!ping";
	}

	@Override
	public boolean isDisabled() {
		return false;
	}
}
