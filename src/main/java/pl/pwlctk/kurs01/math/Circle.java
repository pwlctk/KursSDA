package pl.pwlctk.kurs01.math;

public class Circle {

    public static void main(String[] args) {

        double radius = 7.5;
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);


        System.out.println("Promień koła: " + radius);
        System.out.println("Obwód koła: " + perimeter);
        System.out.println("Pole koła: " + area);

    }
}


/*
    Write a Java program to print the area and perimeter of a circle.
        Test Data:
        Radius = 7.5

        Expected Output:
        Perimeter is = 47.12388980384689
        Area is = 176.71458676442586
*/
