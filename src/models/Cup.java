package models;

/**
 * Created by paul on 3/7/17.
 * To represent a cup in a game of Mancala
 */
public interface Cup {

  /**
   * true if this cup is owned by the first player, false otherwise
   * @return
   */
  boolean isOwnedByFirstPlayer();

  /**
   * Gets the number of mancala stones in this cup
   * @return an integer representing the number of stones in this cup
   */
  int getStones();

  /**
   * Gets whether this cup contributes to scoring
   * @return true if this cup adds score, false otherwise
   */
  boolean isScoring();

  /**
   * Drops stones into this cup
   * @param stones the amount to drop
   */
  void drop(int stones);

  /**
   * Takes all stones from this cup
   * @return the number of stones taken from this cup
   */
  int take() throws IllegalArgumentException;
}
