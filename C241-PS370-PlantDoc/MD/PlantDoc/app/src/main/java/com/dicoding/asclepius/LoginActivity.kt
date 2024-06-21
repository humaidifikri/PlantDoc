package com.dicoding.asclepius

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.dicoding.asclepius.database.DatabaseHelper
import com.dicoding.asclepius.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private lateinit var databaseHelper: DatabaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        databaseHelper = DatabaseHelper(this)

        binding.btnLogin.setOnClickListener {
            loginAttempt()
        }

        binding.btnCreateAccount.setOnClickListener {
            moveToRegisterPage()
        }

    }

    private fun loginAttempt() {
        val username = binding.edtUsername.text.toString()
        val password = binding.edtPassword.text.toString()

        if (username.isEmpty() || password.isEmpty()) {
            Toast.makeText(this@LoginActivity, "Semua field wajib di isi", Toast.LENGTH_SHORT).show()
        } else {
            val checkCredentials = databaseHelper.checkUsernamePassword(username, password)
            if (checkCredentials) {
                Toast.makeText(this@LoginActivity, "Login Berhasil", Toast.LENGTH_SHORT).show()
                val intent = Intent(applicationContext, MainActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this@LoginActivity, "Login Gagal", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun moveToRegisterPage() {
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }
}