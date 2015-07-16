import junit.framework.TestCase;

public class CustomerTest extends TestCase {
    public void testName() throws Exception {
        Customer customer = new Customer("Douglas");
        assertEquals(customer.getName(), "Douglas");
    }
}