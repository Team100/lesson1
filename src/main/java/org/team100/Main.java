package org.team100;

import java.util.List;

import org.team100.roboticists.AllRoboticists;
import org.team100.roboticists.Roboticist;

public final class Main {
    private final AllRoboticists allRoboticists;

    public Main() {
        allRoboticists = new AllRoboticists();
    }

    public static void main(String... args) {
        Main main = new Main();
        System.out.println(main.getRoster());
    }

    String getRoster() {
        List<Roboticist> all = allRoboticists.getAll();
        String result = "";
        for (Roboticist r : all) {
            result += String.format("%s %s\n", r.getName(), r.getType().name());
        }
        return result;
    }
}
