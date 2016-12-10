package MancalaModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Paul on 12/9/2016.
 * To represent a two player game of mancala
 */
public class TwoPlayerMancalaModel implements MancalaModel {
  ArrayList<Integer> board;
  int turn;

  /**
   * Convenience Constructor, player 1's turn if turn is even, player 2's turn otherwise
   * @param board the board configuration
   * @param turn  which players turn it is
   */
  public TwoPlayerMancalaModel(ArrayList<Integer> board, int turn) {
    this.board = board;
    this.turn = turn;
  }

  /**
   * Default constructor for a game of mancala, 0 pieces in each score cup, 4 everywhere else
   */
  public TwoPlayerMancalaModel() {
    this.board = new ArrayList<Integer>(14);
    this.turn = 0;
    initBoard(board, 4);
  }

  /**
   * Initializes a mancala board, with 0 in each score cup and the given amount everywhere
   * else
   */
  private void initBoard(ArrayList<Integer> board, int piecesPerCup) {
    for(int i = 0; i < board.size(); i += 1) {
      board.set(i, piecesPerCup);
    }
    board.set(0, 0);
    board.set(board.size()/2, 0);
  }

  @Override
  public int bestMove(int turn, List<Integer> board) {
    return 0;
  }

  @Override
  public int getTurn() {
    return turn;
  }

  @Override
  public void move(int turn, int cup, List<MancalaRule> rules, List<Integer> board) {

  }

  @Override
  public boolean isGameOver() {
    boolean gameOver = false;
    for(int i = 0; i < board.size(); i += 1) {
      gameOver = gameOver || (i != 0 && i != board.size()/2 && board.get(i) > 0);
    }
    return gameOver;
  }
}
