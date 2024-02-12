package EncodingDecoding;

import org.apache.commons.codec.binary.Base64;

public class sampleStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Pridvi raj";
		byte[] encodeString = Base64.encodeBase64(str.getBytes());
		System.out.println("encoded strings:"+new String(encodeString));
		
		byte[] decodeString = Base64.decodeBase64(encodeString);
		System.out.println("decode strings:"+new String(decodeString));

	}

}
