package com.examproctor;
import java.util.HashMap;
import java.util.Stack;

class ExamProctor {

    private Stack<Integer> navigationStack;
    private HashMap<Integer, String> studentAnswers;
    private HashMap<Integer, String> correctAnswers;

    public ExamProctor() {
        navigationStack = new Stack<>();
        studentAnswers = new HashMap<>();
        correctAnswers = new HashMap<>();

        // Preloaded correct answers
        correctAnswers.put(1, "A");
        correctAnswers.put(2, "C");
        correctAnswers.put(3, "B");
        correctAnswers.put(4, "D");
    }

    // Track question navigation
    public void visitQuestion(int questionId) {
        navigationStack.push(questionId);
        System.out.println("Visited Question: " + questionId);
    }

    // Store student answer
    public void submitAnswer(int questionId, String answer) {
        studentAnswers.put(questionId, answer);
        System.out.println("Answer saved for Question " + questionId);
    }

    // View last visited question
    public void viewLastVisitedQuestion() {
        if (!navigationStack.isEmpty()) {
            System.out.println("Last visited question: " + navigationStack.peek());
        } else {
            System.out.println("No questions visited yet.");
        }
    }

    // Evaluate score using function
    public int evaluateScore() {
        int score = 0;

        for (int questionId : correctAnswers.keySet()) {
            if (studentAnswers.containsKey(questionId) &&
                studentAnswers.get(questionId).equals(correctAnswers.get(questionId))) {
                score++;
            }
        }
        return score;
    }
}
