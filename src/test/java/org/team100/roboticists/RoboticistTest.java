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
    void testMatthew() {
        Roboticist Matthew = new Matthew();
        assertEquals(818855, Matthew.getStudentId());
        assertEquals(Roboticist.type.STUDENT, Matthew.getType());
    }
}
