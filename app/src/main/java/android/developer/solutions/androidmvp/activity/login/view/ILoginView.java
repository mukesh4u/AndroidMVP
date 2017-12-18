package android.developer.solutions.androidmvp.activity.login.view;

/**
 * Created by Mukesh on 12/16/2017.
 * androiddevelopersolutions.com
 */
public interface ILoginView {
    void showProgress();
    void hideProgress();
    void setUsernameError();
    void setPasswordError();
    void navigateToHome();
}
