package views;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import models.Cup;

/**
 * Created by paul on 3/8/17.
 * To represent a console view implementation of Mancala
 */
public class MancalaConsoleView implements MancalaView {
  Readable r;
  Appendable a;

  public MancalaConsoleView (Readable r, Appendable a) {
    this.r = r;
    this.a = a;
  }

  public MancalaConsoleView() {
    this.r = new BufferedReader(new InputStreamReader(System.in));
    this.a = new OutputStreamWriter(System.out);
  }

  @Override
  public void drawBoard(Cup[][] board) {
    try {
      printLine(board[0].length);
      for (int i = 0; i < board.length; i += 1) {
        a.append("|");
        for (int j = 0; j < board[0].length; j += 1) {
          if (!board[i][j].isScoring()) {
            a.append(board[i][j].getStones() + "|");
          }
          else {
            a.append(" " + board[i][j].getStones() + " |");
          }
        }
        printLine(board[0].length);
      }
      a.append("\n");

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  /**
   * Prints a line of the board
   * @param length
   */
  private void printLine(int length) {
    try {
      for (int j = 0; j < length; j += 1) {
        a.append("---");
      }
      a.append("\n");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void getIntro() {
    try {
      a.append("Welcome to Mancala!");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
