public class test74{
public static void main(String args[]){
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    a(numbers, 2, 3);
}
public static void a(int[] numbers, int stepSize, int windowSize) {

    
    for (int i = 0; i < numbers.length - windowSize + 1; i += stepSize) {
      int sum = 0;
      for (int j = i; j < i + windowSize; j++) {
        sum += numbers[j];
      }
      double average = (double) sum / windowSize;
      System.out.println(average);
    }
  }
}