import org.junit.* ;
public class greetTest {
    @Test
    public void test(){
        greet gre = new greet();
        Assert.assertEquals("Hello", gre.says());
    }
}
