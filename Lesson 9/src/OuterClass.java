/**
 * Created by vig on 10/31/16.
 */
public class OuterClass {
    private String name;
    private String firstName;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    class Inner { //объект этого класса не может быть создан без объекта внешнего класса
        private String name;

        public String getName() {
            return name;
        }

        public void  method(){
            OuterClass.this.name = "sdsd"; //работа с переменными внешнего класса
            firstName = "sadasdasd"; //look to OuterClass
            this.name = "sdas"; // работа с переменной внутреннего класса
            name = "2"; //работа с переменной внутреннего класса
        }
    }

    static class StaticInner{

    }
}
