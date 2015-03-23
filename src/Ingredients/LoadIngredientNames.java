package Ingredients;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Jonathan Doll
 */

public class LoadIngredientNames {
    
    private String ingredientNames;
    
    public LoadIngredientNames(){
        
    }
    
    public String[] getIngredientNames() throws FileNotFoundException, IOException{
        ingredientNames = "";
        BufferedReader read = new BufferedReader(new FileReader("ingredientList.txt"));
        String r;
        while((r = read.readLine()) != null){
            if(r.equals("Ingredient:")){
                ingredientNames += "     " + read.readLine();
            }
        }
        ingredientNames = ingredientNames.trim();
        read.close();
        return ingredientNames.split("     ");
    }
    
}
