/**
 * Created by vig on 10/31/16.
 */
public class Main {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.Inner inner = outerClass.new Inner(); //существует только при наличии ссылки на внешний класс
        Car car = new Car();
        car.getDvigatel().getKolichestvoCilindrov();

        OuterClass.StaticInner inner2 = new OuterClass.StaticInner();

        Profile.Message message = new Profile.Message();
        CororateAccount.Message message2 = new CororateAccount.Message();
        Resolution re = Resolution.HIGHT;
        switch (re){
            case HIGHT: break;
            case LOW: break;
        }
        for(Resolution rs:Resolution.values()){
        System.out.println(rs);
        System.out.println(rs.getHeight());
        System.out.println(rs.getWidth());
    }
}
