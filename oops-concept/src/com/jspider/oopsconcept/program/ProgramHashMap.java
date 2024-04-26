package com.jspider.oopsconcept.program;

import java.util.HashMap;
import java.util.Map;

public class ProgramHashMap {
public static void main(String[] args) {
	HashMap<Integer,String> hMap=new HashMap<Integer,String>();
	hMap.put(101,"prashant");
	hMap.put(102, "patil");
	hMap.put(103,"ingle");
	hMap.put(104, "nanded");
	System.out.println(hMap);

//	for (Map.Entry me : hMap.entrySet()) {
//		System.out.println(me.getKey()+"->"+me.getValue());
//	}
	
//	System.out.println(hMap.containsKey(104));
//	System.out.println(hMap.get(104));
//	System.out.println(hMap.isEmpty());
//	System.out.println(hMap.size());
	
}
}
