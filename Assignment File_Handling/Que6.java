import java.io.*;
class Que6{
    public static void main(String[] args) {
        String fileName = "image.jpg";
        File file = new File(fileName);
        long fileSizeBytes = file.length();
        System.out.println("File size: " + fileSizeBytes + " bytes");
        int internetSpeedBps = 256;
        double uploadTime = (double) (fileSizeBytes * 8) / internetSpeedBps;
        System.out.println("Estimated upload time: " + uploadTime + " seconds");
    }
}
