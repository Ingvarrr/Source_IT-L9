/**
 * Created by vig on 10/31/16.
 */
public class RaschetZp {
    public int calculate(int param) {
        switch (param) {
            case 1: return this.new RaschetPoChasam()
                    .calculate();
            default: return this.new RaschetPoStavkee(10)
                    .calculate();
        }
    }

    private class RaschetPoStavkee {
        RaschetPoStavkee(int i) {

        }
        public int calculate() {
            return 50;
        }
    }

    private class RaschetPoChasam {
        public int calculate() {
            return 150;
        }
    }
}
