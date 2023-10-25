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
    void testAydan() {
        Roboticist aydan = new Aydan();
        assertEquals(818408, aydan.getStudentId());
        assertEquals(Roboticist.type.STUDENT, aydan.getType());
    }
}
