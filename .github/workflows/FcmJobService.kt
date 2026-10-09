package com.example.fcmkeepalive

import android.app.job.JobParameters
import android.app.job.JobService
import android.content.Intent
import android.util.Log

class FcmJobService : JobService() {

    override fun onStartJob(params: JobParameters?): Boolean {
            Log.d("FCM_KEEPALIVE", "TriggerContentUri Fired! GMS changed -> Sending MCS_HEARTBEAT")

                    // Gửi Heartbeat ép Google Play Services kết nối lại FCM
                            val heartbeatIntent = Intent("com.google.android.intent.action.MCS_HEARTBEAT").apply {
                                        setPackage("com.google.android.gms")
                                                }
                                                        sendBroadcast(heartbeatIntent)

                                                                // Đăng ký lại Job cho lần thay đổi URI tiếp theo
                                                                        FcmJobScheduler.scheduleJob(applicationContext)

                                                                                // Trả về false: Báo hệ thống công việc đã xong ngay, cho phép kill tiến trình để giải phóng RAM
                                                                                        return false
                                                                                            }

                                                                                                override fun onStopJob(params: JobParameters?): Boolean {
                                                                                                        return true
                                                                                                            }
                                                                                                            }
                                                                                                            