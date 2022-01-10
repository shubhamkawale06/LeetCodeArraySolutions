/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author cw
 */
public class Find_Numbers_with_Even_Number_of_Digits {
    public static void main(String[] args){
        Find_Numbers_with_Even_Number_of_Digits object = new Find_Numbers_with_Even_Number_of_Digits();
        int[] nums = {555,901,482,1771};
        System.out.println(object.findNumbers(nums));
        
    }
    
    public int findNumbers(int[] nums){
        int count = 0,temp = 0,odd = 1,ans = 0;
        for(int i = 0;i<nums.length;i++){
            temp = nums[i];
            odd = 1;
            count = 0;
            while(temp != 0){
                temp /= 10;  
                count++;
            }
            if(count %2 == 0){
                odd = 0;
                ans++;
            }
        }
        return ans;
    }

}

