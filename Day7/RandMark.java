package Day7;

import java.util.Random;

public class RandMark {
    public static void main(String[] args) {
        Random rand = new Random();
        int studentID = rand.nextInt(1000);
        double marks = rand.nextDouble() * 100;
        float attendance = rand.nextFloat() * 100;
        boolean status = rand.nextBoolean();
        String statusStr = status ? "Pass" : "Fail";
        long regNumber = rand.nextLong();
        double performanceScore = rand.nextGaussian() * 10;
        
        byte[] randomBytes = new byte[5];
        rand.nextBytes(randomBytes);
        
        System.out.println("Student ID: " + studentID);
        System.out.println("Marks: " + String.format("%.2f", marks));
        System.out.println("Attendance: " + String.format("%.2f", attendance));
        System.out.println("Status: " + statusStr);
        System.out.println("Registration Number: " + regNumber);
        System.out.println("Performance Score: " + String.format("%.2f", performanceScore));
        System.out.print("Random Bytes: ");
        for (byte b : randomBytes) {
            System.out.print(b + " ");
        }
        System.out.println();
        
        System.out.print("5 Random Numbers (0-100): ");
        rand.ints(5, 0, 100).forEach(num -> System.out.print(num + " "));
        System.out.println();
    }
}
