package org.sergei.inout.paths;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Sergei Visotsky
 */
public class PathInfo {

    public static void main(String[] args) {
        Path path = Paths.get("src/main/resources/hello.txt");
        System.out.println(path.toString());
        System.out.println(path.getFileName());
        System.out.println(path.toAbsolutePath());
        System.out.println(path.getParent());
        System.out.println(path.getRoot());
        System.out.println(path.subpath(0, 2));
    }
    
}
