package gent.spring.repositories;

import gent.spring.controllers.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe ,Long> {

}
