import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args){
        //GetUserFile();
        GetFolderFiles();
        return;
    }

    public void Compare(String filePath){

    }
    public static void GetUserFile(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter document path");
        String file = scan.next();
        scan.close();
        try{

            File f = new File(file);
            FileReader reader = new FileReader(f);
            BufferedReader bufferedReader = new BufferedReader(reader);
            StringBuffer stringBuffer = new StringBuffer();
            String line;

            while((line = bufferedReader.readLine()) != null){
                line = line.replaceAll("\\s", "");
                stringBuffer.append(line);
                stringBuffer.append("\n");
            }
            reader.close();
            System.out.println("Contents of file:");
            System.out.println(stringBuffer.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void GetFolderFiles() {
        File f = new File("C:\\Users\\Matt\\Desktop\\New folder");
        File[] files = f.listFiles();
        for(File currFile : files) {
            System.out.println(currFile);
        }
    }
}

