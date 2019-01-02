package org.file;

import java.io.File;
import java.net.URL;

public class FileTest {

    public static void main(String[] args) {
        URL resource = FileTest.class.getClassLoader().getResource("test.lic");
        File defalutPath = new File(String.valueOf(resource));
        System.out.println(defalutPath);
    }
}
