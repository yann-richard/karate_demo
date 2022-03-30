package ui.web;

import com.intuit.karate.junit5.Karate;

public class WebRunner {

    @Karate.Test
    Karate testWebUiTest() {
        System.setProperty("karate.env", "test");
        return Karate.run("web").relativeTo(getClass());
    }
}
