package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class BinaryTreeQuestions {

    Node insert(Node root, int data){
        if(root==null){
            root = new Node(data);
            return root;
        }else{
            Queue<Node> q = new LinkedList<Node>();
            q.add(root);

            while (!q.isEmpty()){
                Node temp = q.poll();
                if(temp.left==null){
                    temp.left = new Node(data);
                    break;
                }else{
                    q.add(temp.left);
                }

                if(temp.right==null){
                    temp.right = new Node(data);
                    break;
                }else{
                    q.add(temp.right);
                }

            }
        }
        return root;
    }


    void deleteDeepest(Node root, Node deleteNode){
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        while (!q.isEmpty()){
            Node temp = q.poll();
            if(temp==deleteNode) {
                temp=null;
                deleteNode=null;
                return;
            }

          if (temp.left!=null){
              if(temp.left==deleteNode){
                  temp.left =null;
                  deleteNode=null;
                  return;
              }else{
                  q.add(temp.left);
              }
          }
        if (temp.right!=null) {
            if (temp.right == deleteNode) {
                temp.right = null;
                deleteNode = null;
                return;
            } else {
                q.add(temp.right);
            }
        }

        }
    }

     Node deleteKey(Node<Integer> root, int data){
         if (root == null)
             return null;
         if (root.left == null && root.right == null) {
             if (root.data == data)
                 return null;
             else
                 return root;
         }

            Queue<Node> q = new LinkedList<Node>();
            q.add(root);
            Node key_node = null;
            Node<Integer> temp = new Node(0);
            while (!q.isEmpty()){
                temp = q.poll();
                if(temp.data==data) {
                    key_node = temp;
                    break;
                }

                if(temp.left!=null){
                    q.add(temp.left);
                }

                if(temp.right!=null){
                    q.add(temp.right);
                }

            }
            if (key_node != null) {
                int x = temp.data;
                key_node.data = x;
                deleteDeepest(root, temp);
            }
             return root;

    }

    void inorderTravelsal(Node<Integer> root){
        if (root == null)
            return;
        inorderTravelsal(root.left);
        System.out.print(root.data+" ");
        inorderTravelsal(root.right);
    }

    void preorderTravelsal(Node<Integer> root){
        if (root == null)
            return;
        System.out.print(root.data+" ");
        preorderTravelsal(root.left);
        preorderTravelsal(root.right);
    }
    void postorderTravelsal(Node<Integer> root){
        if (root == null)
            return;
        postorderTravelsal(root.left);
        postorderTravelsal(root.right);
        System.out.print(root.data+" ");
    }


    void levelOrder(Node<Integer> root){
        if(root==null){
            return ;
        }else{
            Queue<Node> q = new LinkedList<Node>();
            q.add(root);
            while (!q.isEmpty()){
                Node<Integer> temp = q.poll();
                if(temp!=null) {
                   System.out.print(temp.data+" ");
                }

                if(temp.left!=null){
                    q.add(temp.left);
                }

                if(temp.right!=null){
                    q.add(temp.right);
                }

            }
        }
    }

    public  static void main(String [] args){

        Node root = null;

        BinaryTreeQuestions qs = new BinaryTreeQuestions();
        // Insertion of nodes
        root = qs.insert(root, 10);
        root = qs.insert(root, 20);
        root = qs.insert(root, 30);
        root = qs.insert(root, 40);

        System.out.print("Preorder traversal: ");
        qs.preorderTravelsal(root);

        System.out.print("\nInorder traversal: ");
        qs.inorderTravelsal(root);

        System.out.print("\nPostorder traversal: ");
        qs.postorderTravelsal(
                root);

        System.out.print("\nLevel order traversal: ");
        qs.levelOrder(root);
        System.out.println("\nheight "+qs.depthOfTree(root));
        System.out.println("\nheight "+qs.levelOrderDepth(root));
        // Delete the node with data = 20
        root = qs.deleteKey(root, 20);

        System.out.print("\nInorder traversal after deletion: ");
        qs.inorderTravelsal(root);
    }


    int depthOfTree(Node root){
        if(root ==null)
            return 0;
        else{

            int ldepth = depthOfTree(root.left);
            int rdepth = depthOfTree(root.right);
            if(ldepth>rdepth){
                return ldepth+1;
            }else{
                return rdepth+1;
            }

        }
    }


    int levelOrderDepth(Node root){
        if(root ==null)
            return 0;
        else{
            int heigh = 0;
           Queue<Node> q = new LinkedList();
           q.add(root);
           while(!q.isEmpty()){
               int ht = q.size();
               for(int i = 0;i<ht;i++){
                   Node temp = q.poll();
                    if(temp.left!=null)
                        q.add(temp.left);
                   if(temp.right!=null)
                       q.add(temp.right);
               }
               heigh++;
           }
            return  heigh;
        }
    }


}


class Node<T> {
    T data;
    Node left,right;
    Node (T value){
        data = value;
        left=right=null;
    }

}