package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------------");
        // Create a new car object
        Car myCar = new Car("Toyota", "Camry", 2020, "Red", 24000.00);

        // Display car details
        myCar.displayCarDetails();

        // Modify car details
        myCar.setColor("Blue");
        myCar.setPrice(23000.00);

        // Display updated car details
        System.out.println("\nUpdated Car Details:");
        myCar.displayCarDetails();
        System.out.println("-------------------------------------------------");
        //BANK
        Bank account=new Bank("HDFC Bank","vinaykumar","6055671325",550.0);
        account.displayAccountDetails();

        System.out.println("----------------------------------------------------");

        Bike bike=new Bike("Yamaha", "Fz-s", 2022, "Black", 125000.0);
        bike.displayBikeDetails();
        bike.updatePrice(126000.0);
        System.out.println("-----------------------------------------------------");
        bike.getBrand();
        System.out.println("------------------------------------------------------");

        Student student=new Student("Vinaykumar ", 25, "17E11A1234","Information Technology");
        student.displayStudentDetails();
        student.updateMajor("computer science");
        student.displayStudentDetails();

    }
}
