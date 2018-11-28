import java.util.Scanner;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

public class openFile {
    JFileChooser fileChooser = new JFileChooser();
    StringBuilder sb = new StringBuilder();
    
    public void chooseFile() throws Exception{
        if(fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
            java.io.File file = fileChooser.getSelectedFile();
            Scanner sc = new Scanner(file);
            
            while(sc.hasNext()){
                sb.append(sc.nextLine());
                sb.append("\n");
            }
            sc.close();
        }
        else{
            sb.append("Error: Please select a file or paste code here.");
        }
    }
}
