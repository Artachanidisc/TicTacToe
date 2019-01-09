public class Main {
	
	public static void main(String[] args) {
		
		
		Table game = new Table("TicTacToe");
		Player p1 = new Player();
		Computer x = new Computer();
			
		game.setBoard();
		game.printBoard();
		
		p1.setSymbol(p1.getSymbol());
		x.setSymbol(p1.getSymbol());
		
		while(game.gamePlays() && !game.isFull()) {
			p1.setRow(p1.getRow());
			p1.setCol(p1.getCol());
			game.addPlayer(p1);
			game.printBoard();
	    	p1.setFlag(0);			
	    	x.setRow(x.getRow());
	    	x.setCol(x.getCol());
	    	game.addComputer(x);
	    	game.printBoard();
		}
	}
} 
