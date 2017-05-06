package util;

import models.Cup;
import models.PlayingCup;
import models.ScoreCup;

/**
 * Created by paul on 5/5/17.
 * To represent utilities associated with the game of mancala.
 */
public class MancalaUtils {

  /**
   * Creates a duplicate set of cups
   * @param other the set of cups to be copied
   * @return a new set of cups identical to the given set
   */
  public static Cup[][] copyCups(Cup[][] other) {
    if (other.length == 0) {
      return new Cup[0][0];
    }
    Cup[][] newCups = new Cup[other.length][other[0].length];
    for (int i = 0; i < other.length; i += 1) {
      for (int j = 0; j < other[0].length; j += 1) {
        if (other[i][j].isScoring()) { // TODO I hate this design, I should not have to check type here. Factory?
          newCups[i][j] = new ScoreCup(other[i][j].getStones(), other[i][j].isOwnedByFirstPlayer());
        }
        else {
          newCups[i][j] = new PlayingCup(other[i][j].getStones(), other[i][j].isOwnedByFirstPlayer());
        }
      }
    }
    return newCups;
  }
}
