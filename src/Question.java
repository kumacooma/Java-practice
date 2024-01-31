public class Question {
    public static void main(String args[]) {
        int number1 = 10;
        double number2 = 2.0;

        // 사칙연산 코드 추가

        double doubleresult1 = number1+number2;
        int result1 = (int) doubleresult1;
        double doubleresult2 = number1-number2;
        int result2= (int) doubleresult2;
        double doubleresult3 = number1*number2;
        int result3 = (int) doubleresult3;
        double doubleresult4 = number1/number2;
        int result4 = (int) doubleresult4;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);


        //i는 2의배수 또는 3의배수이다.

//        i%2==0||i%3==0;

        // 아래 코드의 실행 결과가 true가 되도록 수정해보세요.
        String str1 = new String("Hello world!");
        String str2 = new String("Hello world!");

        System.out.println(str1.equals(str2));


        // for문을 이용해서 a배열의 값을 b배열로 복사해보세요.
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        int[][] b = new int[3][3];

        // for문 작성하는 부분
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                int same = a[i][j];
                b[i][j]=same;

            }
            }

        // a배열과 b배열 출력
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("a[" + i + "][" + j + "]: " + a[i][j]);
                System.out.println("b[" + i + "][" + j + "]: " + b[i][j]);
            }
        }
        // for문을 이용하여 배열에 있는 숫자들의 최대값과 평균을 구하세요.

        int[] array = {12, 4, 7, 20, 1};

        // 코드 작성하는 부분
        int sum = 0;
        int max = array[0];
        double avg = 0;

        for (int i = 0; i < array.length; i++) {


            sum+=array[i];
            avg = (double)sum/ array.length;

            if(array[i]>max){
                max = array[i];
            }

        }

        // 결과 출력 (최대값: max, 평균: avg)
        System.out.println(max);
        System.out.println(avg);

//        0부터 20까지 짝수만 출력하는 코드를 작성해보세요.

        for (int i = 0; i <= 20; i++) {
            if(i%2==0){
                System.out.println(i);
            }

        }
    }
}
