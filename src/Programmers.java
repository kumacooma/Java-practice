public class Programmers {
    public static void main(String[] args) {
        Programmers instance = new Programmers();

        // 첫 번째 메서드 호출
        int result1 = instance.checkMultiples(12, 3, 4);
        System.out.println(result1);

        // 두 번째 메서드 호출
        int[] array = {10, 5, 8, 15};
        int result2 = instance.countGreater(array, 7);
        System.out.println(result2);

        // 세 번째 메서드 호출
        int result3 = instance.sumEven(5);
        System.out.println(result3);

        // 네 번째 메서드 호출
        int[] numbers = {3, 5, 7, 2};
        double result4 = instance.averageArray(numbers);
        System.out.println(result4);
    }

    // 첫 번째 메서드: number가 n의 배수이면서 m의 배수이면 1을, 아니라면 0을 반환
    public int checkMultiples(int number, int n, int m) {
        if (number % n == 0 && number % m == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    // 두 번째 메서드: 배열 array에서 키보다 큰 원소의 개수를 반환
    public int countGreater(int[] array, int height) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > height) {
                count++;
            }
        }
        return count;
    }

    // 세 번째 메서드: 0부터 n까지의 짝수의 합을 반환
    public int sumEven(int n) {
        int evenSum = 0;
        for (int num = 0; num <= n; num++) {
            if (num % 2 == 0) {
                evenSum += num;
            }
        }
        return evenSum;
    }

    //배열의 평균구하기
    public double averageArray(int[] numbers) {
        double answer = 0;
        double sum = 0.0;

        for (int i=0; i<numbers.length; i++)
        {
            sum += numbers[i];
            answer = sum/numbers.length;
        }
        return answer;
    }
}
