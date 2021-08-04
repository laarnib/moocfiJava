/**
 *
 * @author lb123
 */

import java.util.ArrayList;

public class Recipe {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;
    
    public Recipe() {
        this.name = "";
        this.cookingTime = 0;
        this.ingredients = new ArrayList<>();
    }
    
    public void setRecipeName (String recipeName) {
        this.name = recipeName;
    }
    
    public void setCookingTime (int cookingTime) {
        this.cookingTime = cookingTime;
    }
    
    public void addIngredients(String ingredient) {
        ingredients.add(ingredient);
    }
    
    public String getRecipeName() {
        return this.name;
    }
    
    public int getCookingTime() {
        return this.cookingTime;
    }
    
    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }
    
    @Override
    public String toString() {
        return this.name + ", cooking time: " + this.cookingTime + ".";
    }
}
