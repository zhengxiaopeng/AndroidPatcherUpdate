package com.patcher;

public class PatcherUtils
{
	static
	{
		System.loadLibrary("Patcher");
	}

	/**
	 * 调用patch-update.so库中的方法,合并apk
	 * 
	 * @param oldApkPath
	 *            旧apk所在地址
	 * @param newApkPath
	 *            新apk存放地址(/xxx/xxx.apk)
	 * @param patch
	 *            增量包存放地址
	 */
	public static native void patcher(String oldApkPath, String newApkPath, String patchPath);

}
