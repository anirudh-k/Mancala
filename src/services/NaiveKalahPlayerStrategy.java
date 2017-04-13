package services;

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
    // TODO s[i][j] represents the score increase sowing from cup number i
    // containing j stones (consider go again rule which makes precomputation impossible)
    int[][] s = new int[model.getBoardLength()][];
    int cupNum = -1;
    for (int i = 0; i < model.getBoardLength(); i += 1) {
      //int best = 0;
    }
    return cupNum;
  }
}
