package mockito;

import mock.DoorPanel;
import mock.SecurityCenter;
import org.junit.jupiter.api.Test;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.*;


public class mockitoTest {
    SecurityCenter securityCenter;
    @Test
    public  void test_mock(){
        DoorPanel mockDoorPanel = mock(DoorPanel.class);
        securityCenter = new SecurityCenter(mockDoorPanel);
        securityCenter.switchOn();
        verify(mockDoorPanel).close();
    }
    
}
