<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android">

    <uses-permission android:name="android.permission.RECEIVE_BOOT_COMPLETED" />

        <application
                android:allowBackup="true"
                        android:icon="@android:drawable/stat_notify_sync"
                                android:label="FCM KeepAlive"
                                        android:supportsRtl="true"
                                                android:theme="@android:style/Theme.DeviceDefault.DayNight">

                                                        <activity
                                                                    android:name=".MainActivity"
                                                                                android:exported="true">
                                                                                            <intent-filter>
                                                                                                            <action android:name="android.intent.action.MAIN" />
                                                                                                                            <category android:name="android.intent.category.LAUNCHER" />
                                                                                                                                        </intent-filter>
                                                                                                                                                </activity>

                                                                                                                                                        <!-- Service xử lý JobScheduler -->
                                                                                                                                                                <service
                                                                                                                                                                            android:name=".FcmJobService"
                                                                                                                                                                                        android:permission="android.permission.BIND_JOB_SERVICE"
                                                                                                                                                                                                    android:exported="true" />

                                                                                                                                                                                                            <!-- Lắng nghe sự kiện khởi động lại máy -->
                                                                                                                                                                                                                    <receiver
                                                                                                                                                                                                                                android:name=".BootReceiver"
                                                                                                                                                                                                                                            android:exported="true">
                                                                                                                                                                                                                                                        <intent-filter>
                                                                                                                                                                                                                                                                        <action android:name="android.intent.action.BOOT_COMPLETED" />
                                                                                                                                                                                                                                                                                    </intent-filter>
                                                                                                                                                                                                                                                                                            </receiver>

                                                                                                                                                                                                                                                                                                </application>
                                                                                                                                                                                                                                                                                                </manifest>
                                                                                                                                                                                                                                                                                                