import java.io.*;

public class Text {
  //  public String getFilePath() {        return filePath;    }

   // public void setFilePath(String filePath) {        this.filePath = filePath;    }




    //  String  filePath = "C:/Users/Arek/Desktop/_1/pattern.txt";
   // File file = new File("pattern.txt");
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
    public static void main(String[] args) throws IOException {
        String  filePath = "C:/Users/Arek/Desktop/_1/pattern.txt";

        Text file = new Text();
        file.readFile(filePath);





        //System.out.println(new File("").getAbsolutePath());
       // System.out.println(Text.class.getClassLoader().getResource("").getPath());
    }
    }




