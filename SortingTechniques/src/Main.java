public class Main {
    public static void main(String[] args) {
        ViewApp view = new ViewApp();
        new Controller(view); // Pass the view to the controller
    }
}
