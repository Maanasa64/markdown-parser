import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
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
    public void getLinks4() throws IOException{
        ArrayList<String> toReturn = new ArrayList<>();
        // toReturn.add("https://something.com");
        // toReturn.add("some-page.html");
        MarkdownParse mark = new MarkdownParse();
        Path filePath = Path.of("test-file4.md");
        String content = Files.readString(filePath);
        ArrayList<String> actual = new ArrayList<>();
        actual = mark.getLinks(content);
        assertArrayEquals(toReturn.toArray(), actual.toArray());
    }
    @Test
    public void getLinks5() throws IOException{
        ArrayList<String> toReturn = new ArrayList<>();
        // toReturn.add("https://something.com");
        // toReturn.add("some-page.html");
        MarkdownParse mark = new MarkdownParse();
        Path filePath = Path.of("test-file5.md");
        String content = Files.readString(filePath);
        ArrayList<String> actual = new ArrayList<>();
        actual = mark.getLinks(content);
        assertArrayEquals(toReturn.toArray(), actual.toArray());
    }
    @Test
    public void getLinks6() throws IOException{
        ArrayList<String> toReturn = new ArrayList<>();
        // toReturn.add("https://something.com");
        // toReturn.add("some-page.html");
        MarkdownParse mark = new MarkdownParse();
        Path filePath = Path.of("test-file6.md");
        String content = Files.readString(filePath);
        ArrayList<String> actual = new ArrayList<>();
        actual = mark.getLinks(content);
        assertArrayEquals(toReturn.toArray(), actual.toArray());
    }
    @Test
    public void getLinks7() throws IOException{
        ArrayList<String> toReturn = new ArrayList<>();
        // toReturn.add("https://something.com");
        // toReturn.add("some-page.html");
        MarkdownParse mark = new MarkdownParse();
        Path filePath = Path.of("test-file7.md");
        String content = Files.readString(filePath);
        ArrayList<String> actual = new ArrayList<>();
        actual = mark.getLinks(content);
        assertArrayEquals(toReturn.toArray(), actual.toArray());
    }
    @Test
    public void getLinks8() throws IOException{
        ArrayList<String> toReturn = new ArrayList<>();
        // toReturn.add("https://something.com");
        // toReturn.add("some-page.html");
        MarkdownParse mark = new MarkdownParse();
        Path filePath = Path.of("test-file8.md");
        String content = Files.readString(filePath);
        ArrayList<String> actual = new ArrayList<>();
        actual = mark.getLinks(content);
        assertArrayEquals(toReturn.toArray(), actual.toArray());
    }
}
