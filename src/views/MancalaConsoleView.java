package views;

import controllers.MancalaController;
import java.io.Writer;

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

  @Override
  public void display() {
    System.out.println("Welcome to Mancala!");
  }
}
