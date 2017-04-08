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
   * Waits for user input
   */
  String getInput(boolean fromFirstPlayer);

}
