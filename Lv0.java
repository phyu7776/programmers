import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Lv0 {
    public static void main(String[] args) {
        System.out.println("나머지 구하기");
        System.out.println(findTheRemainder(10, 5));
        System.out.println();
        System.out.println("몫 구하기");
        System.out.println(findTheQuotient(10, 5));
        System.out.println();
        System.out.println("나이 출력");
        System.out.println(ageOutput(40));
        System.out.println();
        System.out.println("각도기");
        System.out.println(typeOfAngle(70));
        System.out.println();
        System.out.println("두 수의 나눗셈");
        System.out.println(DivToMultiplication(3,2));
        System.out.println();
        //========================= 사칙 연산 및 쉬운 문제 CUT.... 의미없어보임 =================================
        System.out.println();
        System.out.println("skillCheck");
        System.out.println(skillCheck("Pyy"));
        System.out.println();
        System.out.println("skillCheck2");
        System.out.println(skillCheck2("12321","42531"));
    }

    /**
     * 나머지 구하기
     *
     * @param "Int num1"
     * @param "Int num2"
     * @return "나머지"
     */
    public static int findTheRemainder(int num1, int num2) {
        int answer = -1;
        answer = num1 % num2;
        return answer;
    }

    /**
     * 몫 구하기
     *
     * @param num1
     * @param num2
     * @return
     */
    public static int findTheQuotient(int num1, int num2) {
        int answer = 0;
        answer = num1 / num2;
        return answer;
    }

    /**
     * 나이 출력
     * @see "https://school.programmers.co.kr/learn/courses/30/lessons/120820"
     * @param age
     * @return
     */
    public static int ageOutput(int age) {
        int answer = 0;
        answer = 2023 - age;
        return answer;
    }

    /**
     * 각도기
     * @see "https://school.programmers.co.kr/learn/courses/30/lessons/120829"
     * @param angle
     * @return
     */
    public static int typeOfAngle(int angle) {
        int answer = 0;
        if(angle > 0 && angle < 90){
            answer = 1;
        }else if(angle == 90){
            answer = 2;
        }else if(angle < 180 && angle > 90){
            answer = 3;
        }else {
            answer = 4;
        }
        return answer;
    }

    /**
     * 두 수의 나눗셈
     * @see "https://school.programmers.co.kr/learn/courses/30/lessons/120806"
     * @return
     */
    public static int DivToMultiplication(int num1, int num2) {
        double answer = 0;
        answer =  (double) num1 /  (double) num2 * 1000;
        return (int) answer;
    }

    /**
     * 스킬 체크 테스트 Level.1
     * @see "https://programmers.co.kr/skill_checks/442891"
     * @param s
     * @return
     */
    public static boolean skillCheck(String s) {
        boolean answer = false;

        String tempS = s.toLowerCase();

        int p = strCheck(tempS,'p');
        int y = strCheck(tempS,'y');

        if(p == y ){
            answer = true;
        }else if( p == 0 && y == 0){
            answer = true;
        }

        return answer;
    }

    public static int strCheck (String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        return count;
    }

    /**
     * 스킬 체크 테스트 Level.2 (시간초과 불통과함...)
     * @see "https://programmers.co.kr/skill_checks/442891?challenge_id=12297"
     * @param
     * @return
     */
    public static String skillCheck2(String X, String Y) {
        String answer = "";

        ArrayList<String> arrayListX = new ArrayList<>(Arrays.asList(X.split("")));
        ArrayList<String> arrayListY = new ArrayList<>(Arrays.asList(Y.split("")));
        ArrayList<String> resultList = new ArrayList<String>();

        for(int i=0; i < arrayListX.size() ; i++){
            for(int j=0 ; j <arrayListY.size() ; j++){
                if(arrayListX.get(i).equals(arrayListY.get(j))){
                    resultList.add(arrayListX.get(i));
                    arrayListX.remove(i);
                    arrayListY.remove(j);
                    i = 0;
                    j = 0;
                }
            }
        }

        Collections.sort(resultList,Collections.reverseOrder());
        answer = resultList.toString();
        return answer;
    }
}
