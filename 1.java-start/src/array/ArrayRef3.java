package array;

public class ArrayRef3 {
    public static void main(String[] args) {
        int [] students = new int[]{90,80,70,60,50}; // 배열 생성과 초기화

        System.out.println(students); //메모리의 참조값을 16진수로 나타낸것

        //변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }
    }
}
