import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

/**
 * We're going to order the execution of test methods in these three classes:
 *        OrderServiceTest, ProductServiceTest, UserServiceTest
 *
 * IMPORTANT: Although those classes typically should not rely on the order in which they're executed, there
 * are times when it is desirable to enforce a specific test class execution order.
 */

@Order(3)
public class OrderServiceTest {

    @BeforeAll
    static void setup() {
        System.out.println("Test methods related to User orders");
    }

    @Test
    void testCreateOrder_whenProductIdIsMissing_throwsOrdersServiceException() {
    }
}
