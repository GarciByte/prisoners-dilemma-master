public class PerroSanchez extends Prisoner {

    public PerroSanchez(){
        lastPlay = null;
        name="PedroSanchez";
    }
    private Choice apoyo = null;

    public Choice makePlay(Choice oppLastPlay){
        Choice play = null;
        
        if (oppLastPlay == null)
        {
            play = Choice.DEFECT;
        }
        else
        {
            if(apoyo == null)
            {
                apoyo = oppLastPlay;
            }else if(apoyo == oppLastPlay){
                if(apoyo == Choice.COOPERATE){
                    play = Choice.COOPERATE;
                }
                else{
                    play = Choice.DEFECT;
                }
            }else{
                play = Choice.DEFECT;
            }
        }
        return play;
    }
    
}
