package sai.learn.challenges;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class Challenge1 {
    static int xmin, ymin, xmax, ymax, n, direction, value, initialvalue;
//    static Integer[][] arr = {{1,5,8},{8,9,45},{89,27,56}};
    static {
        initialvalue = value = 100;
        direction = xmin = ymin = 0;
        xmax = ymax = n = 30;                        //Change this no only for n*n matrix
    }
    static Integer[][] arr = new Integer[n][n];


    public static void main(String[] args) {

        processArray();
        System.out.println();
        printArrayContent(arr);
    }

    private static void processArray() {
        while (true) {
            switch (direction % 4) {
                case 0:
                    printX_IncrementDirection();
                    break;
                case 1:
                    printY_IncrementDirection();
                    break;
                case 2:
                    printX_DecrementDirection();
                    break;
                case 3:
                    printY_DecrementDirection();
                    break;
            }
            direction++;
//            log.info("Value :"+value);
            if (value == (n * n) + initialvalue) {
                break;
            }
        }
    }

    private static void printX_IncrementDirection() {
        log.info("X Inc| xmax : {} | xmin : {} | ymax : {} | ymin : {}",xmax,xmin,ymax,ymin);
        for (int i = xmin; i < xmax; i++) {
            arr[ymin][i] = value++;
//            System.out.print(arr[ymin][i]+",");
//            value++;
        }
        ymin++;
    }

    private static void printY_IncrementDirection() {
        log.info("Y Inc| xmax : {} | xmin : {} | ymax : {} | ymin : {}",xmax,xmin,ymax,ymin);
        for (int i = ymin; i < ymax; i++) {
            arr[i][xmax - 1] = value++;
//            System.out.print(arr[i][xmax - 1]+",");
//            value++;
        }
        xmax--;
    }

    private static void printX_DecrementDirection() {
        log.info("X Dec| xmax : {} | xmin : {} | ymax : {} | ymin : {}", xmax, xmin, ymax, ymin);
        for (int i = xmax - 1; i >= xmin; i--) {
            arr[ymax - 1][i] = value++;
//            System.out.print(arr[ymax - 1][i]+",");
//            value++;
        }
        ymax--;
    }

    private static void printY_DecrementDirection() {
        log.info("Y Dec| xmax : {} | xmin : {} | ymax : {} | ymin : {}", xmax, xmin, ymax, ymin);
        for (int i = ymax - 1; i >= ymin; i--) {
            arr[i][xmin] = value++;
//            System.out.print(arr[i][xmin]+",");
//            value++;
        }
        xmin++;
    }

    private static void printArrayContent(Object[][] arr) {

        for (Object[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}
