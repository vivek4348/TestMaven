/*
 * package com.vivek;
 * 
 * import java.util.Date; import java.util.Random; import
 * java.util.concurrent.TimeUnit;
 * 
 * import org.apache.logging.log4j.LogManager; import
 * org.apache.logging.log4j.Logger;
 * 
 * import com.vivek.async.AsyncPrinter; import com.vivek.sync.SyncPrinter;
 * 
 * 
 * public class TestMaven {
 * 
 * private static final Logger logger = LogManager.getLogger();
 * 
 * 
 * public static void main8(String[] args) {
 * logger.trace("This is a trace message.");
 * logger.info("This is an info message.");
 * logger.debug("This is a debug message.");
 * logger.info("This is an info message.");
 * logger.warn("This is a warn message.");
 * logger.error("This is an error message.");
 * logger.fatal("This is a fatal message."); String host ="196.22.33.48"; int
 * port = 123; logger.debug("Host: {}", host); logger.info("Port: {}", port);
 * 
 * String upn = "vivekupn@evincible.com";
 * logger.info("User: {} Added to Database", upn);
 * logger.info("User: {} Added to Database", upn);
 * 
 * logger.warn("User: {} Did not select any SP", upn);
 * 
 * String sp ="tsp";
 * 
 * int a = 10; try { Integer x = null; ++x; } catch (Exception e) { logger.
 * error("Exception While getAllAuthorizationsOfServiceProviderForUser for user: {} serviceProvider: {}"
 * , upn, sp, e); }
 * 
 * 
 * }
 * 
 * public static void main3(String[] args) { int i = 1;
 * 
 * while(i<20000 ) { AsyncPrinter.print(i); SyncPrinter.print(i); i++; }
 * 
 * while (true) {
 * 
 * } }
 * 
 * public static void main(String[] args) { System.out.println("Before " + new
 * Date()); logger.debug("Request  getSecurityQuestions " + waitFor(10000));
 * //logger.debug("Perfomed Some Expensive Operation: {}", () ->
 * performSomeExpensiveOperation()); System.out.println("After " + new Date());
 * 
 * int a = 10; try { Integer x = null; ++x; } catch (Exception e) {
 * logger.error("Error reading configuration file {}", a, e); }
 * 
 * 
 * logger.debug("Response getSecurityQuestions"); }
 * 
 * private static String waitFor(int i) { try { Thread.sleep(i); } catch
 * (InterruptedException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); } return "WAITED"; }
 * 
 * private static int performSomeExpensiveOperation() { try {
 * System.out.println("Called performSomeExpensiveOperation");
 * TimeUnit.SECONDS.sleep(5); Random rand = new Random(); int n =
 * rand.nextInt(50) + 1; return n; } catch (InterruptedException e) { // TODO
 * Auto-generated catch block e.printStackTrace(); } return 1; }
 * 
 * }
 */