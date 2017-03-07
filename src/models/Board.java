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
  public List<Cup> getCups();

  /**
   * Gets the number of players this board was made for
   * @return an integer representing the number of players
   */
  public int getPlayers();

  /**
   * Gets the score of the given player
   * @param player the player whose score is being accessed
   * @return
   */
  public int getScore(int player);

  /**
   * Sets up the board
   */
  public void init();

}
