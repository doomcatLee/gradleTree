import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class PingPongTest {

  @Test
  public void runPingPong_countUpToOne_ArrayList() {
    assertEquals(10, PingPong.add(6,4));
  }

  @Test
  public void runString(){
    assertEquals("hello", PingPong.yoString());
  }

}
