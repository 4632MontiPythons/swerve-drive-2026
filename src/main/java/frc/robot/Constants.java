package frc.robot;

public final class Constants {
    //Prevent instantiation
    private Constants() {
    }

    public static final class Drive {
        //Most Drive constants are located in /generated/TunerConstants.java
    }

    public static final class Vision {
        public static final int minTags = 2; //*Should always be at least 1*, decide between 1 and 2 in most cases. This year I think 2 is better because the tags usually comes in pairs of two, so it is ok to ignore singular tags
        public static final double maxYawRate_DegPerSec = 500; //ignore visual measurements when yaw rate is greater than this value
        public static final double maxTagDistance_Meters = 5.0; //ignore visual measurements when tag distance is greater than this value
        public static final double minStdDev_Meters = 0.01; //std dev for vision measurement is always at least this value regardless of distance
        public static final double stdDevPerMeter = 0.02; //Std dev increase per meter; farther from tag means less accurate measurement
    }

    public static final class OI {
        // Will add constants later
    }

}