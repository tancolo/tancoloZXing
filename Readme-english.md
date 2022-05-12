# tancoloZXing
Analyze the open source project of ZXing3.3.3 (zxing-core 3.3.3, zxing-android3.3.0)


# Purpose
Depend on the lib zxing-3.3.3 which was released by [Google ZXing](https://github.com/zxing/zxing/releases/tag/zxing-3.3.3)
- Fixed the issues when the lib was imported into Android Studio.
- Analyzed the architecture of the lib source and the workflow.
- Customized the UI.
- Scaned QR code to add the WIFI.
- Created the QR code automaticaly.

**Please star it if my analysis is going to help you. Thanks**

# Description
## The Master Branch
I have assembled the previous three branches into different directories in the master branch.

### 1. zxing-original-app
Just show the demo of `ZXing3.3.3` with importing the original project of `ZXing android`.
Compared and merged the code and resource between the folder named android in the zip file `ZXing-3.3.3` and the current project.

This folder doesn't involve the source code of the `ZXing core`, but import the lib.
Note: the author of ZXing did not update the [android-core to v3.3.3](https://prnt.sc/nsmzgf)

```
compile 'com.google.zxing:core:3.3.3';
compile 'com.google.zxing:android-core:3.3.0';
```

### 2. zxing-app-debug
To analyze the workflow of this lib ZXing android app.
- to debug the code
- to explore the vertical scree scanning QR code.
- to test the code of customization scanning UI.

### 3. tancolo-zxing-lib
Used to customize zxing-lib code scanning library, not finished.


# Analysis Articles(Chinese)
## The column on CSDN
- [Google ZXing系列讲解(一)——导入AS](http://blog.csdn.net/shrimpcolo/article/details/56286094)
- [Google ZXing系列讲解(二)——生成WIFi二维码](http://blog.csdn.net/shrimpcolo/article/details/56494504)
- [Google ZXing系列讲解(三)——ZXing 目录结构与主体流程](http://blog.csdn.net/shrimpcolo/article/details/57402440)
- [Google ZXing系列讲解(四)——ZXing 解决竖屏扫描问题](http://blog.csdn.net/shrimpcolo/article/details/58176308)
- [Google ZXing系列讲解(五)——ZXing 仿微信扫描UI](https://blog.csdn.net/shrimpcolo/article/details/59484615)

## The column on Jianshu
- [Google ZXing系列讲解(一)——导入AS](https://www.jianshu.com/p/85e0bdb8bd2c)
- [Google ZXing系列讲解(二)——生成WIFi二维码](https://www.jianshu.com/p/656d6f6f862e)
- [Google ZXing系列讲解(三)——ZXing 目录结构与主体流程](https://www.jianshu.com/p/de529919e4e9)
- [Google ZXing系列讲解(四)——ZXing 解决竖屏扫描问题](https://www.jianshu.com/p/b78a967e2ac7)
- [Google ZXing系列讲解(五)——ZXing 仿微信扫描UI](https://www.jianshu.com/p/cbc1239a9f6f)
