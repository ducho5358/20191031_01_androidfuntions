package com.tjoeun.a20191031_01_androidfuntions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {


    // 연습문제.
    // 이름과, 회원번호를 입력하고 로그인 버튼을 누르면
    // Ex. 10번 조경진 회원님 환영합니다. 라는 Toast를 띄우자.


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        loginBt.setOnClickListener {
            var userName = nameEdit.text.toString()
            var userNumber = memberNumberEdit.text.toString()

            Toast.makeText(this, "${userName}", Toast.LENGTH_SHORT).show()

        }


    }
}
