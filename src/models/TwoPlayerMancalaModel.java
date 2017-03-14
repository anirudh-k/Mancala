package models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Paul on 12/9/2016.
 * To represent a two owningPlayer game of mancala
 */
public class TwoPlayerMancalaModel implements MancalaModel {

  Board board;
  List<MancalaRule> rules;
  int turn;

  /**
   * Convenience Constructor
   * @param board the board configuration
   * @param turn  which players turn it is
   * @param rules the rules with which to play the game
   */
  public TwoPlayerMancalaModel(Board board, int turn, List<MancalaRule> rules) {
    this.board = board;
    this.turn = turn;
    this.rules = rules;
  }

  /**
   * Default constructor for a game of mancala, 0 pieces in each score cup, 4 everywhere else,
   * owningPlayer 1's turn if turn is even, owningPlayer 2's turn otherwise
   */
  public TwoPlayerMancalaModel() {
    this.board = new TwoPlayerBoard();
    this.turn = 0;
    this.rules = new ArrayList<>();
  }


  @Override
  public void move(Board board, int turn, Cup cup, List<MancalaRule> rules) {
    int hand;
    if (cup.getOwningPlayer() == turn) {
      hand = cup.take();
    }
    else {
      throw new IllegalArgumentException();
    }
    while (hand > 0) {
      // TODO check if they are placing it in a scoring cup that isnt their own
      cup = board.nextCup(cup);
      hand -= 1;
      cup.drop(1);
      //TODO add rules
      for (MancalaRule r : rules) {

      }
    }
  }

  @Override
  public int getTurn() {
    return turn;
  }

  @Override
  public void setTurn(int turn) {
    this.turn = turn;
  }

  @Override
  public int getScore(int player) {
    return this.board.getScore(player);
  }

  @Override
  public boolean isGameOver(Board board) {
    return false;
  }

}
