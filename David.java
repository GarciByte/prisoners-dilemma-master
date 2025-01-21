public class David extends Prisoner {

    private int cooperateCount;
    private int defectCount;
    private static final double COOPERATION_RATE = 0.7;

    public David() {
        lastPlay = null;
        name = "David";
        cooperateCount = 0;
        defectCount = 0;
    }

    @Override
    void init() {
        super.init();
        cooperateCount = 0;
        defectCount = 0;
    }

    public Choice makePlay(Choice oppLastPlay) {

        if (oppLastPlay == null) {
            return Choice.COOPERATE;
        }

        if (oppLastPlay == Choice.COOPERATE) {
            cooperateCount++;
        } else if (oppLastPlay == Choice.DEFECT) {
            defectCount++;
        }

        int totalPlays = cooperateCount + defectCount;
        double cooperationRate = (double) cooperateCount / totalPlays;

        if (cooperationRate >= COOPERATION_RATE) {
            return Choice.COOPERATE;
        } else {
            return Choice.DEFECT;
        }
    }
}