package com.vinay.variousprogressbar;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

	Button showDialog, cancleDialog;
	Dialog dialog;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		dialog = new Dialog(MainActivity.this);
		dialog.setContentView(R.layout.myprogressdialog);
		dialog.setTitle("Download Progress");
		ProgressBar pb = (ProgressBar) dialog.findViewById(R.id.progress_bar);
		pb.setProgress(0);
		dialog.setCanceledOnTouchOutside(false);
		showDialog = (Button) findViewById(R.id.show_dialog);
		cancleDialog = (Button) findViewById(R.id.cancel_dialog);

		showDialog.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				showProgress(dialog);
			}
		});

		cancleDialog.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				dialog.dismiss();
			}
		});


	}


	void showProgress(Dialog dialog) {

		dialog.show();
		// pb.setProgressDrawable(getResources().getDrawable(R.drawable.green_progress));
	}
}
