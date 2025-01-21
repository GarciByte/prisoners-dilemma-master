public class JugadorFito extends Prisoner {
    
    public JugadorFito() {
        lastPlay = null;
        name = "JugadorFito";
    }

    @Override
    public Choice makePlay(Choice oppLastPlay) {
        if (oppLastPlay == null) {
            return Choice.COOPERATE; 
        }


        if (oppLastPlay == Choice.DEFECT) {
            return Choice.DEFECT; 
        } else {
            return Choice.COOPERATE; 
        }
    }
}
