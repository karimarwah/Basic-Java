class BT
     {
         private BTNode root;
        
         public BT()
         {
             root = null;
         }

 
         public boolean isEmpty()
         {
             return root == null;
         }
         
         public void insert(int data)
         {
             root = insert(root, data);
         }
        
 
         private BTNode insert(BTNode node, int data)
         {
             if (node == null)
                 node = new BTNode(data);
             else
             {
                 if (node.getRight() == null)
                     node.right = insert(node.right, data);
                 else
                     node.left = insert(node.left, data);             
             }
             return node;
         }     
		 
  
		 
         public int countNodes()
         {
             return countNodes(root);
         }
        
         private int countNodes(BTNode r)
         {
             if (r == null)
                 return 0;
             else
             {
                 int l = 1;
                 l += countNodes(r.getLeft());
                 l += countNodes(r.getRight());
                 return l;
             }
         }

 


 
         public void preorder()
         {
             preorder(root);
         }
         private void preorder(BTNode r)
         {
             if (r != null)
             {
                 System.out.print(r.getData() +" ");
                 preorder(r.getLeft());             
                 preorder(r.getRight());
             }
         }


 
         public void postorder()
         {
             postorder(root);
         }
         private void postorder(BTNode r)
         {
             if (r != null)
             {
                 postorder(r.getLeft());             
                 postorder(r.getRight());
                 System.out.print(r.getData() +" ");
             }
         }     
     }
