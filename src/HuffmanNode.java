import java.util.PriorityQueue;
import java.util.Comparator;
public class HuffmanNode {
        int item;
        char c;
        HuffmanNode left;
        HuffmanNode right;
    }

    // For comparing the nodes
    class ImplementComparator implements Comparator<HuffmanNode> {
        public int compare(HuffmanNode x, HuffmanNode y) {
            return x.item - y.item;
        }
    }


