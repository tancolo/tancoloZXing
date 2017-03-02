# tancoloZXing
基于ZXing3.3.0开源项目分析

# 分支说明
##master分支
ZXing android目录的导入工程，用于展示ZXing3.3.0 Demo， 无其他修改。
该工程没有直接使用ZXing core代码，而是使用引入方式！
```
compile 'com.google.zxing:core:3.3.0';
compile 'com.google.zxing:android-core:3.3.0';
```

## debug分支
如有需要，请选择到debug分支查看最新代码
- 调试分析源码
- 测试定制扫码UI

# 分析文章
- [Google ZXing系列讲解(一)——导入AS](http://blog.csdn.net/shrimpcolo/article/details/56286094)
- [Google ZXing系列讲解(二)——生成WIFi二维码](http://blog.csdn.net/shrimpcolo/article/details/56494504)
- [Google ZXing系列讲解(三)——ZXing 目录结构与主体流程](http://blog.csdn.net/shrimpcolo/article/details/57402440)
- [Google ZXing系列讲解(四)——ZXing 解决竖屏扫描问题](http://blog.csdn.net/shrimpcolo/article/details/58176308)
