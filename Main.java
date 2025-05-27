import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            showMenu();
            int choice = getInt("Enter your choice:");

            switch (choice) {
                case 1 -> handleCircle();
                case 2 -> handleRectangle();
                case 3 -> handleSquare();
                case 4 -> handleTriangle();
                case 5 -> handleSphere();
                case 6 -> handleCube();
                case 7 -> handleCone();
                case 8 -> handleCylinder();
                case 9 -> handleTorus();
                case 10 -> {
                    running = false;
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM dd 'at' h:mm a");
                    System.out.println("Thanks for using the program. Today is " + dtf.format(LocalDateTime.now()));
                }
                default -> System.out.println("Invalid selection.");
            }

            if (running) {
                System.out.print("Would you like to continue? (Y or N): ");
                String response = scanner.next().trim().toUpperCase();
                while (!response.equals("Y") && !response.equals("N")) {
                    System.out.println("Sorry I do not understand. Enter Y or N");
                    response = scanner.next().trim().toUpperCase();
                }
                if (response.equals("N")) {
                    running = false;
                }
            }
        }
    }

    static void showMenu() {
        System.out.println("\n*********Welcome to the Java OO Shapes Program **********");
        System.out.println("1. Construct a Circle");
        System.out.println("2. Construct a Rectangle");
        System.out.println("3. Construct a Square");
        System.out.println("4. Construct a Triangle");
        System.out.println("5. Construct a Sphere");
        System.out.println("6. Construct a Cube");
        System.out.println("7. Construct a Cone");
        System.out.println("8. Construct a Cylinder");
        System.out.println("9. Construct a Torus");
        System.out.println("10. Exit the program");
    }

    static int getInt(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid number, try again.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    static double getDouble(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid number, try again.");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    static void handleCircle() {
        double r = getDouble("Enter radius: ");
        Circle c = new Circle(r);
        System.out.printf("Area of Circle: %.2f\n", c.getArea());
    }

    static void handleRectangle() {
        double l = getDouble("Enter length: ");
        double w = getDouble("Enter width: ");
        Rectangle r = new Rectangle(l, w);
        System.out.printf("Area of Rectangle: %.2f\n", r.getArea());
    }

    static void handleSquare() {
        double s = getDouble("Enter side: ");
        Square sq = new Square(s);
        System.out.printf("Area of Square: %.2f\n", sq.getArea());
    }

    static void handleTriangle() {
        double b = getDouble("Enter base: ");
        double h = getDouble("Enter height: ");
        Triangle t = new Triangle(b, h);
        System.out.printf("Area of Triangle: %.2f\n", t.getArea());
    }

    static void handleSphere() {
        double r = getDouble("Enter radius: ");
        Sphere s = new Sphere(r);
        System.out.printf("Volume of Sphere: %.2f\n", s.getVolume());
    }

    static void handleCube() {
        double s = getDouble("Enter side: ");
        Cube c = new Cube(s);
        System.out.printf("Volume of Cube: %.2f\n", c.getVolume());
    }

    static void handleCone() {
        double r = getDouble("Enter radius: ");
        double h = getDouble("Enter height: ");
        Cone c = new Cone(r, h);
        System.out.printf("Volume of Cone: %.2f\n", c.getVolume());
    }

    static void handleCylinder() {
        double r = getDouble("Enter radius: ");
        double h = getDouble("Enter height: ");
        Cylinder c = new Cylinder(r, h);
        System.out.printf("Volume of Cylinder: %.2f\n", c.getVolume());
    }

    static void handleTorus() {
        double R = getDouble("Enter major radius: ");
        double r = getDouble("Enter minor radius: ");
        Torus t = new Torus(R, r);
        System.out.printf("Volume of Torus: %.2f\n", t.getVolume());
    }
}
