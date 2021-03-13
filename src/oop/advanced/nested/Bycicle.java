package oop.advanced.nested;

public class Bycicle {
    private Integer maxSpeed = 100;

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    ///Nested non-static example
    public class Wheel {
        public void repair() {
            maxSpeed += 10;
        }
    }

    //// Nested static example
    public static class Mechanic {
        public void damage(Bycicle bycicle) {
            bycicle.maxSpeed -= 50;
        }
    }

}
