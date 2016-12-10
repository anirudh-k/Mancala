package MancalaModel;

import java.util.List;

/**
 * Created by Paul on 12/9/2016.
 * To represent a game of mancala
 */
public interface MancalaModel {

  /**
   * Returns the best move the player can make given the current board configuration. The best
   * move is defined as one that maximizes the mancala pieces in the current player's score cup,
   * and minimizes the number of pieces the player puts on the other player's side
   * @param turn  which player's turn it is
   * @param board the current board configuration
   * @return the best cup that the current player could move from
   */
  int bestMove(int turn, List<Integer> board);

  /**
   * Executes a move in the game according to the given list of rules
   * @param turn  which players turn it is
   * @param cup   the cup to move from
   * @param rules the rules to apply to the move
   * @param board the current board configuration
   */
  void move(int turn, int cup, List<MancalaRule> rules, List<Integer> board);

  /**
   *
   * @return which player's turn it is
   */
  int getTurn();

  /**
   * A game is over if there are no mancala pieces left on the board, i.e. every piece is in one
   * or the other player's score cup
   * @return true if the game is over, false otherwise
   */
  boolean isGameOver();
}
