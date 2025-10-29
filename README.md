# SOLID Workshop

A hands-on workshop to learn and apply the SOLID principles of object-oriented design:

- SRP: Single Responsibility Principle
- OCP: Open–Closed Principle
- LSP: Liskov Substitution Principle
- ISP: Interface Segregation Principle
- DIP: Dependency Inversion Principle

Each module contains:

- example: initial (often non-SOLID) code
- example_refactored: improved, SOLID-compliant code
- exercise: your turn to refactor using the given principle

## Goals

- Understand each principle through a guided example.
- Refactor the exercise code to comply with the principle.
- Model the design before/after using UML (PlantUML).
- Explain the rationale behind your changes.

## Repository Structure

- SRP/
- OCP/
- LSP/
- ISP/
- DIP/

Inside each module: `src/com/directi/training/<principle>/(example|example_refactored|exercise)`

## Getting Started

Prerequisites:

- JDK 8+ (or newer)
- Visual Studio Code with “Extension Pack for Java”
- (Optional) PlantUML extension and Graphviz for UML diagrams

Open the folder in VS Code and explore each module in order: SRP → OCP → LSP → ISP → DIP.

## Running the Demos (examples/exercises)

Use VS Code “Run” on the main classes:

- LSP: `com.directi.training.lsp.exercise.Pool`
- OCP: `com.directi.training.ocp.exercise.OcpDemo` (demo included in refactor)
- ISP: `com.directi.training.isp.exercise.IspDemo` (demo included in refactor)
- DIP: `com.directi.training.dip.exercise.EncodingModuleClient`
- SRP: create a small `Main` to call `CarManager` (or run the example classes)

Example (Windows CMD) to compile one module manually:

```
javac -d out DIP\src\com\directi\training\dip\exercise\*.java
java -cp out com.directi.training.dip.exercise.EncodingModuleClient
```

## Suggested Workflow per Principle

1. Read the example and identify the violation.
2. Study the refactored example and key ideas.
3. Apply the principle to the exercise (small, focused changes).
4. Produce UML diagrams (before/after) and write a short explanation.
5. Validate behavior with a simple main or unit tests.
