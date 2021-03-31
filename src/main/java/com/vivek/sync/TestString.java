package com.vivek.sync;

public class TestString {

	public static void main(String[] args) {
		String str = "x-xo-authn-session-token=eyJhbGciOiJBMTI4S1ciLCJlbmMiOiJBMTI4R0NNIiwia2lkIjoic2E5OTk5OSJ9.bjXw-Z4BACdQcPwZBtpxxNU49rKCQCTe.JXYL7PkbfAegaVCI.mocTZ8-KqdlLss147PGD6WZiRcksH0hgURqDeSVlTs9n33QTGQhzAdPEpB-UL1nq6sWB10ZDPGojjQfslEKJlH2kWrgYc-4I6U0RF4CmXTHi7KhmpaYnq2RMiN9q3psWHf1piTs_Z-3HIJhRayT4vOaJ2TxzfgeBX2wC0W8Vh8SFHkPw7Ve7FCsuvrxuZzxHqqHHW5hEx5EIDQ6ZGnotAeUNlruCKF4vmpMYMTEE2leqz3BJNfzqkt_W2lJROSA0PFZ1jpBsJJpHn9IOlk82nftKWSkurXRYDjeLpEx59CAAdrdjKzasBczovteZaD6iPNPBRJcHh2t_5pMcMmRLROO8fVYodn5SgHb9NfI4c0vubI5gHcZIydWm0ffBi49o.WiRa6mn1uc5qXAKXgFk-0g;Path=/;Secure; HttpOnly";
		
		String ast = str.substring(25);
		System.out.println(ast);
	}

}
