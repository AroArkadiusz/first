import java.io.*;
import java.util.Scanner;

public class Poly extends Text {


    public static void main(String[] args) throws FileNotFoundException {
         String random, polyline, polyline2;
         String  filePath = "C:/Users/Arek/Desktop/_1/pattern.txt";
        int info1, info2, sum;
         random = "length";
         polyline = "length 1600";
         polyline2 = "length 1800";
if (polyline.contains("ength") || polyline2.contains("ength")) { info1 = Integer.parseInt(polyline.substring(7)) ;
    info2 = Integer.parseInt(polyline2.substring(7)); sum = info1 + info2; System.out.println(sum); }
else {return ;};

        File file = new File("pattern.txt");
        Scanner in = new Scanner(file);

        String zdanie = in.nextLine();
        System.out.println(zdanie);




    }







    }








