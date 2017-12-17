package android.developer.solutions.androidmvp.activity.home.presenter;

import android.developer.solutions.androidmvp.model.Country;

/**
 * Created by Mukesh on 12/16/2017.
 * Affle Appstudio S/W Pvt. Ltd.
 * mukesh.yadav@affle.com
 */
public interface IHomePresenter {
    void onSuccess(Country response);
    void onError(Throwable throwable);
}
