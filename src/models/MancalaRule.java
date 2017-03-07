package models;

/**
 * Created by Paul on 12/9/2016.
 * to represent a mancala rule
 * TODO: What even is a mancala rule?
 * Hand: pieces in the players hand
 * Rules are a set of cup and hand interactions
 *  ex: hand is not empty, drop one stone in cup
 *      cup is empty, hand has one stone, move ends
 */
public interface MancalaRule {

  /**
   * Applies this rule to a cup in a move and the current hand
   * @param model the model in which the move is made
   * @param cup   the cup having the rule applied
   * @param hand  the current hand
   */
  void apply(MancalaModel model, Cup cup, int hand);

}
