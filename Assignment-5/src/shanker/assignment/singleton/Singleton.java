package shanker.assignment.singleton;

public class Singleton {

    String name;
    public static Singleton fun1(String param){
        Singleton myobj = new Singleton();
        myobj.name = param;
        return myobj;
    }
    public void print(){
        System.out.println(name);
    }
}
