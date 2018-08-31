package com.siqi.kattis;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class ANewAlphabet {

	 public static void main(String[] args) throws IOException {
	        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	        String[] newalphabet = {"@", "8", "(", "|)", "3", "#", "6", "[-]", "|", "_|", "|<", "1", "[]\\/[]", "[]\\[]", "0", "|D", "(,)", "|Z", "$", "']['", "|_|", "\\/", "\\/\\/", "}{", "`/", "2"};
	        HashMap<Character, String> transformtable = new HashMap<>();
	        int pos = 0;
	        int start = (int) 'a';
	        for (int i = start; i < start + newalphabet.length; i++) {
	        	transformtable.put((char) i, newalphabet[pos++]);   //fill in the transform table
	        } 
	        char[] data = reader.readLine().toLowerCase().toCharArray();//transform data into lower case
	        String textaftertransform = "";
	        for (char c : data) {
	            if (transformtable.containsKey(c)) {
	            	textaftertransform += transformtable.get(c); 
	            } else {
	            	textaftertransform += c;
	            }
	        }
	        System.out.println(textaftertransform);
	    }

}
