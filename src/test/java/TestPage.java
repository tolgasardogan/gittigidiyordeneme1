import org.junit.Test;

public class TestPage extends SampleTest {


    @Test
    public void test() throws InterruptedException {
        HomepageTest();
        logIn();
        searchItem();
        chooseItem();
        basket();
        filladressform();
    }
}
