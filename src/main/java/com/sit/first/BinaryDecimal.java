package com.sit.first;

public class BinaryDecimal {
	public static void main(String[] args) {
        
    }

    public static int convertBinaryToDecimal(long num)
    {
        int decimalNumber = 0, i = 0;
        long remainder;
        while (num != 0)
        {
            remainder = num % 10;
            num /= 10;
            decimalNumber += remainder * Math.pow(2, i);
            ++i;
        }
        return decimalNumber;
    }
}
