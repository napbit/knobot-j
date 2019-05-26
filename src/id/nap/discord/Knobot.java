package id.nap.discord;

import javax.security.auth.login.LoginException;

import id.nap.discord.commands.Ping;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDABuilder;

public class Knobot {
	
	public static final int NO_TOKEN_FOUND = 500;
	
	public static void main(String[] args) throws LoginException {
		String token = "";
		
		try {
			token = getToken();
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
			System.exit(NO_TOKEN_FOUND);
		}
		
		JDABuilder builder = new JDABuilder(AccountType.BOT).setToken(token);
		
		builder.addEventListener(new Ping());
		
		builder.build();
	}
	
	private static String getToken() {
		if (System.getenv("DISCORD_TOKEN") == null) {
			throw new NullPointerException("No DISCORD_TOKEN found in system environment.");
		}
		
		return System.getenv("DISCORD_TOKEN");
	}
}
