package com.mirkamol.simpleprojectforfirebase.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.mirkamol.simpleprojectforfirebase.R
import com.mirkamol.simpleprojectforfirebase.managers.AuthManager

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        findViewById<Button>(R.id.btn_sign_out).setOnClickListener {
       AuthManager.signOut()
            callSignInActivity(context)
            finish()
        }
    }
}