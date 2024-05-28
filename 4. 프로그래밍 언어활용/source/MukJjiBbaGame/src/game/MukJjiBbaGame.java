package game;

import java.util.Random;
import java.util.Scanner;

public class MukJjiBbaGame {
    // 묵찌빠 게임
    enum MukJjiBba {
        MUK("묵"), JJI("찌"), BBA("빠");
        /*
        묵, 찌, 빠 중 하나를 나타내는 열거형
         */

        private final String koreanName;
        /*
         'MukJjiBba' 열거형의 각 상수가 가지고 있는 한글 이름을 나타내는 멤버변수를 정의
         String koreanName은 해당 변수의 타입이 문자열임을 나타낸다. 'MukJjiBba' 열거형의 각 상수가
         가지고 있는 한글 이름을 저장하는 데 사용되는 변수를 정의한다.
         */

        MukJjiBba(String KoreanName) {
            this.koreanName = koreanName;
        }
        /*
        'MukJjiBba' 열거형의 각 상수를 생성할 때 해당 상수의 한글 이름을 지정하는 생성자
        'koreanName'은 생성자의 매개변수로 받은 값이고, 각 상수의 한글 이름을 나타낸다.
        'this.koreanName = koreanName;' -> 생성자의 매개변수인 'koreanName'의 값을
        해당 함수의 'koreanName' 멤버 변수에 할당하느 역할을 한다.
       즉, 이 코드는 각각의 묵, 찌, 빠 상수를 생성할 때 해당 상수의 한글 이름을 지정하고, 그 값을
       상수에 할당하는 역할을 한다. 이렇게 함으로써 각 상수는 생성될 때 한글 이름을 가지게 되며,
       이를 통해 한글 이름을 참조할 수 있다.
         */
        @Override
        public String toString() {
            return koreanName;
        }
/*
        '@Override' 어노테이션은 메서드가 부모 클래스나 인터페이스에서 오버라이드된 메서드다.
        이 어노테이션을 사용하면 컴파일러가 해당 메서드가 정말로 오버라이드된 메서드인지 확인하고
        오버라이드가 제대로 이루어졌는지 검사한다.

        'public Static toString() { return koreanName; }' 코드는 'toString' 메서드를 오버라이드하여
        해당 열거 상수를 문자열로 표현할 대 반환하는 값을 재정의하는 것이다.
        기본적으로 Java의 'Enum'클래스는 'toString' 메서드를 사용하여 해당 열거 상수의 이름을 문자열로 반환
 */

        public static MukJjiBba fromString(String text) {
            for (MukJjiBba choice : MukJjiBba.values()) {
                if (choice.koreanName.equals(text)) {
                    return choice;
                }
            }
            return null;
        }
    }

    /*
    이 메서드는 문자열 형태의 한국어 이름을 입력으로 입력받아 해당하는 MukJjiBba 열거 상수를 반환한다. 이 메서드는
    사용자가 입력한 문자열과 각 열거 상수의 한국어 이름을 비교하여 일치하는 열거 상수를 찾는다.

    'fromString' 메서드의 인자로는 문자열 'text'가 전달, 이 문자열 'text'가 전달된다. 이 문자열은
    사용자가 입력한 묵, 찌, 빠를 나타낸다.
    'MukJjiBba.values()'를 사용하여 모든 열거 상수를 순회하며, 각 열거 상수의 'koreanName' 속성과 'text'를 비교한다.
    만약 일치하는 열거 상수를 찾으면 해당 열거 상수를 반환합니다. 그렇지 않으면 'null'을 반환

    이 메서드를 사용하면 사용자가 입력한 문자열과 일치하는 묵찌빠 옵션을 쉽게 찾을 수 있다.
    만약 사용자가 문자열을 입력했다면 'null'이 반환되므로, 이를 통해 예외 처리 수행

     */


