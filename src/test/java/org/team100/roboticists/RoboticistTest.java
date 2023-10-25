package org.team100.roboticists;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RoboticistTest {
    @Test
    void testJoel() {
        Roboticist joel = new Joel();
        assertEquals(0, joel.getStudentId());
        assertEquals(Roboticist.type.MENTOR, joel.getType());
    }

    @Test
    void testPeter() {

        Roboticist joel = new Peter();
        assertEquals(819651, joel.getStudentId());
        assertEquals(Roboticist.type.STUDENT, joel.getType());
    }
}
