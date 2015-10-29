
INSERT INTO Recipe (id, name, is_pie) VALUES(1, 'Pecan Pie', TRUE);
INSERT INTO Ingredient (amt, unit, name, recipe_id) VALUES(2.4, 'Cup', 'Flour', 1);
INSERT INTO Ingredient (amt, unit, name, recipe_id) VALUES(1, 'Bushel', 'Pecans', 1);
INSERT INTO Ingredient (amt, unit, name, recipe_id) VALUES(3, 'Handful', 'Milk', 1);

INSERT INTO Recipe (id, name, is_pie) VALUES(2, 'Chicken Enchiladas', FALSE);
INSERT INTO Ingredient (amt, unit, name, recipe_id) VALUES(0.5, 'Spoon', 'Cheese', 2);
INSERT INTO Ingredient (amt, unit, name, recipe_id) VALUES(1, 'Chickeny', 'Chicken', 2);
INSERT INTO Ingredient (amt, unit, name, recipe_id) VALUES(4, 'Cup', 'Enchilada Sauce', 2);

INSERT INTO Recipe (id, name, is_pie) VALUES(3, 'Apple Pie', TRUE);
INSERT INTO Ingredient (amt, unit, name, recipe_id) VALUES(4, 'Cup', 'Flour', 3);
INSERT INTO Ingredient (amt, unit, name, recipe_id) VALUES(1, 'Tree', 'Apples', 3);
INSERT INTO Ingredient (amt, unit, name, recipe_id) VALUES(3, 'Handful', 'Milk', 3);

INSERT INTO Recipe (id, name, is_pie) VALUES(4, 'Mac n Cheese', FALSE);
INSERT INTO Ingredient (amt, unit, name, recipe_id) VALUES(2, 'Part', 'Mac', 4);
INSERT INTO Ingredient (amt, unit, name, recipe_id) VALUES(1, 'Part', 'Cheese', 4);

