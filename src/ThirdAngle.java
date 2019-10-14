public class ThirdAngle {
        public static int otherAngle(int angle1, int angle2) {
            int angle3 = 180 - (angle1 + angle2);
            System.out.println(angle3);
            return angle3;
        }

    public static void main(String[] args) {
        otherAngle(45,12);
    }
}
