import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;


//Class for Map
public class FileUtil {

    private final File file;
    private final HashMap<String, Integer> wordCount;
    private Scanner sc;

    public FileUtil(String filePath){
        file = new File(filePath);
        wordCount = new HashMap<>();

        try{
            sc = new Scanner(file);
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }


    public void initFile(){
        while(sc.hasNext()){
            String currLine = sc.nextLine().toLowerCase();
            String[] split = currLine.split(" ");
            for (String word : split) {
                if(!wordCount.containsKey(word))
                    wordCount.put(word, 1);
                else
                    wordCount.put(word, wordCount.get(word) + 1);
            }
        }
    }

    public void printWords(){
        for (String word : wordCount.keySet()) {
            System.out.println(word + " was found " + wordCount.get(word) + " times");
        }
    }

    public void searchWord(String wordToFind){
            if(wordCount.containsKey(wordToFind))
                System.out.println(wordToFind + " appears in the text " + wordCount.get(wordToFind) + " times");
            else
                System.out.println(wordToFind + " doesn't appear in the text");
    }


}
