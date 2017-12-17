package android.developer.solutions.androidmvp.adapter;

import android.developer.solutions.androidmvp.R;
import android.developer.solutions.androidmvp.model.Result;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Create by: Mukesh Yadav
 * www.androiddevelopersolutions.com
 */
public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {

    private ArrayList<Result> mCountryList;

    public DataAdapter(ArrayList<Result> mCountryList) {
        this.mCountryList = mCountryList;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.mTvName.setText(mCountryList.get(position).getName());
        holder.mTvVersion.setText(mCountryList.get(position).getAlpha2Code());
        holder.mTvApi.setText(mCountryList.get(position).getAlpha3Code());
    }

    @Override
    public int getItemCount() {
        return mCountryList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView mTvName,mTvVersion,mTvApi;
        public ViewHolder(View view) {
            super(view);

            mTvName = (TextView)view.findViewById(R.id.tv_name);
            mTvVersion = (TextView)view.findViewById(R.id.tv_version);
            mTvApi = (TextView)view.findViewById(R.id.tv_api_level);
        }
    }
}