package se.iths;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
public class TestRunner {
Runner runner;

@BeforeEach
public void createRunner(){
   runner = new Runner(162, 56);
}

@Test
public void testRunnerisCreated() {
   assertEquals(runner,runner);
}
@Test
public void testRunnerSetUpHeight() {
   runner = new Runner(162, 56);
   assertEquals(162, runner.heightincm);
}
@Test
public void testRunnerSetUpWeight() {
   runner = new Runner(162, 56);
   assertEquals(56, runner.weightinkg);


}
@Test 
public void testCalculateBmi() {
   
   assertEquals(21.33, runner.calculateBmi(),0.01); 
}
}