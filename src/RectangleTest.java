public class RectangleTest {

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(); //instance or object
        Rectangle rect2 = new Rectangle(67.50);
        Rectangle rect3 = new Rectangle(25.70, 36.90);
        Rectangle rect4 =  new Rectangle("rect4");

        Rectangle.isWorking = false;
        Rectangle.sayHello();
    }
}
