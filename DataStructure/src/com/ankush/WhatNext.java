package com.ankush;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class WhatNext {
	public static synchronized void myMethod(String[] argument3, File file) {
		String[] cmd = { "command", "argument 1", "argument 2" };
		PrintWriter fileWriter = null;
		Scanner fileScanner = null;
		try {
			for (int i = 0; i < argument3.length; i++) {
				fileWriter = new PrintWriter(new OutputStreamWriter(
						new FileOutputStream(file, true)));
				cmd[3] = argument3[i];
				if (i == 0) {
					fileWriter = new PrintWriter(new OutputStreamWriter(
							new FileOutputStream(file, false)));
				}
				Process p = Runtime.getRuntime().exec(cmd);
				fileScanner = new Scanner(p.getInputStream());

				while (fileScanner.hasNextLine()) {
					fileWriter.println(fileScanner.nextLine());
				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			fileWriter.close();
			fileScanner.close();
		}
	}
}
