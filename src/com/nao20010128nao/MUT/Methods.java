package com.nao20010128nao.MUT;

import java.io.IOException;
import java.io.StringReader;

public final class Methods {
	public static String deleteDecorations(String decorated) {
		StringBuilder sb = new StringBuilder();
		char[] chars = decorated.toCharArray();
		int offset = 0;
		while (chars.length > offset) {
			if (chars[offset] == '§') {
				offset += 2;
				continue;
			}
			sb.append(chars[offset]);
			offset++;
		}
		return sb.toString();
	}

	public static String deleteDecorations2(String decorated) {
		StringBuilder sb = new StringBuilder(decorated.length());
		char[] chars = decorated.toCharArray();
		int offset = 0;
		while (chars.length > offset) {
			if (chars[offset] == '§') {
				offset += 2;
				continue;
			}
			sb.append(chars[offset]);
			offset++;
		}
		return sb.toString();
	}

	@Deprecated
	public static String deleteDecorations3(String decorated) {
		char[] chars = new char[decorated.length()];
		int offset = 0;
		int actLen = decorated.length();
		while (actLen > offset) {
			if (decorated.charAt(offset) == '§') {
				offset += 2;
				actLen -= 2;
				continue;
			}
			chars[offset] = decorated.charAt(offset);
			offset++;
		}
		return new String(chars, 0, actLen);
	}

	public static String deleteDecorations4(String decorated) throws IOException {
		StringReader sr = new StringReader(decorated);
		char[] chars = new char[decorated.length()];
		int cur = 0, offset = 0;
		while (-1 != (cur = sr.read())) {
			if (cur == '§') {
				sr.read();
				continue;
			}
			chars[offset++] = (char) cur;
		}
		return new String(chars, 0, offset);
	}

	public static String deleteDecorations5(String decorated) throws IOException {
		StringReader sr = new StringReader(decorated);
		StringBuilder sb = new StringBuilder();
		int cur = 0;
		while (-1 != (cur = sr.read())) {
			if (cur == '§') {
				sr.read();
				continue;
			}
			sb.appendCodePoint(cur);
		}
		return sb.toString();
	}
}
