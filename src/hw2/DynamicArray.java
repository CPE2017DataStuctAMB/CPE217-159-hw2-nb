/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;

/**
 *
 * @author Patiwet
 */
public class DynamicArray {
    private int[] arr;
    private int capacity;
    private int size; // Last element can be indexed at size-1

    public DynamicArray(int cap){ // Class Constructor
        arr = new int[cap];
        capacity = cap;
    }

    public void pushBack(int data){
        // FIXED by Ball, Aunpyz
        if(size < capacity){
            arr[size] = data;
        }else{
            int[] oldArr = arr;
            capacity *= 2;
            arr = new int[capacity];
            for(int i=0;i<oldArr.length;i++){
                arr[i] = oldArr[i];
            }
            arr[size] = data;
        }
        size++;

    }

    public int popBack(){
        // FIXED by ball, Aunpyz
        if(size > 0){
            int tmp = arr[size];
            size--;
            return tmp;
        }else{
            System.out.println("ERROR");
            return 0;
        }

    }

    public int get(int i){
        // FIXED by ball, Aunpyz lasted 590831 0152
        if(i < size-1 && i >= 0)
            return arr[i];
        else
            System.out.println("ERROR");
        return 0;
    }
    public void set(int i, int value){
        // FIXED by ball, Aunpyz lasted 590831 0250
        if(i < size-1 && i >= 0)
        {
            arr[i] = value;
            //System.out.println(arr[i]);
        }else
            System.out.println("ERROR");
    }

    public void remove(int i){
        // FIXED by ball, Aunpyz lasted 590831 0255
        if(i < size-1 && i >= 0){
            int s = 0;
            boolean f = false;
            while(s<size){
                if(s==i-1)
                    f = true;
                if(f){
                    arr[s] = arr[s+1];
                }
                s++;
            }
            size--;
        }else
            System.out.println("ERROR");
    }

    public boolean isEmpty(){
        //FIXED by ball lastest 590831 0049
        return !(size > 0);
        //return (capacity == 0 || arr.length == 0);
    }

    public int getSize(){
        // FIXED by ball lasted 590831 0236
        return size;
    }

    public void printStructure(){
        // FIXED by ball
        System.out.print("Size = " + size + ", Cap = " + capacity + ", arr = [ ");
        for (int i=0;i<size;i++){
            if(arr[i]>0) {
                System.out.print(arr[i]);
                if(i < size-1)
                    System.out.print(",");
            }
        }
        System.out.println(" ]");
    }

}
