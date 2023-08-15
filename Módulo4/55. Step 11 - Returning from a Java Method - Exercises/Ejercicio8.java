//-------------------------------------------------------------//
//1.Method to return Sum of three numbers
int sumOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
  int sum = firstNumber + secondNumber + thirdNumber;
  return sum;
}

sumOfThreeNumbers(15, 2, 3);

//-------------------------------------------------------------//
//2.Given two angles, write a method to return the third angle in a triangle. Hint: Sum of angles in a triangle is 180.
int calculateThirdAngle(int angle1, int angle2) {
  int angle3 = 180 - (angle1 + angle2);
  return angle3;
}

calculateThirdAngle(20, 20);