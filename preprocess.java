package com.example.demo;

public class preprocess {
    public String preprocess(String content) {
        // TODO: 实现论文内容的预处理操作
        return content.replaceAll("[\\p{Punct}]", "");
    }
}
