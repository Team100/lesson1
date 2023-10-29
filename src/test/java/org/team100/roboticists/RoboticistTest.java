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

    @Test
    void testAydan() {
        Roboticist aydan = new Aydan();
        assertEquals(818408, aydan.getStudentId());
        assertEquals(Roboticist.type.STUDENT, aydan.getType());
    }
  
    @Test
    void testOm() {
        Roboticist om = new Om();
        assertEquals(819652, om.getStudentId());
        assertEquals(Roboticist.type.STUDENT, om.getType());
    }
  
    @Test
    void testPeter() {
        Roboticist joel = new Peter();
        assertEquals(819651, joel.getStudentId());
        assertEquals(Roboticist.type.STUDENT, joel.getType());
    }
  
    @Test
    void testMatthew() {
        Roboticist Matthew = new Matthew();
        assertEquals(818855, Matthew.getStudentId());
        assertEquals(Roboticist.type.STUDENT, Matthew.getType());
    }
  
    @Test
    void testSanah() {
        Roboticist sanah = new Sanah();
        assertEquals(819269, sanah.getStudentId());
        assertEquals(Roboticist.type.STUDENT, sanah.getType());
    }
}
