import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String a[]){

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        System.out.println(nums);
        System.out.println(nums.get(1));
        System.out.println(nums.indexOf(1));

        for(int n : nums){
            System.out.println(n);
        }        

    }
}
