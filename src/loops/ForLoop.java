package loops;

public class ForLoop {

    /*
        for(initialValue; condition; step){
            //do something
        }
     */

    /**
     *
     * @param args
     * @varibale i is our counter
     */
    public static void main(String[] args) {
        for(int i = 0; i <= 20; i++){
            if(i == 0){
                continue;
            }
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
        boolean isMarried = false;
        String message = isMarried ? "Married guy" : "Chase him";
        int age = 18 < 6 ? 78 : 67;
        System.out.println("\n" + message + " " + age);
    }

}
