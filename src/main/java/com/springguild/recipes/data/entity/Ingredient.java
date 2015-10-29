package com.springguild.recipes.data.entity;

import javax.persistence.*;

/**
 * Created by jamesliljenquist on 10/29/15.
 */
@Entity
public class Ingredient {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private float amt;
	private String unit;
	private String name;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "recipe_id", nullable = false)
	private Recipe recipe;

	public long getId() {
		return id;
	}

	public float getAmt() {
		return amt;
	}

	public String getUnit() {
		return unit;
	}

	public String getName() {
		return name;
	}
}
