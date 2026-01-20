BMI Calculator Android Application Documentation
1. Introduction
   
This document provides a detailed description of the BMI Calculator Android Application developed using Android Studio and Java.

The application allows users to calculate their Body Mass Index (BMI) by entering their weight and height, and it classifies the result into standard health categories.

The documentation covers: - Application overview 
                         - User interface design and layout
                         - BMI calculation logic
                         - Input validation and output handling
                         - Screenshots description of the running application
                      
This document is intended for academic and development purposes and demonstrates a basic Android application implementation using event-driven programming.
________________________________________
2. Application Overview

The BMI Calculator app is a simple health-related Android application.

Its main function is to compute the BMI using the formula:
                                                BMI = Weight / (Height × Height)
                                 Where: - Weight is measured in kilograms (kg) - Height is measured in meters (m)
                                 
Based on the calculated BMI value, the app categorizes the user as:

- Underweight
- Normal
- Overweight
- Obese
The app consists of a single activity (MainActivity) and uses a clean, minimal user interface.
________________________________________
3. User Interface Design and Layout
   
3.1 Layout Description

The application uses a simple vertical layout consisting of the following UI elements:

1.	EditText (Weight Input)
o	Allows the user to enter their weight in kilograms
o	Uses numeric input type for accuracy
2.	EditText (Height Input)
o	Allows the user to enter their height in meters
o	Uses numeric decimal input
3.	Button (Calculate BMI)
o	Triggers the BMI calculation when clicked
4.	TextView (Result Display)
o	Displays the calculated BMI value
o	Shows the corresponding BMI category
The layout is designed to be simple and user-friendly, ensuring ease of use even for first-time users.

3.2 Design Considerations

•	Minimalistic design for clarity
•	Proper spacing between input fields
•	Clear button labeling
•	Readable output text
________________________________________
4. Application Logic and Implementation
   
4.1 MainActivity Class

The MainActivity class extends AppCompatActivity and serves as the entry point of the application.
UI components are initialized using findViewById() inside the onCreate() method after setting the content view.

4.2 Event Handling

The BMI calculation is triggered using an OnClickListener attached to the Calculate button.
When the button is clicked: 
1. The app retrieves user input from the weight and height fields 
2. It checks whether any input field is empty 
3. If inputs are missing, an error message is displayed 
4. If inputs are valid, BMI is calculated and categorized
________________________________________

5. BMI Calculation Logic
   
5.1 Input Validation

Before performing any calculations, the application verifies that both weight and height fields are not empty: - If either field is empty, the user is prompted to enter both values - This prevents application crashes due to invalid input

5.2 BMI Formula Implementation

Once valid input is confirmed: - Weight and height values are converted from String to double - BMI is calculated using the formula:
BMI = weight / (height × height)
The result is stored as a double value.

5.3 BMI Category Classification

The calculated BMI is classified using conditional statements:
•	BMI < 18.5 → Underweight
•	18.5 ≤ BMI < 25 → Normal
•	25 ≤ BMI < 30 → Overweight
•	BMI ≥ 30 → Obese
5.4 Result Display

The result is displayed using a TextView, formatted to two decimal places and shown along with the BMI category.
________________________________________

#6. Screenshots of the Application
Screenshot 1: Application Home Screen
•	Displays input fields for weight and height
•	Shows the calculate button
 ![homescreen](BMIApp2\empty1.jpeg)
 
Screenshot 2: BMI Calculation Result
•	Displays calculated BMI value
•	Shows BMI category
![output](BMIApp2\full.jpeg)
