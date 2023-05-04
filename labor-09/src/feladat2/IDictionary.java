package feladat2;

public interface IDictionary {
    String DICTIONARY_FILE = "D:\\GitHub-Oop\\labor-09\\src\\feladat2\\dictionary.txt";

    boolean add(String word);

    boolean findWord(String word);

    int size();
}
