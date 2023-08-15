public class TriangleValidator {
    public boolean isValidTriangle(int angle1, int angle2, int angle3) {
        // write your code here
        if(angle1 <=0 || angle1 <=0 || angle3<=0){
            return false;
        }

        int sumOfAngles = angle1 + angle2 + angle3;

        boolean isSumOfAngles180 = sumOfAngles == 180;
        
        return isSumOfAngles180;
    }
}