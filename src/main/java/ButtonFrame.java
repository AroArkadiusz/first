import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


public class ButtonFrame extends JFrame /* implements ActionListener */ {
    JButton load = new JButton ("Wczytaj");


    public ButtonFrame() {
        super("Ramka z przyciskami");
        setSize(340,170);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pane = new JPanel();
        pane.add(load);
        add(pane);
        setVisible(true);
    }
   private static void setLookAndFeel(){
try {

    UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");}
catch (Exception exc) {System.out.println(exc.getMessage());}

 }

    public void readFile(String filePath) throws IOException {
        int info1, info2, sum;

        sum = 0;
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        try {
            String textLine = bufferedReader.readLine();
            do {
                if (textLine.contains("ength")) {
                    info1 = Integer.parseInt(textLine.substring(7)); sum += info1; System.out.println(sum);

                }

                textLine = bufferedReader.readLine();
            } while (textLine != null);
        } finally {
            bufferedReader.close();
        }
    }


 public static void main (String[] arguments) throws IOException {setLookAndFeel();
   ButtonFrame bf = new ButtonFrame();

   String  filePath = "C:/Users/Arek/Desktop/_1/pattern.txt";

     Text file2 = new Text();
      file2.readFile(filePath);


   }


}
