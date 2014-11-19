
#AndroidPatcherUpdate
```
Android增量更新工具，可实现程序补丁式更新。这个开源项目提供的功能使你可以在自己的Android程序中完成
差异包（需要更新的部分）与当前程序本身的合并，并生成新的Android程序（APK）。使得你可以不必下载整个
APK文件来完成程序的更新。

```
更多细节请参阅：http://blog.csdn.net/bbld_/article/details/38668507


----
##Usage
```
首先，你需要得到旧版和新版apk的差分文件，然后你就可以通过本项目实现的功能去与它合并，完成合并
的方法:调用PatcherUtils.patcher(oldApkPath,newApkPath,patchPath)即可以生成新apk文到指定的路径
中(newApkPath)。

引入自己项目时注意改jni里的方法名，例如：native方法在com.patcher包里的PatcherUtils类里，那么
你应该在jni目录里将 Patcher.c和Patcher.h的接口方法里改为Java_com_patcher_PatcherUtils_patcher
需注意的地方：com_patcher为你的native方法所在包名，Patcher为你的native方法所在类名，patcher为
你的native方法名。

如果导入项目且你的ndk配置正确时发现jni文件报错，你可以打开Problems调试窗口把jni代码里的错误提
示删除，重新编译生成.so文件即可，jni里的源码是可以正确生成.so文件的。

```

##License
```
Copyright 2014 Rocko.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
