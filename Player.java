import java.util.InputMismatchException;
import java.util.Scanner;
public class Player {
	
	private int row;
	private int col;
	private int flag;
	private char colChar;
	private char symbol;
	
	Scanner in = new Scanner(System.in);
	
	public Player() {
	}
	public Player(char symbol) {
		this.symbol=symbol;
	}
	public Player(int flag) {
		this.flag=flag;
	}
	public Player(int row,int col) {
		this.row=row;
		this.col=col;
	}
	public Player(int row,int col,char symbol) {
		this.row=row;
		this.col=col;
		this.symbol=symbol;
	}
	public char getSymbol() {
		return symbol;
	}
	public int getRow() {
		return row;
	}
	public int getCol() {
		return col;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag=flag;
	}
	public void setSymbol(char symbol) {
		while(flag==0) {
			try {
				System.out.println("Please enter the symbol you would to like to play as: (X or O)");
				this.symbol=in.next(".").charAt(0);
				flag=1;
			}
			catch(Exception e) {
				System.out.println("Invalid input");
			}
			in.nextLine();
		}
		while(flag==1){
			if(this.symbol=='x' || this.symbol=='o' || this.symbol=='X' || this.symbol=='O') {
				flag=0;
			}	
			else {
				System.out.println("Invalid input.Choose between 'x' and 'o'");
				this.symbol=in.next().charAt(0);
			}
		}
	}
	public void setRow(int row) {
		while(flag==0) {
			try {
				System.out.println("Please enter a row (1/2/3): ");
				this.row=in. nextInt();
				flag=1;
			}
			catch(InputMismatchException e) {
				System.out.println("Invalid input");
			}
			in.nextLine();
		}
		while(this.row<1 || this.row>3) { 
				System.out.println("Invalid input.Choose between (1/2/3)");
			    this.row =in.nextInt();
		}
	}	
	public void setCol(int col) {
		while(flag==1) {
			try {
				System.out.println("Please enter a collumn (A/B/C): ");
				colChar =in.next(".").charAt(0);
				flag=0;
			}
			catch(Exception e) {
				System.out.println("Invalid input");
			}
			in.nextLine();
		}	
		while(flag==0) {	
			if(colChar=='a' || colChar=='A') {
				this.col=0;
				flag=1;
			}	
			else if(colChar=='b' || colChar=='B') {
				this.col=1;
				flag=1;
			}
			else if(colChar=='c' || colChar=='C') {
				this.col=2;
				flag=1;
			}
			else {
				System.out.println("Invalid input.Choose between (A/B/C)");
				colChar =in.next().charAt(0);	
			}
		}	
	}
}

