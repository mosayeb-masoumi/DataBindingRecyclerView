package com.example.databindingrecyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.databindingrecyclerview.databinding.SportDataBinding;

public class ViewHolder extends RecyclerView.ViewHolder {


    private SportDataBinding mDataBinding;

    public ViewHolder(SportDataBinding dataBinding) {
        super(dataBinding.getRoot());
        this.mDataBinding=dataBinding;
    }

    public void bind(SportViewModel model){
        this.mDataBinding.setViewModel(model);
    }

    public SportDataBinding getDataBinding(){

        return mDataBinding;
    }
}
