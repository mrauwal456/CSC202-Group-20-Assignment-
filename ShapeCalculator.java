        package group_20;
            import java.util.Scanner;
                
        // Base class Shape
        abstract class Shape {
            protected double dimension1;
            protected double dimension2;

            public abstract double calculateArea();
        }

        // 2D Shapes
        class Triangle extends Shape {
            public Triangle(double base, double height) {
                this.dimension1 = base;
                this.dimension2 = height;
            }

            @Override
            public double calculateArea() {
                return 0.5 * dimension1 * dimension2;
            }
        }

        class Circle extends Shape {
            public Circle(double radius) {
                this.dimension1 = radius;
            }

            @Override
            // Area = pi * r^2
            public double calculateArea() {
                return Math.PI * dimension1 * dimension1;
            }
        }

        class Rectangle extends Shape {
            public Rectangle(double length, double width) {
                this.dimension1 = length;
                this.dimension2 = width;
            }

            @Override
            public double calculateArea() {
                return dimension1 * dimension2;
            }
        }

        // 3D Shapes
        class Sphere extends Shape {
            public Sphere(double radius) {
                this.dimension1 = radius;
            }

            @Override
            public double calculateArea() {
                return 4 * Math.PI * dimension1 * dimension1;
            }

            public double calculateVolume() {
                return (4.0 / 3.0) * Math.PI * dimension1 * dimension1 * dimension1;
            }
        }

        class Cube extends Shape {
            public Cube(double side) {
                this.dimension1 = side;
            }

            @Override
            public double calculateArea() {
                return 6 * dimension1 * dimension1;
            }

            public double calculateVolume() {
                return dimension1 * dimension1 * dimension1;
            }
        }
                public class ShapeCalculator {
                    public static void main(String[] args) {



                Scanner scanner = new Scanner(System.in);
                System.out.println("Select a Shape to Calculate it's Dimension:");
                System.out.println("1. Triangle");
                System.out.println("2. Circle");
                System.out.println("3. Rectangle");
                System.out.println("4. Sphere");
                System.out.println("5. Cube");

                int choice = scanner.nextInt();
                Shape shape;

                switch (choice) {
                    case 1:
                        System.out.print("Enter the base of a Triangle: ");
                        double base = scanner.nextDouble();
                        System.out.print("Enter the height of a Triangle: ");
                        double height = scanner.nextDouble();
                        shape = new Triangle(base, height);
                        break;
                    case 2:
                        System.out.print("Enter the radius of a Circle : ");
                        double radius = scanner.nextDouble();
                        shape = new Circle(radius);
                        break;
                    case 3:
                        System.out.print("Enter the length of a Rectanle: ");
                        double length = scanner.nextDouble();
                        System.out.print("Enter the width of a Rectangle: ");
                        double width = scanner.nextDouble();
                        shape = new Rectangle(length, width);
                        break;
                    case 4:
                        System.out.print("Enter the radius of a Sphere: ");
                        radius = scanner.nextDouble();
                        shape = new Sphere(radius);
                        break;
                    case 5:
                        System.out.print("Enter the side of a Cube: ");
                        double side = scanner.nextDouble();
                        shape = new Cube(side);
                        break;
                    default:
                        System.out.println("Invalid choice.");
                        return;
                }

                System.out.println("Area : " + shape.calculateArea());

                if (shape instanceof Sphere) {
                    Sphere sphere = (Sphere) shape;
                    System.out.println("Volume: " + sphere.calculateVolume());
                } else if (shape instanceof Cube) {
                    Cube cube = (Cube) shape;
                    System.out.println("Volume: " + cube.calculateVolume());
                }
            }
                }
