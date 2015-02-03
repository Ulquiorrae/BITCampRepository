
public class TicTacToeLogicTest {

public static void main(String[] args) {
	
	TicTacToeLogic table = new TicTacToeLogic(3);
	
	table.setCell(0, 0);
	table.setCell(1, 1);
	table.setCell(0, 2);
	table.setCell(1, 2);
	table.setCell(0, 1);
	
	
	table.printTable();
	
}
}
