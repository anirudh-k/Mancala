package views;

import controllers.MancalaController;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;

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
  public void display() {
    try {
      a.append("Welcome to Mancala");

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
