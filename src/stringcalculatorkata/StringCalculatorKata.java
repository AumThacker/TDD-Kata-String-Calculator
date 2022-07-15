/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringcalculatorkata;

/**
 *
 * @author Aum Thacker
 */
public class StringCalculatorKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public int Add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        } else if (numbers.length() == 1) {
            return stringToInt(numbers);
        } else {
            String[] nums = numbers.split(",");
            return stringToInt(nums[0]) + stringToInt(nums[1]);
        }
    }
    
    public int stringToInt(String str) {
        return Integer.parseInt(str);
    }
}
