import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		
		Table game = new Table();
		Player p1 = new Player("Terminator");
		game.startTable();
		
		
		System.out.println(p1.getName() + " : "+ "Make a move");
		Scanner in = new Scanner(System.in);
		
//		p1.makeMove();
		
		
	}
}