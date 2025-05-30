# Java Object-Oriented Shapes Program 🧮

This command-line Java application was created for CMSC 335 to demonstrate object-oriented programming (OOP) principles using geometric shapes. The program allows users to calculate areas of 2D shapes and volumes of 3D shapes interactively.

## 🧠 Features

- Text-based menu for user interaction
- Calculate **area** for 2D shapes: Circle, Rectangle, Square, Triangle
- Calculate **volume** for 3D shapes: Sphere, Cube, Cone, Cylinder, Torus
- Clean structure using **inheritance** and **polymorphism**
- Error handling for invalid user input

## 📚 Concepts Practiced

- **Inheritance:** Common shape classes share traits through abstract base classes  
- **Polymorphism:** Unified interface for different shapes (`getArea()`, `getVolume()`)
- **Abstraction:** Abstract classes for 2D and 3D shapes
- **Encapsulation:** Private fields and public methods

## 🖥️ How It Works

When the program runs:
1. The user sees a menu of shape options
2. They choose a shape to construct
3. The program prompts for relevant dimensions
4. It calculates and displays the result
5. The user can repeat or exit

Example:
*********Welcome to the Java OO Shapes Program **********

Construct a Circle

Construct a Rectangle
...

Exit the program

## 📂 Project Structure

- `Shape` – abstract base class for all shapes  
- `TwoDimensionalShape` & `ThreeDimensionalShape` – extended base classes  
- Concrete classes like `Circle`, `Cube`, `Cylinder`, etc. implement area or volume logic  
- `Main.java` – handles user interaction and program flow

## 🛠️ Technologies Used

- Java (JDK 17 or higher recommended)
- No external libraries required – runs in terminal/console

## 📌 How to Run

1. Clone the repo or download the `.java` files
2. Compile all files using:
javac *.java
3. Run the program:
java Main

## 🧠 What I Learned

- How to use OOP to create scalable, reusable code
- Designing a menu-driven interface in the terminal
- Structuring a project around user input and feedback
- Applying abstract classes and method overriding effectively

---

👩‍💻 Mackenzie Treadway  
🎓 CMSC 335 – Object-Oriented Programming
