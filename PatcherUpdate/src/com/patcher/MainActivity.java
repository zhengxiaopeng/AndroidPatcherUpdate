package com.patcher;

import android.app.Activity;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void click(View v)
	{
		new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				String oldApkPath = Environment.getExternalStorageDirectory() + "/old.apk";
				String newApkPath = Environment.getExternalStorageDirectory() + "/new.apk";
				String patchPath = Environment.getExternalStorageDirectory() + "/update_file.patch";
				PatcherUtils.patcher(oldApkPath, newApkPath, patchPath);
			}
		}).start();
	}

}
