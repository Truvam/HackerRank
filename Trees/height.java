	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	static int height(Node root) {
      	// Write your code here.
      int heightr = 0;
      int heightl = 0;
      int height = 0;
      if(root == null) 
        return height - 1;
      else {
        heightl = 1 + height(root.left);
        heightr = 1 + height(root.right);
      }
      if(heightl > heightr) height = heightl;
      else height = heightr;
      return height;
    }