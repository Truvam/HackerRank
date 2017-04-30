   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   void LevelOrder(Node root)
    {
      LinkedList<Node> queue = new LinkedList<Node>();
      queue.add(root);
      while(queue.size() > 0) {
        Node curr = queue.poll();
        if(curr != null) {
          System.out.print(curr.data + " ");
          queue.offer(curr.left);
          queue.offer(curr.right);
        }
      }
    }