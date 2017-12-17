package android.developer.solutions.androidmvp.activity.home.view;

import android.developer.solutions.androidmvp.model.Country;

/**
 * Created by Mukesh on 12/16/2017.
 * Affle Appstudio S/W Pvt. Ltd.
 * mukesh.yadav@affle.com
 */
public interface IHomeView {
    void showProgress();
    void hideProgress();
    void bindDataOnView(Country response);
    void showErrorMessage(Throwable error);
}

