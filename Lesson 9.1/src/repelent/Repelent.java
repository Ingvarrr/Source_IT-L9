package repelent;

import hierarcy.Insect;
import hierarcy.Cockroach;


/**
 * Created by denis.selutin on 04.11.2016.
 */
/*
    <modificator> class ClassName[<T>]
    <modificator> class ClassName[<T extends Insect>]
    <modificator> class ClassName[<T implements Insect>]
 */
public abstract class Repelent<T extends Insect> {
    private T t;
    public abstract T doSmth(T t);
    /*
    * <modificator> [<T>] <return type> methodName([param])
    * */
    public abstract <K extends Cockroach> T doSmth(K param);

    public abstract void kill(T insect);
}