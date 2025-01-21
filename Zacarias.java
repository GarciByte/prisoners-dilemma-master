public class Zacarias extends Prisoner {
    public Zacarias(){
        lastPlay=null;
        name="Zacarias";
    }
    
    public Choice makePlay(Choice oppLastPlay){
        int count=0;
        Choice play = null;
        if (oppLastPlay == null)
        {
            play = Choice.DEFECT;
            count++;
        }
        else
        {
            if(count<3){
                play = Choice.DEFECT;
                count++;
            }else{
                if(oppLastPlay==Choice.COOPERATE){
                    play=Choice.DEFECT;
                }else{
                    play=Choice.COOPERATE;
                }
            }
            
        }
        return play;
    }
}
