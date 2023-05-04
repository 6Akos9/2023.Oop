package feladat2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        IDictionary arrayListDictionary = ArrayListDictionary.newInstance();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Word to find(Enter <end> to exit): ");
            String word = scanner.nextLine();
            if (word.equalsIgnoreCase("end")){
                break;
            }
            System.out.println("Find("+word+"):"+arrayListDictionary.findWord(word));
        }
        scanner.close();
    }
}