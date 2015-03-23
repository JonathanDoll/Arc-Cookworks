package Recipes;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author jonathan.doll
 */
public class SaveRecipe {
    
    public SaveRecipe(String recipeName, String ingredients, String instructions) throws IOException{
        FileWriter fout = new FileWriter("recipeList.txt", true);
        fout.append("Recipe Name:\n" + recipeName + "\n");
        fout.append("Ingredients:\n" + ingredients + "\n");
        fout.append("Instructions:\n" + instructions + "\n");
        fout.close();
    }
}
