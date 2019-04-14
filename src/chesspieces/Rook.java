package chesspieces;

import Chess.ChessPiece;
import Chess.Color;
import board.Board;

public class Rook extends ChessPiece{

	public Rook(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "R";
	}
}
