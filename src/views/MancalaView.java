package views;

import models.Cup;

/**
 * Created by paul on 3/8/17.
 * To represent a mancala view
 */
public interface MancalaView {

  /**
   * Displays a view for a mancala game
   */
  void drawBoard(Cup[][] board);

  /**
   * Displays welcome information for Mancala
   */
  void showIntro();

  /**
   * Displays the end game sequence. if winner = 0, the game is a tie
   * @param winner
   */
  void showEnd(int winner, int player1Score, int player2Score);

  /**
   * Prompts user for input
   */
  void getInput(boolean fromFirstPlayer);

  /**
   * Displays the player's move
   * @param fromFirstPlayer
   * @param cupNum
   */
  void showMove(boolean fromFirstPlayer, int cupNum);

}
