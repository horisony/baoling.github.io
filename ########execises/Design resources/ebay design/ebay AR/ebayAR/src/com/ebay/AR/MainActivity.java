package com.ebay.AR;

import m.ebayAR.table.UnityPlayerNativeActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
	private Toolbar toolbar;
	private ImageView img_table;
	private ImageView img_andrew;
	private ImageView img_bear;
	private ImageView img_dress;
	private ImageView img_dress3d;
	private ImageView img_hat;
	private ImageView img_necklace;
	private ImageView img_pig;
	private ImageView img_sheep;
	private ImageView img_walle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);;
		toolbar=(Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
		
		img_table=(ImageView) findViewById(R.id.imageView_table);
		img_table.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent("UnityPlayerNativeActivity.intent.action.Launch");
				startActivity(intent);
			}
			});
		
		
		img_andrew=(ImageView) findViewById(R.id.imageView_andrew);
		img_andrew.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent("AndrewActivity.intent.action.Launch");
				startActivity(intent);
			}
			});
		
		img_bear=(ImageView) findViewById(R.id.imageView_bear);
		img_bear.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent("bearActivity.intent.action.Launch");
				startActivity(intent);
			}
			});
		
		img_dress=(ImageView) findViewById(R.id.imageView_dress);
		img_dress.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent("dressActivity.intent.action.Launch");
				startActivity(intent);
			}
			});
		
		img_dress3d=(ImageView) findViewById(R.id.imageView_dress3d);
		img_dress3d.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent("dress3dActivity.intent.action.Launch");
				startActivity(intent);
			}
			});
		
		img_hat=(ImageView) findViewById(R.id.imageView_hat);
		img_hat.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent("hatActivity.intent.action.Launch");
				startActivity(intent);
			}
			});
		
		img_necklace=(ImageView) findViewById(R.id.imageView_necklace);
		img_necklace.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent("necklaceActivity.intent.action.Launch");
				startActivity(intent);
			}
			});
		
		img_sheep=(ImageView) findViewById(R.id.imageView_sheep);
		img_sheep.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent("sheepActivity.intent.action.Launch");
				startActivity(intent);
			}
			});
		
		img_pig=(ImageView) findViewById(R.id.imageView_pig);
		img_pig.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent("pigActivity.intent.action.Launch");
				startActivity(intent);
			}
			});
		
		img_walle=(ImageView) findViewById(R.id.imageView_walle);
		img_walle.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent("walleActivity.intent.action.Launch");
				startActivity(intent);
			}
			});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_scan) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
