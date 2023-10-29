package org.team100.roboticists;

public class Peter implements Roboticist {

    @Override
    public type getType() {
        return type.STUDENT;
    }

    @Override
    public String getName() {
        return "Peter";
    }

    @Override
    public int getStudentId() {
        return 819651;
    }

    @Override
    public String getSpecialTalent() {
        return "Pretending to know stuff";
    }

}
