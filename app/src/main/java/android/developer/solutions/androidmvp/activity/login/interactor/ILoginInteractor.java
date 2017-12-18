package android.developer.solutions.androidmvp.activity.login.interactor;

import android.developer.solutions.androidmvp.activity.login.presenter.ILoginPresenter;

/**
 * Created by Mukesh on 12/16/2017.
 * androiddevelopersolutions.com
 */
public interface ILoginInteractor {
    void login(String username, String password, ILoginPresenter listener);
}
