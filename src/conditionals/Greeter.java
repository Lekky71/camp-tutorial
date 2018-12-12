package conditionals;

import java.util.Scanner;
public class Greeter {

    private final String TOBA = "toba";
    private final String PROMISE = "promise";
    private final String LEKE = "leke";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name...\n");
        Greeter greeter = new Greeter();

        System.out.println(greeter.greet(input.nextLine()));
    }

    public String greet(String name){
        name = name.toLowerCase();
        if(name.equals(PROMISE) || name.equals(TOBA)){
            if(name.length() == 4){
                return "Toba!!";
            }
            else {
                return "Promise!!";
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
