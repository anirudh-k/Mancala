package models;

import java.util.List;
import rules.MancalaRule;

/**
 * Created by Paul on 12/9/2016.
 * TODO make sure model is in line with new information and refactored design - bao, oware, kalah
 * To represent a game of mancala.
 * Mancala has rules defined by the following (from https://en.wikipedia.org/wiki/Mancala):
 *
 * Most mancala games share a common general game play. Players begin by placing a certain number of
 * seeds, prescribed for the particular game, in each of the pits on the game board. A player may
 * count their stones to plot the game. A turn consists of removing all seeds from a pit, "sowing"
 * the seeds (placing one in each of the following pits in sequence) and capturing based on the
 * state of board. This leads to the English phrase "count and capture" sometimes used to describe
 * the gameplay. Although the details differ greatly, this general sequence applies to all games.
 */
public interface MancalaModel {

  /**
   * Executes a move in the game according to the given list of rules (called sowing)
   * @param board the current board configuration
   * @param turn  which players turn it is
   * @param cup   the cup to sow from
   * @param rules the rules to apply to the sow
   */
  void sow(Board board, int turn, Cup cup, List<MancalaRule> rules);

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
   * Gets the length of the board. Length is defined as the amount of cups under any one player's
   * control
   * @return an integer representing board length
   */
  int getBoardLength();

  /**
   * A game is over if there are no mancala pieces left on the board, i.e. every piece is in a
   * {@code ScoreCup}.
   * @return true if the game is over, false otherwise
   */
  boolean isGameOver(Board board);
}
