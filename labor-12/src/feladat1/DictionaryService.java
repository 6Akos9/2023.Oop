package feladat1;

import java.util.ArrayList;

public class DictionaryService {
    private IDictionary dictionary;

    public DictionaryService(IDictionary dictionary) {
        this.dictionary = DictionaryProvider.createDictionary(DictionaryType.ARRAY_LIST);
    }

    public boolean findWords() {
        return false;
    }

    public ArrayList<String> findWordsFile() {
        return null;
    }
}
