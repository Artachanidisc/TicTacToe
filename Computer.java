import java.util.Random;

public class Computer {
	
	private int row;
	private int col;
	private char symbol;
	
	Random t = new Random();
	
	public Computer() {
	}
	public Computer(int row,int col,char symbol) {
		this.row=row;
		this.col=col;
		this.symbol=symbol;
	}
	public int getRow() {
		return row;
	}
	public int getCol() {
		return col;
	}
	public char getSymbol() {
		return symbol;
	}
	public void setSymbol(char symbol) {
		if(symbol=='o') {
			this.symbol='x';
		}			
		else if(symbol=='x') {
			this.symbol='o';
		}		
		else if(symbol=='O') {
			this.symbol='X';
		}
		else if(symbol=='X') {
			this.symbol='O';
		}
	}
	public void setRow(int row) {
		this.row= t.nextInt(3);
	}
	public void setCol(int col) {
		this.col=t.nextInt(3);
	}
}
