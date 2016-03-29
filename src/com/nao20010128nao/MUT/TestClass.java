package com.nao20010128nao.MUT;

import java.io.IOException;

import junit.framework.TestCase;

public class TestClass extends TestCase {
	static {
		// Pre-load classes
		Methods.class.toString();
		Resources.class.toString();
	}

	public void test_nao20010128nao_1() {
		System.out.println(Methods.deleteDecorations(Resources.testString));
		if (!Methods.deleteDecorations(Resources.testString).equals(Resources.result))
			throw new RuntimeException();
	}

	public void test_nao20010128nao_2() {
		System.out.println(Methods.deleteDecorations2(Resources.testString));
		if (!Methods.deleteDecorations2(Resources.testString).equals(Resources.result))
			throw new RuntimeException();
	}

	@Deprecated
	public void test_nao20010128nao_3() {
		System.out.println(Methods.deleteDecorations3(Resources.testString));
		if (!Methods.deleteDecorations3(Resources.testString).equals(Resources.result))
			throw new RuntimeException();
	}

	public void test_nao20010128nao_4() throws IOException {
		System.out.println(Methods.deleteDecorations4(Resources.testString));
		if (!Methods.deleteDecorations4(Resources.testString).equals(Resources.result))
			throw new RuntimeException();
	}

	public void test_nao20010128nao_5() throws IOException {
		System.out.println(Methods.deleteDecorations4(Resources.testString));
		if (!Methods.deleteDecorations5(Resources.testString).equals(Resources.result))
			throw new RuntimeException();
	}
}
