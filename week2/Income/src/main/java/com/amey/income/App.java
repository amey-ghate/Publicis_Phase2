package com.amey.income;

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
		String filePathString = "/Users/amey/publicis2.0/Income/income/Sample_Input.csv";
		ReadInput.read(filePathString);
		try {
			WriteOutput.answerLog();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }
}