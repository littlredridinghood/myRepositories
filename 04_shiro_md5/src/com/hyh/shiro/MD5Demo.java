package com.hyh.shiro;

import org.apache.shiro.crypto.hash.Md5Hash;

public class MD5Demo {
	public static void main(String[] args) {
		Md5Hash md5 = new Md5Hash("1111");
		System.out.println("加密后="+md5);
		md5 = new Md5Hash("1111", "hyh");
		System.out.println("加盐后="+md5);
		md5 = new Md5Hash("1111", "hyh", 2);
		System.out.println("迭代后="+md5);
	}
}
