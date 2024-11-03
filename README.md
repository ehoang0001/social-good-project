# Unit 3 - Data for Social Good Project 

## Introduction 

Software engineers develop programs to work with data and provide information to a user. Each user has different needs based on the information they are looking for from data. Your goal is to create a data analysis program for your user that stores and analyzes data to provide the information they need. 

## Requirements 

Use your knowledge of object-oriented programming, one-dimensional (1D) arrays, and algorithms to create your data analysis program: 
- **Write a class** – Write a class to represent your user or business and store and analyze their data with no-argument and parameterized constructors. 
- **Create at least two 1D arrays** – Create at least two 1D arrays to store the data that your user needs information about. 
- **Write a method** – Write a method that finds or manipulates the elements in a 1D array to provide the information your user needs. 
- **Implement a toString() method** – Write a toString() method that returns general information about the data (for example, number of values in the dataset). 
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions. 

## User Story 

As a marketer, I want to analyze which platform is best for paid advertising, so that I can increase client sales and reach the right audience.

## Dataset 

Dataset: Advertising Platforms Dataset

Platform (String) - name of the advertising platform (e.g., Instagram, Facebook)
ConversionRate (int) - percentage of users who made a purchase after seeing the ad

Example: 

Dataset: https://www.kaggle.com/datasets/sansuthi/global-co2-emissions 
- **Country** (String) - name of the country 
- **Population** (int) - number of people in the country 
- **CO2Emissions** (double) - carbon dioxide emission in kilotons 

## UML Diagram 

Put and image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here. Make sure your image file name is one work, otherwise it might not properly get display on this README. 

![UML Diagram for my project](nameOfImageFileHere.png) 

## Description 

This project helps marketers analyze which advertising platform works best. It uses data from different platforms to find the one with the highest conversion rate. The program uses a class to represent the user and two arrays to store platform names and their conversion rates.

The program reads data from text files and uses methods to analyze the data. It then prints out which platform has the best conversion rate. Users can see how many platforms are included in the data set and which one performs the best. If the program uses the Scanner class, users can also enter new data for analysis.
