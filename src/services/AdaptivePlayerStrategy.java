package services;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import models.MancalaModel;

/**
 * Created by paul on 7/6/17.
 * To represent a strategy in which the AI adapts to the strategy being used against it.
 * The adaptive player strategy implements a genetic algorithm constructed as such:
 * Individual: a set of cups moved from in a game
 * Fitness: How many stones they ended with in their cup at the end of the game
 */
public class AdaptivePlayerStrategy implements PlayerStrategy {

  int generations = 100;
  int popSize = 20;
  PlayerStrategy otherStrat;
  List<Integer> moves;


  public AdaptivePlayerStrategy(PlayerStrategy otherStrat) {
    this.otherStrat = otherStrat;
    moves = evolve();
  }

  /**
   * Fitness function - movesets with higher scores at the end are favored
   * @return
   */
  private int evaluate(List<Integer> moveset) {
    return 0;
  }

  /**
   * Main evolver for adaptation
   * @return
   */
  private List<Integer> evolve() {
    Map<Integer, List<Integer>> fitness = new HashMap<>();
    List<List<Integer>> population;
    for (int i = 0; i < generations; i += 1) {
      for (int j = 0; j < popSize; j += 1) {

      }
    }

    return fitness.get(Collections.max(fitness.keySet()));
  }

  @Override
  public int getMove(MancalaModel model) {
    return moves.remove(0);
  }


}
