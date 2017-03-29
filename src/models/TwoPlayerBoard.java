package models;

import java.util.List;

/**
 * Created by paul on 3/7/17.
 * To represent a standard two-player western mancala board
 * TODO move this implementation to the kalah model
 */
public class TwoPlayerBoard implements Board {
  List<Cup> cups;
  int players;
  int stonesPerCup;
  int sideLength;

  /**
   * Specific constructor
   * @param stonesPerCup initial stones per cup
   * @param sideLength number of cups per side
   * @param players number of players
   */
  public TwoPlayerBoard (int stonesPerCup, int sideLength, int players) {
    this.stonesPerCup = stonesPerCup;
    this.sideLength = sideLength;
    this.players = players;
    init();
  }

  /**
   * Default constructor
   */
  public TwoPlayerBoard() {
    this.stonesPerCup = 4;
    this.sideLength = 7;
    this.players = 2;
    init();
  }

  @Override
  public List<Cup> getCups() {
    return this.cups;
  }

  @Override
  public Cup nextCup(Cup current) {
    if (this.cups.contains(current)) {
      int i = this.cups.indexOf(current);
      if (i != this.cups.size()) {
        return this.cups.get(i + 1);
      }
      else {
        return this.cups.get(0);
      }
    }
    else {
      throw new IllegalArgumentException("Cup not found in the board.");
    }
  }

  @Override
  public int getPlayers() {
    return this.players;
  }

  @Override
  public int getScore(int player) {
    int score = 0;
    for (Cup c : cups) {
      if (c.isScoring() && c.getOwningPlayer() == player) {
        score += c.getStones();
      }
    }
    return score;
  }

  @Override
  public int getLength() {
    return this.sideLength;
  }

  @Override
  public void init() {
    for (int i = 0; i < this.players; i += 1) {
      for (int j = 0; j < this.sideLength - 1; j += 1) {
        cups.add(new PlayingCup(this.stonesPerCup, i));
      }
      cups.add(new ScoreCup(i));
    }
  }
}
