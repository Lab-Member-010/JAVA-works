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
class Que2_1{
    public static void main(String[] args) {
        Student student = new Student("John Doe", 123456);
        String fileName = "student.ser";
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(student);
            objectOut.close();
            fileOut.close();
            System.out.println("Student object has been serialized and stored in " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
