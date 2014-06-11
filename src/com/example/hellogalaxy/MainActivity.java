package com.example.hellogalaxy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button btn1 = (Button)findViewById(R.id.button1);
		Button btn2 = (Button)findViewById(R.id.button2);
		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO 自動生成されたメソッド・スタブ
		TextView tvresult = (TextView)findViewById(R.id.textView3);
		EditText et1 = (EditText)findViewById(R.id.editText1);
		EditText et2 = (EditText)findViewById(R.id.editText2);

		switch(v.getId()){
		case R.id.button1:
			tvresult.setText(et1.getText().toString() + et2.getText().toString());
			Intent vIntent = new Intent(this, MsgActivity.class);
			startActivity(vIntent);
			break;
		case R.id.button2:
			et1.setText("");
			et2.setText("");
			tvresult.setText("");
			break;
		}
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
