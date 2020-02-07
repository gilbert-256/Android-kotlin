package com.ktaomai

    import android.os.Bundle
    import android.widget.Toast
    import androidx.appcompat.app.AppCompatActivity
    import kotlinx.android.synthetic.main.activity_forgotpassword.*

    class ForgotPasswordActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_forgotpassword)
            btnToSendEmail.setOnClickListener {
                Toast.makeText(this, "Thank you! Check your email inbox and Login at ktaomai.", Toast.LENGTH_SHORT).show()
            }
        }
    }
