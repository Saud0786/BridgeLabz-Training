package com.callcenter;
import java.util.*;

public class CallCenterManager {

    // Regular customer queue
      Queue<Customer> regularQueue = new LinkedList<>();

    // VIP 
      PriorityQueue<Customer> vipQueue =
            new PriorityQueue<>(Comparator.comparingLong(c -> c.callTime));

    // Tracks call count per customer
      HashMap<String, Integer> callCountMap = new HashMap<>();

    // Incoming call
    public void receiveCall(Customer customer) {
        // Update call count
        callCountMap.put(customer.id,callCountMap.getOrDefault(customer.id, 0) + 1);

        // Route to appropriate queue
        if (customer.isVIP) {
            vipQueue.offer(customer);
        } else {
            regularQueue.offer(customer);
        }

        System.out.println("Call received from: " + customer.name);
    }

    // Serve next customer
    public void serveNextCall() {
        Customer customer;

        if (!vipQueue.isEmpty()) {
            customer = vipQueue.poll();
        } else if (!regularQueue.isEmpty()) {
            customer = regularQueue.poll();
        } else {
            System.out.println("No calls in queue.");
            return;
        }

        System.out.println("Serving customer: " + customer.name);
    }

    // Get number of calls this month
    public int getCallCount(String customerId) {
        return callCountMap.getOrDefault(customerId, 0);
    }
}
