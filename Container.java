import java.util.ArrayList;
import java.util.Iterator;

public class Container{
    int sum;
    int max;

    ArrayList<Integer> containWeights = new ArrayList<>();

    Container(int max) {
        this.containWeights = new ArrayList<>();
        this.max = max;
    }

    public boolean addItem(int itemWeight) {
        sum = 0;
        for (Integer item : containWeights) {
            System.out.print(item);
            sum += item;
        }
        if (sum + itemWeight <= max) {
            return true;
        }
        return false;
    }


}
