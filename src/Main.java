import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        int[] arr = {15, 4, -2, 2, -8, 1, 7, 10, 23};
        /*-2, 2  ==> len 2
                -8, 1, 7, ==> len 3
                -2, 2, -8, 1, 7 ==> len 5
        output: Max length is 5*/

        long num = 12345675436l;
        Stream.of(num).collect(Collectors.groupingBy(n->n.longValue(),Collectors.counting())).entrySet().stream().forEach(System.out::println);
        int maxLength = 0;
        int sum = 0;
        for(int i=0; i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                sum = arr[i]+arr[j];
                if(sum == 0){
                    maxLength = j;
                }

            }
        }
        System.out.println("MaxLength : " + maxLength);
    }
}
