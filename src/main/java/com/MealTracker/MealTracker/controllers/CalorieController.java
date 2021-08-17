/*package com.MealTracker.MealTracker.controllers;

import com.MealTracker.MealTracker.retriever.MealRetriever;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class CalorieController {



    @GetMapping("/meal/{food}")
    public String getMealCalories(@PathVariable String food) throws IOException {
        return food + " " + MealRetriever.getCurrentResponse(food);
    }
}*/
