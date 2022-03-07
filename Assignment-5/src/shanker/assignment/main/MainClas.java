package shanker.assignment.main;

import shanker.assignment.data.*;
import shanker.assignment.singleton.*;

public class MainClas {
    public static void main(String args[]){
        Main obj1 = new Main();
        obj1.fun1();
        obj1.fun2();
        Singleton obj2 = Singleton.fun1("Shanker");
        obj2.print();


    }

}
