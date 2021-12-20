import org.example.service.CalculTest;
import org.example.service.FactureTest;
import org.example.service.IFactureTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({CalculTest.class, FactureTest.class, IFactureTest.class})
public class ProjetTestSuite {

}
