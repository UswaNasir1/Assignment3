class BSTree { 
    
    class Node { 
        String key; 
        Node left_ptr;
        Node right_ptr;  
        public Node(String data){ 
            key = data; 
            left_ptr = right_ptr = null; 
        } 
    } 
    
    Node root; 
    BSTree(){ 
        root = null; 
    } 

    
    void insert(String key)  { 
        root = insert_Recursive(root, key); 
    } 
   
    
    Node insert_Recursive(Node root, String key) { 
          
        if (root == null) { 
            root = new Node(key); 
            return root; 
        } 
       
        if (key.compareTo(root.key) < 0)     
            root.left_ptr = insert_Recursive(root.left_ptr, key); 
        else if (key.compareTo(root.key) > 0)    
            root.right_ptr = insert_Recursive(root.right_ptr, key); 
         
        return root; 
    } 
    void inorder() { 
        inorder_Recursive(root); 
    } 
   
   
    void inorder_Recursive(Node root) { 
        if (root != null) { 
            inorder_Recursive(root.left_ptr); 
            System.out.print(root.key + "\n"); 
            inorder_Recursive(root.right_ptr); 
        } 
    } 
     
    boolean search(String key)  { 
       Node newRoot = search_Recursive(root, key); 
        if (newRoot != null)
            return true;
        else
            return false;
    } 
   
   
    Node search_Recursive(Node root, String key)  { 
        
        if (root==null)
        {
            return root; 
        }
        if(root != null && root.key.compareTo(key) == 0)
        {
        	return root;
        }
        if (key.compareTo(root.key) < 0)
        {
            return search_Recursive(root.left_ptr, key); 
        }
        return search_Recursive(root.right_ptr, key); 
    } 
}