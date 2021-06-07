import java.util.ArrayList;

public class BasicJava {
    public static void main(String[] args) {
        int[] arr = {1,3,5,8,9,13};
        shiftValues(arr);
    }

    public static void printNums() {
        for (int i=1; i<=255; i++) {
            System.out.println(i);
        }
    }

    public static void printSums() {
        int sum = 0;
        for (int i=0; i<=255; i++) {
            sum+=i;
            System.out.println(String.format("New number: %d Sum: %d", i, sum));
        }
    }

    public static void iterateArray(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void iterateArray(String[] arr) {
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void printMax(int[] arr) {
        int max = arr[0];
        for (int i=0; i<arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public static void printAverage(int[] arr) {
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            sum+= arr[i];
        }
        System.out.println(sum/arr.length);
    }

    public static ArrayList<Integer> getOdds(int[] arr) {
        ArrayList<Integer> odds = new ArrayList<Integer>();
        for (int i=1; i<=255; i++) {
            if (i%2 != 0) {
                odds.add(i);
            }
        }
        return odds;
    }

    public static int getGreaterThan(int[] arr, int x) {
        int num = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] > x) {
                num++;
            }
        }
        return num;
    }

    public static void squareValues(int[] arr) {
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for (int i=0; i<arr.length; i++) {
            newArr.add((int) Math.pow(arr[i], 2));
        }
        System.out.println(newArr);
    }

    public static void removeNegatives(int[] arr) {
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for (int i=0; i<arr.length; i++) {
            if (arr[i] < 0) {
                newArr.add(0);
            } else {
                newArr.add(arr[i]);
            }
        }
        System.out.println(newArr);
    }

    public static int[] maxMinAvg(int[] arr) {
        int maximum = arr[0];
        int minimum = arr[0];
        int sum = 0;
        int[] result = new int[3];

        for (int i=0; i<arr.length; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
            sum+= arr[i];
        }
        int average = sum / arr.length;

        result[0] = maximum;
        result[1] = maximum;
        result[2] = average;

        return result;
    }

    public static int[] shiftValues(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i=0; i<arr.length; i++) {
            if (i==arr.length-1) {
                newArr[i] = 0;
            } else {
                newArr[i] = arr[i+1];
            }
        }

        return newArr;
    }
}