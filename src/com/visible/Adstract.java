package com.visible;

	abstract class FitnessTrainer {
	    public abstract void conductSession();
	    public abstract void giveAdvice();
	}

	class YogaInstructor extends FitnessTrainer {
		@Override 
	    public void conductSession() {
	        System.out.println("Conduct a yoga session...");
	    }

		@Override
	    public void giveAdvice() {
	        System.out.println("Give advice on flexibility and stress relief...");
	    }
	}

	class WeightTrainingCoach extends FitnessTrainer {
		@Override
	    public void conductSession() {
	        System.out.println("Conduct a weight training session...");
	    }

		@Override
	    public void giveAdvice() {
	        System.out.println("Give advice on strength training and muscle gain...");
	    }
	}

	public class Adstract {
	    public static void main(String[] args) {
	        YogaInstructor yogaInstructor = new YogaInstructor();
	        WeightTrainingCoach weightCoach = new WeightTrainingCoach();

	        startWorkout(yogaInstructor);
	        startWorkout(weightCoach);
//	        yogaInstructor.conductSession();
//	        yogaInstructor.giveAdvice();
//	        weightCoach.conductSession();
//	        weightCoach.giveAdvice();
	    }

	    public static void startWorkout(FitnessTrainer trainer) {
	        trainer.conductSession();
	        trainer.giveAdvice();
	    }
	}
