/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node == null){
            return null;
    
        }
        Node cloneNode = new Node(node.val);
        Node[] visited = new Node[101];
        Arrays.fill(visited, null);
        DFS(node, cloneNode, visited);
        return cloneNode;
    }
    public void DFS(Node node, Node cloneNode, Node[] visited){
        visited[cloneNode.val] = cloneNode;
        for(Node prevNode : node.neighbors){
            /* check whether node is visited or not, 
             if not visited then return null*/
            if(visited[prevNode.val] == null){
                Node newNode = new Node(prevNode.val);
                cloneNode.neighbors.add(newNode);
                DFS(prevNode, newNode, visited);
            } else{
                cloneNode.neighbors.add(visited[prevNode.val]);
            }
        }
        
    }
}