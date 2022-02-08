import java.util.Scanner;

class Program{
    //Objects
    private final DataHandler dh = new DataHandler("resources/MobyDick.txt");
    private final FileUtil fu = new FileUtil("resources/MobyDick.txt");
    private final Scanner sc = new Scanner(System.in);


    public void run(){
        //dh.initFile();
        //dh.printUniqueWords();
        //dh.searchWord("precious");

        fu.initFile();
        //fu.printWords();
        fu.searchWord("me");




    }

}


public class Main {
    public static void main(String[] args) {
        new Program().run();
    }
}
