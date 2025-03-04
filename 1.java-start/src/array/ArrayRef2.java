package array;

public class ArrayRef2 {
    public static void main(String[] args) {
        int[] students; // 배열 변수 선언
        students = new int[5]; // 배열 생성

        System.out.println(students); //메모리의 참조값을 16진수로 나타낸것
        //변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        //변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + "점수" + students[i]);
        }
    }
}
