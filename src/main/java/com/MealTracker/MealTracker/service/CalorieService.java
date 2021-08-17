package com.MealTracker.MealTracker.service;

import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class CalorieService {

    HashMap<String, Integer> meals;

    public CalorieService() {
        meals = new HashMap<String, Integer>();
    }

    public HashMap<String, Integer> getMeals() {
        return meals;
    }
}
