import java.util.Random;

public class Sort{

    private int[] originalArray;
    private double sortTime;

    public Sort(){ //initalize

        Random random = new Random();
        int [] originalArray = new int[50000];

        for (int i =0; i<50000; i++){
            originalArray[i] = random.nextInt(401) - 200; //generates number from -200 to 200
        }

    }


    /**
     * Method for selection Sort
     * @return sorted array
     */
    public int[] selectionSort() {

        int[] arraySelection = originalArray.clone();

        int n = arraySelection.length;

        long nanoStart = System.nanoTime();

        /**
         * for loop for the number of passes
         */
        for(int i =0; i<n-1; i++){
            int idxmin = i; //minimum element index

            /**
             * loop through number of comparisions 
             * goes through the unsorted parts
             * to find the actual minimum
             */
            for (int j=i+1; j<n; j++){

                //checks if numbers are out of ascending order
                if(arraySelection[j] < arraySelection[idxmin]){
                    idxmin = j;
                }
            }

            /**
             * swaps the smallest element found with the element at index i ensuring its in the right position
             */
            int temp = arraySelection[i];
            arraySelection[i] = arraySelection[idxmin];
            arraySelection[idxmin] = temp;
        }

        long nanoEnd = System.nanoTime();
        sortTime = (nanoEnd - nanoStart);
        return arraySelection;

    }


    /**
     * Bubble Sorter
     * @return sorted array
     */
    public int[] bubbleSort(){
        int[] arrayBubble = originalArray.clone(); //create copy of original array
        int n = arrayBubble.length; //varaible for length of array

        //Outer loop for the number of passes
        for (int i=0; i<(n-1); i++){ 

            //Inner loop, number of comparisons to each adjacent elements
            for(int j=0; j<(n-1); j++){

                //swap elements if in wrong order
                if(arrayBubble[j] > arrayBubble[j+1]){
                    int temp = arrayBubble[j]; //stores larger integer temporarily
                    arrayBubble[j] = arrayBubble[j+1]; //move smaller integer ahead
                    arrayBubble[j+1] = temp; //place larger value in correct position or swap it with smaller value
                }

            }
        }

        return arrayBubble; //return the sorted array

    }


    /**
     * Insertion Sort
     * @return sorted array
     */
    public int[] insertionSort(){
        int[] arrayInsertion = originalArray.clone(); //clone original array for array Insertion
        int n = arrayInsertion.length; //varaible for array length

        //start with second element of the array
        for (int i = 1; i<n; ++i){
            int key = arrayInsertion[i]; //assign current element position as key
            int j = i -1; //initialize a variable to track previous index/position

            //shift elements to the right until the correct position for key is found
            while(j>=0 && arrayInsertion[j] > key){
                arrayInsertion[j+1] = arrayInsertion[j]; //move the bigger element one position ahead
                j=j - 1; //decrease index to check previous integer
            }

            arrayInsertion[j+1] = key; //insert the key to correct position in the sorted part of the array
        }
        return arrayInsertion; //return sorted array

    }

    /**
     * returns the time taken for the last sort
     * @return sort time in nanoseconds
     */
    public double getSortTime(){
        return sortTime;
    }

   //message for testing purposes
}

