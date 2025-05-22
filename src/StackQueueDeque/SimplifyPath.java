package StackQueueDeque;

import java.util.Stack;

public class SimplifyPath {

	public String simplifyPath(String path) {

		String[] split = path.split("/+");

		Stack<String> stack = new Stack<String>();

		for (int i = 1; i < split.length; i++) {

			if (split[i].equals(".")) {

			} else if (split[i].equals("..")) {

				if (stack.isEmpty()) {

				} else {
					stack.pop();
				}

			}

			else {
				stack.push(split[i]);
			}

		}
		StringBuilder stringBuilder = new StringBuilder();

		if (stack.isEmpty()) {

			stringBuilder.append("/");
			return stringBuilder.toString();
		}

		for (String temp : stack) {

			stringBuilder.append("/");
			stringBuilder.append(temp);

		}

		return stringBuilder.toString();

	}

	public String simplifyPath2(String path) {

		Stack<String> stack = new Stack<String>();
		String[] split = path.split("/+");

		// Time o(n) space =o(n) spacec o(n)+o(n)=o(2n)=0(n) çünkü big o notasyonunda
		// katsayılar önemsizdir Big-O notasyonu, asıl büyüme oranını ölçer,
		for (String temp : split) {

			if (temp.equals("..")) {

				if (!stack.isEmpty()) {

					stack.pop();
				}

			} else if (!temp.equals("") && !temp.equals(".")) {

				stack.push(temp);

			}

		}

		// Bu metot string stackleri birleşmesini sağlar
		return "/" + String.join("/", stack);
	}

	public static void main(String[] args) {

		String path = "/home/";
		String path1 = "/home//foo/";
		String path2 = "/home/user/Documents/../Pictures";
		String path3 = "/../";
		String path4 = "/.../a/../b/c/../d/./";
		String path5 = "/a/../../b/../c//.//";

		SimplifyPath simplifyPath = new SimplifyPath();

		System.out.println(simplifyPath.simplifyPath(path5));

		System.out.println(simplifyPath.simplifyPath(path));
		System.out.println(simplifyPath.simplifyPath(path1));
		System.out.println(simplifyPath.simplifyPath(path2));
		System.out.println(simplifyPath.simplifyPath(path3));
		System.out.println(simplifyPath.simplifyPath(path4));

	}

}
