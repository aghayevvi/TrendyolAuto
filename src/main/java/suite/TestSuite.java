package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import runner.AdToCartRunner;
import runner.CartRunner;
import runner.LoginRunner;
import runner.SearchRunner;

import static org.junit.runners.Suite.*;

@RunWith(Suite.class)
@SuiteClasses({
        LoginRunner.class,
        SearchRunner.class,
        AdToCartRunner.class,
        CartRunner.class,
})

public class TestSuite {
}
