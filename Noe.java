import java.util.Random;

public class Noe extends Prisoner{
    public Noe()
    {
        lastPlay = null;
        name = "TitForTat";
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
            Random myRandom = new Random();
            int randomNum = myRandom.nextInt(2);
            if (randomNum == 0)
            {
                play = Choice.DEFECT;
            }
            else
            {
                play = Choice.COOPERATE;
            }
        }
        return play;
    }
}
