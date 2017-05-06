package models;

/**
 * Created by paul on 3/7/17.
 * To represent a score cup. A score cup may not be moved from.
 */
public class ScoreCup implements Cup {
  int stones;
  boolean isOwnedByFirstPlayer;

  public ScoreCup(boolean isOwnedByFirstPlayer) {
    this.stones = 0;
    this.isOwnedByFirstPlayer = isOwnedByFirstPlayer;
  }

  public ScoreCup(int stones, boolean isOwnedByFirstPlayer) {
    this.stones = stones;
    this.isOwnedByFirstPlayer = isOwnedByFirstPlayer;
  }

  public boolean isOwnedByFirstPlayer() {
    return this.isOwnedByFirstPlayer;
  }

  @Override
  public int getStones() {
    return this.stones;
  }

  @Override
  public boolean isScoring() {
    return true;
  }

  @Override
  public void drop(int stones) {
    this.stones += stones;
  }

  @Override
  public int take() {
    throw new IllegalArgumentException("Cannot take from a score cup.");
  }
}
