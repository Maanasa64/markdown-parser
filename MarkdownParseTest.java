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
}
