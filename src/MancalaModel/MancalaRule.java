package MancalaModel;

/**
 * Created by Paul on 12/9/2016.
 * to represent a mancala rule
 * TODO: What even is a mancala rule?
 */
public interface MancalaRule {

  /**
   * Applies this rule to a move in the model given by the beginCup and the endCup
   * @param model    the model in which the move is made
   * @param beginCup the beginning cup that the move was made
   * @param endCup   the ending cup of the move
   */
  void apply(MancalaModel model, int beginCup, int endCup);

}
