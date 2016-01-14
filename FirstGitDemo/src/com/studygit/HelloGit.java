package com.studygit;

import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class HelloGit {
	public static void main(String[] args) {
		System.out.println("HelloGit");
		//还原到了main方法原始版本：新增：
		showMemory();
		//新增显示系统属性方法
		showNativeSystem();
		//设置了origin等参数之后
	}
	
	public static void showMemory(){
		Long freeMem = Runtime.getRuntime().freeMemory();//单位是byte
		Long maxMem = Runtime.getRuntime().maxMemory();
		System.out.println("可用内存="+ freeMem/1024 + " KB" );
		System.out.println("最大内存="+ maxMem/1024 + " KB" );
	}
	public static void showNativeSystem(){
		Properties p = System.getProperties();
		Set<Entry<Object, Object>> set = p.entrySet();
		java.util.Iterator<Entry<Object, Object>> iter = set.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}
}
