package chesspieces;

import Chess.ChessPiece;
import Chess.Color;
import board.Board;

public class King extends ChessPiece{

	public King(Board board, Color color) {
		super(board, color);
		
	}

	@Override
	public String toString() {
		return "K";
	}
	
}
