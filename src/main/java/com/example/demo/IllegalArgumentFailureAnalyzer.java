package com.example.demo;
import com.sun.xml.internal.ws.api.server.AbstractServerAsyncTransport;
import org.springframework.boot.diagnostics.AbstractFailureAnalyzer;
import org.springframework.boot.diagnostics.FailureAnalysis;
public class IllegalArgumentFailureAnalyzer extends AbstractFailureAnalyzer<IllegalArgumentException>{
    @Override
    protected FailureAnalysis analyze(Throwable rootFailure, IllegalArgumentException cause) {
        return new FailureAnalysis(cause.getMessage(),"requesting.....",cause);
    }
}
