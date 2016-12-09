/**
 * Created by vig on 10/31/16.
 */
public class RaschetZp2 {
    public int calculate(int param) {
        switch (param) {
            case 1: return calculatePoChasam();
            default: return calculatePoStavke();
        }
    }

    private int calculatePoStavke() {
        return 50;
    }

    public int calculatePoChasam() {
        return 150;
    }
}