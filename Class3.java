www.interviewbit.com/problems/flip/ 


package STSclass;
import java.util.*;

public class Class3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A = "0111000";
			    char nums[] = A.toCharArray();
		        int N = A.length();
		        boolean iszero = false;
		        ArrayList<Integer> ans = new ArrayList<>();
		        // System.out.println(Arrays.toString(num));
		        for(int i=0;i<N;i++){
		            if(nums[i] == '1') nums[i] = '2';
		            else {
		                nums[i] = '1';
		                iszero = true;
		            }
		        }
		        //kadans algorithm
		        int current_sum = 0;
		        int max_sum = Integer.MIN_VALUE;
		        int L = 0;
		        int R = 0;
		        int prev = 0;
		        for(int i=0;i<N;i++){
		            int temp1 = Integer.parseInt(String.valueOf(nums[i]));
		            if(temp1 == 2) temp1 = -1;
		            if(current_sum +temp1<0){
//		                current_sum =0;
		                prev =i+1;
		            }
		            else current_sum +=temp1;
		            if(temp1>current_sum) current_sum =temp1;
		            if(max_sum<current_sum){
		                max_sum = current_sum;
		                R = i;
		                L = prev;
		            }
		        }
		      
		    
		        ans.add(L+1);
		        ans.add(R+1);
		        System.out.println(ans);
		        
		        
		      
		        
		    
		

		
	}

}
