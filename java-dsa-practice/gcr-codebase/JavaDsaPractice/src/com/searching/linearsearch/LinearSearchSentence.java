package com.searching.linearsearch;
public class LinearSearchSentence {
    // find Sentence
    public static String searchSentence(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence;
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sentences = {
            "Java is a powerful programming language",
            "Data structures are important",
            "Linear search is simple",
            "Practice makes a man perfect"
        };

        String word = "search";

        String result = searchSentence(sentences, word);
        System.out.println(result);
    }
}
