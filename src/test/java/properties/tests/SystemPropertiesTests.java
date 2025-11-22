package properties.tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SystemPropertiesTests {

    @Test
    void  systemPropertiesTests()
    {
        System.setProperty("browser", "chrome");
        String browser = System.getProperty("browser");
        System.out.println(browser);
    }

    @Test
    void  systemProperties2Tests()
    {
        String browser = System.getProperty("browser", "firefox");
        System.out.println(browser);
    }

    @Test
    void  systemProperties3Tests()
    {
        String browser = System.getProperty("browser", "mozilla");
        System.out.println(browser);
    }

    @Test
    @Tag("property")
    void  systemProperties4Tests()
    {
        String browser = System.getProperty("browser", "mozilla");
        System.out.println(browser);

    }
}
