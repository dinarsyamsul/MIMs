package dev.iconpln.mims.ui.auth.change_password

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.viewModels
import dev.iconpln.mims.R
import dev.iconpln.mims.databinding.ActivityChangePasswordBinding
import dev.iconpln.mims.ui.auth.AuthViewModel
import dev.iconpln.mims.ui.auth.LoginActivity
import dev.iconpln.mims.utils.SharedPrefsUtils

class ChangePasswordActivity : AppCompatActivity() {
    private lateinit var binding: ActivityChangePasswordBinding
    private val viewModel: AuthViewModel by viewModels()
    private lateinit var username: String
    private lateinit var dialog : Dialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChangePasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        dialog = Dialog(this@ChangePasswordActivity)
        dialog.setContentView(R.layout.popup_loading)
        dialog.window!!.setBackgroundDrawableResource(android.R.color.transparent)
        dialog.window!!.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.setCancelable(false)
        dialog.window!!.attributes.windowAnimations = R.style.DialogUpDown

        username = SharedPrefsUtils.getStringPreference(this,"username","")!!

        viewModel.isLoading.observe(this){
            if (it) dialog.show() else dialog.dismiss()
        }

        viewModel.changePassword.observe(this){
            when(it.message){
                "update password berhasil" -> {
                    startActivity(Intent(this, LoginActivity::class.java))
                    Toast.makeText(this, "silahkan login dengan password baru anda", Toast.LENGTH_SHORT).show()
                    finish()
                }
                else -> Toast.makeText(this, "ada kesalahan saat mengganti password", Toast.LENGTH_SHORT).show()
            }
        }

        with(binding){
            btnKirim.setOnClickListener{
                tvMsgError.visibility = View.GONE
                val password = edtPasswordBaru.text.toString()
                val konfPassword = edtPassKonfirmasi.text.toString()

                when{
                    password.isNullOrEmpty() -> {
                        tvMsgError.visibility = View.VISIBLE
                        tvMsgError.text = "Password baru tidak boleh kosong"
                    }
                    konfPassword.isNullOrEmpty() -> {
                        tvMsgError.visibility = View.VISIBLE
                        tvMsgError.text = "Silahkan masukkan konfirmasi password"
                    }
                    else -> viewModel.changePasswordProfile(this@ChangePasswordActivity, username, password,konfPassword)
                }
            }
        }
    }
}