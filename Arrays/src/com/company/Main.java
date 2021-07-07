package com.company;

public class Main {

    static int[] add(int value, int[] array){
        int[] output = new int[(array.length)+1];
        for(int i =0; i < array.length;i++) {
            output[i] = array[i];
        }
        output[(array.length)] = value;
        return output;
    }


    static int[] pop(int[] array){
        int[] output = new int[(array.length)-1];
        for(int i =0; i < output.length;i++) {
            output[i] = array[i];
        }
        return output;
    }


    static int[] insert(int value, int position, int[] array){
        int[] output = new int[(array.length)+1];
        for(int i =0; i < array.length;i++) {
            if(i<position) {
                output[i] = array[i];
            }else{
                output[i+1] = array[i];
            }
            output[position] = value;
        }

        return output;
    }


    public static void main(String[] args) {

    }
}
