import java.util.List;

public class PabloMotos extends Prisoner {
    private List<Choice> choices = new java.util.ArrayList<Choice>();
    //private java.util.Random random = new java.util.Random();
    
    public PabloMotos()
    {
        lastPlay = null;
        name = "Pablo Motos";
    }

    @Override
    public Choice makePlay(Choice oppLastPlay)
    {
        int totalTraicion = 0;
        int totalCooperacion = 0;

        for (Choice choice : choices)
        {
            if(choice == Choice.COOPERATE)
            {
                totalCooperacion++;
            }
            else
            {
                totalTraicion++;
            }
        }


        //double porcentajeTraicion = ((double) totalTraicion / choices.size()) * 100;
        //System.out.println(porcentajeTraicion);

        choices.add(oppLastPlay);

        if(totalTraicion <= totalCooperacion)
        {
            return Choice.COOPERATE;
        }
        else
        {
            return Choice.DEFECT;
        }
    }

    @Override
    void init() {
        super.init();
        choices = new java.util.ArrayList<Choice>();
    }
}
