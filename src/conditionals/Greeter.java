package conditionals;

import java.util.Scanner;
public class Greeter {

    final String TOBA = "toba";
    final String PROMISE = "promise";
    final String LEKE = "leke";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name...\n");
        Greeter greeter = new Greeter();

        System.out.println(greeter.greet(input.nextLine()));
    }

    private String greet(String name){
        name = name.toLowerCase();
        if(name.equals(PROMISE) || name.equals(TOBA)){
            if(name.length() == 4){
                return "toba!!";
            }
            else {
                return "promise!!";
            }
        }
        else if(name.equals(LEKE)){
            return "Master!!";
        }
        else {
            return "Not Allowed";
        }
    }
}
