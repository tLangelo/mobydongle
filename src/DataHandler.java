import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

// Class for Set
public class DataHandler {

    private final File file;
    private final HashSet<String> wordList;
    private Scanner sc;

    public DataHandler(String filePath){
        file = new File(filePath);
        wordList = new HashSet<>();

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
            wordList.addAll(Arrays.asList(split));

        }
    }

    public void printUniqueWords(){
        System.out.println(wordList.size());
    }

    public void searchWord(String wordToFind){
        if(wordList.contains(wordToFind.toLowerCase()))
            System.out.println(wordToFind + " was found in the text");
        else
            System.out.println("Couldn't find that word");
    }

    public HashSet<String> getWordList() {
        return wordList;
    }
}
