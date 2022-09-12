class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        
        List<List<Integer>> lst = new ArrayList<>();
        if(root == null)
            return lst;
        
        Queue<TreeNode> q = new LinkedList();
        q.offer(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> ls = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr = q.poll();
                ls.add(curr.val);
                
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
                
            }
            lst.add(ls);
        }
        return lst;
    }
}
