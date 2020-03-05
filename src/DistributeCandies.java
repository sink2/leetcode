public class DistributeCandies {
    public static int[] distributeCandies(int candies, int num_people) {
        int[] result = new int[num_people];
        int i = 0;
        int step = 1;
        while(candies > 0) {
            result[i] += Math.min(step, candies);
            candies -= step;;
            step++;
            i++;
            i = i % num_people;
        }
        return result;
    }
}
