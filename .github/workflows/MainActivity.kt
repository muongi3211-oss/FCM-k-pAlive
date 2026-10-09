package com.example.fcmkeepalive

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = android.widget.LinearLayout(this).apply {
            orientation = android.widget.LinearLayout.VERTICAL
            setPadding(64, 64, 64, 64)
            gravity = android.view.Gravity.CENTER
        }

        val tvStatus = TextView(this).apply {
            textSize = 18f
            setPadding(0, 0, 0, 32)
        }

        val btnToggle = Button(this)

        fun updateUI() {
            val active = FcmJobScheduler.isScheduled(this)
            tvStatus.text = if (active) "Trạng thái: ĐANG LẮNG NGHE GMS" else "Trạng thái: ĐÃ TẮT"
            btnToggle.text = if (active) "Tắt Trigger" else "Kích hoạt Trigger FCM"
        }

        btnToggle.setOnClickListener {
            if (FcmJobScheduler.isScheduled(this)) {
                FcmJobScheduler.cancelJob(this)
                Toast.makeText(this, "Đã hủy theo dõi GMS", Toast.LENGTH_SHORT).show()
            } else {
                FcmJobScheduler.scheduleJob(this)
                Toast.makeText(this, "Đã kích hoạt Trigger ContentURI", Toast.LENGTH_SHORT).show()
            }
            updateUI()
        }

        layout.addView(tvStatus)
        layout.addView(btnToggle)
        setContentView(layout)

        updateUI()
    }
}
