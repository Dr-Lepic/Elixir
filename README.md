# Elixir - Your Personal Health Tracker

![Health Tracking](https://img.shields.io/badge/Health-Tracking-brightgreen)
![Java](https://img.shields.io/badge/Language-Java-orange)


## Description
Elixir is a command line based Health Tracking application. It helps the users to monitor fitness, nutrition, and overall well-being. The application raises user's awareness by tracking BMI/BMR, water intake, workouts, heart rate, blood pressure, medications, and diseases—all under the theme of "Savor the Favor of Health," emphasizing mindful health management.

### Objective
- Track key health metrics (BMI, BMR, hydration, workouts, vitals)
- Provide personalized suggestions for improvement
- Ensure data consistency with validation (e.g., weight/height thresholds)
- Promote sustainable health habits through daily tracking

---

## Project Details

### Functionality
- **User Profile**: Stores weight, height, and age with update threshold limits
- **BMI/BMR Calculator**: Evaluates body health and calorie needs
- **Water Tracker**: Tracks water intake and progress towards the goal
- **Workout Tracker**: Logs exercises and calories burned
- **Vitals Monitoring**: Records heart rate and blood pressure with medical feedback
- **Medicine/Disease Log**: Manages medications and health history

### Architecture
- Built following **OOP principles** (Encapsulation, Inheritance, Polymorphism)
- **Modular design** for easy extension
- **Serialization** for data persistence between sessions

---

## Key Features

| Feature | Description |
|---------|-------------|
| **User Profile** | Tracks weight/height with change thresholds (5kg/0.05m) |
| **BMI/BMR Calculator** | Calculates BMI (with status categories) and BMR for calorie management |
| **Water Intake Tracker** | Logs daily water consumption against a 4000ml goal with progress status |
| **Workout Tracker** | Estimates calories burned for 5 exercise types (running, swimming, etc.) |
| **Heart Rate Monitor** | Classifies readings as Normal/Bradycardia/Tachycardia |
| **Blood Pressure Log** | Categorizes readings per medical standards (e.g., Hypertension Stage 1) |
| **Medicine Manager** | Tracks medications with dosage and schedule (daily/weekly view) |
| **Disease Tracker** | Records illnesses with dates and descriptions |

---

## Technology Used

- **Language**: Java (OOP)
- **UI**: Command Line Interface
- **Data Persistence**: Java Serialization

---

## Justification

We can’t *“Savor the favour of health”* without a sound health. We need a sound body and mind to enjoy life. In order to stay healthy we need to track our Health.
By tracking BMI/BMR, heart rate, blood pressure and getting personalized feedback we can check our condition of health.
We sometimes get sick and by tracking our medicine we can know the schedule of our medicine and become healthy again without missing any medication.
To get the frequency of the sickness, we can track our sickness and become cautious for the future.
By tracking our water intake we can ensure the consumption of water.
We can't keep a sound body without exercising. So by tracking our exercise along with the calories burned can help us stay motivated.

Ultimately this app enables you to build a healthy life and become cautious of your health and enables you to “Savor the favour of health”.


---

## Getting Started

1. **Requirements**: Java 8+
2. **Execution**: Run `Main`

> **Note**: Data is automatically saved in `data.ser` and reloaded on next launch.

---

**Developed by:** Mahbub (ID: 220042148)  
**Theme:** *Savor the Favor of Health*