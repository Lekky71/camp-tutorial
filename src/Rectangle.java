public class Rectangle {
    private double length;
    private double width;
    public String name;

    public static boolean isWorking;

    public Rectangle(double length, double w){
        this.length = length;
        width = w;
    }

    public Rectangle(){

    }

    public Rectangle(double length){
        this.length = length;
    }

    public Rectangle(String name){
        this.name = name;
    }

    public static void sayHello(){
        System.out.println("Hello world!");
    }
}
