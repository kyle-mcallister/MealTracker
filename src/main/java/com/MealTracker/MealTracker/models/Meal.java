package com.MealTracker.MealTracker.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "meal")
public class Meal {
    private Date date;
    private Integer caloriesAmount = 0;
    private Integer calorieMax = 0;
    private String mealDescription;

    @Id
    @GeneratedValue
    private Long id;

    public Meal(Date date, Integer caloriesAmount, String mealDescription) {
        this.date = date;
        this.caloriesAmount = caloriesAmount;
        this.mealDescription = mealDescription;
    }

    public Meal() {

    }

    public Integer getCalorieMax() {
        return calorieMax;
    }

    public void setCalorieMax(Integer calorieMax) {
        this.calorieMax = calorieMax;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getCaloriesAmount() {
        return caloriesAmount;
    }

    public void setCaloriesAmount(Integer caloriesAmount) {
        this.caloriesAmount = caloriesAmount;
    }

    public String getMealDescription() {
        return mealDescription;
    }

    public void setMealDescription(String mealDescription) {
        this.mealDescription = mealDescription;
    }
}
