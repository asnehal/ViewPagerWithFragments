package com.example.viewpagerwithfragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class Page3Fragment extends Fragment{
    @Override  
    public void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
    }  
      
    @Override  
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {  
           
    	RelativeLayout layout = (RelativeLayout)inflater.inflate(R.layout.page3, container, false);
        Button button = (Button)layout.findViewById(R.id.page3Button);
        button.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				Toast.makeText(getActivity(), "This is Page 3", Toast.LENGTH_SHORT).show();
			}
		});
        return layout;  
    }  
}
