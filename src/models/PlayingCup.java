package models;

/**
 * Created by paul on 3/7/17.
 * To represent a playing cup. A playing cup can be moved from and does not count towards either
 * player's score.
 */
public class PlayingCup implements Cup {
  int stones;
  boolean isOwnedByFirstPlayer;

  public PlayingCup(int stones, boolean isOwnedByFirstPlayer) {
    this.stones = stones;
    this.isOwnedByFirstPlayer = isOwnedByFirstPlayer;
  }

  /**
   * Copy constructor
   * @param cup
   */
  public PlayingCup(PlayingCup cup) {
    this.stones = cup.getStones();
    this.isOwnedByFirstPlayer = cup.isOwnedByFirstPlayer();
  }

  public boolean isOwnedByFirstPlayer() {
    return isOwnedByFirstPlayer;
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
  public int take() throws IllegalArgumentException {
    int stones = this.stones;
    if (stones == 0) {
      throw new IllegalArgumentException("Cannot take from an empty cup.");
    }
    this.stones = 0;
    return stones;
  }


}
