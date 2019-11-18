package com.poorak.pie.tree;

import java.util.Arrays;
import java.util.Comparator;

public class BST_To_Heap {
    public BinaryTree.Node<Integer> heap(BinaryTree.Node<Integer> root){
        if(root == null) return null;
        int size = traverse(root, 0 , null);
        final BinaryTree.Node<Integer>[] arr = new BinaryTree.Node[size];
        // create an array
        traverse(root, 0, arr);
        // sort an array
        Arrays.sort(arr, new Comparator<BinaryTree.Node<Integer>>() {
            @Override
            public int compare(BinaryTree.Node<Integer> o1, BinaryTree.Node<Integer> o2) {
                int o1Val = o1.getValue();
                int o2Val = o2.getValue();
                return o1Val <  o2Val ? -1 : (o1Val == o2Val ? 0 : 1);
            }
        });
        System.out.println(Arrays.toString(arr));
        // create heap
        for(int i=0 ; i<size ; i++){
            int indexL = 2*i+1;
            int indexR = indexL +1;
            arr[i] = arr[i].getMutable()
                    .setLeft(indexL >= size ? null: arr[indexL])
                    .setRight(indexR >= size?  null:arr[indexR] )
                    .build();
        }
        return arr[0];
    }

    private int traverse(BinaryTree.Node<Integer> node, int count, BinaryTree.Node<Integer>[] arr) {
        if(node == null) return count;
        if(arr != null) arr[count] = node;
        count++;
        count = traverse(node.getLeft(), count, arr);
        count = traverse(node.getRight(), count, arr);
        return count;
    }
}
