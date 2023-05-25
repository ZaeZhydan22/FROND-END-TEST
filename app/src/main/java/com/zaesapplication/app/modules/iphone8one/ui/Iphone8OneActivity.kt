package com.zaesapplication.app.modules.iphone8one.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.zaesapplication.app.R
import com.zaesapplication.app.appcomponents.base.BaseActivity
import com.zaesapplication.app.databinding.ActivityIphone8OneBinding
import com.zaesapplication.app.modules.iphone8one.`data`.viewmodel.Iphone8OneVM
import com.zaesapplication.app.modules.iphone8two.ui.Iphone8TwoActivity
import kotlin.String
import kotlin.Unit

class Iphone8OneActivity : BaseActivity<ActivityIphone8OneBinding>(R.layout.activity_iphone_8_one) {
  private val viewModel: Iphone8OneVM by viewModels<Iphone8OneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone8OneVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = Iphone8TwoActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.viewRectangleTwo.setOnClickListener {
        val destIntent = Iphone8TwoActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "IPHONE8ONE_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, Iphone8OneActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
