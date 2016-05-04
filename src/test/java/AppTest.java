import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Jeopardy!");
  }

 
  @Test
    public void returnVowelSub() {
    goTo("http://localhost:4567");
    fill("#user-input").with("This is a test string, it should work now");
    submit(".btn");
    assertThat(pageSource()).contains("Th-s -s - t-st str-ng, -t sh--ld w-rk n-w");
  }
}