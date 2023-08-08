public class calcularmedia {

    public static void main(String[] args) {

        int[] nums = new int[3];
        nums[0] = 7;
        nums[1] = 5;
        nums[2] = 3;

        float media = 0;
        for (int i = 0; i<nums.length; i++) {
            media += nums[i];
        }

        float total = (float)media / nums.length;

        System.out.println("A média é: "+total);

    }

}