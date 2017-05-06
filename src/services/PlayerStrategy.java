package services;

import models.Cup;
import models.MancalaModel;

/**
 * Created by paul on 3/7/17.
 * To represent a Mancala strategy implementation. I should test which one is the best by having
 * them all play each other.
 * Ideas:
 * MinMax
 * Naive
 * Random (for control)
 * Human (takes human input)
 */
public interface PlayerStrategy {

  /**
   * Gets the next move for the given strategy
   * @param model
   * @return
   */
  int getMove(MancalaModel model);
}
