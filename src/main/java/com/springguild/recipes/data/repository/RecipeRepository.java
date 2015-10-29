package com.springguild.recipes.data.repository;

import com.springguild.recipes.data.entity.*;
import org.springframework.data.repository.*;

import java.util.*;

/**
 * Created by jamesliljenquist on 10/29/15.
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
	List<Recipe> findByIsPie(boolean isPie);
}
