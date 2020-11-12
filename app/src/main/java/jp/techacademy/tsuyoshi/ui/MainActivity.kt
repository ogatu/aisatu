package jp.techacademy.tsuyoshi.ui

import android.app.TimePickerDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.app.DatePickerDialog
import android.widget.DatePicker

class MainActivity : AppCompatActivity(),View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button2.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when (v.id) {

            R.id.button2 -> showTimePickerDialog()
        }


    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->

                if (2 <= hour && hour <= 9) {
                    textView.text = "おはよう"
                }

                else if (10<=hour&&hour<=17){
                    textView.text="こんにちは"
                }
                 else {
                    textView.text="こんばんは"
                }
            },
            13, 0, true)

        timePickerDialog.show()
    }
}





























