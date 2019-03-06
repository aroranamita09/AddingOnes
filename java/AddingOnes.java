package com.stackroute;
import java.util.*;
import java.lang.*;
import java.io.*;
class AddingOnes{
    int[] updateBy1(int n,int k,int freq[])
            {
               /*your code here*/
            }
             int[] check (int arr[]) {
                 Scanner ab = new Scanner(System.in);
                 int arr1[]={};
                 int t = ab.nextInt();
                 while (t-- > 0) {
                     int n = ab.nextInt();
                     int k = ab.nextInt();
                     int freq[] = new int[n];
                     for (int i = 0; i < k; ++i)
                         ++freq[ab.nextInt() - 1];
                     arr1= updateBy1(n, k, freq);
                 }return arr1;
             }
        }

