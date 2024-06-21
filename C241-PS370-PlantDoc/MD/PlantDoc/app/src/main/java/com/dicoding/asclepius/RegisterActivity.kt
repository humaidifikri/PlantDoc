package com.dicoding.asclepius

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.dicoding.asclepius.database.DatabaseHelper
import com.dicoding.asclepius.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    private lateinit var databaseHelper: DatabaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        databaseHelper = DatabaseHelper(this);

        binding.btnRegister.setOnClickListener {
            val username = binding.edtUsername.text.toString()
            val password = binding.edtPassword.text.toString()
            val confirmPassword = binding.edtConfirmPassword.text.toString()

            if (username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                Toast.makeText(this, "Semua field wajib diisi", Toast.LENGTH_SHORT).show()
            } else {
                if (password == confirmPassword) {
                    val checkUsername = databaseHelper.checkUsername(username)
                    if (!checkUsername) {
                        val insert = databaseHelper.insertData(username, password)
                        if (insert) {
                            Toast.makeText(this, "Pendaftaran Berhasil. Silahkan Login", Toast.LENGTH_SHORT).show()
                            val intent = Intent(applicationContext, LoginActivity::class.java)
                            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
                            startActivity(intent)
                        } else {
                            Toast.makeText(this, "Pendaftara Gagal", Toast.LENGTH_SHORT).show()
                        }
                    } else {
                        Toast.makeText(this, "Pengguna SUdah Terdaftar. Silahkan Login", Toast.LENGTH_SHORT).show()
                    }
                } else {
                    Toast.makeText(this, "Password Konfirmasi Salah", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}