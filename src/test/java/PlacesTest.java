import org.junit.*;
import static org.junit.Assert.*;

public class PlacesTest {

  @Test
  public void task_instantiatesWithDescription_true() {
    Places myPlaces = new Places("Portland");
    assertEquals("Portland", myPlaces.getDescription());
  }
}
