package exam01;

public class Ex07 {
    private static boolean autoSave = false;

    public static void main(String[] args) {
        Thread th = new Thread(() -> {
            while (true) {
                Thread.sleep(3000);

                System.out.println("저장!");
            }
        });
    }
}
