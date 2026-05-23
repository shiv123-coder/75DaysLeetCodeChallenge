import java.util.Arrays;

class Solution {
    public int lastStoneWeight(int[] stones) {

        while (stones.length > 1) {

            Arrays.sort(stones);

            int n = stones.length;

            int y = stones[n - 1];
            int x = stones[n - 2];

            int newStone = y - x;

            int[] temp;

            if (newStone == 0) {
                temp = new int[n - 2];

                for (int i = 0; i < n - 2; i++) {
                    temp[i] = stones[i];
                }
            } else {
                temp = new int[n - 1];

                for (int i = 0; i < n - 2; i++) {
                    temp[i] = stones[i];
                }

                temp[n - 2] = newStone;
            }

            stones = temp;
        }

        if (stones.length == 0) {
            return 0;
        } else {
            return stones[0];
        }
    }
}