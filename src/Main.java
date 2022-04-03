import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File f = new File("file1.txt");
        FileInputStream fis = new FileInputStream(f);
        FileOutputStream fos = new FileOutputStream("new.txt");
        int i = fis.read();
        while(i!= -1){
            fos.write(i);
            i = fis.read();
        }
        fos.close();
        fis.close();
    }
}
