/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraytasks;

import java.util.Arrays;

/**
 *
 * @author 92019179
 */
public class arrayTasks {

    private static int gradesArraySize = 5;
    private static int subjectsArraySize = 3;
    private static char[] studentGrades = new char[gradesArraySize];
    public static String[] subjectNames = new String[gradesArraySize];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //adding array elements
        studentGrades[0] = 'A';
        studentGrades[1] = 'B';
        studentGrades[2] = 'D';
        studentGrades[3] = 'F';
        System.out.println("Original grades array: ");
        displayCharArray(studentGrades);

        //TASK 1: as shifting indexes is not possible in arrays, creating new array to store grades 
        char[] newStudentGrades = new char[gradesArraySize];
        //TASK 1: as arrays are fixed size, creating new array to store subjects 
        String[] newSubjectsArray;
        //TASK 1: copying first 2 elements from original to final grades array
        System.arraycopy(studentGrades, 0, newStudentGrades, 0, 2);
        //TASK 1: adding missing grade to the middle of the array
        newStudentGrades[2] = 'C';
        //TASK 1: copying remaining elements from original to final grades array
        System.arraycopy(studentGrades, 2, newStudentGrades, 3, 2);

        //TASK 1: displaying final grades array
        System.out.println("Final grades array: ");
        displayCharArray(newStudentGrades);
        //displays array elements to the console for the given array of characters  

        //TASK 2: Adding array elements
        subjectNames[0] = "Mathmatics";
        subjectNames[1] = "PE";
        subjectNames[2] = "Dance";
        System.out.println("Number 2 element in the array is " + "[" + subjectNames[1] + "]");

        newSubjectsArray = Arrays.copyOf(subjectNames, 5);
        newSubjectsArray[3] = "English";
        newSubjectsArray[4] = "Fine Arts";
        //TASK 2: displaying final subjects array
        System.out.println("Final subjects array: ");
        for (int i = 0; i < newSubjectsArray.length; i++) {
            System.out.println(newSubjectsArray[i]);
        }
    }

    public static void displayCharArray(char[] arrayToDisplay) {
        for (int i = 0; i < arrayToDisplay.length; i++) {
            System.out.println(arrayToDisplay[i]);
        }
        System.out.println("\n");
    }
}
