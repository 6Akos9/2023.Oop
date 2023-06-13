package feladat1;

public interface IDictionary {
    String DICTIONARY_FILE = "labor-12/src/dictionary.txt";

    boolean add(String word);

    boolean find(String word);

    int size();
}
