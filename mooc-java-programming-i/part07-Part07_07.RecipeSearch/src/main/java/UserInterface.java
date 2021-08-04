/**
 *
 * @author lb123
 */

import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {
    private Scanner scanner;
    private Scanner fileReader;
    private ArrayList<Recipe> recipes;
    
    public UserInterface(Scanner fileReader, Scanner scanner) {
        this.scanner = scanner;
        this.fileReader = fileReader;
        this.recipes = new ArrayList<>();
    }
    
    public void start() {
        readFile();
        printCommands();
        getCommandFromUser();
        scanner.close();
        fileReader.close();
    }
    
    public void printCommands() {
        System.out.println("");
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
    }
    
    public void getCommandFromUser() {        
        while (true) {
            System.out.println("");
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            
            if (command.equals("list")) {
                getRecipeList();
            } else if (command.equals("stop")) {
                break;
            } else if (command.equals("find name")) {
                findRecipeByName();
            } else if (command.equals("find cooking time")) {
                findRecipeByCookingTime();
            } else if (command.equals("find ingredient")) {
                findRecipeByIngredient();
            } else {
                System.out.println("Invalid command");
            }            
        }
    }
    
    public void readFile () {
        ArrayList<String> recipeInformation = new ArrayList<>();
        
        while (fileReader.hasNextLine()) {
            String line = fileReader.nextLine();
            if (line.isEmpty()) {
                setRecipeInformation(recipeInformation);
                recipeInformation.clear();
                continue;
            }     
            
            recipeInformation.add(line);
        }
        
        setRecipeInformation(recipeInformation);
        recipeInformation.clear();
    }
    
    private void setRecipeInformation(ArrayList<String> recipeInfo) {
        Recipe recipe = new Recipe();
        recipes.add(recipe);

        String recipeName = recipeInfo.get(0);
        int cookingTime = Integer.valueOf(recipeInfo.get(1));

        recipe.setRecipeName(recipeName);
        recipe.setCookingTime(cookingTime);

        if (recipeInfo.size() < 3) {
            return;
        }

        for (int i = 2; i < recipeInfo.size(); i++) {
            recipe.addIngredients(recipeInfo.get(i));
        }        
    }
    
    public void getRecipeList() {
        System.out.println("");
        System.out.println("Recipes:");        
        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
    }
    
    public void findRecipeByName() {
        System.out.print("Searched word: ");
        String keyWord = scanner.nextLine();
        
        System.out.println("");
        System.out.println("Recipes:");        
        for (Recipe recipe : recipes) {
            if (recipe.getRecipeName().contains(keyWord)) {
                System.out.println(recipe);
            }
        }
    }
    
    private void findRecipeByCookingTime() {
        System.out.print("Max cooking time: ");
        int maxTime = Integer.valueOf(scanner.nextLine());
        
        System.out.println("");
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getCookingTime() <= maxTime) {
                System.out.println(recipe);
            }
        } 
    }
    
    private void findRecipeByIngredient() {
        System.out.print("Ingredient: ");
        String ingredient = scanner.nextLine();
        
        System.out.println("");
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe);
            }
        }
    }
}
