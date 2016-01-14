package com.studygit;

import java.util.Date;

public class HelloGit {
	public static void main(String[] args) {
		System.out.println("HelloGit");
		//还原到了main方法原始版本：新增：
		showMemory();
	}
	
	public static void showMemory(){
		Long freeMem = Runtime.getRuntime().freeMemory();//单位是byte
		Long maxMem = Runtime.getRuntime().maxMemory();
		System.out.println("可用内存="+ freeMem/1024 + " KB" );
		System.out.println("最大内存="+ maxMem/1024 + " KB" );
	}
}
