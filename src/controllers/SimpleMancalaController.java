package controllers;

import models.MancalaModel;
import views.MancalaView;

/**
 * Created by paul on 3/8/17.
 * To represent a mancala controller. Handles user input and defines game sequence and AI strategy.
 */
public class SimpleMancalaController implements MancalaController {

  MancalaModel model;
  MancalaView view;

  public SimpleMancalaController(MancalaModel model, MancalaView view) {
    this.model = model;
    this.view = view;
  }

  @Override
  public void go() {

  }
}
