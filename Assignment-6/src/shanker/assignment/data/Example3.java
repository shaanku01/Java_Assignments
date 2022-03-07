package shanker.assignment.data;

public class Example3 {
    public Example3(String arg){
        System.out.println(arg);
    }
    public static void main(String args[]){
        //Question-3 where only Reference is created:
        Example3 arr[];
        //Question-4 Where The objects are created.

        Example3 ob1 = new Example3("Object-1 Created");
        Example3 ob2 = new Example3("Object-2 Created");
        Example3 ob3 = new Example3("Object-3 Created");
        Example3 ob4 = new Example3("Object-4 Created");
        Example3 ob5 = new Example3("Object-5 Created");
        Example3 arr1[] = {ob1,ob2,ob3,ob4,ob5};



    }

}
