package feladat2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDictionary implements IDictionary{


    private ArrayList<String> words=new ArrayList<>();
    private static ArrayListDictionary instance = null;

    private ArrayListDictionary(){
        ///populate word ArrayList
        try(Scanner scanner= new Scanner(new File(DICTIONARY_FILE)))
        {
            while (scanner.hasNextLine()){
                add(scanner.nextLine());
            }
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
    }
    public static IDictionary newInstance(){
        if(instance==null){
            instance = new ArrayListDictionary();
        }
        return instance;
    }
    @Override
    public boolean add(String word) {
        if(!findWord(word)){
            words.add(word);
            return true;
        }
        return false;
    }

    @Override
    public boolean findWord(String word) {
        return words.contains(word);
    }

    @Override
    public int size() {
        return words.size();
    }
}
