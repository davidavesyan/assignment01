import java.util.*;
import java.io.*;


public class InsertionSort{
    public static void main(String[] args) throws IOException {
        int counter = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("How many strings to be sorted: ");
        int input = scan.nextInt();
        BufferedReader br = null;
        try {
            File file = new File("\\string.txt");
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException ex) {
            System.out.println("File not Found");
        }

        List<String> arr = new ArrayList<String>();

        String s;
        while((s=br.readLine())!=null) {
            arr.add(s);
            System.out.println(s);
        }

    }
}
