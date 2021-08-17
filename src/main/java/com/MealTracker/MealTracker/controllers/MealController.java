package com.MealTracker.MealTracker.controllers;

import com.MealTracker.MealTracker.models.Meal;
import com.MealTracker.MealTracker.repo.MealRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;



@RestController
@RequestMapping("/meals")
public class MealController {


    private final MealRepo mealRepo;

    public MealController(MealRepo mealRepo) {
        this.mealRepo = mealRepo;
    }

    @GetMapping
    public List<Meal> getAllMeals() {
        return mealRepo.findAll();
    }

    @GetMapping("/{id}")
    public Meal getMeal(@PathVariable Long id) {
        return mealRepo.findById(id).orElseThrow(RuntimeException::new);
    }


    @PostMapping
    public ResponseEntity createMeal(@RequestBody Meal meal) throws URISyntaxException {
        Meal savedMeal = mealRepo.save(meal);
        return ResponseEntity.created(new URI("/meals/" + savedMeal.getId())).body(savedMeal);
    }

    @PutMapping("/{id}")
    public ResponseEntity updateMeal(@PathVariable Long id, @RequestBody Meal meal) {
        Meal currentMeal = mealRepo.findById(id).orElseThrow(RuntimeException::new);
        currentMeal.setDate(meal.getDate());
        currentMeal.setMealDescription(meal.getMealDescription());
        currentMeal.setCaloriesAmount(meal.getCaloriesAmount());
        currentMeal = mealRepo.save(meal);

        return ResponseEntity.ok(currentMeal);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteMeal(@PathVariable Long id) {
        mealRepo.deleteById(id);
        return ResponseEntity.ok().build();
    }





}
