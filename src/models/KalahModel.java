package models;

import java.util.List;
import models.Cup;
import models.MancalaModel;
import rules.MancalaRule;

/**
 * Created by paul on 3/28/17.
 * To represent a Kalah mancala model, the rules for which are as follows:
 *
 * The game provides a Kalah board and a number of seeds or counters. The board has 12 small pits,
 * called houses, on each side; and a big pit, called an end zone, at each end. The object of the
 * game is to capture more seeds than one's opponent.
 * - At the beginning of the game, four seeds are placed in each house. This is the traditional
 *   method.
 * - Each player controls the six houses and their seeds on the player's side of the board. The
 *   player's score is the number of seeds in the store to their right.
 * - Players take turns sowing their seeds. On a turn, the player removes all seeds from one of the
 *   houses under their control. Moving counter-clockwise, the player drops one seed in each house
 *   in turn, including the player's own store but not their opponent's.
 * - If the last sown seed lands in an empty house owned by the player, and the opposite house
 *   contains seeds, both the last seed and the opposite seeds are captured and placed into the
 *   player's store.
 * - If the last sown seed lands in the player's store, the player gets an additional move. There is
 *   no limit on the number of moves a player can make in their turn.
 * - When one player no longer has any seeds in any of their houses, the game ends. The other player
 *   moves all remaining seeds to their store, and the player with the most seeds in their store
 *   wins.
 * - It is possible for the game to end in a draw.
 * TODO
 * PROGRESS:
 * 3/29 merged with two player mancala model
 */
public class KalahModel implements MancalaModel{
  private Cup[][] board;
  private boolean isFirstPlayerTurn;
  private boolean pieRule;
  private int stonesPerCup;

  /**
   * Default constructor
   */
  public KalahModel () {
    this.isFirstPlayerTurn = true;
    this.stonesPerCup = 4;
    this.pieRule = false;
    init();
  }

  /**
   * Advanced rules constructor. Allows playing with the pie rule
   * @param stonesPerCup
   * @param pieRule
   */
  public KalahModel (int stonesPerCup, boolean pieRule) {
    this.isFirstPlayerTurn = true;
    this.stonesPerCup = stonesPerCup;
    init();
  }

  /**
   * Testing, game situation simulation constructor
   * @param board
   */
  public KalahModel (Cup[][] board) {
    this.isFirstPlayerTurn = true;
    this.board = board;
  }

  @Override
  public Cup[][] getCups() {
    return board;
  }

  @Override
  public void sow(Cup cup) {

  }

  @Override
  public boolean isFirstPlayerTurn() {
    return this.isFirstPlayerTurn;
  }

  @Override
  public boolean toggleTurn(int turn) {
    this.isFirstPlayerTurn = ! this.isFirstPlayerTurn;
    return this.isFirstPlayerTurn;
  }

  @Override
  public int getScore(boolean firstPlayer) {
    if (firstPlayer) {
      return board[0][6].getStones();
    }
    else {
      return board[1][6].getStones();
    }
  }

  @Override
  public int getBoardLength() {
    return 14;
  }

  @Override
  public boolean isGameOver() {
    for (int i = 0; i < 2; i += 1) {
      for (int j = 0; j < 6; j += 1) { // only 6 because scoring cups shouldnt be counted
        if (board[i][j].getStones() != 0) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public void init() {
    // board initialization
    this.board = new Cup[2][7];
    for (int i = 0; i < 2; i += 1) {
      for (int j = 0; j < 7; j += 1) {
        if (j != 6) {
          board[i][j] = new PlayingCup(this.stonesPerCup, i==0);
        }
        else {
          board[i][j] = new ScoreCup(i == 0);
        }
      }
    }

    if (pieRule) {
      pieRule();
    }

  }

  /**
   * The pie rule, sometimes referred to as the swap rule, is a rule used to balance abstract
   * strategy games where a first-move advantage has been demonstrated. After the first move is made
   * in a game that uses the pie rule, the second player has one of two options:
   *
   * - Letting the move stand, in which case the second player remains the second player and moves
   *   immediately
   *
   * - Switching places, in which case the second player becomes the first-moving player, and the
   *   "new" second player then makes their "first" move. (I.e., the game proceeds from the opening
   *   move already made, but with roles reversed.)
   *
   * Source: https://en.wikipedia.org/wiki/Pie_rule, 3/29/2017
   */

  private void pieRule() {
    //TODO
  }
}
