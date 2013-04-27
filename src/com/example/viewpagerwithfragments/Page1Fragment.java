package com.example.viewpagerwithfragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class Page1Fragment extends Fragment{
    
	//	Called to do initial creation of a fragment.
	@Override  
    public void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
    }  
      
    // Called to have the fragment instantiate its user interface view.
    @Override  
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {  
           
        RelativeLayout layout = (RelativeLayout)inflater.inflate(R.layout.page1, container, false);
        Button button = (Button)layout.findViewById(R.id.page1Button);
        button.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				Toast.makeText(getActivity(), "This is Page 1", Toast.LENGTH_SHORT).show();
			}
		});
        return layout;  
    }  
}
