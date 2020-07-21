package gent.spring.services;

import gent.spring.commands.RecipeCommand;
import gent.spring.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);


}
