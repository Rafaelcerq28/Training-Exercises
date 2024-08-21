package Question03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ManageProducts {

    //Method to read a txt file
    public static String[][] txtReader(String sInputFileName) {
        
        try (BufferedReader br = new BufferedReader(new FileReader(sInputFileName))) {
            //String to store data from the txt file
            String sOutputString;
           
            //check how many lines the txt file has
            BufferedReader linesCounter = new BufferedReader(new FileReader(sInputFileName));
            int iterator = (int) linesCounter.lines().count();
           
            //creating a list to store the products
            String [][] products = new String[iterator][];
            //changes the iterator to 0 to start counting again
            iterator = 0;
            
            //iterates over the txt to get the products
            while ((sOutputString = br.readLine()) != null) {
                //split the the items and store in the array
                String [] product = sOutputString.split(",");
                //store the array into the other array
                products[iterator] = product;
                iterator++;
            }

            //returning the products list
            return products;
        } catch (IOException e) {
            System.out.println(e);
        }
        return null;
    }

    //method to write a txt file
    public static void txtWriter(String [][] missingDepartments) {
        try {
            //give a name to the file
            Path outputFileName = Path.of("MissingDepartment.txt");
            //string builder to store into the txt file
            StringBuilder sb = new StringBuilder();

            //iterating over a list adding the itens in the string builder
            for(int i=0;i<missingDepartments.length;i++){
                sb.append(missingDepartments[i][0]+",").
                    append(missingDepartments[i][1]+",").
                    append(missingDepartments[i][2]+",").
                    append(missingDepartments[i][3]+",").
                    append(missingDepartments[i][4]).
                    append("\n");                
            }
            
            //saving the list in the string format in the sOutputString
            String sOutputString = sb.toString();
            //writing a file
            Files.writeString(outputFileName, sOutputString);
            //message to inform that the file was saved
            System.out.println("Data was added to " + outputFileName);
        } catch (IOException e) {
            System.out.println(e);
        }
    }    

    public static void main(String[] args) {

        String workingDir = System.getProperty("user.dir");
        String [][] products = txtReader(workingDir + "/Question03/products.txt");
        
        //iterates over the list to get the amount of empty departments
        int iterator = 0;
        for(int i=0;i<products.length-1;i++){
            if(products[i][3] == ""){
                iterator++;
            }
        }

        //create a list of missing departments with the size os prodicts with department missing
        String [][] missingDepartments = new String[iterator][];
        iterator = 0;
        //iterates over a list adding to the missing department list the itens with the department missing
        for(int i=0;i<products.length-1;i++){
            if(products[i][3] == ""){
                //add the product to the list
                missingDepartments[iterator] = products[i];
                iterator++;
            }
        }

        //call the method to write a txt file
        txtWriter(missingDepartments);

        //Uncomment this line case the code above dont work
        //String [][] products = readUsingBufferedReader(workingDir + "/products.txt");
    }
}
