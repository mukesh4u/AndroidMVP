package android.developer.solutions.androidmvp.activity.login.presenter;

/**
 * Created by Mukesh on 12/16/2017.
 * androiddevelopersolutions.com
 */
public interface ILoginPresenter {
    void validateCredentials(String username, String password);
    void onDestroy();
    void onUsernameError();
    void onPasswordError();
    void onSuccess();
}
