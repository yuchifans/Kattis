package com.siqi.kattis;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Date;

public class TryFile {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		File dirObject = new File("C:/test");
		File fileObject = new File(dirObject, "test.txt");
		try {

			if (!dirObject.isDirectory()) {
				dirObject.mkdir();
			}

			if (!fileObject.exists()) {
				fileObject.createNewFile();
			} else {
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("You can " + (fileObject.canRead() ? "" : "not") + "read " + fileObject);
		System.out.println("You can " + (fileObject.canWrite() ? "" : "not") + "write " + fileObject);
		System.out.println(fileObject.getName());
		System.out.println(fileObject.getAbsolutePath());
		System.out.println("The parent of " + dirObject.getName() + " is " + dirObject.getParent());
		File[] contents = dirObject.listFiles();
		if (contents != null) {
			System.out.println("\nThe " + contents.length + " items in the directory " + dirObject.getName() + " are ");
			for (int i = 0; i < contents.length; i++) {
				System.out.println(contents[i] + " is a" + (contents[i].isDirectory() ? " directory" : " file. ")
						+ "last modified " + new Date(contents[i].lastModified()));
			}
		}
		byte[] info = { 12, 34, 56, 78, 22, 53, 28, 90 };
		int[] intArray = { 10, 20, 30, 40, 50, 60 };
		float[] floatArray = { 11.0f, 22.0f, 33.0f, 44.0f, 55.0f };
		try {
			FileOutputStream outputFile = new FileOutputStream(fileObject, true);
			OutputStreamWriter outwri = new OutputStreamWriter(outputFile,"UTF-8");
			for (byte b : info) {
				System.out.println(b+"");
				outwri.write(b+"");
			}
			// for (int i=0;i<info.length;i++) {
			// outwri.write(info[i]);
			// }
			outwri.flush();
			outwri.close();
			outputFile.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			FileOutputStream outputFile = new FileOutputStream(fileObject, true);
			DataOutputStream dataStream = new DataOutputStream(outputFile);
			for (int i :intArray) {
				dataStream.writeUTF(i+"");
			}
			for (float f :floatArray) {
				dataStream.writeUTF(f+"");
			}
			dataStream.flush();
			dataStream.close();
			outputFile.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
