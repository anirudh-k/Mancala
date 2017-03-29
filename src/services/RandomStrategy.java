package services;

import models.MancalaModel;

/**
 * Created by paul on 3/28/17.
 * To represent a "control" strategy which returns a random cup to sow from
 */
public class RandomStrategy implements StrategyAlgorithm {

  @Override
  public int bestMove(MancalaModel model) {
    return (int) (Math.round(Math.random() * model.getBoardLength()) * model.getTurn());
  }
}
