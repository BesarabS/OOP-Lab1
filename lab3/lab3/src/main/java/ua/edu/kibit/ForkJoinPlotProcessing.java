package ua.edu.kibit;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinPlotProcessing {
    public static void main(String[] args) {
        int size= 15_000_000;
        double[] array = new double[size];
        double step = 15.0 / size;

        for (int i = 0; i < size; i++) {
            array[i] = -10 + i * step;
        }

        long startTime=System.currentTimeMillis();

        ForkJoinPool pool = new ForkJoinPool();

        pool.invoke(new CalculatePlotTask(array, 0, array.length, new MyTrigonometricFunction()));

        long endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime) + " ms");

        PlotDisplayer.showChart(array, step);
    }
}
