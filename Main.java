import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Container> containers = new ArrayList<>();
        System.out.println("Enter the number of objects: ");
        int numContainers = input.nextInt();
        System.out.println("Enter the max weight: ");
        int maxUser = input.nextInt();

        System.out.println("Enter the weights: ");
        for (int i = 0; i < numContainers; i++) {
            int user = input.nextInt();
            boolean added = false;
            int index = 0;

            while (!added && index < containers.size()) {
                Container current = containers.get(index);
                added = current.addItem(user);

                if(added){
                    current.addItem(user);
                }
                if(!added){
                    index ++;
                }
            }

            if (!added) {
                Container newContainer = new Container(maxUser);
                newContainer.addItem(user);
                containers.add(newContainer);
            }
        }
        System.out.println("Number of containers needed: " + containers.size());
        for (int i = 0; i < containers.size(); i++) {
            Container c = containers.get(i);
            System.out.println("Container " + (i + 1) + " contains objects with weights " + c.containWeights);
        }

    }
    }
