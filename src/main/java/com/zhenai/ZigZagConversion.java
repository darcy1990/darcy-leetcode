package com.zhenai;

public class ZigZagConversion {
    public String convert(String s, int nRows) {
    	if (nRows == 1) {
    		return s;
    	}
    	
        String[] strings = new String[nRows];
        for (int i = 0 ; i < strings.length ; i ++) {
        	strings[i] = ""; // clear to empty but not null
        }
        
        int index = 0;
        boolean flag = true; // true: forward and false: backward
        for (int i = 0 ; i < s.length() ; i ++) {
        	strings[index] = strings[index] + s.charAt(i);
        	
        	if (flag)
        	{
        		if (index == nRows - 1) {
        			index --;
        			flag = false;
        		}
        		else {
        			index ++;
        		}
        	}
        	else
        	{
        		if (index == 0) {
        			index ++;
        			flag = true;
        		}
        		else {
        			index --;
        		}
        	}
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < strings.length ; i ++) {
        	sb.append(strings[i]);
        }
        
        return sb.toString();
    }
}
