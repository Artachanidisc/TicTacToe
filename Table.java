public class Table {
	
	private String name;
	public static char[][]game=new char[3][3];
	private Player p1;
	private Computer p;
	private int i;
	private int j;
	
	public Table(String name) {
		this.name=name;
	}
	public Table() {
	}
	public char[][] getBoard() {
		return game;
	}
	public void setBoard(){
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				game[i][j]='-';
			}
		}
	}
	public void printBoard() {
		System.out.println("  -- TicTacToe --\n");
		System.out.print("    A     B     C");
		for(i=0;i<3;i++) {
			System.out.println();
			System.out.print(i+1);
			System.out.print("   ");
			for(j=0;j<3;j++) {
				System.out.print(game[i][j]+"     ");
			}
		}
		System.out.println("\n");
	}
	public boolean isFull() {
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				if(game[i][j]=='-') {
					return false;
				}
			}
		}
		return true;	
	}
	public boolean gamePlays() {
		for(j=0;j<3;j++) {
			if((game[0][j]==game[1][j])&&(game[0][j]!='-') && (game[1][j]==game[2][j])) {
				System.out.println("We have a winner!");
				return false;
			}
		}		
		for(i=0;i<3;i++) {	
			if((game[i][0]==game[i][1])&& (game[i][0]!='-') && (game[i][1]==game[i][2])) {
				System.out.println("We have a winner!");
				return false;
			}	
		}
		if((game[2][0]==game[1][1]) && (game[2][0]!='-') && (game[1][1]==game[0][2])){
			System.out.println("We have a winner!");
			return false;
		}
		else if((game[0][0]==game[1][1]) && (game[0][0]!='-') && (game[1][1]==game[2][2])) {
			System.out.println("We have a winner!");
			return false;
		}
		else if(isFull()) {
			System.out.println("Its a draw!");
			
		}
		return true;
	}
	public void addPlayer(Player p1) {
		while(game[p1.getRow()-1][p1.getCol()]=='x' || game[p1.getRow()-1][p1.getCol()]=='X' || game[p1.getRow()-1][p1.getCol()]=='o' || game[p1.getRow()-1][p1.getCol()]=='O'  ) {
			System.out.println("Slot taken \n");
			printBoard();
			p1.setFlag(0);
			p1.setRow(p1.getRow());
			p1.setCol(p1.getCol());
		}
			game[p1.getRow()-1][p1.getCol()]=p1.getSymbol();
	}
	public void addComputer(Computer p) {
		while((game[p.getRow()][p.getCol()]=='x' || game[p.getRow()][p.getCol()]=='X' || game[p.getRow()][p.getCol()]=='o' || game[p.getRow()][p.getCol()]=='O') && !isFull()) {
			System.out.println("Slot taken \n");
			printBoard();
			p.setRow(p.getRow());
			p.setCol(p.getCol());
		}
			game[p.getRow()][p.getCol()]=p.getSymbol();
	}
	
}
