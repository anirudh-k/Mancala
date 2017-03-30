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
 *
 */
public interface StrategyAlgorithm {
  /**
   * Returns the best sow the player can make given the current board configuration. The best
   * sow is defined as one that maximizes the mancala pieces in the current player's score cup,
   * maximizes the potential for the players next sow given the rules, and minimizes the
   * potential for the opponents next sow given the rules.
   * @param model model to be analyzed
   * @return the best cup that the current player could sow from
   */
  int bestMove(MancalaModel model);
}
