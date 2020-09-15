package stub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GradeSystemStub extends GradeSystem{
    public List<Double> gradesFor(long studentId) {
        return Arrays.asList(80.0,90.0,100.0);
    }
}
