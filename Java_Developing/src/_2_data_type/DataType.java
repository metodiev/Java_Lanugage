package _2_data_type;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.Format;
import java.util.function.DoubleToLongFunction;

import javax.xml.bind.helpers.DefaultValidationEventHandler;

public class DataType {

	/***
	 * Java has eight primitive types: byte, short, int, long, char, float, double, boolean
	 * 
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		System.out.println("Java eight primitive types: Their Max and Min values: ");
		
		byte byteMinNumber = Byte.MIN_VALUE;
		byte byteMaxNuber = Byte.MAX_VALUE;
		
		short shortMinNumber = Short.MIN_VALUE;
		short shortMaxNumber = Short.MAX_VALUE;
		
		int intMinNumber = Integer.MIN_VALUE;
		int intMaxNumber = Integer.MAX_VALUE;
		
		long longMinNumber = Long.MIN_VALUE;
		long longMaxNumber = Long.MAX_VALUE;
		
		float floatMinNumber = Float.MIN_VALUE;
		float floatMAxNumber = Float.MAX_VALUE;
		
		double doubleMinValue = Double.MIN_VALUE;
		double doubleMaxValue = Double.MAX_VALUE;
		double doubleNormalValue = Double.MIN_NORMAL;
		
		BigInteger bigInt = new BigInteger("151516516515616516515665");
		BigInteger bigIntValueOF = BigInteger.valueOf(intMinNumber);
		
		bigInt.add(bigIntValueOF);//Sum big int
		bigInt.multiply(bigIntValueOF); //multiple by big Int
		bigInt.negate();
		
		BigDecimal bigDecimal = new BigDecimal("1515115.55454545115");
		BigDecimal bigDecimalNumber = BigDecimal.valueOf(intMinNumber);
		bigDecimal.add(bigDecimalNumber);
		
		Format formatter = new DecimalFormat("##.####");
		String decimalNumber = formatter.format(151151.15151);
		System.out.println(decimalNumber);
		
		
		
		
		System.out.println(doubleMinValue);
		
		//assign hex value 
		
		int intHexValue = 0X2f;
		System.out.println(intHexValue);
		
		boolean boolValue = true;
		
		Boolean boolVar = new Boolean(true);
		System.out.println(boolVar.valueOf(false));
		
		String isTrue = "true";
		boolean isTrueBool = Boolean.parseBoolean(isTrue);
		System.out.println(isTrueBool);
		boolean[] boolArr = new boolean [] {true, false, false};
		
		char charValue = '\u0000';
		

	}

}
