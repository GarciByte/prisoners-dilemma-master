public class Manu extends Prisoner{

    private int punished = 0;
    public Manu()
    {
        lastPlay = null;
        name = "Manu";
    }

    public Choice makePlay(Choice oppLastPlay)
    {
        Choice play = null;
        if (oppLastPlay == null && punished == 0)
        {
            play = Choice.COOPERATE;
        } else
        {
            if(punished == 0) punished = 2;
            play = Choice.DEFECT;
            punished--;
        }
        return play;
    }
}
