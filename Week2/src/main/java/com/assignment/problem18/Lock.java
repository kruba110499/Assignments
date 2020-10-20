package com.assignment.problem18;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.StampedLock;

public class Lock {
    static int counter=0;
	public static void main(String[] args) {
		StampedLock lock=new StampedLock();
		ExecutorService pool=Executors.newFixedThreadPool(2);
		Runnable increment=()->{
			long stamp=lock.writeLock();
			try {
				for(int ind=0;ind<5;ind++) {
					counter++;
				}
				System.out.println("Incrementing");
			}
			finally {
				System.out.println("unlock write");
				lock.unlock(stamp);
			}
		};
		Runnable readvalue=()->{
			long stamp=lock.readLock();
			try {
				System.out.println(counter);
				}
			finally {
				System.out.println("unlock read");
				lock.unlock(stamp);
			}
		};
		pool.submit(increment);
		pool.submit(increment);
		pool.submit(readvalue);
		pool.submit(increment);

	}

}
