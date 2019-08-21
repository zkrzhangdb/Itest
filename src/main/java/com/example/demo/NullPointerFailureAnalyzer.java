package com.example.demo;
import org.springframework.boot.diagnostics.AbstractFailureAnalyzer;
import org.springframework.boot.diagnostics.FailureAnalysis;

public class NullPointerFailureAnalyzer extends AbstractFailureAnalyzer<NullPointerException>{
    @Override
    protected FailureAnalysis analyze(Throwable rootFailure, NullPointerException cause) {
        return new FailureAnalysis(cause.getMessage(), "Please check null pointer!", cause);
    }
}
