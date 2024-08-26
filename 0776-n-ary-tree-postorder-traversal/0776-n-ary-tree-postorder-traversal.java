/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    private List<Integer>ans=new ArrayList<Integer>();
    public List<Integer> postorder(Node root) {
        dfs(root);
        return ans;
    }
    public void dfs(Node root){
        if(root==null)return;
        for(var child:root.children){
            dfs(child);
        }
        ans.add(root.val);
    }
}