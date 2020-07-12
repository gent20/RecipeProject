package gent.spring.repositories;

import gent.spring.controllers.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    
}
