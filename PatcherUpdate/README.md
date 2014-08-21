AndroidPatcherUpdate
====================

Android增量更新工具

首先你需要生成旧版和新版apk的差分文件,然后调用方法
PatcherUtils.patcher(oldApkPath,newApkPath, patchPath);
即可以生成新apk文件。

引入自己项目时注意改jni里的方法名
例如：
native方法在com.patcher包里的PatcherUtils里那么对用的你应该在jni里的Patcher.c和Patcher.h的接口方法里都改成 Java_com_patcher_PatcherUtils_patcher。其中你只需注意com_patcher为你的native方法所在包名，Patcher为你的native方法所在类名，patcher为你的native方法名。

如果导入项目且你的ndk配置正确时发现jni文件报错，你可以打开调试里的Problems把jni代码里的错误提示删除，重新编译生成.so文件即可。jni里的源码是可以正确生成.so文件的。

see also：
http://blog.csdn.net/bbld_/article/details/38668507
