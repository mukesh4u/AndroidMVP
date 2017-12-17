package android.developer.solutions.androidmvp.activity.home.view;

import android.developer.solutions.androidmvp.R;
import android.developer.solutions.androidmvp.activity.home.interactor.HomeInteractorImpl;
import android.developer.solutions.androidmvp.activity.home.presenter.HomePresenterImpl;
import android.developer.solutions.androidmvp.activity.home.presenter.IHomePresenter;
import android.developer.solutions.androidmvp.adapter.DataAdapter;
import android.developer.solutions.androidmvp.model.Country;
import android.developer.solutions.androidmvp.model.Result;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity implements IHomeView {

    RecyclerView recyclerView;
    ProgressBar progress;
    IHomePresenter homePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        progress = (ProgressBar) findViewById(R.id.progress);
        showProgress();
        homePresenter = new HomePresenterImpl(this,new HomeInteractorImpl());
    }

    @Override
    public void showProgress() {
        progress.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progress.setVisibility(View.GONE);
    }


    @Override
    public void bindDataOnView(Country response) {
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        if(response != null &&
                response.getRestResponse() != null &&
                response.getRestResponse().getResult() != null &&
                response.getRestResponse().getResult().size() >0) {
            ArrayList<Result>mAndroidArrayList = (ArrayList<Result>) response.getRestResponse().getResult();
            DataAdapter mAdapter = new DataAdapter(mAndroidArrayList);
            recyclerView.setAdapter(mAdapter);
        }
    }

    @Override
    public void showErrorMessage(Throwable error) {
        Toast.makeText(this, "Error "+error.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
    }
}
