
public class Manolo extends Prisoner {
  private int round;
  private boolean opponentDefectedLast;

  public Manolo() {
      name = "Manolo";
      round = 0;
      opponentDefectedLast = false;
  }

  public Choice makePlay(Choice oppLastPlay) {
      round++;

      if (round == 1) {
          return Choice.COOPERATE;
      }
      if (oppLastPlay == Choice.DEFECT) {
          opponentDefectedLast = true;
      } else {
          opponentDefectedLast = false;
      }

     
      if (opponentDefectedLast) {
          return Choice.DEFECT; 
      } else {
          if (round % 5 == 0) {
              return Choice.DEFECT; 
          } else {
              return Choice.COOPERATE;
          }
      }
  }
}
