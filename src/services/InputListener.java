package services;

/**
 * Created by paul on 4/11/17.
 * To represent a way to get input from a human
 */
public interface InputListener {

  /**
   * listens for user input
   * @return the string of user input
   */
  String listen();
}
