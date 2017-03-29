package services;

import models.MancalaModel;

/**
 * Created by paul on 3/8/17.
 * To represent the naive best sow algorithm. This algorithm seeks to maximize the amount a player
 * can increase his/her score
 * PSEUDOCODE:
 * initialize map of cup numbers to potential score from moving from that cup
 * sow from farthest left cup owned by the moving player
 * accumulate score
 */
public class NaiveStrategy implements StrategyAlgorithm {

  @Override
  public int bestMove(MancalaModel model) {
    // TODO

    return 0;
  }
}
