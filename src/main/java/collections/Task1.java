package collections;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import static java.nio.file.Files.readAllLines;

public class Task1 {
    //Character.isLetter(character) COULD BE USEFULL!

    public static void main(String[] args) throws IOException, URISyntaxException {
        List<String> lines = readAllLines(getFile());

    }

    private static Path getFile() throws URISyntaxException {
        return Paths.get(Task1.class.getClassLoader().getResource("pan_tadeusz.txt").toURI());
    }
}
