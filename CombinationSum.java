// Time Complexity : O(N ^ (T/M)+1) -t is the target ,M is the minimum element
// Space Complexity : O(t/M)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach



class Solution {
  
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
      //use backtracking to add to the resultant list
      backTracking(candidates,target,0,new ArrayList<>());
      
      return result;
        
    }
  
    private void backTracking(int[] candidates,int target,int index,List<Integer> path)
    {
      //no need to go to the next level
      if(target<0)
      {
        return;
      }
      //we have a combination add it to the result
      if(target==0)
      {
        result.add(new ArrayList<>(path));
      }
      //
      for(int i=index;i<candidates.length;i++)
      {
        //add the current number to the list
        path.add(candidates[i]);
        //pass the list to the backtrack method recursilvely and keep reducing the target to reach the base cases
        backTracking(candidates,target-candidates[i],i,path);
        //backtrack by removing the number form the list
        path.remove(path.size()-1);
      }
    }
}