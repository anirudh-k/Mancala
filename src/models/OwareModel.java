package models;

import java.util.List;
import models.Cup;
import models.MancalaModel;
import rules.MancalaRule;

/**
 * Created by paul on 3/28/17.
 * To represent an Oware mancala model, the rules for which are as follows:
 * TODO
 *
 */
public class OwareModel implements MancalaModel {

  @Override
  public Cup[][] getCups() {
    return new Cup[0][];
  }

  @Override
  public void sow(Cup cup) {

  }

  @Override
  public boolean isFirstPlayerTurn() {
    return false;
  }

  @Override
  public boolean toggleTurn(int turn) {
    return false;
  }

  @Override
  public int getScore(boolean firstPlayer) {
    return 0;
  }

  @Override
  public int getBoardLength() {
    return 0;
  }

  @Override
  public boolean isGameOver() {
    return false;
  }

  @Override
  public void init() {

  }
}
