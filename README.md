# Balfaqih-Abobakr-OOP
# BIT1123 Object-Oriented Programming Fundamentals in Java

![Java](https://img.shields.io/badge/Java-17%2B-orange) ![Course](https://img.shields.io/badge/Course-BIT1123-blue) ![Status](https://img.shields.io/badge/Tutorials-Complete-brightgreen)

## Student Information

| Field | Details |
|---|---|
| Student name | BALFAQIH ABOBAKR MOHAMMED ABOBAKR |
| Student ID | 202505010363 |
| Class code | 202605F0782 |
| Programme | BCSSE |
| NRIC / Passport No. | 14213550 |
| Course | BIT1123 - Object Oriented Programming |
| Institution | City University Malaysia, Cyberjaya Campus |
| Assignment | Assignment 1 - Individual (20%) |

## Course Description

This repository consolidates my Java tutorial work for Weeks 1-10. It documents my progression from basic Java syntax and control structures to classes, encapsulation, inheritance, abstraction, polymorphism, collections, file handling, exception handling, and graphical user interfaces. Each folder is a self-contained example that can be compiled and run independently.

## Repository Structure

```text
Balfaqih-Abobakr-OOP/
|-- README.md
|-- myreport.pdf
|-- week1/        Basic Java and selection statements
|-- week2/        Classes, objects, constructors, and methods
|-- week3-4/      Inheritance and method overriding
|-- week5/        Encapsulation and controlled data access
|-- week6/        Inheritance with employee and lecturer classes
|-- week7/        Abstraction and runtime polymorphism
|-- week8-9/      Collections, file I/O, and exception handling
`-- week10/       Event-driven programming with Java Swing
```

## Tutorial Summary

| Week | Main topic | Practical outcome |
|---|---|---|
| 1 | Java fundamentals | Printed output and used conditional statements to calculate a grade. |
| 2 | Classes and objects | Modelled a student using fields, a constructor, and instance methods. |
| 3-4 | Inheritance and overriding | Built a `Person` hierarchy and provided specialized introductions. |
| 5 | Encapsulation | Protected student data with private fields, getters, and setters. |
| 6 | Inheritance | Reused employee state and behaviour in a lecturer subclass. |
| 7 | Abstraction and polymorphism | Used an abstract appliance type with several concrete implementations. |
| 8-9 | Collections and file handling | Collected tasks, saved them to a text file, loaded them, and handled I/O errors. |
| 10 | GUI and event handling | Built a one-question Swing quiz with two answer buttons and immediate feedback. |

## Technologies Used

- Java Development Kit (JDK 17 or newer)
- Java Swing for the Week 10 graphical interface
- Java Collections Framework (`ArrayList`)
- Java file I/O (`BufferedReader`, `BufferedWriter`)
- Git and GitHub for version control and portfolio organization

## How to Run

Install a JDK and confirm that `java` and `javac` are available. Open a terminal in the folder for the tutorial you want to run.

For a single-file example:

```bash
cd week1
javac HelloWorld.java
java HelloWorld
```

For a multi-file tutorial:

```bash
cd week7
javac *.java
java Main
```

For the Week 10 graphical quiz:

```bash
cd week10
javac Questions.java QuizBattleGUI.java
java QuizBattleGUI
```

The Week 8-9 program accepts three tasks from the console and writes `task.txt` in the current working directory.

## Reflection Summary

These tutorials changed how I approach programming problems. I began by writing instructions in one `main` method, then learned to divide responsibilities among objects with clear state and behaviour. Encapsulation helped me protect data, while inheritance, abstraction, and polymorphism showed me how to reuse code without losing flexibility. File handling and GUI development introduced real-world concerns such as invalid input, exceptions, persistent data, events, and user feedback. My main improvement has been learning to design first, test smaller parts, and treat readable names and documentation as part of a correct solution.

The complete self-reflective report is available in [`myreport.pdf`](myreport.pdf).

## Repository URL

https://github.com/abocom64-sketch/Balfaqih-Abobakr-OOP

## Academic Note

This repository is maintained for educational submission and demonstrates my learning progress in OOP.
