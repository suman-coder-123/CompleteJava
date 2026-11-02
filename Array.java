import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // int[] number = new int[5];

        // number[0] = 10;
        // number[1] = 20;
        // number[2] = 30;
        // number[3] = 40;
        // number[4] = 50;

        // System.out.println(number[0]);
        // System.out.println(number[1]);

        // for (int i=0; i<=4; i++){
        //     System.out.println(number[i]);
        // }


        // int[] arr = {11,22,33,44,55};


        //   for (int i=0; i<=4; i++){
        //     System.out.println(arr[i]);
        // }


        // Scanner sc = new Scanner(System.in);

        // int[] arr1 = new int[5];

        // for (int i=0; i<=4; i++) {
        //     System.out.println("enter elements : ");
        //     arr1[i] = sc.nextInt();
        // }
        // sc.close();

        // for (int i=0; i<=4; i++) {
        //     System.out.println(arr1[i]);
        // }


        // int sum =0;

        // for (int i=0; i<=4; i++) {
        //     sum = sum + arr1[i];
        // }

        // System.out.println(sum);


       // largest number of the array 
       // smallest number of the array 

       // count even odd in the array 
       // print the reverse array 



  
    //    int [][] arr = {
    //     {1,2,3},
    //     {4,5,6},
    //     {7,8,9},
    //    };

    //    System.out.println(arr[0][0]);
    //    System.out.println(arr[0][1]);
    //    System.out.println(arr[0][2]);
    //    System.out.println(arr[1][0]);
    //    System.out.println(arr[1][1]);
    //    System.out.println(arr[1][2]);
    //    System.out.println(arr[2][0]);
    //    System.out.println(arr[2][1]);
    //    System.out.println(arr[2][2]);


    //    for ( int i=0; i<arr.length; i++) {
    //     for (int j=0; j<arr[i].length; j++){
    //         System.out.print(arr[i][j] + " ");
    //     }
    //     System.out.println();
    //    }
       


    // Scanner sc = new Scanner(System.in);

    // System.out.println("enter no of rows");
    // int rows = sc.nextInt();

    // System.out.println("enter no of columns");
    // int cols = sc.nextInt();

    // int[][] arr = new int[rows][cols];

    // for (int i=0; i < rows; i++) {
    //     for (int j=0; j < cols; j++ ) {
    //         System.out.println("enter element [" + i + "] [" + j + "]");
    //         arr[i][j] = sc.nextInt();
    //     }
    // }

    // System.out.println("2D Array");

    // for (int i=0; i<rows ; i++){
    //     for (int j=0; j<cols; j++){
    //         System.out.print(arr[i][j] + " ");
    //     }
    //     System.out.println();
    // }


    // sc.close();


    // for (int i=0; i<rows ; i++){
    //     int sum =0;
    //     for(int j=0; j<cols; j++) {
    //         sum += arr[i][j];
    //     }
    //     System.out.println("row sum = " + sum);
    // }



    // for (int j=0; j<cols; j++) {
    //     int sum1 =0;
    //     for ( int i=0; i<rows; i++) {
    //         sum1  += arr[i][j];
    //     }
    //     System.out.println("column wise = " + sum1);
    // }


    // int[][]  arr = {
    //     {1,2,3},
    //     {4,5,6},
    //     {7,8,9},
    // };

    // for (int i=0; i<arr.length; i++) {
    //     System.out.println(arr[i][i]);
    // }


    // 7 8 9 
    // 4 5 6
    // 1 2 3


    // reverse the 2d array 
    // sum of the element 
    // largest no 
    // smallest no 
    // even odd 


/// length is not a method of array it is a property of array 

    // methods  array 

    // 1. length => to find the length of the array 

    // int[] arr = {10,20,3,4,5,7,8,9,};


    // int count = 0;

    // for(int num : arr) {
    //     count++;
    // }

    // System.out.println(count);


    // System.out.println(arr.length);


    //1. to convert the array  into string  => toString();

    // int[] arr = {1,2,3,4,5,6};

    // System.out.println(Arrays.toString(arr));

    // 2. sort into ascending order => sort()


    // int[] arr = {11,22,1,4,2,66,23,12};

    // Arrays.sort(arr);
   

    // System.out.println(Arrays.toString(arr));


    // 3. binarySearch() => to search the value in the array

    //  int[] arr = {11,22,1,4,2,66,23,12};

    //  Arrays.sort(arr);

    //  int index  = Arrays.binarySearch(arr, 22);

    //  System.out.println(index);



    // 4. equals => check two arrays contains the same elements in the same order 

    // int[] a = {10 , 20 , 30};
    // int[] b = {10 , 20 , 30};
    // int[] c = {10 , 30 , 20};

    // System.out.println(Arrays.equals(a,b));
    // System.out.println(Arrays.equals(b,c));


    // 5. fills() => fills every element with the same value  

    // int[] arr = new int[10];
    // // Arrays.fill(arr, 500);
    // Arrays.fill(arr, 1,3 , 8);

    // System.out.println(Arrays.toString(arr));



    //6.copyOf() => copy a array to new array 

    // int[] arr = {90,80,70,60};


    // // int[] copy = Arrays.copyOf(arr, 7 );
    // int[] copy = Arrays.copyOfRange(arr,1 , 4);

    // System.out.println(Arrays.toString(copy));


    // compares => 


        // int[] a = {10 , 20 , 30};
        // int[] b = {10 , 2 , 30};

        // System.out.println(Arrays.compare(b, a));



        // 7. mismatch => return the index of the first position of the differ


        
        // int[] a = {10 , 20 , 30};
        // int[] b = {10 , 2 , 30}; 


        // System.out.println(Arrays.mismatch(a,b));


        // parallelSort() => sort an array using paralele sorting , which can be useful for large array 


        // int[] arr = {11,23,3,56,78,90,12,45,6,8,9};

        // Arrays.parallelSort(arr);

        // System.out.println(Arrays.toString(arr));


        // stream()  => calculations => sum , minimum , maximum , average 


        // int[] arr = {10 , 20 , 30 , 40 , 50 , 60 , 70 , 80 , 90};

        // System.out.println(Arrays.stream(arr).sum());

        // System.out.println(Arrays.stream(arr).min().getAsInt());

        // System.out.println(Arrays.stream(arr).max().getAsInt());

        // System.out.println(Arrays.stream(arr).average().getAsDouble());


        // clone() => create a shallow copy of an array 


        // int[] arr = {10 , 20 , 30};

        // int[] copy = arr.clone();
        // copy[1] = 100;

        // System.out.println(Arrays.toString(copy));


        // deepToString => convert into readable format of 2d Array 

        // int[][] arr = {
        //     {10 , 20},
        //     {30 ,40},
        // };


        // System.out.println(Arrays.deepToString((arr)));


        // deepEquals => compare the nested array 


    //    int[][] arr = {
    //         {10 , 20},
    //         {30 ,40},
    //     };

    //     int[][] arr1 = {
    //         {11 , 20},
    //         {30 ,40},
    //     };


    //     System.out.println(Arrays.deepEquals(arr, arr1));



    int[] arr = {1,2,3,44,66,12,4,78,5};

    for (int i=0; i<arr.length; i++) {
        for (int j=i+1; j<arr.length; j++) {
            if (arr[i] > arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    System.out.println("Ascending order ; ");

    for (int i=0; i<arr.length; i++) {  
        System.out.print(arr[i] + " ");
    }


    // copy one array to another without method 

    // descending order 
















        

























    }
}
