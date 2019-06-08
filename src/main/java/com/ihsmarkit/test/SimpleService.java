package com.ihsmarkit.test;

import datadog.trace.api.Trace;
import io.opentracing.util.GlobalTracer;

import static java.lang.String.valueOf;

public class SimpleService {

    @Trace
    public int calculate(int a, int b){
        GlobalTracer.get().activeSpan()
                .setBaggageItem("first", valueOf(a))
                .setBaggageItem("second", valueOf(b));
        return trackCalculation(a, b);

    }
    @Trace
    public int trackCalculation(int a, int b) {
        return deepCalculation(a, b);
    }

    @Trace
    public int deepCalculation(int a, int b) {
        return a+b;
    }
}