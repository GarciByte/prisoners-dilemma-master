public class Cresenciano extends Prisoner{

    private int vecesTraicionado;

    public Cresenciano(){
        lastPlay = null;
        name = "Crescenciano";
        vecesTraicionado = 0;
    }

    @Override
    Choice makePlay(Choice oppLastPlay) {


        Choice play = null;
        if (oppLastPlay == null)
        {
            play = Choice.COOPERATE;
        }
        else
        {

            if(oppLastPlay.equals(Choice.DEFECT)){
                vecesTraicionado ++;
            }

            if(vecesTraicionado >= 2)
                play = oppLastPlay;
            else
                play = Choice.COOPERATE;


        }

        return play;

    }

    @Override
    void init() {
        super.init();
        vecesTraicionado = 0;
    }

}
