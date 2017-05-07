package models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import util.MancalaUtils;

/**
 * Created by paul on 5/6/17.
 * To test the KalahModel
 */
public class KalahModelTest {

  KalahModel model;
  KalahModel modelCopy;

  public void init() {
    model = new KalahModel();
    modelCopy = model;
  }

  @Test
  public void testInit() {
    init();
    Cup[][] cups = model.getCups();
    for (int i = 0; i < 2; i += 1) {
      for (int j = 0; j < model.getBoardLength(); j += 1) {
        if (cups[i][j].isScoring()) {
          assertTrue(cups[i][j].getStones() == 0);
        }
        else {
          assertTrue(cups[i][j].getStones() == 4);
        }
      }
    }
  }

  @Test
  public void testCopyConstructor() {
    init();
    Cup[][] modelCups = model.getCups();
    Cup[][] modelCopyCups = modelCopy.getCups();
    for (int i = 0; i < 2; i += 1) {
      for (int j = 0; j < model.getBoardLength(); j += 1) {
        assertTrue(modelCups[i][j].equals(modelCopyCups[i][j]));
      }
    }

    modelCopy = new KalahModel(model);

    modelCups = model.getCups();
    modelCopyCups = modelCopy.getCups();
    for (int i = 0; i < 2; i += 1) {
      for (int j = 0; j < model.getBoardLength(); j += 1) {
        assertFalse(modelCups[i][j].equals(modelCopyCups[i][j]));
      }
    }
  }

  @Test
  public void testSowFromEmpty() {
    init();
    Cup[][] cups = model.getCups();
    assertTrue(cups[0][0].getStones() > 0);
    model.sow(1);
    assertTrue(cups[0][0].getStones() == 0);
    try {
      model.sow(1);
    } catch (IllegalArgumentException e) {
      assertEquals(e.getMessage(), "Cannot take from an empty cup.");
    }

  }

  @Test
  public void testSowFromScoreCup() {
    init();
    Cup[][] cups = model.getCups();
    assertTrue(cups[0][6].isScoring());
    try {
      model.sow(6);
    } catch (IllegalArgumentException e) {
      assertEquals(e.getMessage(), "Cannot take from a score cup.");
    }


  }

  @Test
  public void testSowFromFull() {
    init();
    KalahModel previousState = new KalahModel(model);
    Cup[][] cups = model.getCups();
    Cup[][] lastCups = previousState.getCups();
    for (int j = 0; j < model.getBoardLength(); j += 1) {
      if (!cups[0][j].isScoring()) {
        assertTrue(cups[0][j].getStones() == lastCups[0][j].getStones());
        model.sow(j);
        assertTrue(cups[0][j].getStones() == 0);
        for (int k = 1; k < lastCups[0][j].getStones(); k += 1) {
          int side = 0;
          int pos = j + k;
          if (pos >= model.getBoardLength()) {
            side = 1;
            pos -= model.getBoardLength();
          }
          if (!cups[side][pos].isOwnedByFirstPlayer() && cups[side][pos].isScoring()) {
            assertTrue(cups[side][pos].getStones() == lastCups[side][pos].getStones());
          }
          else {
            assertTrue(cups[side][pos].getStones() == lastCups[side][pos].getStones() + 1);
          }
        }
        previousState.sow(j);
      }
    }
  }


}
