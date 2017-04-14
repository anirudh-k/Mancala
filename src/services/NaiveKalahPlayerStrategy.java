package services;

import models.Cup;
import models.KalahModel;
import models.MancalaModel;

/**
 * Created by paul on 3/8/17.
 * To represent the naive best sow algorithm for kalah. This algorithm seeks to maximize the amount a player
 * can increase his/her score
 * PSEUDOCODE:
 * initialize map of cup numbers to potential score from moving from that cup
 * sow from farthest left cup owned by the moving player
 * accumulate score
 */
public class NaiveKalahPlayerStrategy implements PlayerStrategy {

  @Override
  public int getMove(MancalaModel model) {
    Cup[][] cups = model.getCups();
    int side;
    if (model.isFirstPlayerTurn()) {
      side = 0;
    }
    else {
      side = 1;
    }
    // TODO s[i][j] represents the score increase sowing from cup number i
    // containing j stones (consider go again rule which makes precomputation impossible)
    int[][] s = new int[model.getBoardLength()][36]; //TODO placeholder number
    int cupNum = -1;
    for (int i = 0; i < model.getBoardLength() - 1; i += 1) {
      int stones = cups[side][i].getStones();
      if (stones == model.getBoardLength() - (i + 1)) {
        s[i][stones] += 1;
        // recurse or some shit
      }
      else if (stones > model.getBoardLength() - (i + 1)) {
        s[i][stones] += 1;
      }
      else {

      }
    }
    return cupNum;
  }
}
