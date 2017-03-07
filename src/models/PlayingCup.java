package models;

/**
 * Created by paul on 3/7/17.
 * To represent a playing cup. A playing cup can be moved from and does not count towards either
 * player's score.
 */
public class PlayingCup implements Cup {
  int stones;
  int player;

  public PlayingCup(int stones, int player) {
    this.stones = stones;
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
    return 0;
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
