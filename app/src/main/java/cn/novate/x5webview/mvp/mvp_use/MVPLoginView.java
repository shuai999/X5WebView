package cn.novate.x5webview.mvp.mvp_use;


import cn.novate.x5webview.mvp.mvpbase.BaseView;

/**
 * Created by tzw on 2018/3/13.
 */

public interface MVPLoginView extends BaseView {

    void loginSuccess(String msg, String data, Object object);

    void loginFailed(String msg, String data);

}
