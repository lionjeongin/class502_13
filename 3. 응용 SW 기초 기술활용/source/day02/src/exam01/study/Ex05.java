package exam01.study;

public class Ex05 {
    public static void main(String[] args) {
        int number = 10;
        int result;

        for(int i = 10; i >= 0; i--){
            //예외가 발생할 가능성이 있는 코드
            try{
                result = number / i;
                System.out.println(result);
                //예외가 발생했을 시 실행되는 코드 (catch는 여러개 작성 가능)
            }catch (Exception e){
                System.out.println("Exception 발생: " + e.getMessage());
                //예외의 발생여부에 관계없이 항상 수행되어야하는 코드
            }finally {
                System.out.println("항상 실행되는 finally 구문");
            }
        }

    }
}
