package exam01;

public class Ex04 { //case문 / 중간고사 문제 !!
    public static void main(String[] args) { // case문
        int floor = 3;
        switch (floor) {
            case 1:
                System.out.println("1층 약국"); // 결과 안 나온다.

            case 2:
                System.out.println("2층 정형외과"); // 결과가 안 나온다.
                break; // case 2번은 실행 안 되기 때문에 break문도 실행 안 된다.
            case 3:
                System.out.println("3층 피부과"); // case 3부터 결과 나온다.

            case 4:
                System.out.println("4층 치과");
                break; // case 4 결과 실행하고 case 4 이후론 결과 안 나온다.
            case 5:
                System.out.println("5층 헬스클럽"); // 결과 안 나온다,

            default:
                System.out.println("없는 층입니다.");

        }

    }
}
// 결과
// 3층 피부과
// 4층 치과
