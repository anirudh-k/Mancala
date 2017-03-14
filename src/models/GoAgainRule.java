package models;

/**
 * Created by paul on 3/14/17.
 * To represent the rule that says if a player place the last stone from their hand into their score
 * cup, they may take another turn.
 */
public class GoAgainRule implements MancalaRule {

  @Override
  public void apply(MancalaModel model, Cup cup, int hand) {
    if (hand == 0 && cup.getOwningPlayer() == model.getTurn() && cup.isScoring()) {
      model.setTurn(model.getTurn()); // TODO
    }
  }
}
