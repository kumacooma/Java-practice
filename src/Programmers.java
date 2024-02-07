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


   /* 정수 리스트 num_list가 주어질 때, 마지막 원소가 그전 원소보다 크면 마지막 원소에서
     그전 원소를 뺀 값을 마지막 원소가 그전 원소보다 크지 않다면
     마지막 원소를 두 배한 값을 추가하여
     return하도록 solution 함수를 완성해주세요.*/
    public int[] lastIndex(int[] num_list) {
        if (num_list.length < 2) {
            throw new IllegalArgumentException("리스트의 길이는 최소 2 이상이어야 합니다.");
        }

        int[] result = new int[num_list.length + 1];
        result[0] = num_list[0];

        for (int i = 1; i < num_list.length; i++) {
            result[i - 1] = num_list[i - 1];
            result[i] = num_list[i];
            if (num_list[i] > num_list[i - 1]) {
                result[i + 1] = num_list[i] - num_list[i - 1];
            } else {
                result[i + 1] = num_list[i] * 2;
            }
        }

        return result;
    }

    //정수 찾기 n과 같으면 1반환 다르면 0반환
    public int findInterger(int[] num_list, int n) {

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] == n) {
                return 1;
            }
        }
        return 0;
    }
    //start_num부터 end_num까지의 숫자를 차례로 담은 리스트를 return
    public int[] countUp(int start_num, int end_num) {
        int[] answer = new int[end_num-start_num+1];

        answer[0] = start_num;

        for (int i = 0; i < answer.length; i++) {

            answer[answer.length-1] = end_num;
            answer[i] = start_num++;
        }
        return answer;
    }

    //arr의 각 원소에 대해 값이 50보다 크거나 같은 짝수라면 2로 나누고, 50보다 작은 홀수라면 2를 곱합니다.
    public int[] translateArray(int[] arr) {

        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=50&&arr[i]%2==0){
                answer[i] = arr[i]/2;
            }
            else if(arr[i]<=50&&arr[i]%2!=0){
                answer[i] = arr[i]*2;
            }
            else{
                answer[i] = arr[i];
            }
        }

        return answer;
    }



}
