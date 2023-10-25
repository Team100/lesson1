package org.team100.roboticists;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RoboticistTest {
    @Test
    void testParsa(){
        Roboticist parsa = new Parsa();
        assertEquals(813062, parsa.getStudentId());
        assertEquals(Roboticist.type.STUDENT, parsa.getType());
    
    }
}
