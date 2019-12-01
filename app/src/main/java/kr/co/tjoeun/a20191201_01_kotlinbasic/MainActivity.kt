package kr.co.tjoeun.a20191201_01_kotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Ctrl + / 주석
//        버튼 (okBtn)이 눌리면
//        EditText (inputEdt)에 적힌 값(text)을 받아서
//        TextView (resultTxt)의 내용(text)으로 반영.

        okBtn.setOnClickListener {
//            Ctrl + K 커밋

            var inputString = inputEdt.text.toString()
            resultTxt.text = inputString

        }


    }
}













