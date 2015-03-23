package Recipes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Jonathan Doll
 */

public class LoadRecipeNames {

    private String recipeNames;
    
    public LoadRecipeNames(){
        
    }
    
    public String[] getRecipeNames() throws FileNotFoundException, IOException{
        recipeNames = "";
        BufferedReader read = new BufferedReader(new FileReader("recipeList.txt"));
        String r;
        while((r = read.readLine()) != null){
            if(r.equals("Recipe Name:")){
                recipeNames += "     " + read.readLine();
            }
        }
        recipeNames = recipeNames.trim();
        read.close();
        return recipeNames.split("     ");
    }
    
    
}
