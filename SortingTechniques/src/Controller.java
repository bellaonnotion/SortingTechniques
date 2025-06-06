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

    /**
     * print first 10 numbers that are sorted
     */
    public static void print10num(int[] array){
        for(int i =0; i<10 && i<array.length; i++){
            System.out.println(array[i]+"");
        }
    }

    public static void printall(){
        Sort sorter = new Sort();
        int[] selectionS = sorter.selectionSort();
        System.out.println("Selection Sort first 10:");
        print10num(selectionS);
        

        int[] bubbleS = sorter.bubbleSort();
        System.out.println("Bubble Sort first 10:");
        print10num(bubbleS);

        int[] insertionS = sorter.insertionSort();
        System.out.println("Insertion Sort first 10:");
        print10num(insertionS);


    }

    
}
