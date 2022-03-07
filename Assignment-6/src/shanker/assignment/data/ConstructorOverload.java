package shanker.assignment.data;
public class ConstructorOverload {
    public ConstructorOverload(){

        this("Passing String");
        System.out.println("Exit from first Constructor");




    }
    public ConstructorOverload(String str){
        System.out.println("Inside the Second Constructor");
        System.out.println("The first Constructor Called me and passed the string "+str);

    }



    public static void main(String args[]){
        ConstructorOverload obj = new ConstructorOverload();

    }

}
