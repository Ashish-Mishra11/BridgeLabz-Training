// Writing a java code to calculate profit and profit percentage
// Create CalProfitAndLoss class to compute the profit and profit percentage 
public class CalProfitAndLoss
{
  public static void main(String [] args)
  {
    // Create variable costPrice and sellingPrice to store both values
    double costPrice = 129, sellingPrice = 191;
  
    // Create a variable profit to store the profit value
    double profit = sellingPrice - costPrice;

    // Create a variable profitPercentage to store profit percentage
    double profitPercentage = (profit/costPrice)*100;

    // Display cost price, selling price, profit, profit percentage
    System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" 
                       + "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
  }
}