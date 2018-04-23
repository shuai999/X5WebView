package cn.novate.x5webview.tools;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;

import com.tencent.smtt.sdk.QbSdk;

/**
 * Email: 2185134304@qq.com
 * Created by JackChen 2018/4/23 11:46
 * Version 1.0
 * Params:
 * Description:
*/
public class X5NetService extends IntentService {

    public static final String TAG = LogTAG.x5webview;
    public X5NetService(){
        super(TAG);
    }
    public X5NetService(String name) {
        super(TAG);
    }

    /**
     * 初始化X5WebView
     */
    @Override
    public void onHandleIntent(@Nullable Intent intent) {
        initX5Web();
    }
    public void initX5Web() {
        if (!QbSdk.isTbsCoreInited()) {
            // 设置X5初始化完成的回调接口
            QbSdk.preInit(getApplicationContext(), null);
        }
        QbSdk.initX5Environment(getApplicationContext(), cb);
    }

    QbSdk.PreInitCallback cb = new QbSdk.PreInitCallback() {
        @Override
        public void onViewInitFinished(boolean arg0) {
            // TODO Auto-generated method stub
        }
        @Override
        public void onCoreInitFinished() {
            // TODO Auto-generated method stub
        }
    };


}



