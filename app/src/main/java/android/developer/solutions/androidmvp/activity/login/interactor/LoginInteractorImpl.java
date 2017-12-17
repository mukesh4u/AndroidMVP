package android.developer.solutions.androidmvp.activity.login.interactor;

import android.developer.solutions.androidmvp.activity.login.presenter.ILoginPresenter;
import android.os.Handler;
import android.text.TextUtils;

/**
 * Created by Mukesh on 12/16/2017.
 * Affle Appstudio S/W Pvt. Ltd.
 * mukesh.yadav@affle.com
 */
public class LoginInteractorImpl implements ILoginInteractor {

    @Override
    public void login(final String username, final String password, final ILoginPresenter loginPresenter) {
        // Mock login. I'm creating a handler to delay the answer a couple of seconds
        new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                if (TextUtils.isEmpty(username)) {
                    loginPresenter.onUsernameError();
                    return;
                }
                if (TextUtils.isEmpty(password)) {
                    loginPresenter.onPasswordError();
                    return;
                }
                loginPresenter.onSuccess();
            }
        }, 2000);
    }
}
