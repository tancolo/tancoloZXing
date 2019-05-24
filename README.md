# tancoloZXing
基于ZXing3.3.3 (zxing-core 3.3.3, zxing-android3.3.0)开源项目分析


# 用途
基于Google ZXing官方发布的zxing-3.3.3为基础。[Google ZXing](https://github.com/zxing/zxing/releases/tag/zxing-3.3.3)
- 解决AS导入android目录遇到的问题
- 分析Demo源码结构以及流程
- 自定义UI界面
- 扫码添加wifi
- 自动生成二维码

**如果有帮到你， 顺手Star是对我最大的鼓励, 感谢**

# 目录说明
## master分支
将之前的三个分支集合到master分支中的不同目录下：
### 1. zxing-original-app
原ZXing android项目的导入工程， 用于展示`ZXing3.3.3` Demo，无其他修改。
手动比对merge ZXing-3.3.3压缩包内的android目录以及当前工程的所有代码以及资源文件。

该工程没有直接使用ZXing core源码，而是使用引入方式！ 
注意，ZXing作者并没有更新[android-core版本到`3.3.3`](https://prnt.sc/nsmzgf)

```
compile 'com.google.zxing:core:3.3.3';
compile 'com.google.zxing:android-core:3.3.0';
```

### 2. zxing-app-debug
用于分析ZXing android app是如何工作。
- 代码调试
- 竖屏扫描探讨
- 测试定制扫码UI

### 3. tancolo-zxing-lib
用于定制zxing-lib扫码库， 未完成.

**其他分支已经废弃!!!**

# 分析文章
## CSDN专栏
- [Google ZXing系列讲解(一)——导入AS](http://blog.csdn.net/shrimpcolo/article/details/56286094)
- [Google ZXing系列讲解(二)——生成WIFi二维码](http://blog.csdn.net/shrimpcolo/article/details/56494504)
- [Google ZXing系列讲解(三)——ZXing 目录结构与主体流程](http://blog.csdn.net/shrimpcolo/article/details/57402440)
- [Google ZXing系列讲解(四)——ZXing 解决竖屏扫描问题](http://blog.csdn.net/shrimpcolo/article/details/58176308)
- [Google ZXing系列讲解(五)——ZXing 仿微信扫描UI](https://blog.csdn.net/shrimpcolo/article/details/59484615)

## 简书专栏
- [Google ZXing系列讲解(一)——导入AS](https://www.jianshu.com/p/85e0bdb8bd2c)
- [Google ZXing系列讲解(二)——生成WIFi二维码](https://www.jianshu.com/p/656d6f6f862e)
- [Google ZXing系列讲解(三)——ZXing 目录结构与主体流程](https://www.jianshu.com/p/de529919e4e9)
- [Google ZXing系列讲解(四)——ZXing 解决竖屏扫描问题](https://www.jianshu.com/p/b78a967e2ac7)
- [Google ZXing系列讲解(五)——ZXing 仿微信扫描UI](https://www.jianshu.com/p/cbc1239a9f6f)

