package Recipes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Jonathan Doll
 */

public class LoadRecipe {
   
    private String recipeName;
    private String ingredients = "";
    private String instructions = "";
    
    public LoadRecipe(String recipeName) throws FileNotFoundException, IOException{
        
        this.recipeName = recipeName;
        File recipes = new File("recipeList.txt");
        BufferedReader read = new BufferedReader(new FileReader(recipes));
        
        String r;
        while((r = read.readLine()) != null){
            if(r.contains(recipeName)) break;
        }
        read.readLine();
        while((r = read.readLine()) != null && !r.equals("Instructions:")){
            this.ingredients += r + "\n";
        }
        while((r = read.readLine()) != null && !r.equals("Recipe Name:")){
            this.instructions += r + "\n";
        }
        read.close();
        
        
    }
    
    public String getRecipeName(){
        return recipeName;
    }
    
    public String getIngredients(){
        return ingredients;
    }
    
    public String getInstructions(){
        return instructions.trim();
    }
    
}
