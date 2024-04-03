

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ShippingCompanyTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ShippingCompanyTest
{
    private ShippingCompany sc;
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        sc = new ShippingCompany("RELIABLE-MOVING");
        sc.add(new GroundTransportation());
        sc.add(new AirTransportation());
        sc.add(new AirTransportation());
        sc.add(new Lorry());
        sc.add(new Van());
    }
    @Test
    public void setName(){
        sc.setName("Test");
        assertEquals("Test", sc.getName());
    }
    @Test
    public void makeTransportation(){
        sc.makeTransportation("T-002", "Lis", "Porto", 20);
        assertEquals("Lis", sc.getTransportInService("T-002").getOrigin());
    }
    @Test
    public void finalizeTransportation(){
        sc.makeTransportation("T-006", "Lis", "Porto", 20);
        sc.finalizeTransportation("T-006");
        assertEquals("", sc.getTransport("T-006").getOrigin());
    }
}
