package com.ambulanceroute;
class AmbulanceRoute {
    private HospitalUnit head = null;

    // Add hospital unit
    public void addUnit(String name, boolean available) {
        HospitalUnit newUnit = new HospitalUnit(name, available);

        if (head == null) {
            head = newUnit;
            newUnit.next = head;
        } else {
            HospitalUnit temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newUnit;
            newUnit.next = head;
        }
    }

    // Find nearest available unit
    public void findAvailableUnit() {
        if (head == null) {
            System.out.println("No hospital units available.");
            return;
        }

        HospitalUnit temp = head;
        do {
            System.out.println("Checking: " + temp.unitName);
            if (temp.available) {
                System.out.println("Patient redirected to: " + temp.unitName);
                return;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println("No available units at the moment.");
    }

    // Remove unit under maintenance
    public void removeUnit(String unitName) {
        if (head == null) return;

        HospitalUnit curr = head;
        HospitalUnit prev = null;

        do {
            if (curr.unitName.equalsIgnoreCase(unitName)) {
                if (curr == head && curr.next == head) {
                    head = null;
                } else {
                    if (curr == head) {
                        HospitalUnit last = head;
                        while (last.next != head) {
                            last = last.next;
                        }
                        head = head.next;
                        last.next = head;
                    } else {
                        prev.next = curr.next;
                    }
                }
                System.out.println(unitName + " removed (under maintenance).");
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("Unit not found.");
    }

    // Display route
    public void displayRoute() {
        if (head == null) {
            System.out.println("Route is empty.");
            return;
        }

        HospitalUnit temp = head;
        System.out.print("Ambulance Route: ");
        do {
            System.out.print(temp.unitName + " → ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(Back to Emergency)");
    }
}