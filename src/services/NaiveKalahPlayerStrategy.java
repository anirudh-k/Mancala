package services;

import models.Cup;
import models.KalahModel;
import models.MancalaModel;
import models.PlayingCup;
import models.ScoreCup;

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
    KalahModel sim = new KalahModel((KalahModel) model);
    // TODO s[i][j] represents the score increase sowing from cup number i on moving player's side
    // containing j stones (consider go again rule which makes precomputation impossible)
    int[][] s = new int[sim.getBoardLength()][36]; //TODO placeholder number that should represent the maximum number of stones that can be in a cup at any one time
    return getMoveHelp(sim, s);
  }

  private int getMoveHelp(KalahModel model, int[][] s) {
    Cup[][] cups = model.getCups();
    int boardLength = cups[0].length;
    boolean isFirstPlayerTurn = model.isFirstPlayerTurn();
    int mostStones = 0;
    int cupIndex = 0;
    int side;
    if (isFirstPlayerTurn) {
      side = 0;
    }
    else {
      side = 1;
    }
    for (int i = 0; i < boardLength - 1; i += 1) { // exclude scoring cup
      int stones = cups[side][i].getStones();
      if (stones == boardLength - (i + 1)) { // Last stone lands in moving player's scoring cup
        s[i][stones] += 1;
        KalahModel sim = new KalahModel(model);
        sim.sow(i);
        int potentialCup = getMoveHelp(sim, s);
        s[i][stones] += s[potentialCup][sim.getCups()[side][potentialCup].getStones()]; // Possible bug not passing value of s back to this instance, use hashmap?
        // FIX 2d array i = cupnum j = map of numStones to scoreIncrease
      }
      else if (stones > boardLength - (i + 1)) { // sow reaches past moving player's scoring cup
        s[i][stones] += (stones - (boardLength - i)) / (boardLength * 2 - 1);
      }
      else { // sow does not reach moving player's scoring cup
        // do nothing
      }
      if (s[i][stones] > mostStones) {
        mostStones = s[i][stones];
        cupIndex = i;
      }
    }
    return cupIndex + 1;
  }
}
