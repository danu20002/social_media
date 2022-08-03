import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filehandling{
    public static void main(String args[]){
        File myfile=new File("danu.txt");
        try {
            myfile.createNewFile();
            myfile.canWrite();
            if(myfile.canWrite()){
                System.out.println("file is writable");
            }
            else{
                System.out.println("file is not writable");
            }
            FileWriter filewrite=new FileWriter("danu.txt");
            filewrite.write("i am the legend");
            filewrite.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        myfile.canRead();
        if(myfile.canRead()){
            System.out.println("file is readable ");
        }
        else{
            System.out.println("filee is not readable ");
        }
        Scanner sc= null;
        try {
            sc = new Scanner(myfile);
            String line=sc.nextLine();
            System.out.println(line);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        sc.close();

    }


}