package Class_14;

import java.io.File;

public class TestFileClass {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Java Student PC-7\\Desktop\\Saima\\rahim\\aa/ss");
       /* System.out.println("Does it exits? ->" + file.exists());
        System.out.println("The file has " + file.length() + " bytes");
        System.out.println("Can it be read? -> " + file.canRead());
        System.out.println("Can it be written ? -" + file.canWrite());
        System.out.println("Is it a directory? ->" + file.isDirectory());
        System.out.println("Is it a file "  + file.isFile());
        System.out.println("Is it a absolute? ->"+ file.isAbsolute());
        System.out.println("Is it hidden? ->" + file.isHidden());
        System.out.println("Absolute path is " + file.getAbsolutePath());
        System.out.println("Last modified on " + new java.util.Date(file.lastModified()));
        */


        boolean bool = file.mkdir();
        if(bool){
            System.out.println("Folder is created successfully");
        }else{
            System.out.println("Error Found!");
        }
        file.mkdirs();
    }
}
