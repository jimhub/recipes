package com.springguild.recipes.data.entity;

import javax.persistence.*;
import java.util.*;

/**
 * Created by jamesliljenquist on 10/29/15.
 */
@Entity
public class Recipe {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String name;

	@OneToMany(mappedBy = "recipe")
	private Set<Ingredient> ingredients = new HashSet<Ingredient>(0);

	private boolean isPie;

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Set<Ingredient> getIngredients() {
		return ingredients;
	}

	public boolean isPie() {
		return isPie;
	}
}
