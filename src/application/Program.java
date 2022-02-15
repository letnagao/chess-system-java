package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		//Caminho pasta chess-system > bin > git bash here > (comando) java application/Program
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
	}

}
