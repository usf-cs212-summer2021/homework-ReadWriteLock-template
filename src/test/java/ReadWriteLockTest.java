import org.junit.jupiter.api.MethodOrderer.MethodName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * Runs both the {@link SimpleReadWriteLockTest} unit tests and the
 * {@link ThreadSafeIndexedSetTest} unit tests.
 *
 * @author CS 212 Software Development
 * @author University of San Francisco
 * @version Spring 2021
 */
@TestMethodOrder(MethodName.class)
public class ReadWriteLockTest {

	/**
	 * All of the tests in {@link SimpleReadWriteLockTest}.
	 * 
	 * @see SimpleReadWriteLockTest
	 */
	@Nested
	public class Group1Tests extends SimpleReadWriteLockTest {
		
	}

	/**
	 * All of the tests in {@link ThreadSafeIndexedSetTest}.
	 * 
	 * @see ThreadSafeIndexedSetTest
	 */
	@Nested
	public class Group2Tests extends ThreadSafeIndexedSetTest {
		
	}

}
