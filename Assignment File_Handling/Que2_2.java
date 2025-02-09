import java.io.*;
class Student implements Serializable {
    private String name;
    private int rollNumber;
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
    public String getName() {
        return name;
    }
    public int getRollNumber() {
        return rollNumber;
    }
}
class Que2_2 {
    public static void main(String[] args) {
        String fileName = "student.ser";
        try {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            Student student = (Student) objectIn.readObject();
            objectIn.close();
            fileIn.close();
            System.out.println("Student Name: " + student.getName());
            System.out.println("Student Roll Number: " + student.getRollNumber());
            System.out.println("Student object has been deserialized from " + fileName);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
