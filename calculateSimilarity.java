package com.example.demo;

import org.apache.commons.text.similarity.JaccardSimilarity;

public class calculateSimilarity {
    public double CalculateSimilarity(String paperContent, String databaseContent) {
        JaccardSimilarity js=new JaccardSimilarity();
        return js.apply(paperContent, databaseContent);
    }
}
