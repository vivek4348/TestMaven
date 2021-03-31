/*
 * package com.vivek;
 * 
 * import java.io.BufferedReader; import java.io.DataInputStream; import
 * java.io.FileInputStream; import java.io.InputStreamReader; import
 * java.util.Date;
 * 
 * public class TestMain {
 * 
 * public static void main(String[] args) {
 * 
 * long nanSec = 95659890850860l; long startMillis = (nanSec/1000000);
 * System.out.println(new Date( startMillis ));
 * 
 * 
 * 
 * String file =
 * "C:\\Projects\\Exostar\\Temp\\IAM_BAID_API\\log\\authnService.log"; String
 * word1 = "Invoking verifyByPwd"; String word2 =
 * "Completed Step 1:  AuthnSessTokenRequestHelper.buildFromHttpRequest"; String
 * word3 = "Completed Step 2:  toAuthenticationCtxt"; String word4 =
 * "Completed Step 3:  processAuthnRequestInfoCreds"; String word5 =
 * "Completed Step 4:  updateLastUseIfNeeded"; String word6 =
 * "Completed Step 5:  verifyAndAddLoginPostPwd"; String word7 =
 * "Completed Step 6:  getChangedHeaders";
 * 
 * 
 * 
 * String word8 = "USER_STUB.LOGIN_REF=?"; String word9 = "USER_STUB.ID IN";
 * String word10 = "USER_LOGIN.USER_ID=?"; String word11 =
 * "ENTITY_ATTRIBUTES.ATTRIB_NAME=?"; String word12 =
 * "USER_SP_SUBSCRIPTION.USER_ID=?";
 * 
 * String word13 = "verifyAndAddPwdCred"; String word14 =
 * "BaidAuthnProvider - Calling getUserAuthnProfile"; String word18 =
 * "BaidAuthnProvider - Got DataSources getUserAuthnProfile"; String word15 =
 * "BaidAuthnProvider - Got SpUser from getUserAuthnProfile"; String word16 =
 * "BaidAuthnProvider - Calling populateUserProfile"; String word17 =
 * "BaidAuthnProvider - Got baidUserAcct";
 * 
 * 
 * String word21 = "-verifyAndAddPwdCred- Step1"; String word22 =
 * "-verifyAndAddPwdCred- Step2"; String word23 = "-verifyAndAddPwdCred- Step3";
 * String word24 = "-verifyAndAddPwdCred- Step4"; String word25 =
 * "-verifyAndAddPwdCred- Step5";
 * 
 * 
 * System.out.println(" Number Of Occurences Of  " + word1 +" : " +
 * countStringInFile(word1, file));
 * System.out.println(" Number Of Occurences Of  " + word2 +" : " +
 * countStringInFile(word2, file));
 * System.out.println(" Number Of Occurences Of  " + word3 +" : " +
 * countStringInFile(word3, file));
 * System.out.println(" Number Of Occurences Of  " + word4 +" : " +
 * countStringInFile(word4, file));
 * System.out.println(" Number Of Occurences Of  " + word5 +" : " +
 * countStringInFile(word5, file));
 * System.out.println(" Number Of Occurences Of  " + word6 +" : " +
 * countStringInFile(word6, file));
 * System.out.println(" Number Of Occurences Of  " + word7 +" : " +
 * countStringInFile(word7, file));
 * 
 * System.out.println(" Number Of Occurences Of  " + word8 +" : " +
 * countStringInFile(word8, file));
 * System.out.println(" Number Of Occurences Of  " + word9 +" : " +
 * countStringInFile(word9, file));
 * System.out.println(" Number Of Occurences Of  " + word10 +" : " +
 * countStringInFile(word10, file));
 * System.out.println(" Number Of Occurences Of  " + word11 +" : " +
 * countStringInFile(word11, file));
 * System.out.println(" Number Of Occurences Of  " + word12 +" : " +
 * countStringInFile(word12, file));
 * 
 * System.out.println(" Number Of Occurences Of  " + word13 +" : " +
 * countStringInFile(word13, file));
 * System.out.println(" Number Of Occurences Of  " + word14 +" : " +
 * countStringInFile(word14, file));
 * System.out.println(" Number Of Occurences Of  " + word18 +" : " +
 * countStringInFile(word18, file));
 * System.out.println(" Number Of Occurences Of  " + word15 +" : " +
 * countStringInFile(word15, file));
 * System.out.println(" Number Of Occurences Of  " + word16 +" : " +
 * countStringInFile(word16, file));
 * System.out.println(" Number Of Occurences Of  " + word17 +" : " +
 * countStringInFile(word17, file));
 * 
 * System.out.println(" Number Of Occurences Of  " + word21 +" : " +
 * countStringInFile(word21, file));
 * System.out.println(" Number Of Occurences Of  " + word22 +" : " +
 * countStringInFile(word22, file));
 * System.out.println(" Number Of Occurences Of  " + word23 +" : " +
 * countStringInFile(word23, file));
 * System.out.println(" Number Of Occurences Of  " + word24 +" : " +
 * countStringInFile(word24, file));
 * System.out.println(" Number Of Occurences Of  " + word25 +" : " +
 * countStringInFile(word25, file));
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * System.out.println(
 * ZonedDateTime.now().format(DateTimeFormatter.ISO_INSTANT)); DateTimeFormatter
 * formatter = new DateTimeFormatterBuilder().appendInstant(3).toFormatter();
 * for (;;) { String format = ZonedDateTime.now().format(formatter);
 * if(format.contains("00Z")) { System.out.println(format); }
 * 
 * } }
 * 
 * 
 * public static int countStringInFile(String stringToLookFor, String fileName){
 * int count = 0; try{ FileInputStream fstream = new FileInputStream(fileName);
 * DataInputStream in = new DataInputStream(fstream); BufferedReader br = new
 * BufferedReader(new InputStreamReader(in)); String strLine; while ((strLine =
 * br.readLine()) != null) { int startIndex = strLine.indexOf(stringToLookFor);
 * if (startIndex != -1) { count++; } } in.close(); }catch (Exception e){//Catch
 * exception if any System.err.println("Error: " + e.getMessage()); } return
 * count; }
 * 
 * }
 */