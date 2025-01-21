/**
 * TitForTat is a prisoner who plays what the opponent played in the last round. 
 * If it is the first round, TitForTat cooperates.
 * @author Serina Chang - sc3003
 */
public class Friedman extends Prisoner
{
    private boolean onceNoCooperation;

    public Friedman()
    {
        lastPlay = null;
        name = "Friedman";
        onceNoCooperation = false;
    }

    @Override
    void init() {
        super.init();
        onceNoCooperation = false;
    }

    public Choice makePlay(Choice oppLastPlay) //opponent's last play
    {
        Choice play = null;
        if (oppLastPlay == null)
        {
            play = Choice.COOPERATE;
        }
        else
        {
            if (oppLastPlay == Choice.DEFECT) {
                onceNoCooperation = true;
            }
            if (onceNoCooperation) {
                play = Choice.DEFECT;
            } else {
                play = Choice.COOPERATE;
            }
        }
        return play;
    }   
}