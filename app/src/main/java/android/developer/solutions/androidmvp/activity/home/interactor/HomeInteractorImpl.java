package android.developer.solutions.androidmvp.activity.home.interactor;

import android.developer.solutions.androidmvp.activity.home.presenter.HomePresenterImpl;
import android.developer.solutions.androidmvp.model.Country;
import android.developer.solutions.androidmvp.network.ApiClient;
import android.developer.solutions.androidmvp.network.ApiServices;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;
import retrofit2.Response;

/**
 * Created by Mukesh on 12/16/2017.
 * Affle Appstudio S/W Pvt. Ltd.
 * mukesh.yadav@affle.com
 */
public class HomeInteractorImpl implements IHomeInteractor {
    @Override
    public void getAllCounty(HomePresenterImpl homePresenter) {
        Observable<Country> observer = ApiClient.getClient("http://services.groupkt.com/").create(ApiServices.class).getAllCountry();
        observer.subscribeOn(Schedulers.newThread()).
                observeOn(AndroidSchedulers.mainThread()).
                subscribe(homePresenter::onSuccess, homePresenter::onError);
    }
}
