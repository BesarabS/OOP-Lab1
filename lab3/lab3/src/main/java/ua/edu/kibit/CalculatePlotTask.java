package ua.edu.kibit;

import java.util.concurrent.RecursiveAction;

public class CalculatePlotTask extends RecursiveAction {
    private static final int THRESHOLD = 1000;
    private final double[] array;

    private final int start;
    private final int end;
    private Calculable function;

    public CalculatePlotTask(double[] array,
                             int start,
                             int end,
                             Calculable function) {
        this.array = array;
        this.start = start;
        this.end = end;
        this.function = function;
    }

    @Override
    protected void compute() {
        if (end - start <= THRESHOLD) {
            for(int i = start; i< end; i++) {
                array [i] = function.calculate(array[i]);
            }
        } else {
            int mid = (start + end)/ 2;
            CalculatePlotTask leftTask = new CalculatePlotTask(array, start, mid, function);
            CalculatePlotTask rightTask = new CalculatePlotTask(array, mid, end, function);
            invokeAll(leftTask, rightTask);
        }
    }
}
