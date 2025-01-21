import java.util.Random;

public class RokoBaturina extends Prisoner{

    public RokoBaturina() {
        lastPlay = null;
        name = "Roko Baturina";
    }

    public Choice makePlay(Choice oppLastPlay)
    {
        Choice play = null;
        int contNoCoop = 0;

        if (oppLastPlay == Choice.DEFECT) {
            contNoCoop++;
        }

        if (lastPlay == null) {
            play = Choice.DEFECT;
        }

        if (contNoCoop >= 3) {
            play = Choice.DEFECT;
        } else {
            Random myRandom = new Random();
            int randomNum = myRandom.nextInt(2);
            if (randomNum == 0)
            {
                play = Choice.COOPERATE;
            }
            else
            {
                play = Choice.DEFECT;
            }
        }

        return play;
    }
}