package com.fragments;

import com.fragment1.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment1 extends Fragment{

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
		return inflater.inflate(R.layout.f1, container, false);
	}
}
