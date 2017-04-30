/*
   class Node 
       int data;
       Node left;
       Node right;
*/
void top_view(Node root)
{ 
  printleft(root.left);
  printright(root);
}
void printleft(Node root) {
  if(root != null) {
    printleft(root.left);
    System.out.print(root.data + " ");
  }
}
void printright(Node root) {
  if(root != null) {
    System.out.print(root.data + " ");
    printright(root.right);
  }
}