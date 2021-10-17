package arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {4, 5, 8, 15, 23, 1, 11, 25, 88, 50};
        // Տպել մասիվի բոլոր էլեմենտները
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Տպել մասիվի ամենամեծ թիվը
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("max=" + max);

        // Տպել մասիվի ամենափոքր թիվը
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min =" + min);


        // Տպել մասիվի բոլոր զույգ էլեմենտները
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        // Տպել մասիվի բոլոր կենտ էլեմենտները
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        //տպել մասիվի զույգ էլեմենտների քանակը
        int evenCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("count of even:" + evenCount);

        //տպել մասիվի կենտ էլեմենտների քանակը
        int oddCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println("count of odd:" + oddCount);


        // տպել մասիվի էլեմենտների գումարը
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("sum:" + sum);

         // տպել մասիվի էլեմենտների միջին տվաբանականը
        int avg = 0;
        for (int i = 0; i < array.length; i++) {
            avg += array[i];
        }
        System.out.println("avg:" + sum/ array.length);


    }

}









