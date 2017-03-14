package models;

/**
 * Created by paul on 3/7/17.
 * To represent a score cup. A score cup may not be moved from.
 */
public class ScoreCup implements Cup {
  int stones;
  int owningPlayer;

  public ScoreCup(int owningPlayer) {
    this.stones = 0;
    this.owningPlayer = owningPlayer;
  }

  public int getOwningPlayer() {
    return this.owningPlayer;
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
