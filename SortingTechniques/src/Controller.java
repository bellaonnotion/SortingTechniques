public class Controller {
    private ViewApp view;
    private Sort sortInstance;

    public Controller(ViewApp view) {
        this.view = view;
        this.sortInstance = new Sort(); // Initialize the Sort model
        addEventListeners();
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
}