/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook;

import binarysearch.*;

/**
 *
 * @author olade
 */
public class TreeNode // Class TreeNode definitionNode 
{
    // package access members
    

        TreeNode left;   // left node
      Contact data;        // data item	          - data will differ depending on the application.
        TreeNode right;  // right node

        // Constructor: initialize data to d and make this a leaf node
        public TreeNode(Contact d) {
            data = d;
            left = right = null;  // this node has no children
        }
        // Insert a TreeNode into a Tree that contains nodes.( Ignore duplicate values).

        public synchronized void insert(Contact d) {
            if (d.SurName.compareTo(data.SurName)<0)
            {
                if (left == null) {
                    left = new TreeNode(d);
                } else {
                    left.insert(d);
                }
            } else if (d.SurName.compareTo(data.SurName)>0)
            {
                if (right == null) {
                    right = new TreeNode(d);
                } else {
                    right.insert(d);
                }
            }
        }
    }
// Class Tree definition

   