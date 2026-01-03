package com.linkedlist.singlelinkedlist;

public class StudentRecordManagement {

    public static void main(String[] args) {

        StudentLinkedList list = new StudentLinkedList();

        list.addAtBeginning(1, "Saud", 20, 'A');
        list.addAtEnd(2, "Ashif", 21, 'B');
        list.addAtPosition(2, 3, "Naman", 19, 'A');

        System.out.println("All Students:");
        list.displayAll();

        System.out.println("\nSearching Roll No 2:");
        list.searchStudent(2);

        System.out.println("\nUpdating Grade of Roll No 2:");
        list.updateGrade(2, 'A');

        System.out.println("\nDeleting Roll No 1:");
        list.deleteByRollNo(1);

        System.out.println("\nFinal Student Records:");
        list.displayAll();
    }
}

