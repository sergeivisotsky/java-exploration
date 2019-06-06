package org.sergei.core;

public class ForceGarbageCollection {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        long memBefore, memAfter;

        Integer[] integers = new Integer[1_000];
        System.out.println("Total memory is: " + runtime.totalMemory());

        memBefore = runtime.freeMemory(); // Get free memory from the starting point
        System.out.println("Initial free memory: " + memBefore);

        runtime.gc(); // Garbage collection

        memAfter = runtime.freeMemory();
        System.out.println("Free memory after garbage collection: " + memAfter);

        for (int i = 0; i < 1_000; i++) {
            integers[i] = i;
        }

        memAfter = runtime.freeMemory();
        System.out.println("Free memory after allocation: " + memAfter);

        long memAlloc = memBefore - memAfter;
        System.out.println("Memory that was used by allocation process: " + memAlloc);

        for (int i = 0; i < 1_000; i++) { // Discard all the integers
            integers[i] = null;
        }

        runtime.gc();

        memAfter = runtime.freeMemory();
        System.out.println("Free memory after collection of discarded integers: " + memAfter);

    }

}
