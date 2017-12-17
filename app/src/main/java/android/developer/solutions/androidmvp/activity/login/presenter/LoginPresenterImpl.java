package android.developer.solutions.androidmvp.activity.login.presenter;

import android.developer.solutions.androidmvp.activity.login.interactor.ILoginInteractor;
import android.developer.solutions.androidmvp.activity.login.interactor.LoginInteractorImpl;
import android.developer.solutions.androidmvp.activity.login.view.ILoginView;

/**
 * Created by Mukesh on 12/16/2017.
 * Affle Appstudio S/W Pvt. Ltd.
 * mukesh.yadav@affle.com
 */
public class LoginPresenterImpl implements ILoginPresenter {

    private ILoginView loginView;
    private ILoginInteractor loginInteractor;

    public LoginPresenterImpl(ILoginView loginView, LoginInteractorImpl loginInteractor) {
        this.loginView = loginView;
        this.loginInteractor = loginInteractor;
    }

    @Override
    public void validateCredentials(String username, String password) {
        if (loginView != null) {
            loginView.showProgress();
        }

        loginInteractor.login(username, password, this);
    }

    @Override
    public void onDestroy() {
        loginView = null;
    }

    @Override
    public void onUsernameError() {
        if (loginView != null) {
            loginView.setUsernameError();
            loginView.hideProgress();
        }
    }

    @Override
    public void onPasswordError() {
        if (loginView != null) {
            loginView.setPasswordError();
            loginView.hideProgress();
        }
    }

    @Override
    public void onSuccess() {
        if (loginView != null) {
            loginView.navigateToHome();
        }
    }
}
