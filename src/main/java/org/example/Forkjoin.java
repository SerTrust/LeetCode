package org.example;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Forkjoin {
    static long time1, time2;
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        time1 = System.currentTimeMillis();
        System.out.println(Fibonacci(51));
        time2 = System.currentTimeMillis();
        System.out.println("所需時間="+((time2-time1)/1000.0)+"秒");

        time1 = System.currentTimeMillis();
        Fork fork = new Fork(51);
        ForkJoinPool.commonPool().execute(fork);
        System.out.println(fork.get());
        time2 = System.currentTimeMillis();
        System.out.println("所需時間="+((time2-time1)/1000.0)+"秒");

        time1 = System.currentTimeMillis();
        System.out.println(forFibonacci(51));
        time2 = System.currentTimeMillis();
        System.out.println("所需時間="+((time2-time1)/1000.0)+"秒");

    }

    public static long forFibonacci(int n){
        if(n<0) return 0;
        long[] arr = new long[n];
        arr[0] = 1;
        if(n>=2){
            arr[1] = 1;
            if(n>2){
                for (int i = 2; i < n; i++) {
                    arr[i] = arr[i - 1] + arr[i - 2];
                }
            }
        }
        return arr[n-1];
    }

    public static long Fibonacci(long n){
        if(n>2){
            return Fibonacci(n-1)+Fibonacci(n-2);
        }else{
            return 1;
        }
    }


}

class Fork extends RecursiveTask<Long>{
    final long n;

    public Fork(long n) {
        this.n = n;
    }

    @Override
    protected Long compute() {

        if(n<2) return n;
        Fork f1 = new Fork(n-1);
        f1.fork();
        Fork f2 = new Fork(n-2);
        return f2.compute()+f1.join();
    }
}