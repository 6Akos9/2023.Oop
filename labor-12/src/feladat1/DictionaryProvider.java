package feladat1;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class DictionaryProvider {
    private static IDictionary dictionary = null;

    public DictionaryProvider(DictionaryType dictionaryType) {
        createDictionary(dictionaryType);
    }

    public static IDictionary createDictionary(DictionaryType dtype) {
//        IDictionary dictionary = null;
        switch (dtype) {
            case ARRAY_LIST:
                dictionary =
                        ArrayListDictionary.newInstance();
                break;
            case HASH_SET:
                dictionary =
                        HashSetDictionary.newInstance();
                break;
            case TREE_SET:
                dictionary =
                        TreeSetDictionary.newInstance();
                break;
        }
        return dictionary;
    }

    public void findWordsFile(String s) {
        try (Scanner scanner = new Scanner(new File(s))) {
            String line;
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                String[] tokens = line.split(" ,.!?");
                for (int i = 0; i < tokens.length; i++) {
                    String word = tokens[i].trim();
                    dictionary.find(word);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
