package services;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by paul on 4/11/17.
 * To represent a console user input listener
 */
public class ConsoleListener implements InputListener {
  Readable r;

  public ConsoleListener () {
    this.r = new BufferedReader(new InputStreamReader(System.in));
  }

  public ConsoleListener (Readable r) {
    this.r = r;
  }

  @Override
  public String listen() {
    return new Scanner(r).next();
  }
}
