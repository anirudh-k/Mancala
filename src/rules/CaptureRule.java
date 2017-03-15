package rules;

import models.Cup;
import models.MancalaModel;
import rules.MancalaRule;

/**
 * Created by paul on 3/14/17.
 * To represent the "capture rule". When a player drops the last stone in their hand in an empty cup
 * that they own, that player places the last stone they placed along with all stones in the cup
 * across from the empty cup in their scoring cup.
 */
public class CaptureRule implements MancalaRule {

  @Override
  public void apply(MancalaModel model, Cup cup, int hand) {
    if (hand == 0 && cup.getStones() == 1) {
      //TODO
    }
  }
}
