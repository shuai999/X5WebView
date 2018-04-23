package cn.novate.x5webview.mvp.mvp_use;


import cn.novate.x5webview.model.MVPLoginBean;
import cn.novate.x5webview.mvp.mvpbase.BasePresenter;

/**
 * Created by tzw on 2018/3/13.
 */

public interface MVPLoginPresenter extends BasePresenter<MVPLoginView> {
    void login(MVPLoginBean bean);
}
