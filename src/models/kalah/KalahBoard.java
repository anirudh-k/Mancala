package models.kalah;

import java.util.List;
import models.Board;
import models.Cup;

/**
 * Created by paul on 3/28/17.
 * To represent a Kalah board
 * TODO
 */
public class KalahBoard implements Board {

  @Override
  public List<Cup> getCups() {
    return null;
  }

  @Override
  public Cup nextCup(Cup current) {
    return null;
  }

  @Override
  public int getPlayers() {
    return 0;
  }

  @Override
  public int getScore(int player) {
    return 0;
  }

  @Override
  public int getLength() {
    return 0;
  }

  @Override
  public void init() {

  }
}
