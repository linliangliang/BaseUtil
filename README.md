# BaseUtil
在android开发过程中，会遇到在每个工程中都可能遇到的类，这里进行类封装，便于以后使用。

1、ToastUtil：使用单例模式实现不管我们触发多少次Toast调用，都只会持续一次Toast显示的时长。
	一共包含六个显示函数，
		showShortToast(String msg)短时间显示Toast【居下】
		showShortToastCenter(String msg) 短时间显示Toast【居中】
		showShortToastTop(String msg) 短时间显示Toast【居上】
		showLongToast(String msg) 长时间显示Toast【居下】
		showLongToastCenter(String msg)   长时间显示Toast【居中】
		showLongToastTop(String msg) 长时间显示Toast【居上】
	参数只有一个String ,上下文由MyApplication提供。


2、LogUtil：实现发布程序的时候禁用日志，提高效率。日志工具包，开发时LOGLEVEL设置6，表示都输出。发布时LOGLEVEL设置为0，表示禁止输出

3、NetUtils：判断网络是否连接，判断是否是wifi连接，打开网络设置界面

4、ScreenUtils： 获得屏幕相关的辅助类
	getScreenWidth(Context context)	获得屏幕高度
	getScreenHeight(Context context) 获得屏幕宽度
	getStatusHeight(Context context) 获得状态栏的高度
	Bitmap  snapShotWithStatusBar(Activity activity) 获取当前屏幕截图，包含状态栏
	Bitmap snapShotWithoutStatusBar(Activity activity) 获取当前屏幕截图，不包含状态栏

5、AppUtils：跟App相关的辅助类
	getAppName(Context context) 获取应用程序名称
	getVersionName(Context context) 当前应用的版本名称

6、SDCardUtils SD卡相关的辅助类

7、SharedPreferencesHelper：保存信息配置类
8、HttpUtils ：网络请求的四种方法。
9、添加了ImageUtil工具类，用于实现图片的压缩显示。
11、添加cropUtil,实现图片的裁剪。
