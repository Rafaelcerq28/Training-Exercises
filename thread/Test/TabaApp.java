import java.util.ArrayList;

import taba2024.Taba2024;

public class TabaApp {
    public static void main(String[] args) {

        //Getting the drawers
        ArrayList[] drawers = Taba2024.generateData();

        //variables to store the statistics computed from each thread (Exercise B)
        Long grandTotal = Long.valueOf(0);
        double average = 0;
        int min = 0;
        String threadOfMinValue ="";
        int max = Integer.MIN_VALUE;
        String threadOfMaxValue ="";


        ArrayList<Drawer> threads = new ArrayList<>();

        //Threads
        Drawer drawerThreadA = new Drawer(drawers[0], "Thread A");
        Drawer drawerThreadB = new Drawer(drawers[1], "Thread B");
        Drawer drawerThreadC = new Drawer(drawers[2], "Thread C");
        Drawer drawerThreadD = new Drawer(drawers[3], "Thread D");
        Drawer drawerThreadE = new Drawer(drawers[4], "Thread E");
        Drawer drawerThreadF = new Drawer(drawers[5], "Thread F");
        Drawer drawerThreadG = new Drawer(drawers[6], "Thread G");
        Drawer drawerThreadH = new Drawer(drawers[7], "Thread H");
        Drawer drawerThreadI = new Drawer(drawers[8], "Thread I");
        Drawer drawerThreadJ = new Drawer(drawers[9], "Thread J");

        //Adding the threads into an arrayLists
        threads.add(drawerThreadA);
        threads.add(drawerThreadB);
        threads.add(drawerThreadC);
        threads.add(drawerThreadD);
        threads.add(drawerThreadE);
        threads.add(drawerThreadF);
        threads.add(drawerThreadG);
        threads.add(drawerThreadH);
        threads.add(drawerThreadI);
        threads.add(drawerThreadJ);

        //fill the min value with some minimun valule to compare
        min = threads.get(0).getMin();

        //iterate over my arrayList to calculate the statics
        for (Drawer drawer : threads) {
            //getting the sum
            grandTotal += drawer.getSum();

            //getting the min value and where it was found
            if(drawer.getMin() < min){
                min = drawer.getMin();
                threadOfMinValue = drawer.getDrawerName();
            }

            //getting the max value and where it was found
            if(drawer.getMax() > max){
                max = drawer.getMax();
                threadOfMaxValue = drawer.getDrawerName();
            }

            //getting the sum of the averages
            average += drawer.getAverage();

        }

        //getting the average
        average = average / threads.size();


        //printing a Final Report with all statistics
        System.out.println("Final Report :\n"+
        "Total: " + grandTotal +
        "\nAverage: " + average +
        "\nThread where the min value was found: " + threadOfMinValue + 
        "\nMin: " + min +
        "\nThread where the max value was found: " + threadOfMaxValue +
        "\nMax: " + max
        );
    }
}
