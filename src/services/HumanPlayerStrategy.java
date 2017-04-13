package services;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import models.MancalaModel;
import views.MancalaView;

/**
 * Created by paul on 4/11/17.
 * To represent a human player of mancala
 */
public class HumanPlayerStrategy implements PlayerStrategy {
  InputListener listener;

  public HumanPlayerStrategy(InputListener listener) {
    this.listener = listener;
  }

  @Override
  public int getMove(MancalaModel model) {
    return getCupNum(listener.listen());
  }

  /**
   * Gets the cup to move from
   * @param input user input
   * @return integer representing cup to move from
   */
  private int getCupNum(String input) {
    int num = 0;
    for (int i = 0; i < input.length(); i += 1) {
      if (Character.isDigit(input.charAt(i))) {
        num = num + (int) Math.pow(Character.getNumericValue(input.charAt(i)), i + 1);
      }
    }
    return num;
  }
}
