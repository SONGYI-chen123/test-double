package mock;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class MockDoorPanel  extends DoorPanel{

    private boolean iscalled = false;

    public void close(){
        this.iscalled = true;
        System.out.println("the close is called");
    }

    void verifyMockDOOrPanelCalled(){
        assertTrue(iscalled);
    }
}
