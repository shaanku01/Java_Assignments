package shanker.assignment.data;

public class Main {
    public static int number=0;
    public static int count;

    public static int returnNumber(){
        return ++number;
    }
    public static boolean vampireNumber(){

        String number = Integer.toString(returnNumber());
        if(number.length() % 2==0){
            int num1 = Integer.parseInt(number.substring(0,(number.length()/2)+1));
            int num2 = Integer.parseInt(number.substring((number.length()/2)+1));
            
        }


        return true;
    }




    public static void main(String[] args) {

        while(Main.count < 100){
                if(vampireNumber()){
                    Main.count++;
                }
                else{
                    continue;
                }
        }

    }
}
