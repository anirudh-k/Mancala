package models;

import java.util.List;

/**
 * Created by paul on 3/7/17.
 * To represent a Mancala board
 */
public interface Board {

  /**
   * Gets the cup information about the board
   * @return a {@code List<Cup>} representing this board
   */
  List<Cup> getCups();

  /**
   * Gets the next cup in the series
   * @param current the current cup
   * @return the cup after the current cup
   */
  Cup nextCup(Cup current);

  /**
   * Gets the number of players this board was made for
   * @return an integer representing the number of players
   */
  int getPlayers();

  /**
   * Gets the score of the given player
   * @param player the player whose score is being accessed
   * @return an integer representing the player's score
   */
  int getScore(int player);

  /**
   * Sets up the board
   */
  void init();

}
