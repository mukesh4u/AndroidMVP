package android.developer.solutions.androidmvp.activity.home.presenter;

import android.developer.solutions.androidmvp.activity.home.interactor.HomeInteractorImpl;
import android.developer.solutions.androidmvp.activity.home.interactor.IHomeInteractor;
import android.developer.solutions.androidmvp.activity.home.view.IHomeView;
import android.developer.solutions.androidmvp.activity.login.interactor.ILoginInteractor;
import android.developer.solutions.androidmvp.activity.login.interactor.LoginInteractorImpl;
import android.developer.solutions.androidmvp.activity.login.view.ILoginView;
import android.developer.solutions.androidmvp.model.Country;

/**
 * Created by Mukesh on 12/16/2017.
 * Affle Appstudio S/W Pvt. Ltd.
 * mukesh.yadav@affle.com
 */
public class HomePresenterImpl implements IHomePresenter {
    IHomeView homeView;
    IHomeInteractor homeInteractor;

    public HomePresenterImpl(IHomeView homeView, HomeInteractorImpl homeInteractor) {
        this.homeView = homeView;
        this.homeInteractor = homeInteractor;
        homeInteractor.getAllCounty(this);
    }
    @Override
    public void onSuccess(Country respomse) {
        if(homeView != null) {
            homeView.hideProgress();
            homeView.bindDataOnView(respomse);
        }
    }

    @Override
    public void onError(Throwable throwable) {
        if(homeView != null) {
            homeView.hideProgress();
            homeView.showErrorMessage(throwable);
        }
    }
}
