package org.sergei.inout.fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileOperations {

    public static void main(String[] args) throws IOException {
        Path source = Paths.get("/src/main/resources/files/movable.txt");
        Path target = Paths.get("/src/main/resources/movehere/movable.txt");
        Files.move(source, target);
    }

}
