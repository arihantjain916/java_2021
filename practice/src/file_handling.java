import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class file_handling{
    public static void main(String[] args) {
        // Create new File

        File f = new File("arihant.txt");
        try{
            f.createNewFile();
        }
        catch(Exception e){
            System.out.println("Error in creation");
        }

        // Write in a file

        try{
            FileWriter fw = new FileWriter("arihant.txt");
            fw.write("Hi Arihant.");
            fw.close();
        }
        catch(Exception e){
            System.out.println("Error in writing");
        }

        // Read in the file
        try{
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch (Exception e) {
            System.out.println("Error in reading");
        }
    }
}

    