import controllers.MancalaController;
import controllers.SimpleController;
import models.KalahModel;
import models.MancalaModel;
import services.ConsoleListener;
import services.HumanPlayerStrategy;
import services.NaiveKalahPlayerStrategy;
import services.PlayerStrategy;
import services.RandomPlayerStrategy;
import views.MancalaConsoleView;
import views.MancalaView;

/**
 * Created by paul on 3/7/17.
 * To represent a mancala runner
 */
public class MancalaRunner {
  public static void main(String[] args) {
    PlayerStrategy p1 = new RandomPlayerStrategy();
    PlayerStrategy p2 = new NaiveKalahPlayerStrategy();
    MancalaModel model = new KalahModel();
    MancalaView view = new MancalaConsoleView();
    MancalaController controller = new SimpleController(model, view, p1, p2);
    controller.go();
  }
}
