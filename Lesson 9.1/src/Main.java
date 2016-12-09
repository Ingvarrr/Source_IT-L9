import hierarcy.Cockroach;
import hierarcy.Fly;
import hierarcy.Insect;
import repelent.RaidFromFlies;
import repelent.Repelent;

/**
 * Created by vig on 11/4/16.
 */
public class Main {
    public static void main(String[] args) {
        Repelent<Fly> repelent = new RaidFromFlies();

        RaidFromFlies repelent2 = new RaidFromFlies();

        Cockroach c = new Cockroach();
        Fly f = new Fly();
        Insect i = new Insect();

        repelent2.<Cockroach>doSmth(c);
        repelent2.<Fly>doSmth(f);
        repelent2.<Insect>doSmth(f);
        repelent2.<Insect>doSmth(c);
        repelent2.<Insect>doSmth(i);
    }
}
