package com.example.databindingrecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.databindingrecyclerview.databinding.SportDataBinding;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<ViewHolder> {

    private Context mContext;
    private ArrayList<SportViewModel> mList;
    private LayoutInflater inflater;

    public RecyclerViewAdapter(Context context, ArrayList<SportViewModel> list) {
        this.mContext = context;
        this.mList = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        if(inflater==null){
            inflater=LayoutInflater.from(parent.getContext());
        }

        SportDataBinding dataBinding= SportDataBinding.inflate(inflater,parent,false);
        return  new ViewHolder(dataBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        final SportViewModel model= mList.get(position);
        holder.bind(model);

        final SportDataBinding dataBinding = holder.getDataBinding();
        dataBinding.setHandler(new FavImgClickHandler() {
            @Override
            public void onFavImgClick() {

                if(model.imgSrcId.get() == R.drawable.ic_star){
                    model.imgSrcId.set(R.drawable.ic_star_outline);
                    Toast.makeText(mContext, "Sport removed from favourites", Toast.LENGTH_SHORT).show();
                }else{
                    model.imgSrcId.set(R.drawable.ic_star);
                    Toast.makeText(mContext, "Sport added to favourites", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
}
