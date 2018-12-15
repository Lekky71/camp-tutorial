package conditionals;

public class Switcher {

    public static void main(String[] args) {
        String username = "Leke";
        Greeter greeter = new Greeter();
        String message;
        switch (username) {
            case "Leke":
                message = greeter.LEKE;
                break;
            case "Toba":
                message = greeter.TOBA;
                break;
            case "Promise":
                message = greeter.PROMISE;
                break;
            default:
                message = "Sorry";
                break;
        }
        System.out.println(message);
    }
}
