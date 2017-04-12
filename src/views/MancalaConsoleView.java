package views;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.CharBuffer;
import java.util.Scanner;

import models.Cup;

/**
 * Created by paul on 3/8/17.
 * To represent a console view implementation of Mancala
 */
public class MancalaConsoleView implements MancalaView {
  Appendable a;

  public MancalaConsoleView (Appendable a) {
    this.a = a;
  }

  public MancalaConsoleView () {
    this.a = System.out;
  }

  @Override
  public void drawBoard(Cup[][] board) {
    try {
      printLine(board[0].length);
      a.append("|Cup Number |");
      for (int i = 0; i < board[0].length - 1; i += 1) {
        a.append(i + 1 + "|");
      }
      a.append(" " + board[0].length + " |");
      printLine(board[0].length);
      for (int i = 0; i < board.length; i += 1) {
        a.append("|Player " + (i + 1) + "   |");
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
      a.append("\n-------------");
      for (int j = 0; j < length; j += 1) {
        a.append("--");
      }
      a.append("--\n");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void showIntro() {
    try {
      a.append("Welcome to Mancala!\n");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void getInput(boolean fromFirstPlayer) {
    try {
      if (fromFirstPlayer) {
        a.append("Player 1 move: \n");
      }
      else {
        a.append("Player 2 move: \n");
      }
      } catch (IOException e) {
        e.printStackTrace();
      }
  }
}
