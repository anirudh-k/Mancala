package models.bao;

import java.util.List;
import models.Board;
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
  public void sow(Board board, int turn, Cup cup, List<MancalaRule> rules) {

  }

  @Override
  public int getTurn() {
    return 0;
  }

  @Override
  public void setTurn(int turn) {

  }

  @Override
  public int nextTurn() {
    return 0;
  }

  @Override
  public int getScore(int player) {
    return 0;
  }

  @Override
  public int getPlayers() {
    return 0;
  }

  @Override
  public int getBoardLength() {
    return 0;
  }

  @Override
  public boolean isGameOver(Board board) {
    return false;
  }
}
