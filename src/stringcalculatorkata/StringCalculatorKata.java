/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringcalculatorkata;

import java.util.ArrayList;

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
    public int Add(String numbers) throws Exception {
        if (numbers.isEmpty()) {
            return 0;
        } else if (numbers.length() == 1) {
            return stringToInt(numbers);
        } else {
            String[] nums;
            if(numbers.charAt(0) == '/' && numbers.charAt(1) == '/'){
                String[] lines = numbers.split("\n");
                char split_char = lines[0].charAt(2);
                nums = lines[1].split(Character.toString(split_char));
            }
            else{
                nums = numbers.split(",|\n");
            }
            return getSum(nums);
        }
    }
    
    public int getSum(String[] nums) throws Exception
    {
        ArrayList<Integer> neg_nums = new ArrayList<Integer>();
        int sum=0;
        for (String num : nums) {
            if(Integer.parseInt(num) < 0){
                neg_nums.add(Integer.parseInt(num));
            }
            else{
                sum += stringToInt(num);
            }
        }
        if(neg_nums.size() != 0){
            String exc_msg = "negatives not allowed : ";
            for(int i = 0;i < neg_nums.size();i++){
                exc_msg += String.valueOf(neg_nums.get(i)) + " ";
            }
            System.out.println(exc_msg);
            throw new Exception(exc_msg);
        }
        return sum;
    }
    
    public int stringToInt(String str) {
        return Integer.parseInt(str);
    }
}
