package cidadeDorme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		List<String> players = new ArrayList<>();
		
		players.add("Bianca");
		players.add("Pedro");
		players.add("Alan");
		players.add("Josi");
		players.add("Joel");
		
		Collections.shuffle(players);
		
		System.out.println("===== CIDADE DORME =====\n");
		
		System.out.println("ASSASSINO: " + players.get(0).toUpperCase());
		System.out.println("ANJO:      " + players.get(1).toUpperCase());
		
		System.out.println("\n========================");
		
	}
}