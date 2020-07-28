package aq_concurrency;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.LongAdder;

public class B_ConcurrentHashmap {
	public static void main(String[] args) {
		String aString = "I am a very good boy. I like to do good work. Ha Ha Ha";

		ConcurrentHashMap<Character, LongAdder> concurrentHashMap = new ConcurrentHashMap<>();

		for (char character : aString.toCharArray()) {
			concurrentHashMap.computeIfAbsent(character, chr -> new LongAdder()).increment();
		}

		System.out.println(concurrentHashMap);
		
		
		CopyOnWriteArrayList<E>
	}
}
