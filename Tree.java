class Tree{
  Tree root=null;

boolean  addNode(Node n){
    if(this.root==null){
      this.root=n;
      return true;
    }else{
      return addTree(n,root);
    }
    return false;
  }
boolean addTree(Node child, Node parent){
  if(n.data<parent.data){
    if(parent.left==null){
      parent.left=child;
      return true;
    }else{
      addTree(child,parent.left);
    }
  }else if(n.data>parent.data){
    if(parent.right==null){
      parent.right=child;
      return true;
    }else{
      addTree(child,parent.right);
   } 
  } 
  return false;  
}

void traverseTree(){
  if(this.root==null){
    return;
  }else{
    traverseLeft();
    printNode();
    traverseRight();
  }
}
boolean findNode(){
  
}

}