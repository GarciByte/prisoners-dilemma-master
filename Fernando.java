import java.util.ArrayList;
import java.util.Random;

/**
 * TitForTat is a prisoner who plays what the opponent played in the last round. 
 * If it is the first round, TitForTat cooperates.
 * @author Serina Chang - sc3003
 */
public class Fernando extends Prisoner
{
    int opponentsDefects = 0;
    int opponentsNonRevengeInARow = 0;
    int ownDefects = 0;

    ArrayList<Choice> oppChoices; // Recuento de lo que ha ido haciendo el enemigo
    ArrayList<Choice> ownChoices; // Recuento de lo que he ido haciendo yo

    private Choice getRandom() {
        Random myRandom = new Random();
        int randomNum = myRandom.nextInt(2);
        if (randomNum == 0)
        {
            return Choice.COOPERATE;
        }
        else
        {
            return Choice.DEFECT;
        }
    }

    public Fernando()
    {
        lastPlay = null;
        name = "Fernando";
        oppChoices = new ArrayList<>();
        ownChoices = new ArrayList<>();
    }
    
    public Choice makePlay(Choice oppLastPlay) //opponent's last play
    {
        oppChoices.add(oppLastPlay);

        Choice play = null;
        if (oppLastPlay == null)
        {
            play = getRandom();
        }
        else
        {
            if (oppLastPlay == Choice.DEFECT) {
                opponentsDefects++;
                if (opponentsDefects > 1) {
                    play = Choice.DEFECT;
                } else {
                    play = Choice.COOPERATE;
                }
            } else {
                opponentsDefects = 0;
                play = getRandom();
            }
        }

        ownChoices.add(play);

        return play;
    }   
}