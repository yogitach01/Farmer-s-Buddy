package clg;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public String main() throws IOException {
        String p=null;
        BufferedReader br = new BufferedReader(new FileReader("D:\\WHEAT.txt"));
                for (String line; (line = br.readLine()) != null;) {
        p=line;
        }
       return p;
    }
}