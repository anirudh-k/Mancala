package models;

/**
 * Created by paul on 3/7/17.
 * To represent a cup in a game of Mancala
 */
public interface Cup {

  /**
   * Gets the player who owns this cup
   * @return an integer representing owning player
   */
  public int getPlayer();

  /**
   * Gets the number of mancala stones in this cup
   * @return an integer representing the numeber of stones in this cup
   */
  public int getStones();

  /**
   * Gets the score contributed by this cup
   * @return an integer representing the score contributed by this cup
   */
  public int getScore();

  /**
   * Drops stones into this cup
   * @param stones the amount to drop
   */
  public void drop(int stones);

  /**
   * Takes all stones from this cup
   * @return the number of stones taken from this cup
   */
  public int take();
}
