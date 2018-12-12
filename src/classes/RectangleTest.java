package classes;

public class RectangleTest {

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(); //instance or object
        Rectangle rect2 = new Rectangle(67.50);
        Rectangle rect3 = new Rectangle(25.70, 36.90);
        Rectangle rect4 =  new Rectangle("rect4");

        Rectangle.isWorking = false; //static variable
        Rectangle.sayHello(); //static method

        System.out.println("rect1 " + rect1.isWorking);
        System.out.println("rect2 " + rect2.isWorking);

        Rectangle.isWorking = true; //static variable
        rect1.name = "leke";

        System.out.println("rect3 " + rect3.isWorking);
        System.out.println("rect4 " + rect4.isWorking);
        System.out.println(Constants.NAME);
    }
}
