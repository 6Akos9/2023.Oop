package feladat1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDictionary implements IDictionary {
    private Set<String> words = new TreeSet<>();
    private static TreeSetDictionary instance = null;

    private TreeSetDictionary() {
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
            instance = new TreeSetDictionary();
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
