public class Table{
	
	private char[][]game = new char[3][3];
	private int i,j;
	private Player tester;
	
	public void startTable() {	
		System.out.println("  --TicTacToe--");
		for(i=0;i<3;i++) {
			System.out.println(" ");
			for(j=0;j<3;j++) {
				game[i][j]='-';
				System.out.print(game[i][j]+"      ");
			}
		}
		System.out.println('\n');
	}
	
		
			
	
}