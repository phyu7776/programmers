public class LvCustom {
   public static void main(String []args) {
        ObjectUtil util = new ObjectUtil();

        System.out.println();
        System.out.println("정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때, numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.");
        System.out.println("Test Array = [1,2,3,4,5] num1 = 3, num2 = 4");
        System.out.println();

        int[] testArray = {1, 3, 5};
        int[] testArray2 = {1, 2, 3, 4, 5};
        util.printArray(solution1(testArray, 1,2));
        util.printArray(solution1(testArray2, 1,3));
   }

    /**
     * 정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때, numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.
     * @param "int[] Array"
     * @param "int"
     * @param "int"
     * @return array[int] ~ [int];
     */
    public static int[] solution1(int[] numbers, int num1, int num2) {
        // 라이브러리 사용안되네 ㅇㅅㅇ...
        //answer = Arrays.copyOfRange(numbers, num1, num2);

        int[] answer = {};
        answer = new int[num2-(num1-1)];
        int arrayIndex = 0;
        for(int i = num1 ; i <= num2 ; i++) {
            answer[arrayIndex] = numbers[i];
            if(answer.length-1 > arrayIndex){
                arrayIndex++;
            }
        }
        return answer;
    }
}
