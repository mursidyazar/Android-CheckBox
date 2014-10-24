package org.kod5.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Toast;

public class MainActivity extends Activity {

	private CheckBox cb1;
	private CheckBox cb2;
	private CheckBox cb3;
	private CheckBox cb4;
	private CheckBox cb5;
	private CheckBox cb6;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//Tasar›mdaki Checkbox'lar› çekiyoruz.
		cb1 = (CheckBox)findViewById(R.id.checkBox1);
		cb2 = (CheckBox)findViewById(R.id.checkBox2);
		cb3 = (CheckBox)findViewById(R.id.checkBox3);
		cb4 = (CheckBox)findViewById(R.id.checkBox4);
		cb5 = (CheckBox)findViewById(R.id.checkBox5);
		cb6 = (CheckBox)findViewById(R.id.checkBox6);
		
		//CheckBox'lar›n Listener'lar›n› tan›ml›yoruz. 
		cb1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				if(cb1.isChecked())
					Toast.makeText(getApplicationContext(), buttonView.getText(), Toast.LENGTH_SHORT).show();
			}
		});
		cb2.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				if(cb2.isChecked())
					Toast.makeText(getApplicationContext(), buttonView.getText(), Toast.LENGTH_SHORT).show();
			}
		});
		cb3.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				if(cb3.isChecked())
					Toast.makeText(getApplicationContext(), buttonView.getText(), Toast.LENGTH_SHORT).show();
			}
		});
		cb4.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				if(cb4.isChecked())
					Toast.makeText(getApplicationContext(), buttonView.getText(), Toast.LENGTH_SHORT).show();
			}
		});
		cb5.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				if(cb5.isChecked())
					Toast.makeText(getApplicationContext(), buttonView.getText(), Toast.LENGTH_SHORT).show();
			}
		});
		cb6.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				if(cb6.isChecked())
					Toast.makeText(getApplicationContext(), buttonView.getText(), Toast.LENGTH_SHORT).show();
			}
		});
		
		// Butonu tan›ml›yoruz ve t›kland›€›nda iﬂaretli ﬂ›klar› ekrana bas›yoruz. 
		Button show = (Button) findViewById(R.id.showButton);
		show.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String cevaplar="Cevaplar: \n";
				if(cb1.isChecked())
					cevaplar += " "+cb1.getText();
				if(cb2.isChecked())
					cevaplar += " "+cb2.getText();
				if(cb3.isChecked())
					cevaplar += " "+cb3.getText();
				if(cb4.isChecked())
					cevaplar += " "+cb4.getText();
				if(cb5.isChecked())
					cevaplar += " "+cb5.getText();
				if(cb6.isChecked())
					cevaplar += " "+cb6.getText();
				
				Toast.makeText(getApplicationContext(), cevaplar, Toast.LENGTH_LONG).show();
			}
		});
	}
}
