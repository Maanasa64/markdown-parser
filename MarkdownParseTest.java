import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.*;
public class MarkdownParseTest {

    @Test
    public void getLinks9() throws IOException {
        Path fileName = Path.of("test-file9.md");
        String content = Files.readString(fileName);
        MarkdownParse check = new MarkdownParse();
        ArrayList<String> links = check.getLinks(content);
        String[] actual = {"google.com"};
        assertArrayEquals(actual, links.toArray());
    
        
    }

    @Test
    public void getLinks() throws IOException{
        ArrayList<String> toReturn = new ArrayList<>();
        toReturn.add("https://something.com");
        toReturn.add("some-thing.html");
        MarkdownParse mark = new MarkdownParse();
        Path filePath = Path.of("test-file.md");
        String content = Files.readString(filePath);
        ArrayList<String> actual = new ArrayList<>();
        actual = mark.getLinks(content);
        assertArrayEquals(toReturn.toArray(), actual.toArray());
    }

    @Test
    public void getLinks2() throws IOException{
        ArrayList<String> toReturn = new ArrayList<>();
        toReturn.add("https://something.com");
        toReturn.add("some-page.html");
        MarkdownParse mark = new MarkdownParse();
        Path filePath = Path.of("test-file2.md");
        String content = Files.readString(filePath);
        ArrayList<String> actual = new ArrayList<>();
        actual = mark.getLinks(content);
        assertArrayEquals(toReturn.toArray(), actual.toArray());
    }
    @Test
    public void getLinks3() throws IOException{
        ArrayList<String> toReturn = new ArrayList<>();
        // toReturn.add("https://something.com");
        // toReturn.add("some-page.html");
        MarkdownParse mark = new MarkdownParse();
        Path filePath = Path.of("test-file3.md");
        String content = Files.readString(filePath);
        ArrayList<String> actual = new ArrayList<>();
        actual = mark.getLinks(content);
        assertArrayEquals(toReturn.toArray(), actual.toArray());
    }

    @Test
    public void snippet1test() throws IOException {

        Path filename = Path.of("snippet1.md");
        String content = Files.readString(filename);
        MarkdownParse check = new MarkdownParse();
        ArrayList<String> links = check.getLinks(content);
        String[] actual = {"`google.com", "google.com", "ucsd.edu"};
        assertArrayEquals(actual, links.toArray());
    }

    @Test
    public void snippet2test() throws IOException {

        Path filename = Path.of("snippet2.md");
        String content = Files.readString(filename);
        MarkdownParse check = new MarkdownParse();
        ArrayList<String> links = check.getLinks(content);
        String[] actual = {"b.com", "a.com(())", "example.edu"};
        assertArrayEquals(actual, links.toArray());
    }

    @Test
    public void snippet3test() throws IOException {

        Path filename = Path.of("snippet3.md");
        String content = Files.readString(filename);
        MarkdownParse check = new MarkdownParse();
        ArrayList<String> links = check.getLinks(content);
        String[] actual = {"https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule"};
        assertArrayEquals(actual, links.toArray());
    }

}
