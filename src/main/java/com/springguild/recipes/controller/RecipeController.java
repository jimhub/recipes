package com.springguild.recipes.controller;

import com.springguild.recipes.data.entity.*;
import com.springguild.recipes.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * Created by jamesliljenquist on 10/29/15.
 */
@RestController
@RequestMapping(value = "/recipe", produces = MediaType.APPLICATION_JSON_VALUE)
public class RecipeController {

	@Autowired
	private RecipeService recipeService;

	@RequestMapping("/")
	@ResponseBody
	public List<Recipe> getAllRecipes() {
		return recipeService.getAllRecipes();
	}

	@RequestMapping("/{id}")
	@ResponseBody
	public Recipe getRecipe(@PathVariable("id") long id) {
		return recipeService.getRecipe(id);
	}

	@RequestMapping("/justPies")
	@ResponseBody
	public List<Recipe> getJustPies() {
		return recipeService.getPies();
	}
}
