import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;

public class Main {

//sol-7 الدوال
        // دالة لحساب النقاط الإجمالية لكلمة المرور
        public int calculateTotalScore(String password) {
            return checkLength(password) + checkSpecialCharacters(password) + checkUpperCaseLowerCase(password);
        }

        // دالة للتحقق من الطول وإعطاء نقاط
        public int checkLength(String password) {
            int length = password.length();
            if (length >= 8) {
                return 3;
            } else if (length >= 6) {
                return 2;
            } else {
                return 0;
            }
        }

        // دالة للتحقق من وجود أحرف خاصة وإعطاء نقاط
        public int checkSpecialCharacters(String password) {
            if (password.matches(".*[!@#$%^&*()-+=<>?/].*")) {
                return 2;
            } else {
                return 0;
            }
        }

        // دالة للتحقق من وجود الأحرف الكبيرة والصغيرة وإعطاء نقاط
        public int checkUpperCaseLowerCase(String password) {
            boolean hasUpperCase = false;
            boolean hasLowerCase = false;

            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);
                if (Character.isUpperCase(ch)) {
                    hasUpperCase = true;
                }
                if (Character.isLowerCase(ch)) {
                    hasLowerCase = true;
                }
            }

            return (hasUpperCase && hasLowerCase) ? 3 : 0;
        }

        // دالة لطباعة تصنيف قوة كلمة المرور
        public void printPasswordStrength(int totalScore) {
            if (totalScore >= 8) {
                System.out.println("Password is strong.");
            } else if (totalScore >= 5) {
                System.out.println("Password is moderately strong.");
            } else {
                System.out.println("Password is weak.");
            }
        }


        //sol-8 الدوال
        public static void generateFibonacciSequence(int n) {
            System.out.println("Fibonacci sequence with " + n + " terms:");
            int firstTerm = 0, secondTerm = 1;

            for (int i = 1; i <= n; ++i) {
                System.out.print(firstTerm + " ");

                int nextTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = nextTerm;

            }
        }


    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

       //sol-1
        String[]words={ "cat", "dog", "red", "is", "am" };
        int maxLength = 0;

      // إيجاد طول الكلمة الأطول
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
            }
        }

      // طباعة الكلمات التي تطابق الطول الأطول
        for (String word : words) {
            if (word.length() == maxLength) {
                System.out.println(word);
            }
        }

        System.out.println();

        //sol-2
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(3);
        numbers.add(3);
        numbers.add(5);
        System.out.println("Original Array: \n" + numbers);

        // استخدم HashMap لتخزين عدد مرات تكرار كل عنصر
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int number : numbers) {
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }

        // طباعة نتائج التكرار لكل عنصر
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
        }

        System.out.println();

       //sol-3
        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(1);
        numbers2.add(4);
        numbers2.add(17);
        numbers2.add(7);
        numbers2.add(25);
        numbers2.add(3);
        numbers2.add(100);

        System.out.println("Original Array: " + numbers2);

        int k = 3;

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        for (int num : numbers2) {
            maxHeap.add(num);
        }

        System.out.print(k + " largest elements of the said array are: ");
        while (!maxHeap.isEmpty() && k > 0) {
            System.out.print(maxHeap.poll() + " ");
            k--;
        }
        System.out.println();


        //sol-4
        ArrayList<Integer> number3 =new ArrayList();
        number3.add(5);
        number3.add(4);
        number3.add(3);
        number3.add(2);
        number3.add(1);
        System.out.println("Original Array: \n"+ number3);

        Collections.reverse(number3);

        // طباعة العناصر المعكوسة بدون أقواس
        System.out.print("Reversed Array: \n");
        for (int num : number3) {
            System.out.print(num + " ");
        }


        System.out.println("\n");

        /*
        مدري وش المشكله مايطلع الاوت بوت الا لحاله اذا عرضت كل الاكواد يطلع ايرور
         انحلت المشكله يوم تركته اخر كود مايطلع ايرو نقلته للاخير ووقفته هنا
         */

        //sol-5

        Scanner input = new Scanner(System.in);
