package Ingredients;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Jonathan Doll
 */

public class CreateIngredient {
    
    private String price = "0.00";
    private String name = "";
    private File ingredientList = new File("ingredientList.txt");
    private FileWriter fout;
    
    public CreateIngredient(String name) throws FileNotFoundException, IOException{
        this.name = name;
        fout = new FileWriter(ingredientList, true);
        fout.append("Ingredient:\n" + name + "\nPrice:\n" + price + "\n");
        fout.close();
    }
    
    public CreateIngredient(String name, String price) throws FileNotFoundException, IOException{
        this.name = name;
        this.price = price;
        fout = new FileWriter(ingredientList, true);
        fout.append("Ingredient:\n" + name + "\nPrice:\n" + price + "\n");
        fout.close();
    }
    
}
