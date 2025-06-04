import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class View extends JFrame {

    JLabel Bsort, Insort, Selectsort;
    JPanel panel1,panel2,panel3;
    JButton sortbtn;

    public View(){
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Sorting Algorithm Timer");
    setSize(500,500);

    sortbtn = new JButton("Sort");

    Bsort = new JLabel("Bubble Sort Time:");
    Insort = new JLabel("Insort Time");
    Selectsort = new JLabel("Selectsort Time");

    add(sortbtn);
    add(Bsort);
    add(Insort);
    add(Selectsort);
    



    




    setVisible(true);

    }


    
}