    // 묵찌빠 게임의 메인 루프 실행
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        MukJjiBba playerChoice;
        MukJjiBba computerChoice;
        boolean playerTurn = true;
        /* 초기화
        'Scanner' 객체를 사용하여 사용자 입력을 받을 준비를 합니다.
        'Random' 객체를 생성하여 컴퓨터의 선택을 무작위로 생성할 준비를 한다.
        'MukJjiBba' 타입의 'playerChoice'와 'computerChoice' 변수를 선언
        'boolean' 타입의 'playTurn' 변수를 선언하고 초기값을 'true'로 설정한다.
        이 변수는 현재 턴이 플레이어의 턴인지 컴퓨터의 턴인지를 나타낸다.
         */

        System.out.println("묵찌빠 게임을 시작합니다!");
        // 게임 시작 메시지

        while (true) {
            playerChoice = getPlayerChoice(scanner);
            computerChoice = getRandomChoice(random);
            System.out.println("플레이어의 선택: " + playerChoice);
            System.out.println("컴퓨터의 선택: " + computerChoice);

            /*
            게임 루프
            무한 루프를 통해 게임이 계속 진행
            'getPlayerChoice(scanner)' 메서드를 호출하여 플레이어의 선택을 받는다.
            'getRandomChoice(random)' 메서드를 호출하여 컴퓨터의 선택을 생성한다.
            플레이어와 컴퓨터의 선택을 출력한다.
             */

            if (playerChoice == computerChoice) {
                System.out.println((playerTurn ? "플레이어" : "컴퓨터") + "의 승리!");
                break;
            } else {
                playerTurn = determineTurn(playerChoice, computerChoice, playerTurn);
                System.out.println((playerTurn ? "플레이어" : "컴퓨터") + "의 턴입니다.");
            }
            /*
            승패 결정 및 턴 변경
            플레이어와 컴퓨터의 선택이 같으면 현재 턴을 가진 쪽이 승리하며 게임이 종료
            선택에 따르면 'determineTurn' 메서드를 호출하여 다음 턴의 주체를 결정한다.
            현재 턴이 누구인지 출력.
             */
        }
        scanner.close();
        /*
        자원 해제
        'Scanner' 객체를 닫아준다. 이를 통해 자원을 해제하고 프로그램을 종료
         */
    }
    /*
    게임의 흐름 요약
    플레이어와 컴퓨터가 각각 묵, 찌, 빠 중 하나를 선택합니다.
    선택 결과를 비교하여, 같으면 현재 턴을 가진 쪽이 승리합니다.
    다르면 턴을 변경하고 다음 라운드를 진행합니다.
    이 과정을 무한 루프를 통해 반복하다가 승부가 나면 게임을 종료합니다.
     */


    /*
    'getPlayerChoice' 메서드는 플레이어가 묵, 찌, 빠 중 하나를 선택하도록 입력을 받는 기능을 수행함
    이 메서드는 올바른 입력이 들어올 때까지 반복적으로 입력을 요구
     */
    private static MukJjiBba getPlayerChoice(Scanner scanner) {
        /*메서드 시그니처:
         private: 이 메서드는 클래스 내부에서만 사용될 수 있습니다.
        static: 이 메서드는 인스턴스화 없이 호출될 수 있습니다.
        MukJjiBba: 이 메서드는 MukJjiBba 타입의 값을 반환합니다.
        getPlayerChoice: 메서드의 이름입니다.
        Scanner scanner: 사용자 입력을 받기 위해 Scanner 객체를 매개변수로 받습니다.
         */
        MukJjiBba choice = null;
        // 초기화
        // 'choice' 변수를 'null'로 초기화한다. 이는 유효한 'MukJjiBba'를 선택이 들어올 때가지
        // 입력을 반복적으로 요구하기 위 사용된다.
        while (choice == null) {
            System.out.print("묵찌빠 중 하나를 선택하세요 (묵, 찌, 빠): ");
            choice = MukJjiBba.fromString(scanner.nextLine().trim());
            if (choice == null) {
                System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            }
        }
        /* 입력 루프
        'while (choice == null)':'choice'가 'null'인 동안 루프를 계속 실행한다.
        'System.out.print("묵찌빠 중 하나를 선택하세요 (묵, 찌, 빠): ")': 사용자에게 묵, 찌, 빠 중 하나를 선택하라는 메세지 출력
        'choice = MukJjiBba.fromString(scanner.nextLine().trim())' : 사용자의 입력을 받아서
        공백을 제거한 후 'fromString' 메서드를 통해 'MukJjiBba' 열거형으로 변환
        'if (choice == null)' : 변환된 값이 'null'이면 잘못된 입력이라는 메세지 출력하고 다시 입력 요구
         */
        return choice;
        // 유효한 선택 반환
        // 루프가 종료된 후 유효한 'MukJjiBba' 선택을 반환

        /*
        public static MukJjiBba fromString(String text) {
        for (MukJjiBba choice : MukJjiBba.values()) {
            if (choice.koreanName.equals(text)) {
                return choice;
            }
        }
        return null;
    }

    MukJjiBba.fromString 메서드 설명
    이 메서드는 문자열을 받아서 해당 문자열에 맞는 MukJjiBba 열거형 값을 반환합니다.

    - 문자열을 받아서 'MukJjiBba' 열거형 값으로 변환하려고 시도한다.
    'koreanName'과 일치하는 값을 찾으면 해당 'MukJjiBba' 열거형 값을 반환한다
    일치하는 값을 지 못하면 'null'을 반환


    전체 흐름 요약
사용자에게 묵, 찌, 빠 중 하나를 선택하라는 메시지를 출력합니다.
사용자가 입력을 하면 입력 값을 MukJjiBba 열거형 값으로 변환하려고 시도합니다.
변환이 성공하면 그 값을 반환하고, 실패하면 오류 메시지를 출력하고 다시 입력을 요구합니다.
유효한 입력이 들어올 때까지 이 과정을 반복합니다.
이 메서드를 통해 플레이어가 유효한 선택을 할 때까지 입력을 계속 요구하게 되므로 게임의 정확한 진행을 보장합니다.
    */
    }


    private static MukJjiBba getRandomChoice(Random random) {
        return MukJjiBba.values()[random.nextInt(MukJjiBba.values().length)];
    }
    /*
    private static MukJjiBba getRandomChoice(Random random)
    private: 이 메서드는 클래스 내부에서만 호출할 수 있습니다.
    static: 이 메서드는 클래스 인스턴스화 없이 호출할 수 있습니다.
    MukJjiBba: 이 메서드는 MukJjiBba 타입의 값을 반환합니다.
    getRandomChoice: 메서드의 이름입니다.
    Random random: 무작위 선택을 위해 Random 객체를 매개변수로 받습니다.

    MukJjiBba.values() : 'MukJjiBba' 열거형의 모든 값을 배열 형태로 반환
    이 배열은 [MukJjiBba.MUK, MukJjiBba.JJI, MukJjiBba.BBA] 형태입니다.

    random.nextInt(MukJjiBba.values().length)
    random.nextInt(int bound) : 0부터 주어진 'bound' (여기서는 MukJjiBba.values().length) -1 사이의 정수를
    무작위로 반환
    MukJjiBba.values().length는 3이다. 따라서 'random.nextIt(3)은 0, 1, 2, 중 하나의 값을 무작위로 반환

    MukJjiBba.values()[random.nextInt(MukJjiBba.values().length)]
    MukJjiBba.values()[index]: 무작위로 선택된 인덱스를 사용하여 MukJjiBba 배열에서 해당 인덱스의 값을 반환합니다.
    인덱스가 0이면 MukJjiBba.MUK, 1이면 MukJjiBba.JJI, 2이면 MukJjiBba.BBA를 반환합니다.

    전체 흐름 요약
    MukJjiBba.values()를 호출하여 MukJjiBba 열거형의 모든 값을 배열 형태로 가져옵니다.
    random.nextInt(MukJjiBba.values().length)를 호출하여 0에서 2 사이의 무작위 정수를 생성합니다.
    이 무작위 정수를 인덱스로 사용하여 MukJjiBba.values() 배열에서 해당 인덱스의 값을 선택합니다.
    선택된 MukJjiBba 값을 반환합니다.


    예제
    random.nextInt(3)이 0을 반환하면 MukJjiBba.values()[0]은 MukJjiBba.MUK를 반환합니다.
    random.nextInt(3)이 1을 반환하면 MukJjiBba.values()[1]은 MukJjiBba.JJI를 반환합니다.
    random.nextInt(3)이 2를 반환하면 MukJjiBba.values()[2]은 MukJjiBba.BBA를 반환합니다.
    이 메서드는 컴퓨터가 묵, 찌, 빠 중 하나를 무작위로 선택하도록 합니다. 이를 통해 게임에서 컴퓨터의 선택이 예측 불가능해지고, 게임의 공정성과 재미를 더합니다.
     */

    private static boolean determineTurn(MukJjiBba playerChoice, MukJjiBba computerChoice, boolean playerTurn) {
        if ((playerChoice == MukJjiBba.MUK && computerChoice == MukJjiBba.JJI) ||
                (playerChoice == MukJjiBba.JJI && computerChoice == MukJjiBba.BBA) ||
                (playerChoice == MukJjiBba.BBA && computerChoice == MukJjiBba.MUK)) {
            return true;  // 플레이어의 턴 유지
        } else {
            return false;  // 컴퓨터의 턴으로 변경
        }
    }
    /*
    이 메서드는 플레이어와 컴퓨터의 묵찌빠 선택을 비교하여 다음 턴의 주체가 누구인지 결정합니다.
    이를 통해 게임의 턴을 관리합니다. 아래는 이 메서드에 대한 상세한 분석입니다.

    메서드 시그니처
    private static boolean determineTurn(MukJjiBba playerChoice, MukJjiBba computerChoice, boolean playerTurn)
    private: 이 메서드는 클래스 내부에서만 호출할 수 있습니다.
    static: 이 메서드는 클래스 인스턴스화 없이 호출할 수 있습니다.
    boolean: 이 메서드는 boolean 타입의 값을 반환합니다.
    determineTurn: 메서드의 이름입니다.
    MukJjiBba playerChoice: 플레이어의 묵찌빠 선택을 나타냅니다.
    MukJjiBba computerChoice: 컴퓨터의 묵찌빠 선택을 나타냅니다.
    boolean playerTurn: 현재 턴이 플레이어의 턴인지 여부를 나타냅니다.

    비교조건
    if ((playerChoice == MukJjiBba.MUK && computerChoice == MukJjiBba.JJI) ||
    (playerChoice == MukJjiBba.JJI && computerChoice == MukJjiBba.BBA) ||
    (playerChoice == MukJjiBba.BBA && computerChoice == MukJjiBba.MUK))

    이 조건문은 플레이어가 이기면 true를 반환하고, 컴퓨터가 이기면 false를 반환합니다.
    각 조건은 다음과 같습니다:
    playerChoice == MukJjiBba.MUK && computerChoice == MukJjiBba.JJI
    : 플레이어가 "묵"을 선택하고 컴퓨터가 "찌"를 선택했을 때 플레이어가 승리합니다.
    playerChoice == MukJjiBba.JJI && computerChoice == MukJjiBba.BBA
    : 플레이어가 "찌"를 선택하고 컴퓨터가 "빠"를 선택했을 때 플레이어가 승리합니다.
    playerChoice == MukJjiBba.BBA && computerChoice == MukJjiBba.MUK
    : 플레이어가 "빠"를 선택하고 컴퓨터가 "묵"을 선택했을 때 플레이어가 승리합니다.

    플레이어의 턴 유지
    return true;  -> 위 조건이 참이면 'true'를 반환하여 플레이어 턴을 유지한다.

    컴퓨터 턴으로 변경
    return false; -> 위 조건이 거짓이면 'false'를 반환하여 컴퓨터의 턴으로 변경한다.

    요약
    이 메서드는 플레이어와 컴퓨터의 선택을 비교하여 누가 턴을 유지할지를 결정합니다.
    플레이어가 이기면 true를 반환하여 플레이어의 턴을 유지하고,
    컴퓨터가 이기면 false를 반환하여 컴퓨터의 턴으로 변경합니다.
    이는 게임의 진행 상황을 관리하는 데 중요한 역할을 합니다.
     */
}
