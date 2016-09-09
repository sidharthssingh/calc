package org.example.calkulator;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
 

public class MainActivity extends Activity {
	
	EditText operand1;
	EditText operand2;
	Button btnAdd;
	Button btnSubtract;
	Button btnDivide;
	Button btnMultiply;
	Button btnClear;
	TextView result;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		//Operand fields from main Screen
		operand1 = (EditText) findViewById(R.id.editOperand1);
		operand2 = (EditText) findViewById(R.id.editOperand2);
		
		
		
		//Associate Buttons
		btnAdd = (Button) findViewById(R.id.btnAdd);
		btnSubtract = (Button) findViewById(R.id.btnSubtract);
		btnMultiply = (Button) findViewById(R.id.btnMultiply);
		btnDivide = (Button) findViewById(R.id.btnDivide);
		btnClear= (Button) findViewById(R.id.btnClear);
		//Result
		result =(TextView) findViewById(R.id.textResult);
	
		//Associate adding functionality
		btnAdd.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				
				 if (TextUtils.isEmpty(operand1.getText().toString())
					        || TextUtils.isEmpty(operand2.getText().toString())) {
					 return;
					   }
				
				float oper1 = Float.parseFloat(operand1.getText().toString());
				float oper2 = Float.parseFloat(operand2.getText().toString());
				float theResult= oper1 + oper2;
				result.setText(Float.toString(theResult));
			}
		});
		
		//Subtract Calculator Processing
		btnSubtract.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (TextUtils.isEmpty(operand1.getText().toString())
				        || TextUtils.isEmpty(operand2.getText().toString())) {
				 return;
				   }
				float oper1 = Float.parseFloat(operand1.getText().toString());
				float oper2 = Float.parseFloat(operand2.getText().toString());
				
				float theResult= oper1 - oper2;
				result.setText(Float.toString(theResult));
			}
		});
		
		//Multiply Calculator
		btnMultiply.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (TextUtils.isEmpty(operand1.getText().toString())
				        || TextUtils.isEmpty(operand2.getText().toString())) {
				 return;
				   }
				float oper1 = Float.parseFloat(operand1.getText().toString());
				float oper2 = Float.parseFloat(operand2.getText().toString());
				
				float theResult= (oper1) * (oper2);
				result.setText(Float.toString(theResult));
			}
		});
	
		//Divide Calculator
		btnDivide.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (TextUtils.isEmpty(operand1.getText().toString())
				        || TextUtils.isEmpty(operand2.getText().toString())) {
				 return;
				   }
				
				float oper1 = Float.parseFloat(operand1.getText().toString());
				float oper2 = Float.parseFloat(operand2.getText().toString());
				
				float theResult= (oper1) / (oper2);
				result.setText(Float.toString(theResult));
			}
		});
		
		btnClear.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				operand1.setText("");
				operand2.setText("");
				result.setText("0.00");
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
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
