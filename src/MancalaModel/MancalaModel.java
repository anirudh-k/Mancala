package MancalaModel;

import java.util.List;

/**
 * Created by Paul on 12/9/2016.
 * To represent a game of mancala.
 */
public interface MancalaModel {

  /**
   * Returns the best move the player can make given the current board configuration. The best
   * move is defined as one that maximizes the mancala pieces in the current player's score cup,
   * maximizes the potential for the players next move given the rules, and minimizes the
   * potential for the opponents next move given the rules.
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
   * Gets which player's turn it is.
   * @return 1 if it is player 1's turn, 2 for player 2, etc.
   */
  int getTurn();

  /**
   * A game is over if there are no mancala pieces left on the board, i.e. every piece is in one
   * or the other player's score cup.
   * @return true if the game is over, false otherwise
   */
  boolean isGameOver();
}
