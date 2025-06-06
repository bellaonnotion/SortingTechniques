

/**
 * class for controller
 * connects view and sort class
 */
public class Controller {
    private ViewApp view;
    private Sort sortInstance;

    public Controller(ViewApp view) {
        this.view = view;
        this.sortInstance = new Sort(); // Initialize the Sort model
        addEventListeners(); //add event listeners
        
    

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
        printall(); //print first 400 sorted numbers 
    }

    /**
    * Returns a string containing the first 400 numbers from the array
    * @param array the array of integers to print
    * @return a single string of up to 400 numbers from the array
    */
    public String printnum(int[] array) {
    StringBuilder sb = new StringBuilder(); // Builds output string 
    //goes through 400 sorted number in array
    for (int i = 0; i < 400 && i < array.length; i++) {
        sb.append(array[i]).append(" "); // Add new number to string with a space at end
         
        if((i+1)%15==0){ //every 15 integer create a new line
            sb.append("\n");
         }
    }
        return sb.toString().trim(); // trim to remove trailing space
    }

    /**
     * print the first 400 in the selection sorted array 
     * testing if the code works 
     */
    public void printall(){
        
        int[] selectionS = sortInstance.selectionSort();
        System.out.println("Selection Sort first 400:");
        String output = printnum(selectionS);

        view.txtSortNum.setText(output);



    }


        





}
