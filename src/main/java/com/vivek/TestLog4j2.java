package com.vivek;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestLog4j2 {

	private static final Logger logger = LogManager.getLogger(TestLog4j2.class);
	
    public static void main(String[] args) {    	   
    	logger.debug("Perfomed Some Expensive Operation: {}", () -> performSomeExpensiveOperation());          
    }

	private static int performSomeExpensiveOperation() {
		try {
			System.out.println("Called performSomeExpensiveOperation");
			TimeUnit.SECONDS.sleep(5);
			Random rand = new Random();
			int  n = rand.nextInt(50) + 1;
			return n;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 1;
	}

}
