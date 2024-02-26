package com.happytails.app.modules.createaccount.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.happytails.app.R
import com.happytails.app.appcomponents.base.BaseActivity
import com.happytails.app.databinding.ActivityCreateAccountBinding
import com.happytails.app.modules.createaccount.`data`.viewmodel.CreateAccountVM
import com.happytails.app.modules.signup.ui.SignUpActivity
import kotlin.String
import kotlin.Unit

class CreateAccountActivity :
    BaseActivity<ActivityCreateAccountBinding>(R.layout.activity_create_account) {
  private val viewModel: CreateAccountVM by viewModels<CreateAccountVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.createAccountVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtLanguage.setOnClickListener {
      val destIntent = SignUpActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CREATE_ACCOUNT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CreateAccountActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
