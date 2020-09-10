package com.amey.transaction;

import java.io.IOException;

import com.amey.IO.ReadInput;
import com.amey.IO.WriteOutput;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
		String fileString = "/Users/amey/publicis2.0/Transaction/transaction/log.csv";
		ReadInput.read(fileString);
		try {
			WriteOutput.printLog();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}