import java.util.Scanner;

public class TaxTableTools {

    private int[] search;
    private double[] value;
    private int nEntries;

    
    public TaxTableTools() {
        nEntries = search.length; 
    }

    
    public TaxTableTools(int[] search, double[] value) {
        this.search = search;
        this.value = value;
        nEntries = search.length; 
    }

    public void setTables(int[] newSearch, double[] newValue) {
        if (newSearch.length == newValue.length) {
            search = newSearch;
            value = newValue;
            nEntries = search.length;
        } else {
            System.out.println("Error: Length mismatch between search and value tables.");
        }
    }

    
    public double getValue(int searchArgument) {
        double result;
        boolean keepLooking;
        int i;

        result = 0.0;
        keepLooking = true;
        i = 0;

        while ((i < nEntries) && keepLooking) {
            if (searchArgument <= search[i]) {
                result = value[i];
                keepLooking = false;
            } else {
                ++i;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        
        int[] modifiedSearch = {0, 25000, 75000, 150000, Integer.MAX_VALUE};
        double[] modifiedValue = {0.0, 0.15, 0.25, 0.35, 0.45};

        
        TaxTableTools taxTable = new TaxTableTools(modifiedSearch, modifiedValue);
        taxTable.setTables(modifiedSearch, modifiedValue);
        

        int[] salaries = {10000, 50000, 50001, 100001, -1};

        Scanner scanner = new Scanner(System.in);

        for (int salary : salaries) {
            if (salary == -1) {
                
                break;
            }

            
            double taxRate = taxTable.getValue(salary);
            double taxToPay = taxRate * salary;

            System.out.println("For salary $" + salary + ":");
            System.out.println("Tax Rate: " + (taxRate * 100) + "%");
            System.out.println("Tax to Pay: $" + taxToPay);
            System.out.println();
        }

        scanner.close();
    }
}
