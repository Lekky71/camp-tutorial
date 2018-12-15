package loops;

public class WhileLoop {

    public static void main(String[] args) {
        //To print odd numbers
        int counter = 0;
        while (counter < 20){
            if(counter % 2 == 0){
                counter++; //increment counter by 1
                continue;
            }
            System.out.print(counter +" ");
            if(counter == 15){
                break; //stop the entire loop
            }
            counter++;
        }
    }
}
