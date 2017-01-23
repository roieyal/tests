//package org.moro.pages;
//
///**
// * Created by eyal on 16/11/2016.
// */
//public class Binary {
//    private static int isPresent(Node root, int val){
//
//        if(root.data == val){
//            return 1;
//        }
//
//        if(val >= root.data){
//            if(root.right != null){
//                if( isPresent(root.right, val) ==1){
//                    return 1;
//                }
//            }else {
//                if(root.left != null){
//                    if( isPresent(root.left, val) ==1){
//                        return 1;
//                    }
//                }
//            }
//        }
//        return 0;
//    }
//}
