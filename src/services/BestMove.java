package services;

import models.Board;
import models.MancalaModel;

/**
 * Created by paul on 3/7/17.
 * To represent a Mancala best move implementation
 */
public interface BestMove {
  /**
   * Returns the best move the player can make given the current board configuration. The best
   * move is defined as one that maximizes the mancala pieces in the current player's score cup,
   * maximizes the potential for the players next move given the rules, and minimizes the
   * potential for the opponents next move given the rules.
   * @param model model to be analyzed
   * @return the best cup that the current player could move from
   */
  int bestMove(MancalaModel model);
}
