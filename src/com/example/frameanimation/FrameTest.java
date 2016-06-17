package com.example.frameanimation;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

import com.example.myview.R;

public class FrameTest extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button play = (Button)findViewById(R.id.play);
        Button stop = (Button)findViewById(R.id.stop);
        ImageView imageView = (ImageView)findViewById(R.id.anim);
        //��ȡAnimationDrawable��������
        final AnimationDrawable animationDrawable = (AnimationDrawable)imageView.getBackground();
        
        play.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				animationDrawable.start(); //��ʼ���Ŷ���
			}
		});
        stop.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				animationDrawable.stop();  //ֹͣ���Ŷ���
			}
		});
        
    }
}