//        int[] array=null;
//        int size=0;
//
//        while (true) {
//            System.out.println("\nMenu:");
//            System.out.println("1. Accept elements of an array");
//            System.out.println("2. Display elements of an array");
//            System.out.println("3. Search the element within array");
//                    System.out.println("4. Sort the array");
//            System.out.println("5.Exit");
//                    System.out.print("Enter your choice: ");
//
//            int choice = input.nextInt();
//
//            switch (choice) {
//                case 1:
//                    System.out.print("Enter the size of the array: ");
//                    size = input.nextInt();
//                    array = new int[size];
//                    System.out.println("Enter the elements of the array:");
//                    for (int i = 0; i < size; i++) {
//                        array[i] = input.nextInt();
//                    }
//                    break;
//                case 2:
//                    if (array == null) {
//                        System.out.println("Array is empty. Please accept elements first.");
//                    } else {
//                        System.out.println("Elements of the array:");
//                        for (int i = 0; i < size; i++) {
//                            System.out.print(array[i] + " ");
//                        }
//                        System.out.println();
//                    }
//                    break;
//                case 3:
//                    if (array == null) {
//                        System.out.println("Array is empty. Please accept elements first.");
//                    } else {
//                        System.out.print("Enter the element to search: ");
//                        int elementToSearch = input.nextInt();
//                        boolean found = false;
//                        for (int i = 0; i < size; i++) {
//                            if (array[i] == elementToSearch) {
//                                System.out.println("Element found at index " + i);
//                                found = true;
//                                break;
//                            }
//                        }
//                        if (!found) {
//                            System.out.println("Element not found in the array.");
//                        }
//                    }
//                    break;
//                case 4:
//                    if (array == null) {
//                        System.out.println("Array is empty. Please accept elements first.");
//                    } else {
//                        for (int i = 0; i < size - 1; i++) {
//                            for (int j = 0; j < size - i - 1; j++) {
//                                if (array[j] > array[j + 1]) {
//                                    int temp = array[j];
//                                    array[j] = array[j + 1];
//                                    array[j + 1] = temp;
//                                }
//                            }
//                        }
//                        System.out.println("Sorted array:");
//                        for (int i = 0; i < size; i++) {
//                            System.out.print(array[i] + " ");
//                        }
//                        System.out.println();
//                    }
//                    break;
//                case 5:
//                    System.out.println("Exiting the program.");
//                    System.exit(0);
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//
//            }
//        }


        //sol-6

        Random random = new Random();

        System.out.print("Enter the minimum value of the range: ");
        int min = input.nextInt();

        System.out.print("Enter the maximum value of the range: ");
        int max = input.nextInt();

        System.out.print("Enter the number of random numbers to generate: ");
        int count = input.nextInt();

        System.out.print("Random numbers within the specified range: ");
        for (int i = 0; i < count; i++) {
            int randomNumber = random.nextInt(max - min + 1) + min;
            System.out.print(randomNumber);

            // إضافة الشرطة إذا لم يكن الرقم هو الأخير
            if (i < count - 1) {
                System.out.print(" - ");

            }
        }  input.nextLine();
        //sol-7 الميثود في الكلاس الاساسي

        Main checker = new Main();
        System.out.println();
        System.out.print("Enter a password: ");
        String password = input.nextLine();

        // حساب النقاط الإجمالية لكلمة المرور وتصنيف قوتها
        int totalScore = checker.calculateTotalScore(password);
        checker.printPasswordStrength(totalScore);


        //sol-8 الميثود في الكلاس الاساسي

        System.out.println("Enter the number of Fibonacci terms to generate: ");
        int n = input.nextInt();

        generateFibonacciSequence(n);


        //sol-5
        int[] array=null;
        int size=0;
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Accept elements of an array");
            System.out.println("2. Display elements of an array");
            System.out.println("3. Search the element within array");
                    System.out.println("4. Sort the array");
            System.out.println("5.Exit");
                    System.out.print("Enter your choice: ");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the size of the array: ");
                    size = input.nextInt();
                    array = new int[size];
                    System.out.println("Enter the elements of the array:");
                    for (int i = 0; i < size; i++) {
                        array[i] = input.nextInt();
                    }
                    break;
                case 2:
                    if (array == null) {
                        System.out.println("Array is empty. Please accept elements first.");
                    } else {
                        System.out.println("Elements of the array:");
                        for (int i = 0; i < size; i++) {
                            System.out.print(array[i] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    if (array == null) {
                        System.out.println("Array is empty. Please accept elements first.");
                    } else {
                        System.out.print("Enter the element to search: ");
                        int elementToSearch = input.nextInt();
                        boolean found = false;
                        for (int i = 0; i < size; i++) {
                            if (array[i] == elementToSearch) {
                                System.out.println("Element found at index " + i);
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Element not found in the array.");
                        }
                    }
                    break;
                case 4:
                    if (array == null) {
                        System.out.println("Array is empty. Please accept elements first.");
                    } else {
                        for (int i = 0; i < size - 1; i++) {
                            for (int j = 0; j < size - i - 1; j++) {
                                if (array[j] > array[j + 1]) {
                                    int temp = array[j];
                                    array[j] = array[j + 1];
                                    array[j + 1] = temp;
                                }
                            }
                        }
                        System.out.println("Sorted array:");
                        for (int i = 0; i < size; i++) {
                            System.out.print(array[i] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");

            }
        }
    }
}