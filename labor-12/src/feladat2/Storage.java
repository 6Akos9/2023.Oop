package feladat2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Storage {
    private HashMap<Integer,  Product> products = new HashMap<>();
    private File textfile;
    private Scanner input;
    public static int updated;

    public Storage(String file){
        textfile = new File(file);
        readInFile(textfile);
    }

    private void readInFile(File textfile){
        try(Scanner scanner = new Scanner(textfile)){
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] tokens = line.split(" ");
                int Id = Integer.parseInt(tokens[0].trim());
                String name = tokens[1].trim();
                int amount = Integer.parseInt(tokens[2].trim());
                int price = Integer.parseInt(tokens[3].trim());
                Product product = new Product(Id, name, amount, price);
                products.put(Id, product);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public void update(String textfile){
        try(Scanner scanner = new Scanner(new File(textfile))){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] tokens = line.split(" ");
                int Id = Integer.parseInt(tokens[0].trim());
                int newAmount = Integer.parseInt(tokens[1].trim());
                if (products.containsKey(Id)){
                    products.get(Id).increaseAmount(newAmount);
                }
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }finally {
            System.out.println("Succesfully updated products: "+updated);
        }
    }
}
