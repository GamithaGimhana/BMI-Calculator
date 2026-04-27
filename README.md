# BMI Calculator

A simple and intuitive Android application that calculates the Body Mass Index (BMI) based on user input for weight and height.

## Features

- **BMI Calculation**: Instantly calculate your BMI score using the standard formula ($weight / height^2$).
- **Category Classification**: Automatically determines your health category based on the calculated BMI:
    - Very severely underweight
    - Severely underweight
    - Underweight
    - Normal (Healthy weight)
    - Overweight
    - Obese (Class 1, 2, and 3)
- **Input Validation**: Ensures valid numeric inputs for both weight and height.
- **Clean UI**: User-friendly interface built with `ConstraintLayout`.

## Getting Started

### Prerequisites

- Android Studio Flamingo or newer.
- Android SDK 33+.
- A physical Android device or an Emulator.

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/GamithaGimhana/BMI-Calculator.git
   ```
2. Open the project in **Android Studio**.
3. Wait for Gradle sync to complete.
4. Click **Run** (Green play button) to deploy the app to your device/emulator.

## Usage

1. Enter your weight in **kilograms (kg)**.
2. Enter your height in **meters (m)** (e.g., 1.75).
3. Click the **"Calculate BMI"** button.
4. Your BMI score and health category will be displayed instantly.

## Project Structure

- `MainActivity.java`: Handles UI interactions and button listeners.
- `BMICalculator.java`: Logic for BMI calculation and categorization.
- `activity_main.xml`: The user interface layout.
