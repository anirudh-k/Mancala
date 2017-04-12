package services;

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
   * Returns the strategy's sow choice given the current board configuration.
   * @param model model to be analyzed
   * @return an integer representing the cup to sow from
   */
  int getMove(MancalaModel model);
}
