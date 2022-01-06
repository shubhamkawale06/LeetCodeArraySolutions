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
public class LeetCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LeetCode l = new LeetCode();
        int [] nums = {1,0,1,1,0,1};
        int ans = l.findMaxConsecutiveOnes(nums);
        System.out.println(ans);
        
    }
   
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0,temp = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 1){
                count++;
                if(count >= temp){
                temp = count;
                }
            }if(nums[i] == 0){
                count =0;
            }
        }
        return temp;
    }
}
    

