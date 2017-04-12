package services;

import models.MancalaModel;

/**
 * Created by paul on 3/8/17.
 * To represent the implementation of the Min/Max best sow algorithm. This algorithm seeks to
 * maximize the ratio: score increase/opponents score potential
 * score potential is defined as the number of pieces the opponent has under their control
 */
public class MinMaxPlayerStrategy implements PlayerStrategy {

  public MinMaxPlayerStrategy() {

  }

  @Override
  public int getMove(MancalaModel model) {
    //TODO
    return 0;
  }
}
