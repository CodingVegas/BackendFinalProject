package com.promineotech.burrito.service;

import com.promineotech.burrito.entity.Ingredients;
import com.promineotech.burrito.entity.IngredientsInputModel;

public interface IngredientsService {

  Ingredients getIngredients(String ingredientsPK);

  Ingredients deleteIngredients(String ingredientsPK);
  
}
//Ingredients createIngredients(IngredientsInputModel input);
