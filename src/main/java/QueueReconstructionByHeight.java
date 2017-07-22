import java.util.*;

/**
 * Created by guofeng on 2017/7/22.
 */
public class QueueReconstructionByHeight {

    public int[][] reconstructQueue(int[][] people) {
        //pick up the tallest guy first
        //repeat until all people are inserted into list
        Arrays.sort(people, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0]);

        //when insert the next tall guy, just need to insert him into kth position
        List<int[]> res = new LinkedList<>();
        for (int[] cur : people) {
            res.add(cur[1], cur);
        }
        return res.toArray(people);
    }

}
