package org.sergei.inout.paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathBetweenPaths {

    public static void main(String[] args) {
        Path pOne = Paths.get("src/main/resources/elements");
        Path pTwo = Paths.get("src/main/resources/elements/organisms");

        Path pOneToPTwo = pOne.relativize(pTwo);
    }
    
}
