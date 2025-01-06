package ClassWork;

import java.awt.*;
import java.io.File;


public class FileLastModified {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Java Student PC-7\\Desktop\\Saima\\SQL");

        System.out.println("The file last modified on " + new java.util.Date(file.lastModified()) );
        //Q-2
        System.out.println("The file has " + file.length() + " bytes");
        System.out.println("The file has " + file.length() / 1024 + " kb");
        System.out.println("The file has " + file.length()  / (1024 * 1024)  + " mb");
        System.out.println(file.exists());

    }


}
