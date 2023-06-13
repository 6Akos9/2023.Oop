package feladat1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class HashSetDictionary implements IDictionary {
    private HashSet words = new HashSet();
    private static HashSetDictionary instance = null;

    private HashSetDictionary() {
        try (Scanner scanner = new Scanner(new File(DICTIONARY_FILE))) {
            while (scanner.hasNextLine()) {
                add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static IDictionary newInstance() {
        if (instance == null) {
            instance = new HashSetDictionary();
        }
        return instance;
    }

    @Override
    public boolean add(String word) {
        if (!find(word)) {
            words.add(word);
            return true;
        }
        return false;
    }

    @Override
    public boolean find(String word) {
        if (!words.contains(word)) {
            return false;
        } else return true;
    }

    @Override
    public int size() {
        return words.size();
    }
}
