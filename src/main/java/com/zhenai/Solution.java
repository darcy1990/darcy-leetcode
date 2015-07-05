package com.zhenai;

public class Solution {
    public int reverse(int x) {
    	int max = 1024 * 1024 * 1024 - 1;
    	
        int abs = Math.abs(x);
        
        int result = 0;
        
        while(abs > 0) {
        	int temp = result;
        	for (int i = 0 ; i < 9 ; i ++) {
        		result = result + temp;
        		if (result < 0) return 0;
        	}
        	result = result + abs % 10;
        	if (result < 0) return 0;
        	abs = abs /10;
        }
        
        return x > 0 ? result : 0 - result;
    }
}
