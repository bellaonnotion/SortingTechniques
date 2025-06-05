import java.awt.*; //import java.awt
import javax.swing.*;



public class ViewApp extends JFrame {

    JLabel Bsort, Insort, Selectsort;
    JPanel panel1,panel2,panel3;
    JTextField BsortTime, InsortTime, SelectsortTime;
    JButton sortbtn;

    public ViewApp(){
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Sorting Algorithm Timer");
    setSize(400,300);
    setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS)); // Stack panels vertically
    
    panel1 = new JPanel();
    panel1.setPreferredSize(new Dimension(400,50));
    panel2 =new JPanel();
    panel2.setPreferredSize(new Dimension(400,250));

    add(panel1);
    add(panel2);

    sortbtn = new JButton("Sort");

    Bsort = new JLabel("Bubble Sort Time:");
    Insort = new JLabel("Insertion Sort Time");
    Selectsort = new JLabel("Selection Sort Time");

    panel1.add(sortbtn);
    panel2.add(Bsort);
    panel2.add(Insort);
    panel2.add(Selectsort);

    panel2.setLayout(new GridLayout(3,2));
    

    setVisible(true);

    }


    
}
