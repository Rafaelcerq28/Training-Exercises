import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class Drawer extends Thread {
    
    //variables to store the statistics and arrays
    ArrayList<Integer> drawer;
    private Long sum = Long.valueOf(0);
    private double average = 0;
    private int min;
    private int max;
    private String drawerName;

    //constructor
    public Drawer(ArrayList<Integer> drawers,String name) {
        this.drawerName = name;
        this.drawer = drawers;

        //method to sort my array
        Collections.sort(drawer);
        //starting my thread
        start();
    }
    
    //method run() from the Thread class
    @Override
    public void run() {
        //Getting min and Max
        min = drawer.get(0);
        max = drawer.get(drawer.size()-1);

        //Sum of the numbers
        for(int number : drawer){
            sum += Long.valueOf(number);
        }

        //calculating the average
        average = (double) sum/drawer.size();
        //calling a toString method to print all data colected
        System.out.println(toString());
    }

    
    //ToString / getters and Setters
    @Override
    public String toString() {
        return "Drawer Report: \n" + drawerName +
        "\nSum: " + sum + 
        "\nAverage: " + average + 
        "\nMin: " + min + 
        "\nMax: " + max + "\n";
    }

    public ArrayList<Integer> getDrawer() {
        return drawer;
    }

    public void setDrawer(ArrayList<Integer> drawer) {
        this.drawer = drawer;
    }

    public Long getSum() {
        return sum;
    }

    public void setSum(Long sum) {
        this.sum = sum;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public String getDrawerName() {
        return drawerName;
    }

    public void setDrawerName(String name) {
        this.drawerName = name;
    }    

    

}
