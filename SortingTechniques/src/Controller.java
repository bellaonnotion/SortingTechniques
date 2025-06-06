import java.util.Arrays;

public class Controller {
    private ViewApp view;
    private Sort sortInstance;

    public Controller(ViewApp view) {
        this.view = view;
        this.sortInstance = new Sort(); // Initialize the Sort model
        addEventListeners();
        printall();
    

    }

    private void addEventListeners() {
        view.getSortButton().addActionListener(e -> handleSortButtonClick());
    }

    private void handleSortButtonClick() {
        // Perform Bubble Sort and get the time taken
        sortInstance.bubbleSort();
        long bubbleSortTime = (long) sortInstance.getSortTime();

        // Perform Insertion Sort and get the time taken
        sortInstance.insertionSort();
        long insertionSortTime = (long) sortInstance.getSortTime();

        // Perform Selection Sort and get the time taken
        sortInstance.selectionSort();
        long selectionSortTime = (long) sortInstance.getSortTime();

        // Update the view with the sorting times
        view.updateSortingTimes(bubbleSortTime, insertionSortTime, selectionSortTime);
    }

    /** print first 1000 numbers that are sorted
     */
    public static void printnum(int[] array){
        for(int i =0; i<1000 && i<array.length; i++){
            System.out.println(array[i]+"");

            if((i+1)%50==0){
            System.out.println();
        }
        }
        
    }

    public static void printall(){
        Sort sorter = new Sort();
        int[] selectionS = sorter.selectionSort();
        System.out.println("Selection Sort first 1000:");
        printnum(selectionS);


    }
        





}
