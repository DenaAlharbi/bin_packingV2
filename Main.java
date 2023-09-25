import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Container> containers= new ArrayList<>();
        System.out.println("Enter the number of objects: ");
        int numContainers = input.nextInt();
        System.out.println("Enter the max weight: ");
        int maxUser = input.nextInt();

        System.out.println("Enter the weights: ");
        for (int i = 0; i < numContainers; i++) {
            int user = input.nextInt();
            boolean added = false;
            int index =0;
            //System.out.print(containers);
            while(!added && (index<containers.size())){
                //System.out.print(containers);

                Container current= containers.get(index);
                added = current.addItem(user);
                if(added){
                    current.addItem(user);
                }
                 if(!added){
                    index ++;
                    }
                }
            if(!added){
                Container newcontainer = new Container(maxUser);
                newcontainer.addItem(user);

                containers.add(newcontainer);
                //System.out.print(containers);

            }
        }
        System.out.println("Number of the containers needed: " + containers.size());
        for (int i=0; i<containers.size();i++){
            Container c= containers.get(i);
            System.out.println("Container"+ (i+1));
            for (Integer s : c) {
                System.out.print(s);
            }

        }

    }
}