package models;

/**
 * Created by paul on 3/7/17.
 * To represent a playing cup. A playing cup can be moved from and does not count towards either
 * owningPlayer's score.
 */
public class PlayingCup implements Cup {
  int stones;
  int owningPlayer;

  public PlayingCup(int stones, int owningPlayer) {
    this.stones = stones;
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
    return false;
  }

  @Override
  public void drop(int stones) {
    this.stones += stones;
  }

  @Override
  public int take() {
    int stones = this.stones;
    this.stones = 0;
    return stones;
  }


}
