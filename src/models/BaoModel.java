package models;

import java.util.List;
import models.Cup;
import models.MancalaModel;
import rules.MancalaRule;

/**
 * Created by paul on 3/28/17.
 * To represent a Bao mancala model. The rules of which are as follows:
 * TODO
 */
public class BaoModel implements MancalaModel {

  @Override
  public Cup[][] getCups() {
    return new Cup[0][];
  }

  @Override
  public int getHand(boolean isFirstPlayer) {
    return 0;
  }

  @Override
  public void sow(int cupNum, boolean isFirstPlayerTurn) {

  }


  @Override
  public boolean isFirstPlayerTurn() {
    return false;
  }

  @Override
  public boolean toggleTurn() {
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
