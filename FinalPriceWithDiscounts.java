import java.util.Arrays;

public class FinalPriceWithDiscounts {
/*
 You are given an integer array prices where prices[i] is the price of the ith item in a shop.
There is a special discount for items in the shop. If you buy the ith item, then you will receive 
a discount equivalent to prices[j] where j is the minimum index such that j > i and prices[j] <= prices[i]. 
Otherwise, you will not receive any discount at all.
Return an integer array answer where answer[i] is the final price you will pay for the ith item of the shop, 
considering the special discount.

Input: prices = [8,4,6,2,3]
Output: [4,2,4,2,3]
 */


 public static int[] finalPrices(int[] prices) {
    int [] finalPricesArray = new int[prices.length];
    for(int i=0;i<prices.length;i++){
        for(int j=0;j<prices.length;j++){
            if(j>i){
                if(prices[j] <= prices[i]){
                    finalPricesArray[i] = prices[i] - prices[j];
                    break;
                }
            }else{
                finalPricesArray[i] = prices[i];
            }
        }
    }
    
    return finalPricesArray;
 }

 public static void main(String[] args) {

    int [] array = {8,4,6,2,3};
    array = finalPrices(array);
    System.out.println(Arrays.toString(array));

 }
}
