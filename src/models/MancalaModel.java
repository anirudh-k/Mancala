package models;

import java.util.List;
import rules.MancalaRule;

/**
 * Created by Paul on 12/9/2016.
 * To represent a game of mancala.
 */
public interface MancalaModel {

  /**
   * Executes a move in the game according to the given list of rules
   * @param board the current board configuration
   * @param turn  which players turn it is
   * @param cup   the cup to move from
   * @param rules the rules to apply to the move
   */
  void move(Board board, int turn, Cup cup, List<MancalaRule> rules);

  /**
   * Gets which owningPlayer's turn it is.
   * @return 1 if it is owningPlayer 1's turn, 2 for owningPlayer 2, etc.
   */
  int getTurn();

  /**
   * Sets turn to the given integer
   * @param turn set turn to this value
   */
  void setTurn(int turn);

  /**
   * EFFECT: Advances to the next players turn
   * @return an integer representing the player whose turn it is
   */
  int nextTurn();

  /**
   * Gets the given players's score
   * @param player the given owningPlayer (1 for player 1, 2 for player 2 etc.)
   * @return an integer representing the given player's score
   */
  int getScore(int player);

  /**
   * Gets the number of players in the game
   * @return an integer representing the number of players in the game
   */
  int getPlayers();

  /**
   * A game is over if there are no mancala pieces left on the board, i.e. every piece is in a
   * {@code ScoreCup}.
   * @return true if the game is over, false otherwise
   */
  boolean isGameOver(Board board);
}
