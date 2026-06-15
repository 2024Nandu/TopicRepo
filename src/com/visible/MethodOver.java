package com.visible;


	class MealTracker {
	    public void logMeal(String mealType) {
	        System.out.println("Meal logged: " + mealType);
	    }

	    public void logMeal(String mealType, int calories) {
	        System.out.println("Meal logged: " + mealType + " with " + calories + " calories");
	    }

	    public void logMeal(String mealType, int calories, String macros) {
	        System.out.println("Meal logged: " + mealType + " with " + calories + " calories, macros: " + macros);
	    }

	    public void logMeal(String mealType, int calories, String macros, String micronutrients, String dietaryRestrictions) {
	        System.out.println("Meal logged: " + mealType + " with " + calories + " calories, macros: " + macros + ", micronutrients: " + micronutrients + ", dietary restrictions: " + dietaryRestrictions);
	    }
	}

	public class MethodOver {
	    public static void main(String[] args) {
	        MealTracker tracker = new MealTracker();
	        tracker.logMeal("Breakfast");
	        tracker.logMeal("Lunch", 600);
	        tracker.logMeal("Dinner", 800, "40% carbs, 30% protein, 30% fats");
	        tracker.logMeal("Snack", 300, "10% carbs, 20% protein, 70% fats", "high fiber", "gluten-free");
	         }
	}
