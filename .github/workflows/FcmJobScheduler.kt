package com.example.fcmkeepalive

import android.app.job.JobInfo
import android.app.job.JobScheduler
import android.content.ComponentName
import android.content.Context
import android.net.Uri

object FcmJobScheduler {
    private const val JOB_ID = 9988

        fun scheduleJob(context: Context) {
                val jobScheduler = context.getSystemService(Context.JOB_SCHEDULER_SERVICE) as JobScheduler
                        val componentName = ComponentName(context, FcmJobService::class.java)

                                // URI theo dõi sự thay đổi của GMS Subservices
                                        val gmsUri = Uri.parse("content://com.google.android.gms.settings/subservices")

                                                val builder = JobInfo.Builder(JOB_ID, componentName)
                                                            .addTriggerContentUri(
                                                                            JobInfo.TriggerContentUri(gmsUri, JobInfo.TriggerContentUri.FLAG_NOTIFY_FOR_DESCENDANTS)
                                                                                        )
                                                                                                    .setTriggerContentMaxDelay(1000) // Kích hoạt tối đa sau 1s
                                                                                                                .setTriggerContentUpdateDelay(500) // Đợi 500ms sau khi thay đổi ổn định

                                                                                                                        jobScheduler.schedule(builder.build())
                                                                                                                            }

                                                                                                                                fun isScheduled(context: Context): Boolean {
                                                                                                                                        val jobScheduler = context.getSystemService(Context.JOB_SCHEDULER_SERVICE) as JobScheduler
                                                                                                                                                return jobScheduler.allPendingJobs.any { it.id == JOB_ID }
                                                                                                                                                    }

                                                                                                                                                        fun cancelJob(context: Context) {
                                                                                                                                                                val jobScheduler = context.getSystemService(Context.JOB_SCHEDULER_SERVICE) as JobScheduler
                                                                                                                                                                        jobScheduler.cancel(JOB_ID)
                                                                                                                                                                            }
                                                                                                                                                                            }
                                                                                                                                                                            