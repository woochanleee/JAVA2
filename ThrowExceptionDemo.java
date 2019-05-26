import java.io.*;

class D{
    void run() throws FileNotFoundException, IOException{
        BufferedReader bReader = null;
        String input = null;
        bReader = new BufferedReader(new FileReader("out.txt"));
        System.out.println(input);
    }
}
class F{
    void run() throws  FileNotFoundException, IOException{
        D d = new D();
        d.run();
    }
}
public class ThrowExceptionDemo {
    public static void main(String[] args) {
        F f = new F();
        try {
            f.run();
        } catch (FileNotFoundException e) {
            System.out.println("out.txt 파일이 필요합니다.");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
