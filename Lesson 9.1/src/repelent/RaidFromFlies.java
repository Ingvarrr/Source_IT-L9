package repelent;

import hierarcy.Fly;
import hierarcy.Insect;

/**
 * Created by denis.selutin on 04.11.2016.
 */
public class RaidFromFlies extends Repelent<Fly> {

    @Override
    public Fly doSmth(Fly fly) {
        return null;
    }

    @Override
    public Fly doSmth(hierarcy.Cockroach param) {
        return null;
    }

    public void kill(Fly insect) {

    }



}