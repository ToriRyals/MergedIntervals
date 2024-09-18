 MergeIntervals Project

This is a Java project that merges overlapping intervals. The project demonstrates how to use algorithms for merging intervals and includes unit tests written using JUnit 5.

## Table of Contents
- [Project Description](#project-description)
- [Requirements](#requirements)
- [Setup](#setup)
- [Running the Application](#running-the-application)
- [Running Tests](#running-tests)


## Project Description

The **MergeIntervals** project provides a function to merge a list of intervals that overlap into a set of non-overlapping intervals.

For example, given the input: [[1,3],[2,6],[8,10],[15,18]]

The output would be: [[1,6],[8,10],[15,18]]

This project includes:
- A Java implementation to merge intervals.
- Unit tests using JUnit 5 to ensure the code works as expected.

## Requirements

- **Java 17** or later
- **Maven** (for building the project)

## Setup

1. Clone this repository:
    ```bash
    git clone https://github.com/yourusername/MergeIntervalsProject.git
    ```
   
2. Navigate to the project directory:
    ```bash
    cd MergeIntervals
    ```

3. Build the project using Maven:
    ```bash
    mvn clean install
    ```

## Running the Application

You can run the application by creating a Java class with a `main` method that calls the `merge` method of the `MergeIntervals` class, passing an array of intervals.

## Running Tests

To run the JUnit tests, use the following command:

    ```bash
    mvn test
    ```


