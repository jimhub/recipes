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

	@Value("${server.port}")
	private int serverPort;

	@Autowired
	private RecipeRepository recipeRepository;

	public List<Recipe> getAllRecipes() {
		List<Recipe> recipes = new ArrayList<Recipe>();

		for(Recipe recipe : recipeRepository.findAll()) {
			recipe.setApplicationPort(serverPort);
			recipes.add(recipe);
		}

		return recipes;
	}

	public Recipe getRecipe(long id) {
		Recipe recipe = recipeRepository.findOne(id);
		recipe.setApplicationPort(serverPort);
		return recipe;
	}

	public List<Recipe> getPies() {
		return recipeRepository.findByIsPie(true);
	}
}
