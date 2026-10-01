# Smart University Personnel & Compensation System

A Java application that models university staff and calculates their monthly payroll, built with object-oriented design, strict input validation, and custom exception handling.

> Academic project for CS201 (Java, JDK 17+).

## Features

- **Abstract base class** `UniversityEmployee` with encapsulated fields and validation (negative base salary is rejected with `IllegalArgumentException`).
- **Role-specific salary logic**
  - `Professor`: base salary + (published papers × 150)
  - `Administrator`: base salary + (overtime hours × 45)
- **`Evaluatable` interface** for performance reviews, rejecting scores outside 0 to 100.
- **Custom checked exception** `InvalidAdvisingLoadException` for `AcademicAdvisor`, enforcing an advising load between 1 and 50 students.
- **Polymorphic payroll workflow** that loops over a `UniversityEmployee[]` array, uses `instanceof` with safe casting, and prints the total institutional payroll.

## Concepts Demonstrated

| Concept | Where |
|---|---|
| Encapsulation | Private fields, getters, and setters |
| Abstraction | `UniversityEmployee` abstract methods |
| Inheritance | `Professor` and `Administrator` via `super(...)` |
| Polymorphism | Array dispatch of `calculateMonthlySalary()` and `conductDuties()` |
| Interfaces | `Evaluatable` |
| Exception handling | Custom checked exception and `try-catch` |

## Project Structure

```
├── UniversityEmployee.java
├── Professor.java
├── Administrator.java
├── Evaluatable.java
├── AcademicAdvisor.java
├── InvalidAdvisingLoadException.java
└── UniversityPayrollMain.java
```

## How to Run

```bash
javac *.java
java UniversityPayrollMain
```

## Validation Rules

- Base salary must not be negative.
- Advisor student load must be between 1 and 50.
- Performance score must be between 0.0 and 100.0.

## Author

**Abd-Elrahman Bahaa**
Computer Science student at Tanta University | Software Testing trainee (DEPI)
[LinkedIn](https://linkedin.com/in/abdelrahmanbahaa07)
