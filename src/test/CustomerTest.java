import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CustomerTest {

    @Test
    public void compileTest() throws Exception {
        Customer customer = new Customer("Douglas");
        assertEquals(customer.getName(), "Douglas");
    }
}