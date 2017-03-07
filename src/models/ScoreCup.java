package models;

/**
 * Created by paul on 3/7/17.
 * To represent a score cup. A score cup may not be moved from.
 */
public class ScoreCup implements Cup {
  int stones;
  int player;

  public ScoreCup(int player) {
    this.stones = 0;
    this.player = player;
  }

  @Override
  public int getPlayer() {
    return this.player;
  }

  @Override
  public int getStones() {
    return this.stones;
  }

  @Override
  public int getScore() {
    return this.stones;
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
