package com.example.learnadday2;

public class BMICalculator {

    public static double calculateBMI(double weightKg, double heightM) {
        if (heightM <= 0) {
            return 0;
        }
        return weightKg / (heightM * heightM);
    }

    public static String getCategory(double bmi) {
        if (bmi < 15)
            return "Very severely underweight";
        else if (bmi < 16)
            return "Severely underweight";
        else if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25)
            return "Normal";
        else if (bmi < 30)
            return "Overweight";
        else if (bmi < 35)
            return "Obese Class 1 – Moderately Obese";
        else if (bmi < 40)
            return "Obese Class 2 - Severely Obese";
        else
            return "Obese Class 3 - Very Severely Obese";
    }
}
