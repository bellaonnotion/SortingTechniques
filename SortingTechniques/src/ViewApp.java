import java.awt.*; //import java.awt
import javax.swing.*;

/**
 * View/ visul of the converter
 */

public class ViewApp extends JFrame {

    // Declare UI components
    JLabel Bsort, Insort, Selectsort, sortedNum;
    JPanel panel1, panel2, panel3;
    JTextField BsortTime, InsortTime, SelectsortTime;
    JTextArea txtSortNum;
    JButton sortbtn;

    public ViewApp() {
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Close the application when the window is closed
        
        setTitle("Sorting Algorithm Timer");//title of the frame
        setSize(450, 600);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS)); // Stack panels vertically

        //initalize the panels and set size
        panel1 = new JPanel();
        panel1.setPreferredSize(new Dimension(450, 50));
        panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(450, 200));

        panel3 = new JPanel();
        panel3.setPreferredSize(new Dimension(450, 100));
        panel3.setLayout(new BorderLayout());

        /**
         * create text area 
         * create label for panel 3
         */
        txtSortNum = new JTextArea();
        txtSortNum.setEditable(false);
        sortedNum = new JLabel("Sorted Numbers (First 400)");
        panel3.add(sortedNum, BorderLayout. NORTH);
        panel3.add(txtSortNum,BorderLayout.CENTER);
    

        //add panels to frame
        add(panel1);
        add(panel2);
        add(panel3);
     
        
        //create button
        sortbtn = new JButton("Sort");

        //create labels
        Bsort = new JLabel("Bubble Sort Time:");
        Insort = new JLabel("Insertion Sort Time:");
        Selectsort = new JLabel("Selection Sort Time:");

        //create text fields
        BsortTime = new JTextField(20);
        InsortTime = new JTextField(20);
        SelectsortTime = new JTextField(20);

        //add all components to according panels
        panel1.add(sortbtn);
        panel2.add(Bsort);
        panel2.add(BsortTime);
        BsortTime.setEditable(false); // Make the text field non-editable
        panel2.add(Insort);
        panel2.add(InsortTime);
        InsortTime.setEditable(false); // Make the text field non-editable
        panel2.add(Selectsort);
        panel2.add(SelectsortTime);
        SelectsortTime.setEditable(false); // Make the text field non-editable
        panel2.setLayout(new GridLayout(3, 2)); //set layout manger

        setVisible(true); //set visible for frame can be viewed
    }

    // Expose the sort button to the controller
    public JButton getSortButton() {
        return sortbtn;
    }

    // Method to update sorting times in the text fields
    public void updateSortingTimes(long bubbleSortTime, long insertionSortTime, long selectionSortTime) {
        BsortTime.setText(bubbleSortTime + " ns or " + String.format("%.3f", bubbleSortTime / 1_000_000_000.0) + " s");
        InsortTime.setText(insertionSortTime + " ns or " + String.format("%.3f", insertionSortTime / 1_000_000_000.0) + " s");
        SelectsortTime.setText(selectionSortTime + " ns or " + String.format("%.3f", selectionSortTime / 1_000_000_000.0) + " s");
    }

    
}
