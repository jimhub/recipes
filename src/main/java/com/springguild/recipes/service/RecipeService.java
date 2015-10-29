package com.springguild.recipes.service;

import com.springguild.recipes.data.entity.*;
import com.springguild.recipes.data.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

/**
 * Created by jamesliljenquist on 10/29/15.
 */
@Service
public class RecipeService {

	@Autowired
	private RecipeRepository recipeRepository;

	public List<Recipe> getAllRecipes() {
		List<Recipe> recipes = new ArrayList<Recipe>();

		for(Recipe recipe : recipeRepository.findAll()) {
			recipes.add(recipe);
		}

		return recipes;
	}

	public Recipe getRecipe(long id) {
		return recipeRepository.findOne(id);
	}

	public List<Recipe> getPies() {
		return recipeRepository.findByIsPie(true);
	}
}
