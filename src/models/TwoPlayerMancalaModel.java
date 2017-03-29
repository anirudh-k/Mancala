package models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import rules.GoAgainRule;
import rules.MancalaRule;

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
    rules.addAll(Arrays.asList(new GoAgainRule()));
  }


  @Override
  public void sow(Board board, int turn, Cup cup, List<MancalaRule> rules) {
    int hand;
    if (cup.getOwningPlayer() == turn && !cup.isScoring()) {
      hand = cup.take();
      while (hand > 0) {
        Cup nextCup = board.nextCup(cup);
        if (!nextCup.isScoring() || nextCup.getOwningPlayer() == this.turn) {
          cup = nextCup;
        }
        else {
          cup = board.nextCup(nextCup);
        }
        hand -= 1;
        cup.drop(1);
        for (MancalaRule r : rules) {
          r.apply(this, cup, hand);
        }
      }
      nextTurn();
    }
    else {
      throw new IllegalArgumentException("Cannot sow from that cup.");
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
  public int nextTurn() {
    if (this.turn == this.board.getPlayers()) {
      this.turn = 0;
    }
    else {
      this.turn += 1;
    }
    return this.turn;
  }

  @Override
  public int getScore(int player) {
    return this.board.getScore(player);
  }

  @Override
  public int getPlayers() {
    return this.board.getPlayers();
  }

  @Override
  public int getBoardLength() {
    return this.board.getLength();
  }

  @Override
  public boolean isGameOver(Board board) {
    for (Cup c : board.getCups()) {
      if (!c.isScoring() && c.getStones() > 0) {
        return false;
      }
    }
    return true;
  }
}
