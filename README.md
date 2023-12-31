# University-Mini-Project

## Overview

This Java project implements a simple university system that manages classrooms, courses, clubs, teachers, students, exams, events, and staff. The system is designed to organize and store information related to various entities within a university.

## Classes

### 1. Classrooms

- Represents the physical classrooms where courses take place.
- Associated with specific courses.

### 2. Courses

- Represents academic courses offered in the university.
- Each course has a unique class, a teacher, and an associated exam.
  
### 3. Clubs

- Represents extracurricular clubs within the university.
- Contains instances of the Event class and multiple students.
- Students also have club attributes.

### 4. Teachers

- Represents academic staff with a specialty.
- Teaches specific courses.

### 5. Students

- Represents students enrolled in the university.
- Associated with clubs and have club attributes.

### 6. Exams

- Represents examinations associated with a specific course.
- Linked to a particular classroom.

### 7. Event

- Represents events organized by clubs.
- Events can be associated with multiple clubs and have details such as date, time, and location.

### 8. Staff

- Independent entity representing non-academic staff in the university.

**A personInfo class was extended to define the teacher, student and staff to avoid code redundancy and facilitate changes**

## Usage

The classes in this project are designed to be used together to create a comprehensive university management system. Users can instantiate objects from these classes to model real-world university scenarios.

##
**Note:** There is no code in the main class to be executed since the aim of this project was to correctly implement multiple entities and learn to link them properly and logically coordinate their functioning properly in java OOP.
