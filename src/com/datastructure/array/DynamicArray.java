package com.datastructure.array;

public class DynamicArray {

    int arr[];
    int size;
    int count;

    public DynamicArray() {
        this.arr = new int[1];
        count = 0;
        size = 1;
    }

    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();

        da.add(1);
        da.add(2);
        da.add(3);
        da.add(4);
        da.add(5);
        da.add(6);
        da.add(7);
        da.add(8);
        da.add(9);
        System.out.println("elements Array");
        for (int i = 0; i < da.size; i++) {
            System.out.print(da.arr[i] + " ");
        }

        System.out.println();

        // print size of array and no of element
        System.out.println("Size of array: " + da.size);
        System.out.println("No of elements in array: " +
                da.count);

    }

    public void add(int item) {
        if (count == size) {
            growSize();
        }
        arr[count] = item;
        count++;
    }

    public void addAt(int item, int index) {
        if (count == size) {
            growSize();
        }
        for (int i = count - 1; i >= index; i--) {
            arr[i + 1] = arr[i];

        }
        arr[index] = item;
        count++;
    }

    public void remove() {
        if (count > 0) {
            arr[count - 1] = 0;
            count--;
        }
    }

    public void shrinkSize() {

        int temp[] = null;
        if (count > 0) {
            temp = new int[count];
            for (int i = 0; i < count; i++) {
                temp[i] = arr[i];
            }
            size = count;
            arr = temp;
        }
    }


    public void removeAt(int index) {
        if (count > 0) {
            for (int i = index; i < count - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[count - 1] = 0;
            count--;
        }
    }

    private void growSize() {
        int tmp[] = null;
        if (count == size) {
            tmp = new int[size * 2];
            for (int i = 0; i < size; i++) {
                tmp[i] = arr[i];
            }
        }
        arr = tmp;
        size *= 2;
    }
}
