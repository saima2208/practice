package ClassWork;

import java.io.File;

public class FileSize {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Java Student PC-7\\Desktop\\Saima\\SQL");
        System.out.println("The file has " + convertToBytes(file)+ " byte");
        System.out.println("The file has " + convertToKillobytes(file) + " kb");
        System.out.println("The file has " + convertToMegabytes(file) + " mb");
    }
    private static long convertToMegabytes(File file)
    {
        return  file.length() / (1024 * 1024);
    }
    private static long convertToKillobytes(File file){
        return file.length() / 1024;
    }
    private static long convertToBytes(File file){
        return file.length();
    }
}
