package mockito;

import mock.DoorPanel;
import mock.SecurityCenter;
import org.junit.jupiter.api.Test;
import org.mockito.junit.MockitoJUnitRunner;
import stub.GradeSystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;


public class mockitoTest {
    SecurityCenter securityCenter;
    GradeService gradeService;
    GradeSystem gradeSystem;
    @Test
    public  void mockito_test_mock(){
        DoorPanel mockDoorPanel = mock(DoorPanel.class);
        securityCenter = new SecurityCenter(mockDoorPanel);
        securityCenter.switchOn();
        verify(mockDoorPanel).close();
    }

    @Test
    public void mockito_test_stub(){
        GradeSystem stubgradesystem = mock(GradeSystem.class);
        List<Double> grade = Arrays.asList(90.0, 95.0, 100.0);
        when(stubgradesystem.gradesFor(99900l)).thenReturn(grade);
        Double result = gradeService.calculateAverageGrades(10L);
        Assertions.assertEquals(90.0,result)
    }

}
