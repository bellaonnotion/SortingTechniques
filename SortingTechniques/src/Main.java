/**
 * @author: Anna and Isabella
 * Comments: Anna: worked on Sort Class and part of View components. Isabella: Worked on controller class, and part of view class
 * Description: Create an app that tracks the time it takes to sort through 50000 random numbers from least to greates values, using selection sort, bubble sort and insertion Sort
 * 
 */

public class Main {
    public static void main(String[] args) {
        ViewApp view = new ViewApp();
        new Controller(view); // Pass the view to the controller
    }
}
