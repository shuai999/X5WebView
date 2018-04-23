package cn.novate.x5webview.mvp.mvpbase;
import android.app.Application;
import android.content.Intent;

import cn.novate.x5webview.tools.X5NetService;
/**
 * Email: 2185134304@qq.com
 * Created by JackChen 2018/4/23 11:45
 * Version 1.0
 * Params:
 * Description:
*/
public class HomeApplication extends Application {

    private static HomeApplication homeApplication;
    @Override
    public void onCreate() {
        super.onCreate();
        homeApplication=this;
        // 初始化X5WebView
        preInitX5Core();
    }

    public static HomeApplication getInstance(){
        return homeApplication;
    }

    private void preInitX5Core() {
        //预加载x5内核
        Intent intent = new Intent(this, X5NetService.class);
        startService(intent);
    }
}
