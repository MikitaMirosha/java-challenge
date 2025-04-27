/*
Better than average

There was a test in your class and you passed it. Congratulations!
But you're an ambitious person. You want to know if you're better than the average student in your class.
You receive an array with your peers' test scores. Now calculate the average and compare your score!

Return true if you're better, else false!

Note:
Your points are not included in the array of your class's points.
Do not forget them when calculating the average score!
*/

package _1;

public class Main {

    public static void main(String[] args) {
        System.out.println(betterThanAverage(new int[]{2, 3}, 5));
    }

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int classPointsLength = classPoints.length;
        int averagePoint = 0;

        while (classPointsLength > 0) {
            averagePoint = averagePoint + classPoints[classPointsLength - 1];
            classPointsLength--;
        }
        averagePoint = (averagePoint + yourPoints) / (classPoints.length + 1);

        return yourPoints > averagePoint;
    }
}