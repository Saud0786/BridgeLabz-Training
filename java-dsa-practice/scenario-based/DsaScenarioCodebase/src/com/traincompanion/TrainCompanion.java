package com.traincompanion;

public class TrainCompanion {

    private Compartment head;
    private Compartment tail;

    // Add compartment at end
    public void addCompartment(String name) {
        Compartment newCompartment = new Compartment(name);

        if (head == null) {
            head = tail = newCompartment;
        } else {
            tail.next = newCompartment;
            newCompartment.prev = tail;
            tail = newCompartment;
        }
    }

    // Remove a compartment by name
    public void removeCompartment(String name) {
        Compartment current = head;

        while (current != null) {
            if (current.name.equalsIgnoreCase(name)) {

                if (current == head) {
                    head = current.next;
                    if (head != null) head.prev = null;
                } else if (current == tail) {
                    tail = current.prev;
                    tail.next = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }

                System.out.println("Removed compartment: " + name);
                return;
            }
            current = current.next;
        }
        System.out.println("Compartment not found!");
    }

    // Traverse forward
    public void traverseForward() {
        Compartment current = head;
        System.out.print("Forward: ");
        while (current != null) {
            System.out.print(current.name + " <-> ");
            current = current.next;
        }
        System.out.println("END");
    }

    // Traverse backward
    public void traverseBackward() {
        Compartment current = tail;
        System.out.print("Backward: ");
        while (current != null) {
            System.out.print(current.name + " <-> ");
            current = current.prev;
        }
        System.out.println("START");
    }

    // Show adjacent compartments
    public void showAdjacent(String name) {
        Compartment current = head;

        while (current != null) {
            if (current.name.equalsIgnoreCase(name)) {
                System.out.println("\nCurrent Compartment: " + current.name);
                System.out.println("Previous: " +(current.prev != null ? current.prev.name : "None"));
                System.out.println("Next: " +
                        (current.next != null ? current.next.name : "None"));
                return;
            }
            current = current.next;
        }
        System.out.println("Compartment not found!");
    }
}
