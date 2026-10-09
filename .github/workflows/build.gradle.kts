plugins {
            alias(libs.plugins.android.application)
                alias(libs.plugins.kotlin.android)
}

android {
            namespace = "com.example.fcmkeepalive"
                compileSdk = 34

                    defaultConfig {
                                applicationId = "com.example.fcmkeepalive"
                                        minSdk = 26 // Hỗ trợ TriggerContentUri từ Android 7.0+
                                                targetSdk = 34
                                                        versionCode = 1
                                                                versionName = "1.0"
                    }

                        buildTypes {
                                        release {
                                                            isMinifyEnabled = true
                                                                        proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
                                        }
                        }
}

                                        }
                    }
}