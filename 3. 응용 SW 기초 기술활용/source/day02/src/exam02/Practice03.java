package exam02;

public class Practice03 {
    public static void main(String[] args) {
        int[] arr = {20,30,15,99};
        int[] reverseArr = new int[arr.length];

        for(int i = arr.length - 1 ; i >= 0; i--) {
            reverseArr[arr.length - 1 - i] = arr[i];  //역순의 새 배열 reverseArr
        }

        //reverseArr 내용확인
        for(int i = 0; i < reverseArr.length; i++){
            System.out.printf("nums2[%d] : %d%n", i, reverseArr[i]);
        }
    }
}
