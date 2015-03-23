package arc.cookworks;

import Display.CreateIngredientDisplay;
import Display.CreateRecipeDisplay;
import Display.GroceryListDisplay;
import Display.IngredientListDisplay;
import Display.RecipeListDisplay;
import java.io.File;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

/**
 * @author Jonathan Doll
 */

public class ArcCookworks {
    
    private static JFrame frame = new JFrame();
    public static GroceryListDisplay gld;
    
    public static void main(String[] args) throws IOException {
        File ingred = new File("ingredientList.txt");
        if(!ingred.exists()){
            ingred.createNewFile();
        }
        
        File recipes = new File("recipeList.txt");
        if(!recipes.exists()){
            recipes.createNewFile();
        }
        
        JTabbedPane display = new JTabbedPane();
        
        CreateRecipeDisplay crd = new CreateRecipeDisplay();
        crd.setName("New Recipe");
        
        RecipeListDisplay rld = new RecipeListDisplay();
        rld.setName("Recipe List");
        
        IngredientListDisplay ild = new IngredientListDisplay();
        ild.setName("Ingredient List");
        
        gld = new GroceryListDisplay();
        gld.setName("Grocery List");
        
        CreateIngredientDisplay cid = new CreateIngredientDisplay();
        cid.setName("New Ingredient");
        
        display.add(rld);
        display.add(ild);
        display.add(crd);
        display.add(cid);
        display.add(gld);
        frame.setTitle("Arc Cookworks");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.add(display);
    }
    
}
