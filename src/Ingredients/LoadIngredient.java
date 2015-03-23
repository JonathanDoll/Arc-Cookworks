package Ingredients;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Jonathan Doll
 */

public class LoadIngredient {
    
    private String ingredientName;
    private String cost;
    
    public LoadIngredient(String ingredientName) throws FileNotFoundException, IOException{
        
        this.ingredientName = ingredientName;
        File ingredients = new File("ingredientList.txt");
        BufferedReader read = new BufferedReader(new FileReader(ingredients));
        
        String r;
        while((r = read.readLine()) != null){
            if(r.contains(ingredientName)) break;
        }
        read.readLine();
        cost = read.readLine();
        read.close();
    }
    
    public String getIngredientName(){
        return ingredientName;
    }
    
    public String getCost(){
        return cost;
    }
    
    public void setCost(String cost){
        this.cost = cost;
    }
    
}
