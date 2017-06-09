package com.hodue.factory.absf.product.material.impl;

import com.hodue.factory.absf.factory.PizzaStore;
import com.hodue.factory.absf.factory.NYPizzaIngredientFactory;
import com.hodue.factory.absf.factory.PizzaIngredientFactory;
import com.hodue.factory.absf.product.*;
import com.hodue.factory.absf.product.CheesePizza;
import com.hodue.factory.absf.product.ClamPizza;
import com.hodue.factory.absf.product.PepperoniPizza;

public class NYPizzaStore extends PizzaStore {
 
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory =
			new NYPizzaIngredientFactory();
 
		if (item.equals("cheese")) {
  
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
  
		} else if (item.equals("veggie")) {
 
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("New York Style Veggie Pizza");
 
		} else if (item.equals("clam")) {
 
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
 
		} else if (item.equals("pepperoni")) {

			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("New York Style Pepperoni Pizza");
 
		} 
		return pizza;
	}
}
