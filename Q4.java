package Hw1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) throws IOException {
		FileWriter fw;
		Scanner sc = new Scanner(System.in);
		double n = 0;

		while (n < 1) {
			System.out.println("Enter number of columns(at least 1)");// get input from user (number of columns)
			n = sc.nextInt();
		}
		sc.close();
		
		fw = new FileWriter("q4_Css.css");
		fw.write("div {\r\n" + "  width:"+1550/n+"px;\r\n" + "  height:825px;\r\n" + "  margin:"+1550/n+"px;\r\n"
				+ "  margin-top:-5px;\r\n" + "}\r\n" + ".blue{\r\n" + "	background-color:blue;\r\n" + "}\r\n"
				+ ".red{\r\n" + "	background-color:red;\r\n" + "}\r\n" + ".green{\r\n"
				+ "	background-color:green;\r\n" + "}");
		fw.close();

		fw = new FileWriter("q4_html.html");
		fw.write("<html>\r\n" + "    <title>\r\n" + "		Q1\r\n" + "    </title>\r\n"
				+ "	<link rel=\"stylesheet\" type=\"text/css\" href=\"q4_Css.css\">\r\n"
				+ "	<div class=\"blue\" style=\"margin:-10px;\"/>");
		for (int i = 1; i < n; i++) {
			if (i % 3 == 1)
				fw.write("	<div class=\"red\" />\r\n");
			else if (i % 3 == 2)
				fw.write("	<div class=\"green\">\r\n");
			else
				fw.write("	<div class=\"blue\"/>\r\n");
		}
		fw.write("/<html>\r\n");
		fw.close();
	}
}
