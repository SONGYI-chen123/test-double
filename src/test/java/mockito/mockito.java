package mockito;

import mock.DoorPanel;
import mock.SecurityCenter;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class mockito {
    @InjectMocks
    private SecurityCenter securityCenter;

    @Mock
    private DoorPanel DoorPanel;
}
