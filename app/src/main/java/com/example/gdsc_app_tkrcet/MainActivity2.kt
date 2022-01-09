package com.example.gdsc_app_tkrcet


import androidx.appcompat.app.AppCompatActivity
import android.content.pm.ActivityInfo
import android.graphics.Color
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.method.ScrollingMovementMethod
import android.text.style.ForegroundColorSpan
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)

        var b1 = findViewById<Button>(R.id.b1)
        var b2 = findViewById<Button>(R.id.b2)
        var b3 = findViewById<Button>(R.id.b3)
        var b4 = findViewById<Button>(R.id.b4)
        var b5 = findViewById<Button>(R.id.b5)
        var b6 = findViewById<Button>(R.id.b6)
        var b7 = findViewById<Button>(R.id.b7)
        var b8 = findViewById<Button>(R.id.b8)
        var b9 = findViewById<Button>(R.id.b9)
        var b0 = findViewById<Button>(R.id.b0)
        var b00 = findViewById<Button>(R.id.b00)
        var bdot = findViewById<Button>(R.id.bdot)
        var bdiv = findViewById<Button>(R.id.bdiv)
        var bx = findViewById<Button>(R.id.bx)
        var bminus = findViewById<Button>(R.id.bminus)
        var bplus = findViewById<Button>(R.id.bplus)
        var bequal = findViewById<Button>(R.id.bequal)
        var bc = findViewById<Button>(R.id.bc)
        var bper = findViewById<Button>(R.id.bper)
        var bwrong = findViewById<Button>(R.id.bwrong)
        var textView = findViewById<TextView>(R.id.textView)
        var textView2 = findViewById<TextView>(R.id.textView2)
        var sum = ""
        var str1 = ""
        var sum1 = ""
        var sum2 = ""
        var str2 = ""
        var str = ""
        var str3 = ""
        var sum3 = ""
        var dad = ""
        var bro = ""
        var string = ""
        var hi = 0.0
        var hi1 = 0.0
        var a = 0.0
        var b = 0.0
        var c = 0.0
        var d = 0.0
        var e = 0.0
        var e1 = 0.0
        var mom = 0.0
        var z = 0.0
        var y = 0.0
        var t = 0.0
        var p = 0.0
        var bye = 0.0
        var bhanu = 0
        var k = 0
        var tej = IntArray(9999999)
        var j = DoubleArray(9999999)
        var f = 0
        var rey = 0
        var count = 0
        var sai = 0
        var num = 0
        b1.setOnClickListener{
                if (sum === "" || sum2.endsWith("=")) {
                    sum = "1"
                    sum2 = ""
                    textView.setText(sum)
                    textView2.setText(sum2)
                } else if (bhanu == 0) {
                    if (sum.endsWith("1") || sum.endsWith("-") || sum.endsWith(".") || sum.endsWith("2") || sum.endsWith("3") || sum.endsWith("4") || sum.endsWith("5") || sum.endsWith("6") || sum.endsWith("7") || sum.endsWith("8") || sum.endsWith("9") || sum.endsWith("0") || sum.endsWith("00")) {
                        sum = sum + "1"
                        textView.setText(sum)
                    }
                } else if (sum.endsWith("+") || sum.endsWith("%") || sum.endsWith("/") || sum.endsWith("-") || sum.endsWith("x")) {
                    if (sum.length >= bhanu) {
                        if (bhanu > 0 && sum[bhanu - 1] == '-') {
                            sum = sum + "1"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                d = hi - c
                                hi1 = hi
                                //   hi1=hi+b;
                                c = -c
                                // e=a;
                                mom = d
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '%') {
                            sum = sum + "1"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                //  sum = sum + "1";
                                //textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length)
                                a = sum1.toDouble()
                                b = j[num - 1]
                                //num++;
                                d = hi + b * a
                                mom = d
                                val str1 = mom.toString()
                                j[num] = b * a
                                num++
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '+') {
                            sum = sum + "1"
                            textView.setText(sum)
                            // textView2.setText("hi");
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                                // textView2.setText("hi");
                            } else {
                                //sum = sum + "1";
                                //textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                d = hi + c
                                hi1 = hi
                                //b = hi+(i+c);
                                // hi1=hi+i;
                                // j=i+c;
                                // i=b;
                                mom = d
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                    // textView2.setText("hi");
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '/') {
                            sum = sum + "1"
                            textView.setText(sum)
                            //   sum = sum + "1";
                            //    textView.setText(sum);
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                //  b = hi;
                                // textView2.setText(String.valueOf(j[num-1]));
                                b = hi1 + j[num - 1] / c
                                j[num] = j[num - 1] / c
                                num++
                                //textView2.setText(String.valueOf(j[num-1]));
                                // hi=hi1+a;
                                // hi=d;
                                // i=a/c;
                                //   e=a/c;
                                // hi=b;
                                //  b=b/a;
                                mom = b
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == 'x') {
                            sum = sum + "1"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                // sum = sum + "1";
                                //   textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                //  b = hi;
                                b = hi1 + j[num - 1] * c
                                j[num] = j[num - 1] * c
                                num++
                                //   hi=hi1+j;
                                //  i=a*c;
                                //  e1=a*c;
                                // hi=b;
                                //  b=b/a;
                                //textView2.setText(String.valueOf(num));
                                mom = b
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                                // b=a*c;
                            }
                        }
                    }
                } else  /* if(sum.endsWith("1"))*/ {
                    if (sum.length >= bhanu) {
                        if (bhanu > 0 && sum[bhanu - 1] == '+') {
                            sum = sum + "1"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                d = hi + c
                                hi1 = hi
                                //b = hi+(i+c);
                                // hi1=hi+i;
                                // j=i+c;
                                // i=b;
                                mom = d
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '-') {
                            sum = sum + "1"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                d = hi - c
                                hi1 = hi
                                //   hi1=hi+b;
                                c = -c
                                // e=a;
                                mom = d
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '%') {
                            j[num - 1] = j[num - 1] / a
                            sum = sum + "1"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                a = sum1.toDouble()
                                b = j[num - 1]
                                // num++;
                                d = hi + b * a
                                mom = d
                                val str1 = mom.toString()
                                j[num] = b * a
                                num++
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '/') {
                            j[num - 1] = j[num - 1] * c
                            //num++;
                            sum = sum + "1"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                //  b = hi;
                                //  textView2.setText(String.valueOf(j[num-1]));
                                b = hi1 + j[num - 1] / c
                                j[num] = j[num - 1] / c
                                num++
                                // textView2.setText(String.valueOf(j[num-1]));
                                // hi=hi1+a;
                                // hi=d;
                                // i=a/c;
                                //   e=a/c;
                                // hi=b;
                                //  b=b/a;
                                mom = b
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == 'x') {
                            j[num - 1] = j[num - 1] / c
                            //num++;
                            sum = sum + "1"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                //  b = hi;
                                b = hi1 + j[num - 1] * c
                                j[num] = j[num - 1] * c
                                num++
                                // textView2.setText(String.valueOf(num));
                                //   hi=hi1+j;
                                //  i=a*c;
                                //  e1=a*c;
                                // hi=b;
                                //  b=b/a;
                                mom = b
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                                //  b=a*c;
                            }
                        }
                    }
                }
            
        }
        b2.setOnClickListener {
          
                if (sum === "" || sum2.endsWith("=")) {
                    sum = "2"
                    sum2 = ""
                    textView.setText(sum)
                    textView2.setText(sum2)
                } else if (bhanu == 0) {
                    if (sum.endsWith("1") || sum.endsWith("-") || sum.endsWith(".") || sum.endsWith("2") || sum.endsWith("3") || sum.endsWith("4") || sum.endsWith("5") || sum.endsWith("6") || sum.endsWith("7") || sum.endsWith("8") || sum.endsWith("9") || sum.endsWith("0") || sum.endsWith("00")) {
                        sum = sum + "2"
                        textView.setText(sum)
                    }
                } else if (sum.endsWith("+") || sum.endsWith("%") || sum.endsWith("/") || sum.endsWith("-") || sum.endsWith("x")) {
                    if (sum.length >= bhanu) {
                        if (bhanu > 0 && sum[bhanu - 1] == '-') {
                            sum = sum + "2"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                d = hi - c
                                hi1 = hi
                                //   hi1=hi+b;
                                c = -c
                                // e=a;
                                mom = d
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '%') {
                            sum = sum + "2"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                //  sum = sum + "1";
                                //textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length)
                                a = sum1.toDouble()
                                b = j[num - 1]
                                //num++;
                                d = hi + b * a
                                mom = d
                                val str1 = mom.toString()
                                j[num] = b * a
                                num++
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '+') {
                            sum = sum + "2"
                            textView.setText(sum)
                            // textView2.setText("hi");
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                                // textView2.setText("hi");
                            } else {
                                //sum = sum + "1";
                                //textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                d = hi + c
                                hi1 = hi
                                //b = hi+(i+c);
                                // hi1=hi+i;
                                // j=i+c;
                                // i=b;
                                mom = d
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                    // textView2.setText("hi");
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '/') {
                            sum = sum + "2"
                            textView.setText(sum)
                            //   sum = sum + "1";
                            //    textView.setText(sum);
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                //  b = hi;
                                // textView2.setText(String.valueOf(j[num-1]));
                                b = hi1 + j[num - 1] / c
                                j[num] = j[num - 1] / c
                                num++
                                //textView2.setText(String.valueOf(j[num-1]));
                                // hi=hi1+a;
                                // hi=d;
                                // i=a/c;
                                //   e=a/c;
                                // hi=b;
                                //  b=b/a;
                                mom = b
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == 'x') {
                            sum = sum + "2"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                // sum = sum + "1";
                                //   textView.setText(sum);
                                // textView2.setText(String.valueOf(j[num]-1));
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                //  b = hi;
                                b = hi1 + j[num - 1] * c
                                j[num] = j[num - 1] * c
                                num++
                                //   hi=hi1+j;
                                //  i=a*c;
                                //  e1=a*c;
                                // hi=b;
                                //  b=b/a;
                                //textView2.setText(String.valueOf(num));
                                mom = b
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                                // b=a*c;
                            }
                        }
                    }
                } else  /* if(sum.endsWith("1"))*/ {
                    if (sum.length >= bhanu) {
                        if (bhanu > 0 && sum[bhanu - 1] == '+') {
                            sum = sum + "2"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                d = hi + c
                                hi1 = hi
                                //b = hi+(i+c);
                                // hi1=hi+i;
                                // j=i+c;
                                // i=b;
                                mom = d
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '-') {
                            sum = sum + "2"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                d = hi - c
                                hi1 = hi
                                //   hi1=hi+b;
                                c = -c
                                // e=a;
                                mom = d
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '%') {
                            j[num - 1] = j[num - 1] / a
                            sum = sum + "2"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                a = sum1.toDouble()
                                b = j[num - 1]
                                // num++;
                                d = hi + b * a
                                mom = d
                                val str1 = mom.toString()
                                j[num] = b * a
                                num++
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '/') {
                            j[num - 1] = j[num - 1] * c
                            //num++;
                            sum = sum + "2"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                //  b = hi;
                                //  textView2.setText(String.valueOf(j[num-1]));
                                b = hi1 + j[num - 1] / c
                                j[num] = j[num - 1] / c
                                num++
                                // textView2.setText(String.valueOf(j[num-1]));
                                // hi=hi1+a;
                                // hi=d;
                                // i=a/c;
                                //   e=a/c;
                                // hi=b;
                                //  b=b/a;
                                mom = b
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == 'x') {
                            j[num - 1] = j[num - 1] / c
                            //num++;
                            sum = sum + "2"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                //  b = hi;
                                b = hi1 + j[num - 1] * c
                                j[num] = j[num - 1] * c
                                num++
                                // textView2.setText(String.valueOf(num));
                                //   hi=hi1+j;
                                //  i=a*c;
                                //  e1=a*c;
                                // hi=b;
                                //  b=b/a;
                                mom = b
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                                //  b=a*c;
                            }
                        }
                    } else {
                        if (sum[sum.length - 1] == '+') {
                            sum = sum + "2"
                            textView.setText(sum)
                            sum1 = sum.substring(sum.length - 1, sum.length)
                            a = sum1.toDouble()
                            b = hi
                            b = b + a
                            val str1 = b.toString()
                            if (str1.substring(str1.length - 2) == ".0") {
                                textView2.setText(str1.substring(0, str1.length - 2))
                            } else {
                                textView2.setText(str1)
                                // textView2.setText("hi");
                            }
                        }
                    }
                }
            }
        
        b3.setOnClickListener {

                if (sum === "" || sum2.endsWith("=")) {
                    sum = "3"
                    sum2 = ""
                    textView.setText(sum)
                    textView2.setText(sum2)
                } else if (bhanu == 0) {
                    if (sum.endsWith("1") || sum.endsWith("-") || sum.endsWith(".") || sum.endsWith("2") || sum.endsWith("3") || sum.endsWith("4") || sum.endsWith("5") || sum.endsWith("6") || sum.endsWith("7") || sum.endsWith("8") || sum.endsWith("9") || sum.endsWith("0") || sum.endsWith("00")) {
                        sum = sum + "3"
                        textView.setText(sum)
                    }
                } else if (sum.endsWith("+") || sum.endsWith("%") || sum.endsWith("/") || sum.endsWith("-") || sum.endsWith("x")) {
                    if (sum.length >= bhanu) {
                        if (bhanu > 0 && sum[bhanu - 1] == '-') {
                            sum = sum + "3"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                d = hi - c
                                hi1 = hi
                                //   hi1=hi+b;
                                c = -c
                                // e=a;
                                mom = d
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '%') {
                            sum = sum + "3"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                //  sum = sum + "1";
                                //textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length)
                                a = sum1.toDouble()
                                b = j[num - 1]
                                //num++;
                                d = hi + b * a
                                mom = d
                                val str1 = mom.toString()
                                j[num] = b * a
                                num++
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '+') {
                            sum = sum + "3"
                            textView.setText(sum)
                            // textView2.setText("hi");
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                                // textView2.setText("hi");
                            } else {
                                //sum = sum + "1";
                                //textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                d = hi + c
                                hi1 = hi
                                //b = hi+(i+c);
                                // hi1=hi+i;
                                // j=i+c;
                                // i=b;
                                mom = d
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                    // textView2.setText("hi");
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '/') {
                            sum = sum + "3"
                            textView.setText(sum)
                            //   sum = sum + "1";
                            //    textView.setText(sum);
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                //  b = hi;
                                // textView2.setText(String.valueOf(j[num-1]));
                                b = hi1 + j[num - 1] / c
                                j[num] = j[num - 1] / c
                                num++
                                //textView2.setText(String.valueOf(j[num-1]));
                                // hi=hi1+a;
                                // hi=d;
                                // i=a/c;
                                //   e=a/c;
                                // hi=b;
                                //  b=b/a;
                                mom = b
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == 'x') {
                            sum = sum + "3"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                // sum = sum + "1";
                                //   textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                //  b = hi;
                                b = hi1 + j[num - 1] * c
                                j[num] = j[num - 1] * c
                                num++
                                //   hi=hi1+j;
                                //  i=a*c;
                                //  e1=a*c;
                                // hi=b;
                                //  b=b/a;
                                //textView2.setText(String.valueOf(num));
                                mom = b
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                                // b=a*c;
                            }
                        }
                    }
                } else  /* if(sum.endsWith("1"))*/ {
                    if (sum.length >= bhanu) {
                        if (bhanu > 0 && sum[bhanu - 1] == '+') {
                            sum = sum + "3"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                d = hi + c
                                hi1 = hi
                                //b = hi+(i+c);
                                // hi1=hi+i;
                                // j=i+c;
                                // i=b;
                                mom = d
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '-') {
                            sum = sum + "3"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                d = hi - c
                                hi1 = hi
                                //   hi1=hi+b;
                                c = -c
                                // e=a;
                                mom = d
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '%') {
                            j[num - 1] = j[num - 1] / a
                            sum = sum + "3"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                a = sum1.toDouble()
                                b = j[num - 1]
                                // num++;
                                d = hi + b * a
                                mom = d
                                val str1 = mom.toString()
                                j[num] = b * a
                                num++
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '/') {
                            j[num - 1] = j[num - 1] * c
                            //num++;
                            sum = sum + "3"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                //  b = hi;
                                //  textView2.setText(String.valueOf(j[num-1]));
                                b = hi1 + j[num - 1] / c
                                j[num] = j[num - 1] / c
                                num++
                                // textView2.setText(String.valueOf(j[num-1]));
                                // hi=hi1+a;
                                // hi=d;
                                // i=a/c;
                                //   e=a/c;
                                // hi=b;
                                //  b=b/a;
                                mom = b
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == 'x') {
                            j[num - 1] = j[num - 1] / c
                            //num++;
                            sum = sum + "3"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                //  b = hi;
                                b = hi1 + j[num - 1] * c
                                j[num] = j[num - 1] * c
                                num++
                                // textView2.setText(String.valueOf(num));
                                //   hi=hi1+j;
                                //  i=a*c;
                                //  e1=a*c;
                                // hi=b;
                                //  b=b/a;
                                mom = b
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                                //  b=a*c;
                            }
                        }
                    } else {
                        if (sum[sum.length - 1] == '+') {
                            sum = sum + "3"
                            textView.setText(sum)
                            sum1 = sum.substring(sum.length - 1, sum.length)
                            a = sum1.toDouble()
                            b = hi
                            b = b + a
                            val str1 = b.toString()
                            if (str1.substring(str1.length - 2) == ".0") {
                                textView2.setText(str1.substring(0, str1.length - 2))
                            } else {
                                textView2.setText(str1)
                                // textView2.setText("hi");
                            }
                        }
                    }
                }
            }

        b4.setOnClickListener{

                if (sum === "" || sum2.endsWith("=")) {
                    sum = "4"
                    sum2 = ""
                    textView.setText(sum)
                    textView2.setText(sum2)
                } else if (bhanu == 0) {
                    if (sum.endsWith("1") || sum.endsWith("-") || sum.endsWith(".") || sum.endsWith("2") || sum.endsWith("3") || sum.endsWith("4") || sum.endsWith("5") || sum.endsWith("6") || sum.endsWith("7") || sum.endsWith("8") || sum.endsWith("9") || sum.endsWith("0") || sum.endsWith("00")) {
                        sum = sum + "4"
                        textView.setText(sum)
                    }
                } else if (sum.endsWith("+") || sum.endsWith("%") || sum.endsWith("/") || sum.endsWith("-") || sum.endsWith("x")) {
                    if (sum.length >= bhanu) {
                        if (bhanu > 0 && sum[bhanu - 1] == '-') {
                            sum = sum + "4"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                d = hi - c
                                hi1 = hi
                                //   hi1=hi+b;
                                c = -c
                                // e=a;
                                mom = d
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '%') {
                            sum = sum + "4"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                //  sum = sum + "1";
                                //textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length)
                                a = sum1.toDouble()
                                b = j[num - 1]
                                //num++;
                                d = hi + b * a
                                mom = d
                                val str1 = mom.toString()
                                j[num] = b * a
                                num++
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '+') {
                            sum = sum + "4"
                            textView.setText(sum)
                            // textView2.setText("hi");
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                                // textView2.setText("hi");
                            } else {
                                //sum = sum + "1";
                                //textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                d = hi + c
                                hi1 = hi
                                //b = hi+(i+c);
                                // hi1=hi+i;
                                // j=i+c;
                                // i=b;
                                mom = d
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                    // textView2.setText("hi");
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '/') {
                            sum = sum + "4"
                            textView.setText(sum)
                            //   sum = sum + "1";
                            //    textView.setText(sum);
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                //  b = hi;
                                // textView2.setText(String.valueOf(j[num-1]));
                                b = hi1 + j[num - 1] / c
                                j[num] = j[num - 1] / c
                                num++
                                //textView2.setText(String.valueOf(j[num-1]));
                                // hi=hi1+a;
                                // hi=d;
                                // i=a/c;
                                //   e=a/c;
                                // hi=b;
                                //  b=b/a;
                                mom = b
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == 'x') {
                            sum = sum + "4"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                // sum = sum + "1";
                                //   textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                //  b = hi;
                                b = hi1 + j[num - 1] * c
                                j[num] = j[num - 1] * c
                                num++
                                //   hi=hi1+j;
                                //  i=a*c;
                                //  e1=a*c;
                                // hi=b;
                                //  b=b/a;
                                //textView2.setText(String.valueOf(num));
                                mom = b
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                                // b=a*c;
                            }
                        }
                    }
                } else  /* if(sum.endsWith("1"))*/ {
                    if (sum.length >= bhanu) {
                        if (bhanu > 0 && sum[bhanu - 1] == '+') {
                            sum = sum + "4"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                d = hi + c
                                hi1 = hi
                                //b = hi+(i+c);
                                // hi1=hi+i;
                                // j=i+c;
                                // i=b;
                                mom = d
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '-') {
                            sum = sum + "4"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                d = hi - c
                                hi1 = hi
                                //   hi1=hi+b;
                                c = -c
                                // e=a;
                                mom = d
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '%') {
                            j[num - 1] = j[num - 1] / a
                            sum = sum + "4"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                a = sum1.toDouble()
                                b = j[num - 1]
                                // num++;
                                d = hi + b * a
                                mom = d
                                val str1 = mom.toString()
                                j[num] = b * a
                                num++
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '/') {
                            j[num - 1] = j[num - 1] * c
                            //num++;
                            sum = sum + "4"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                //  b = hi;
                                //  textView2.setText(String.valueOf(j[num-1]));
                                b = hi1 + j[num - 1] / c
                                j[num] = j[num - 1] / c
                                num++
                                // textView2.setText(String.valueOf(j[num-1]));
                                // hi=hi1+a;
                                // hi=d;
                                // i=a/c;
                                //   e=a/c;
                                // hi=b;
                                //  b=b/a;
                                mom = b
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == 'x') {
                            j[num - 1] = j[num - 1] / c
                            //num++;
                            sum = sum + "4"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                //  b = hi;
                                b = hi1 + j[num - 1] * c
                                j[num] = j[num - 1] * c
                                num++
                                // textView2.setText(String.valueOf(num));
                                //   hi=hi1+j;
                                //  i=a*c;
                                //  e1=a*c;
                                // hi=b;
                                //  b=b/a;
                                mom = b
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                                //  b=a*c;
                            }
                        }
                    } else {
                        if (sum[sum.length - 1] == '+') {
                            sum = sum + "4"
                            textView.setText(sum)
                            sum1 = sum.substring(sum.length - 1, sum.length)
                            a = sum1.toDouble()
                            b = hi
                            b = b + a
                            val str1 = b.toString()
                            if (str1.substring(str1.length - 2) == ".0") {
                                textView2.setText(str1.substring(0, str1.length - 2))
                            } else {
                                textView2.setText(str1)
                                // textView2.setText("hi");
                            }
                        }
                    }
                }
            }

        b5.setOnClickListener {

                if (sum === "" || sum2.endsWith("=")) {
                    sum = "5"
                    sum2 = ""
                    textView.setText(sum)
                    textView2.setText(sum2)
                } else if (bhanu == 0) {
                    if (sum.endsWith("1") || sum.endsWith("-") || sum.endsWith(".") || sum.endsWith("2") || sum.endsWith("3") || sum.endsWith("4") || sum.endsWith("5") || sum.endsWith("6") || sum.endsWith("7") || sum.endsWith("8") || sum.endsWith("9") || sum.endsWith("0") || sum.endsWith("00")) {
                        sum = sum + "5"
                        textView.setText(sum)
                    }
                } else if (sum.endsWith("+") || sum.endsWith("%") || sum.endsWith("/") || sum.endsWith("-") || sum.endsWith("x")) {
                    if (sum.length >= bhanu) {
                        if (bhanu > 0 && sum[bhanu - 1] == '-') {
                            sum = sum + "5"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                d = hi - c
                                hi1 = hi
                                //   hi1=hi+b;
                                c = -c
                                // e=a;
                                mom = d
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '%') {
                            sum = sum + "5"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                //  sum = sum + "1";
                                //textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length)
                                a = sum1.toDouble()
                                b = j[num - 1]
                                //num++;
                                d = hi + b * a
                                mom = d
                                val str1 = mom.toString()
                                j[num] = b * a
                                num++
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '+') {
                            sum = sum + "5"
                            textView.setText(sum)
                            // textView2.setText("hi");
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                                // textView2.setText("hi");
                            } else {
                                //sum = sum + "1";
                                //textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                d = hi + c
                                hi1 = hi
                                //b = hi+(i+c);
                                // hi1=hi+i;
                                // j=i+c;
                                // i=b;
                                mom = d
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                    // textView2.setText("hi");
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '/') {
                            sum = sum + "5"
                            textView.setText(sum)
                            //   sum = sum + "1";
                            //    textView.setText(sum);
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                //  b = hi;
                                // textView2.setText(String.valueOf(j[num-1]));
                                b = hi1 + j[num - 1] / c
                                j[num] = j[num - 1] / c
                                num++
                                //textView2.setText(String.valueOf(j[num-1]));
                                // hi=hi1+a;
                                // hi=d;
                                // i=a/c;
                                //   e=a/c;
                                // hi=b;
                                //  b=b/a;
                                mom = b
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == 'x') {
                            sum = sum + "5"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                // sum = sum + "1";
                                //   textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                //  b = hi;
                                b = hi1 + j[num - 1] * c
                                j[num] = j[num - 1] * c
                                num++
                                //   hi=hi1+j;
                                //  i=a*c;
                                //  e1=a*c;
                                // hi=b;
                                //  b=b/a;
                                //textView2.setText(String.valueOf(num));
                                mom = b
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                                // b=a*c;
                            }
                        }
                    }
                } else  /* if(sum.endsWith("1"))*/ {
                    if (sum.length >= bhanu) {
                        if (bhanu > 0 && sum[bhanu - 1] == '+') {
                            sum = sum + "5"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                d = hi + c
                                hi1 = hi
                                //b = hi+(i+c);
                                // hi1=hi+i;
                                // j=i+c;
                                // i=b;
                                mom = d
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '-') {
                            sum = sum + "5"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                d = hi - c
                                hi1 = hi
                                //   hi1=hi+b;
                                c = -c
                                // e=a;
                                mom = d
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '%') {
                            j[num - 1] = j[num - 1] / a
                            sum = sum + "5"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                a = sum1.toDouble()
                                b = j[num - 1]
                                // num++;
                                d = hi + b * a
                                mom = d
                                val str1 = mom.toString()
                                j[num] = b * a
                                num++
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '/') {
                            j[num - 1] = j[num - 1] * c
                            //num++;
                            sum = sum + "5"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                //  b = hi;
                                //  textView2.setText(String.valueOf(j[num-1]));
                                b = hi1 + j[num - 1] / c
                                j[num] = j[num - 1] / c
                                num++
                                // textView2.setText(String.valueOf(j[num-1]));
                                // hi=hi1+a;
                                // hi=d;
                                // i=a/c;
                                //   e=a/c;
                                // hi=b;
                                //  b=b/a;
                                mom = b
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == 'x') {
                            j[num - 1] = j[num - 1] / c
                            //num++;
                            sum = sum + "5"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                //  b = hi;
                                b = hi1 + j[num - 1] * c
                                j[num] = j[num - 1] * c
                                num++
                                // textView2.setText(String.valueOf(num));
                                //   hi=hi1+j;
                                //  i=a*c;
                                //  e1=a*c;
                                // hi=b;
                                //  b=b/a;
                                mom = b
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                                //  b=a*c;
                            }
                        }
                    } else {
                        if (sum[sum.length - 1] == '+') {
                            sum = sum + "5"
                            textView.setText(sum)
                            sum1 = sum.substring(sum.length - 1, sum.length)
                            a = sum1.toDouble()
                            b = hi
                            b = b + a
                            val str1 = b.toString()
                            if (str1.substring(str1.length - 2) == ".0") {
                                textView2.setText(str1.substring(0, str1.length - 2))
                            } else {
                                textView2.setText(str1)
                                // textView2.setText("hi");
                            }
                        }
                    }
                }
            }

        b6.setOnClickListener{
                if (sum === "" || sum2.endsWith("=")) {
                    sum = "6"
                    sum2 = ""
                    textView.setText(sum)
                    textView2.setText(sum2)
                } else if (bhanu == 0) {
                    if (sum.endsWith("1") || sum.endsWith("-") || sum.endsWith(".") || sum.endsWith("2") || sum.endsWith("3") || sum.endsWith("4") || sum.endsWith("5") || sum.endsWith("6") || sum.endsWith("7") || sum.endsWith("8") || sum.endsWith("9") || sum.endsWith("0") || sum.endsWith("00")) {
                        sum = sum + "6"
                        textView.setText(sum)
                    }
                } else if (sum.endsWith("+") || sum.endsWith("%") || sum.endsWith("/") || sum.endsWith("-") || sum.endsWith("x")) {
                    if (sum.length >= bhanu) {
                        if (bhanu > 0 && sum[bhanu - 1] == '-') {
                            sum = sum + "6"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                d = hi - c
                                hi1 = hi
                                //   hi1=hi+b;
                                c = -c
                                // e=a;
                                mom = d
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '%') {
                            sum = sum + "6"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                //  sum = sum + "1";
                                //textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length)
                                a = sum1.toDouble()
                                b = j[num - 1]
                                //num++;
                                d = hi + b * a
                                mom = d
                                val str1 = mom.toString()
                                j[num] = b * a
                                num++
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '+') {
                            sum = sum + "6"
                            textView.setText(sum)
                            // textView2.setText("hi");
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                                // textView2.setText("hi");
                            } else {
                                //sum = sum + "1";
                                //textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                d = hi + c
                                hi1 = hi
                                //b = hi+(i+c);
                                // hi1=hi+i;
                                // j=i+c;
                                // i=b;
                                mom = d
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                    // textView2.setText("hi");
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '/') {
                            sum = sum + "6"
                            textView.setText(sum)
                            //   sum = sum + "1";
                            //    textView.setText(sum);
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                //  b = hi;
                                // textView2.setText(String.valueOf(j[num-1]));
                                b = hi1 + j[num - 1] / c
                                j[num] = j[num - 1] / c
                                num++
                                //textView2.setText(String.valueOf(j[num-1]));
                                // hi=hi1+a;
                                // hi=d;
                                // i=a/c;
                                //   e=a/c;
                                // hi=b;
                                //  b=b/a;
                                mom = b
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == 'x') {
                            sum = sum + "6"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                // sum = sum + "1";
                                //   textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                //  b = hi;
                                b = hi1 + j[num - 1] * c
                                j[num] = j[num - 1] * c
                                num++
                                //   hi=hi1+j;
                                //  i=a*c;
                                //  e1=a*c;
                                // hi=b;
                                //  b=b/a;
                                //textView2.setText(String.valueOf(num));
                                mom = b
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                                // b=a*c;
                            }
                        }
                    }
                } else  /* if(sum.endsWith("1"))*/ {
                    if (sum.length >= bhanu) {
                        if (bhanu > 0 && sum[bhanu - 1] == '+') {
                            sum = sum + "6"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                d = hi + c
                                hi1 = hi
                                //b = hi+(i+c);
                                // hi1=hi+i;
                                // j=i+c;
                                // i=b;
                                mom = d
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '-') {
                            sum = sum + "6"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                d = hi - c
                                hi1 = hi
                                //   hi1=hi+b;
                                c = -c
                                // e=a;
                                mom = d
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '%') {
                            j[num - 1] = j[num - 1] / a
                            sum = sum + "6"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                a = sum1.toDouble()
                                b = j[num - 1]
                                // num++;
                                d = hi + b * a
                                mom = d
                                val str1 = mom.toString()
                                j[num] = b * a
                                num++
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '/') {
                            j[num - 1] = j[num - 1] * c
                            //num++;
                            sum = sum + "6"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                //  b = hi;
                                //  textView2.setText(String.valueOf(j[num-1]));
                                b = hi1 + j[num - 1] / c
                                j[num] = j[num - 1] / c
                                num++
                                // textView2.setText(String.valueOf(j[num-1]));
                                // hi=hi1+a;
                                // hi=d;
                                // i=a/c;
                                //   e=a/c;
                                // hi=b;
                                //  b=b/a;
                                mom = b
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == 'x') {
                            j[num - 1] = j[num - 1] / c
                            //num++;
                            sum = sum + "6"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                //  b = hi;
                                b = hi1 + j[num - 1] * c
                                j[num] = j[num - 1] * c
                                num++
                                // textView2.setText(String.valueOf(num));
                                //   hi=hi1+j;
                                //  i=a*c;
                                //  e1=a*c;
                                // hi=b;
                                //  b=b/a;
                                mom = b
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                                //  b=a*c;
                            }
                        }
                    } else {
                        if (sum[sum.length - 1] == '+') {
                            sum = sum + "6"
                            textView.setText(sum)
                            sum1 = sum.substring(sum.length - 1, sum.length)
                            a = sum1.toDouble()
                            b = hi
                            b = b + a
                            val str1 = b.toString()
                            if (str1.substring(str1.length - 2) == ".0") {
                                textView2.setText(str1.substring(0, str1.length - 2))
                            } else {
                                textView2.setText(str1)
                                // textView2.setText("hi");
                            }
                        }
                    }
                }
        }
        b7.setOnClickListener{

                if (sum === "" || sum2.endsWith("=")) {
                    sum = "7"
                    sum2 = ""
                    textView.setText(sum)
                    textView2.setText(sum2)
                } else if (bhanu == 0) {
                    if (sum.endsWith("1") || sum.endsWith("-") || sum.endsWith(".") || sum.endsWith("2") || sum.endsWith("3") || sum.endsWith("4") || sum.endsWith("5") || sum.endsWith("6") || sum.endsWith("7") || sum.endsWith("8") || sum.endsWith("9") || sum.endsWith("0") || sum.endsWith("00")) {
                        sum = sum + "7"
                        textView.setText(sum)
                    }
                } else if (sum.endsWith("+") || sum.endsWith("%") || sum.endsWith("/") || sum.endsWith("-") || sum.endsWith("x")) {
                    if (sum.length >= bhanu) {
                        if (bhanu > 0 && sum[bhanu - 1] == '-') {
                            sum = sum + "7"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                d = hi - c
                                hi1 = hi
                                //   hi1=hi+b;
                                c = -c
                                // e=a;
                                mom = d
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '%') {
                            sum = sum + "7"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                //  sum = sum + "1";
                                //textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length)
                                a = sum1.toDouble()
                                b = j[num - 1]
                                //num++;
                                d = hi + b * a
                                mom = d
                                val str1 = mom.toString()
                                j[num] = b * a
                                num++
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '+') {
                            sum = sum + "7"
                            textView.setText(sum)
                            // textView2.setText("hi");
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                                // textView2.setText("hi");
                            } else {
                                //sum = sum + "1";
                                //textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                d = hi + c
                                hi1 = hi
                                //b = hi+(i+c);
                                // hi1=hi+i;
                                // j=i+c;
                                // i=b;
                                mom = d
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                    // textView2.setText("hi");
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '/') {
                            sum = sum + "7"
                            textView.setText(sum)
                            //   sum = sum + "1";
                            //    textView.setText(sum);
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                //  b = hi;
                                // textView2.setText(String.valueOf(j[num-1]));
                                b = hi1 + j[num - 1] / c
                                j[num] = j[num - 1] / c
                                num++
                                //textView2.setText(String.valueOf(j[num-1]));
                                // hi=hi1+a;
                                // hi=d;
                                // i=a/c;
                                //   e=a/c;
                                // hi=b;
                                //  b=b/a;
                                mom = b
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == 'x') {
                            sum = sum + "7"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                // sum = sum + "1";
                                //   textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                //  b = hi;
                                b = hi1 + j[num - 1] * c
                                j[num] = j[num - 1] * c
                                num++
                                //   hi=hi1+j;
                                //  i=a*c;
                                //  e1=a*c;
                                // hi=b;
                                //  b=b/a;
                                //textView2.setText(String.valueOf(num));
                                mom = b
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                                // b=a*c;
                            }
                        }
                    }
                } else  /* if(sum.endsWith("1"))*/ {
                    if (sum.length >= bhanu) {
                        if (bhanu > 0 && sum[bhanu - 1] == '+') {
                            sum = sum + "7"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                d = hi + c
                                hi1 = hi
                                //b = hi+(i+c);
                                // hi1=hi+i;
                                // j=i+c;
                                // i=b;
                                mom = d
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '-') {
                            sum = sum + "7"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                d = hi - c
                                hi1 = hi
                                //   hi1=hi+b;
                                c = -c
                                // e=a;
                                mom = d
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '%') {
                            j[num - 1] = j[num - 1] / a
                            sum = sum + "7"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                a = sum1.toDouble()
                                b = j[num - 1]
                                // num++;
                                d = hi + b * a
                                mom = d
                                val str1 = mom.toString()
                                j[num] = b * a
                                num++
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '/') {
                            j[num - 1] = j[num - 1] * c
                            //num++;
                            sum = sum + "7"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                //  b = hi;
                                //  textView2.setText(String.valueOf(j[num-1]));
                                b = hi1 + j[num - 1] / c
                                j[num] = j[num - 1] / c
                                num++
                                // textView2.setText(String.valueOf(j[num-1]));
                                // hi=hi1+a;
                                // hi=d;
                                // i=a/c;
                                //   e=a/c;
                                // hi=b;
                                //  b=b/a;
                                mom = b
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == 'x') {
                            j[num - 1] = j[num - 1] / c
                            //num++;
                            sum = sum + "7"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                //  b = hi;
                                b = hi1 + j[num - 1] * c
                                j[num] = j[num - 1] * c
                                num++
                                // textView2.setText(String.valueOf(num));
                                //   hi=hi1+j;
                                //  i=a*c;
                                //  e1=a*c;
                                // hi=b;
                                //  b=b/a;
                                mom = b
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                                //  b=a*c;
                            }
                        }
                    } else {
                        if (sum[sum.length - 1] == '+') {
                            sum = sum + "7"
                            textView.setText(sum)
                            sum1 = sum.substring(sum.length - 1, sum.length)
                            a = sum1.toDouble()
                            b = hi
                            b = b + a
                            val str1 = b.toString()
                            if (str1.substring(str1.length - 2) == ".0") {
                                textView2.setText(str1.substring(0, str1.length - 2))
                            } else {
                                textView2.setText(str1)
                                // textView2.setText("hi");
                            }
                        }
                    }
                }
            }

        b8.setOnClickListener{

                if (sum === "" || sum2.endsWith("=")) {
                    sum = "8"
                    sum2 = ""
                    textView.setText(sum)
                    textView2.setText(sum2)
                } else if (bhanu == 0) {
                    if (sum.endsWith("1") || sum.endsWith("-") || sum.endsWith(".") || sum.endsWith("2") || sum.endsWith("3") || sum.endsWith("4") || sum.endsWith("5") || sum.endsWith("6") || sum.endsWith("7") || sum.endsWith("8") || sum.endsWith("9") || sum.endsWith("0") || sum.endsWith("00")) {
                        sum = sum + "8"
                        textView.setText(sum)
                    }
                } else if (sum.endsWith("+") || sum.endsWith("%") || sum.endsWith("/") || sum.endsWith("-") || sum.endsWith("x")) {
                    if (sum.length >= bhanu) {
                        if (bhanu > 0 && sum[bhanu - 1] == '-') {
                            sum = sum + "8"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                d = hi - c
                                hi1 = hi
                                //   hi1=hi+b;
                                c = -c
                                // e=a;
                                mom = d
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '%') {
                            sum = sum + "8"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                //  sum = sum + "1";
                                //textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length)
                                a = sum1.toDouble()
                                b = j[num - 1]
                                //num++;
                                d = hi + b * a
                                mom = d
                                val str1 = mom.toString()
                                j[num] = b * a
                                num++
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '+') {
                            sum = sum + "8"
                            textView.setText(sum)
                            // textView2.setText("hi");
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                                // textView2.setText("hi");
                            } else {
                                //sum = sum + "1";
                                //textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                d = hi + c
                                hi1 = hi
                                //b = hi+(i+c);
                                // hi1=hi+i;
                                // j=i+c;
                                // i=b;
                                mom = d
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                    // textView2.setText("hi");
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '/') {
                            sum = sum + "8"
                            textView.setText(sum)
                            //   sum = sum + "1";
                            //    textView.setText(sum);
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                //  b = hi;
                                // textView2.setText(String.valueOf(j[num-1]));
                                b = hi1 + j[num - 1] / c
                                j[num] = j[num - 1] / c
                                num++
                                //textView2.setText(String.valueOf(j[num-1]));
                                // hi=hi1+a;
                                // hi=d;
                                // i=a/c;
                                //   e=a/c;
                                // hi=b;
                                //  b=b/a;
                                mom = b
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == 'x') {
                            sum = sum + "8"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                // sum = sum + "1";
                                //   textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                //  b = hi;
                                b = hi1 + j[num - 1] * c
                                j[num] = j[num - 1] * c
                                num++
                                //   hi=hi1+j;
                                //  i=a*c;
                                //  e1=a*c;
                                // hi=b;
                                //  b=b/a;
                                //textView2.setText(String.valueOf(num));
                                mom = b
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                                // b=a*c;
                            }
                        }
                    }
                } else  /* if(sum.endsWith("1"))*/ {
                    if (sum.length >= bhanu) {
                        if (bhanu > 0 && sum[bhanu - 1] == '+') {
                            sum = sum + "8"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                d = hi + c
                                hi1 = hi
                                //b = hi+(i+c);
                                // hi1=hi+i;
                                // j=i+c;
                                // i=b;
                                mom = d
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '-') {
                            sum = sum + "8"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                d = hi - c
                                hi1 = hi
                                //   hi1=hi+b;
                                c = -c
                                // e=a;
                                mom = d
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '%') {
                            j[num - 1] = j[num - 1] / a
                            sum = sum + "8"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                a = sum1.toDouble()
                                b = j[num - 1]
                                // num++;
                                d = hi + b * a
                                mom = d
                                val str1 = mom.toString()
                                j[num] = b * a
                                num++
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '/') {
                            j[num - 1] = j[num - 1] * c
                            //num++;
                            sum = sum + "8"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                //  b = hi;
                                //  textView2.setText(String.valueOf(j[num-1]));
                                b = hi1 + j[num - 1] / c
                                j[num] = j[num - 1] / c
                                num++
                                // textView2.setText(String.valueOf(j[num-1]));
                                // hi=hi1+a;
                                // hi=d;
                                // i=a/c;
                                //   e=a/c;
                                // hi=b;
                                //  b=b/a;
                                mom = b
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == 'x') {
                            j[num - 1] = j[num - 1] / c
                            //num++;
                            sum = sum + "8"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                //  b = hi;
                                b = hi1 + j[num - 1] * c
                                j[num] = j[num - 1] * c
                                num++
                                // textView2.setText(String.valueOf(num));
                                //   hi=hi1+j;
                                //  i=a*c;
                                //  e1=a*c;
                                // hi=b;
                                //  b=b/a;
                                mom = b
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                                //  b=a*c;
                            }
                        }
                    } else {
                        if (sum[sum.length - 1] == '+') {
                            sum = sum + "8"
                            textView.setText(sum)
                            sum1 = sum.substring(sum.length - 1, sum.length)
                            a = sum1.toDouble()
                            b = hi
                            b = b + a
                            val str1 = b.toString()
                            if (str1.substring(str1.length - 2) == ".0") {
                                textView2.setText(str1.substring(0, str1.length - 2))
                            } else {
                                textView2.setText(str1)
                                // textView2.setText("hi");
                            }
                        }
                    }
                }

        }
        b9.setOnClickListener {

                if (sum === "" || sum2.endsWith("=")) {
                    sum = "9"
                    sum2 = ""
                    textView.setText(sum)
                    textView2.setText(sum2)
                } else if (bhanu == 0) {
                    if (sum.endsWith("1") || sum.endsWith("-") || sum.endsWith(".") || sum.endsWith("2") || sum.endsWith("3") || sum.endsWith("4") || sum.endsWith("5") || sum.endsWith("6") || sum.endsWith("7") || sum.endsWith("8") || sum.endsWith("9") || sum.endsWith("0") || sum.endsWith("00")) {
                        sum = sum + "9"
                        textView.setText(sum)
                    }
                } else if (sum.endsWith("+") || sum.endsWith("%") || sum.endsWith("/") || sum.endsWith("-") || sum.endsWith("x")) {
                    if (sum.length >= bhanu) {
                        if (bhanu > 0 && sum[bhanu - 1] == '-') {
                            sum = sum + "9"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                d = hi - c
                                hi1 = hi
                                //   hi1=hi+b;
                                c = -c
                                // e=a;
                                mom = d
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '%') {
                            sum = sum + "9"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                //  sum = sum + "1";
                                //textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length)
                                a = sum1.toDouble()
                                b = j[num - 1]
                                //num++;
                                d = hi + b * a
                                mom = d
                                val str1 = mom.toString()
                                j[num] = b * a
                                num++
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '+') {
                            sum = sum + "9"
                            textView.setText(sum)
                            // textView2.setText("hi");
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                                // textView2.setText("hi");
                            } else {
                                //sum = sum + "1";
                                //textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                d = hi + c
                                hi1 = hi
                                //b = hi+(i+c);
                                // hi1=hi+i;
                                // j=i+c;
                                // i=b;
                                mom = d
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                    // textView2.setText("hi");
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '/') {
                            sum = sum + "9"
                            textView.setText(sum)
                            //   sum = sum + "1";
                            //    textView.setText(sum);
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                //  b = hi;
                                // textView2.setText(String.valueOf(j[num-1]));
                                b = hi1 + j[num - 1] / c
                                j[num] = j[num - 1] / c
                                num++
                                //textView2.setText(String.valueOf(j[num-1]));
                                // hi=hi1+a;
                                // hi=d;
                                // i=a/c;
                                //   e=a/c;
                                // hi=b;
                                //  b=b/a;
                                mom = b
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == 'x') {
                            sum = sum + "9"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                // sum = sum + "1";
                                //   textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                //  b = hi;
                                b = hi1 + j[num - 1] * c
                                j[num] = j[num - 1] * c
                                num++
                                //   hi=hi1+j;
                                //  i=a*c;
                                //  e1=a*c;
                                // hi=b;
                                //  b=b/a;
                                //textView2.setText(String.valueOf(num));
                                mom = b
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                                // b=a*c;
                            }
                        }
                    }
                } else  /* if(sum.endsWith("1"))*/ {
                    if (sum.length >= bhanu) {
                        if (bhanu > 0 && sum[bhanu - 1] == '+') {
                            sum = sum + "9"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                d = hi + c
                                hi1 = hi
                                //b = hi+(i+c);
                                // hi1=hi+i;
                                // j=i+c;
                                // i=b;
                                mom = d
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '-') {
                            sum = sum + "9"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                d = hi - c
                                hi1 = hi
                                //   hi1=hi+b;
                                c = -c
                                // e=a;
                                mom = d
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '%') {
                            j[num - 1] = j[num - 1] / a
                            sum = sum + "9"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                a = sum1.toDouble()
                                b = j[num - 1]
                                // num++;
                                d = hi + b * a
                                mom = d
                                val str1 = mom.toString()
                                j[num] = b * a
                                num++
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '/') {
                            j[num - 1] = j[num - 1] * c
                            //num++;
                            sum = sum + "9"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                //  b = hi;
                                //  textView2.setText(String.valueOf(j[num-1]));
                                b = hi1 + j[num - 1] / c
                                j[num] = j[num - 1] / c
                                num++
                                // textView2.setText(String.valueOf(j[num-1]));
                                // hi=hi1+a;
                                // hi=d;
                                // i=a/c;
                                //   e=a/c;
                                // hi=b;
                                //  b=b/a;
                                mom = b
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == 'x') {
                            j[num - 1] = j[num - 1] / c
                            //num++;
                            sum = sum + "9"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                //  b = hi;
                                b = hi1 + j[num - 1] * c
                                j[num] = j[num - 1] * c
                                num++
                                // textView2.setText(String.valueOf(num));
                                //   hi=hi1+j;
                                //  i=a*c;
                                //  e1=a*c;
                                // hi=b;
                                //  b=b/a;
                                mom = b
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                                //  b=a*c;
                            }
                        }
                    } else {
                        if (sum[sum.length - 1] == '+') {
                            sum = sum + "9"
                            textView.setText(sum)
                            sum1 = sum.substring(sum.length - 1, sum.length)
                            a = sum1.toDouble()
                            b = hi
                            b = b + a
                            val str1 = b.toString()
                            if (str1.substring(str1.length - 2) == ".0") {
                                textView2.setText(str1.substring(0, str1.length - 2))
                            } else {
                                textView2.setText(str1)
                                // textView2.setText("hi");
                            }
                        }
                    }
                }
        }
        b0.setOnClickListener{

                if (sum === "" || sum2.endsWith("=")) {
                    sum = "0"
                    sum2 = ""
                    textView.setText(sum)
                    textView2.setText(sum2)
                } else if (bhanu == 0) {
                    if (sum.endsWith("1") || sum.endsWith("-") || sum.endsWith(".") || sum.endsWith("2") || sum.endsWith("3") || sum.endsWith("4") || sum.endsWith("5") || sum.endsWith("6") || sum.endsWith("7") || sum.endsWith("8") || sum.endsWith("9") || sum.endsWith("0") || sum.endsWith("00")) {
                        sum = sum + "0"
                        textView.setText(sum)
                    }
                } else if (sum.endsWith("+") || sum.endsWith("%") || sum.endsWith("/") || sum.endsWith("-") || sum.endsWith("x")) {
                    if (sum.length >= bhanu) {
                        if (bhanu > 0 && sum[bhanu - 1] == '-') {
                            sum = sum + "0"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                d = hi - c
                                hi1 = hi
                                //   hi1=hi+b;
                                c = -c
                                // e=a;
                                mom = d
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '%') {
                            sum = sum + "0"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                //  sum = sum + "1";
                                //textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length)
                                a = sum1.toDouble()
                                b = j[num - 1]
                                //num++;
                                d = hi + b * a
                                mom = d
                                val str1 = mom.toString()
                                j[num] = b * a
                                num++
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '+') {
                            sum = sum + "0"
                            textView.setText(sum)
                            // textView2.setText("hi");
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                                // textView2.setText("hi");
                            } else {
                                //sum = sum + "1";
                                //textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                d = hi + c
                                hi1 = hi
                                //b = hi+(i+c);
                                // hi1=hi+i;
                                // j=i+c;
                                // i=b;
                                mom = d
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                    // textView2.setText("hi");
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '/') {
                            sum = sum + "0"
                            textView.setText(sum)
                            //   sum = sum + "1";
                            //    textView.setText(sum);
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                //  b = hi;
                                // textView2.setText(String.valueOf(j[num-1]));
                                b = hi1 + j[num - 1] / c
                                j[num] = j[num - 1] / c
                                num++
                                //textView2.setText(String.valueOf(j[num-1]));
                                // hi=hi1+a;
                                // hi=d;
                                // i=a/c;
                                //   e=a/c;
                                // hi=b;
                                //  b=b/a;
                                mom = b
                                var str1 = mom.toString()
                                if (str1 === "Infinity" || str1 === "NaN") {
                                    str1 = "Undefined"
                                }
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == 'x') {
                            if (sum.endsWith("0") || sum.endsWith("00")) {
                                sum = sum
                                textView.setText(sum)
                            } else {
                                sum = sum + "0"
                                textView.setText(sum)
                            }
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                // sum = sum + "1";
                                //   textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                //  b = hi;
                                b = hi1 + j[num - 1] * c
                                j[num] = j[num - 1] * c
                                num++
                                //   hi=hi1+j;
                                //  i=a*c;
                                //  e1=a*c;
                                // hi=b;
                                //  b=b/a;
                                //textView2.setText(String.valueOf(num));
                                mom = b
                                var str1 = mom.toString()
                                if (str1 === "Infinity" || str1 === "NaN") {
                                    str1 = "0"
                                    textView2.setText(str1)
                                } else {
                                    if (str1.substring(str1.length - 2) == ".0") {
                                        textView2.setText(str1.substring(0, str1.length - 2))
                                    } else {
                                        textView2.setText(str1)
                                    }
                                }
                                // b=a*c;
                            }
                        }
                    }
                } else  /* if(sum.endsWith("1"))*/ {
                    if (sum.length >= bhanu) {
                        if (bhanu > 0 && sum[bhanu - 1] == '+') {
                            sum = sum + "0"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                d = hi + c
                                hi1 = hi
                                //b = hi+(i+c);
                                // hi1=hi+i;
                                // j=i+c;
                                // i=b;
                                mom = d
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '-') {
                            sum = sum + "0"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                d = hi - c
                                hi1 = hi
                                //   hi1=hi+b;
                                c = -c
                                // e=a;
                                mom = d
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '%') {
                            j[num - 1] = j[num - 1] / a
                            sum = sum + "0"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                a = sum1.toDouble()
                                b = j[num - 1]
                                // num++;
                                d = hi + b * a
                                mom = d
                                val str1 = mom.toString()
                                j[num] = b * a
                                num++
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '/') {
                            //num++;
                            j[num - 1] = j[num - 1] * c
                            if (sum[bhanu] == '0') {
                                sum = sum
                                num--
                                // textView2.setText(String.valueOf(j[num-1]));
                            } else {
                                sum = sum + "0"
                                textView.setText(sum)
                            }
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                //  b = hi;
                                //  textView2.setText(String.valueOf(j[num-1]));
                                b = hi1 + j[num - 1] / c
                                j[num] = j[num - 1] / c
                                num = num + 1
                                // textView2.setText(String.valueOf(j[num-1]));
                                // hi=hi1+a;
                                // hi=d;
                                // i=a/c;
                                // e=a/c;
                                // hi=b;
                                //  b=b/a;
                                mom = b
                                var str1 = mom.toString()
                                if (str1 === "Infinity" || str1 === "NaN") {
                                    str1 = "Undefined"
                                }
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == 'x') {
                            j[num - 1] = j[num - 1] / c
                            //num++;
                            if (sum[bhanu] == '0') {
                                sum = sum
                                num--
                            } else {
                                sum = sum + "0"
                                textView.setText(sum)
                            }
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                //  b = hi;
                                b = hi1 + j[num - 1] * c
                                j[num] = j[num - 1] * c
                                num = num + 1
                                // textView2.setText(String.valueOf(num));
                                //   hi=hi1+j;
                                //  i=a*c;
                                //  e1=a*c;
                                // hi=b;
                                //  b=b/a;
                                mom = b
                                var str1 = mom.toString()
                                if (str1 === "Infinity" || str1 === "NaN") {
                                    str1 = "0"
                                    textView2.setText(str1)
                                } else {
                                    if (str1.substring(str1.length - 2) == ".0") {
                                        textView2.setText(str1.substring(0, str1.length - 2))
                                    } else {
                                        textView2.setText(str1)
                                    }
                                }
                                //  b=a*c;
                            }
                        }
                    } else {
                        if (sum[sum.length - 1] == '+') {
                            sum = sum + "0"
                            textView.setText(sum)
                            sum1 = sum.substring(sum.length - 1, sum.length)
                            a = sum1.toDouble()
                            b = hi
                            b = b + a
                            val str1 = b.toString()
                            if (str1.substring(str1.length - 2) == ".0") {
                                textView2.setText(str1.substring(0, str1.length - 2))
                            } else {
                                textView2.setText(str1)
                                // textView2.setText("hi");
                            }
                        }
                    }
                }
        }
        b00.setOnClickListener {
                if (sum === "" || sum2.endsWith("=")) {
                    sum = "00"
                    sum2 = ""
                    textView.setText(sum)
                    textView2.setText(sum2)
                } else if (bhanu == 0) {
                    if (sum.endsWith("1") || sum.endsWith("-") || sum.endsWith(".") || sum.endsWith("2") || sum.endsWith("3") || sum.endsWith("4") || sum.endsWith("5") || sum.endsWith("6") || sum.endsWith("7") || sum.endsWith("8") || sum.endsWith("9") || sum.endsWith("0") || sum.endsWith("00")) {
                        sum = sum + "00"
                        textView.setText(sum)
                    }
                } else if (sum.endsWith("+") || sum.endsWith("%") || sum.endsWith("/") || sum.endsWith("-") || sum.endsWith("x")) {
                    if (sum.length >= bhanu) {
                        if (bhanu > 0 && sum[bhanu - 1] == '-') {
                            sum = sum + "00"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                d = hi - c
                                hi1 = hi
                                //   hi1=hi+b;
                                c = -c
                                // e=a;
                                mom = d
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '%') {
                            sum = sum + "00"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                //  sum = sum + "1";
                                //textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length)
                                a = sum1.toDouble()
                                b = j[num - 1]
                                //num++;
                                d = hi + b * a
                                mom = d
                                val str1 = mom.toString()
                                j[num] = b * a
                                num++
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '+') {
                            sum = sum + "00"
                            textView.setText(sum)
                            // textView2.setText("hi");
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                                // textView2.setText("hi");
                            } else {
                                //sum = sum + "1";
                                //textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                d = hi + c
                                hi1 = hi
                                //b = hi+(i+c);
                                // hi1=hi+i;
                                // j=i+c;
                                // i=b;
                                mom = d
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                    // textView2.setText("hi");
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '/') {
                            sum = sum + "0"
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                //b = hi;
                                //textView2.setText(String.valueOf(j[num-1]));
                                b = hi1 + j[num - 1] / c
                                j[num] = j[num - 1] / c
                                num = num + 1
                                sum = sum + "0"
                                j[num - 1] = j[num - 1] * c
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                textView.setText(sum)
                                b = hi1 + j[num - 1] / c
                                j[num] = j[num - 1] / c
                                num++
                                // textView2.setText(String.valueOf(j[num-1]));
                                // hi=hi1+a;
                                // hi=d;
                                // i=a/c;
                                //   e=a/c;
                                // hi=b;
                                //  b=b/a;
                                mom = b
                                var str1 = mom.toString()
                                if (str1 === "Infinity" || str1 === "NaN") {
                                    str1 = "Undefined"
                                }
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == 'x') {
                            sum = sum + "0"
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                //b = hi;
                                //textView2.setText(String.valueOf(j[num-1]));
                                b = hi1 + j[num - 1] * c
                                j[num] = j[num - 1] * c
                                // textView2.setText(String.valueOf(j[num]));
                                num = num + 1
                                sum = sum + "0"
                                j[num - 1] = j[num - 1] / c
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                textView.setText(sum)
                                b = hi1 + j[num - 1] * c
                                j[num] = j[num - 1] * c
                                num++
                                // textView2.setText(String.valueOf(j[num-1]));
                                // hi=hi1+a;
                                // hi=d;
                                // i=a/c;
                                //   e=a/c;
                                // hi=b;
                                //  b=b/a;
                                mom = b
                                var str1 = mom.toString()
                                if (str1 === "Infinity" || str1 === "NaN") {
                                    str1 = "Undefined"
                                }
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        }
                    }
                } else  /* if(sum.endsWith("1"))*/ {
                    if (sum.length >= bhanu) {
                        if (bhanu > 0 && sum[bhanu - 1] == '+') {
                            sum = sum + "00"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                d = hi + c
                                hi1 = hi
                                //b = hi+(i+c);
                                // hi1=hi+i;
                                // j=i+c;
                                // i=b;
                                mom = d
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '-') {
                            sum = sum + "00"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                d = hi - c
                                hi1 = hi
                                //   hi1=hi+b;
                                c = -c
                                // e=a;
                                mom = d
                                val str1 = mom.toString()
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '%') {
                            j[num - 1] = j[num - 1] / a
                            sum = sum + "00"
                            textView.setText(sum)
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                a = sum1.toDouble()
                                b = j[num - 1]
                                // num++;
                                d = hi + b * a
                                mom = d
                                val str1 = mom.toString()
                                j[num] = b * a
                                num++
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == '/') {
                            //num++;
                            if (sum[bhanu] == '0') {
                                sum = sum
                                // num--;
                                str1 = "Infinity"
                                if (str1 === "Infinity" || str1 === "NaN") {
                                    str1 = "Undefined"
                                }
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            } else {
                                j[num - 1] = j[num - 1] * c
                                sum = sum + "0"
                                if (bhanu == sum.length) {
                                    textView.setText(sum)
                                } else {
                                    sum1 = sum.substring(bhanu, sum.length)
                                    c = sum1.toDouble()
                                    //b = hi;
                                    //textView2.setText(String.valueOf(j[num-1]));
                                    b = hi1 + j[num - 1] / c
                                    j[num] = j[num - 1] / c
                                    num = num + 1
                                    sum = sum + "0"
                                    j[num - 1] = j[num - 1] * c
                                    sum1 = sum.substring(bhanu, sum.length)
                                    c = sum1.toDouble()
                                    textView.setText(sum)
                                    b = hi1 + j[num - 1] / c
                                    j[num] = j[num - 1] / c
                                    num++
                                    // textView2.setText(String.valueOf(j[num-1]));
                                    // hi=hi1+a;
                                    // hi=d;
                                    // i=a/c;
                                    //   e=a/c;
                                    // hi=b;
                                    //  b=b/a;
                                    mom = b
                                    var str1 = mom.toString()
                                    if (str1 === "Infinity" || str1 === "NaN") {
                                        str1 = "Undefined"
                                    }
                                    if (str1.substring(str1.length - 2) == ".0") {
                                        textView2.setText(str1.substring(0, str1.length - 2))
                                    } else {
                                        textView2.setText(str1)
                                    }
                                }
                            }
                        } else if (bhanu > 0 && sum[bhanu - 1] == 'x') {
                            j[num - 1] = j[num - 1] / c
                            //num++;
                            if (sum[bhanu] == '0') {
                                sum = sum
                                num--
                            } else {
                                sum = sum + "0"
                            }
                            if (bhanu == sum.length) {
                                textView.setText(sum)
                            } else {
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                //  b = hi;
                                b = hi1 + j[num - 1] * c
                                j[num] = j[num - 1] * c
                                num++
                                sum = sum + "0"
                                j[num - 1] = j[num - 1] / c
                                sum1 = sum.substring(bhanu, sum.length)
                                c = sum1.toDouble()
                                textView.setText(sum)
                                b = hi1 + j[num - 1] * c
                                j[num] = j[num - 1] * c
                                num++
                                // textView2.setText(String.valueOf(num));
                                //   hi=hi1+j;
                                //  i=a*c;
                                //  e1=a*c;
                                // hi=b;
                                //  b=b/a;
                                mom = b
                                var str1 = mom.toString()
                                if (str1 === "Infinity" || str1 === "NaN") {
                                    str1 = "0"
                                    textView2.setText(str1)
                                } else {
                                    if (str1.substring(str1.length - 2) == ".0") {
                                        textView2.setText(str1.substring(0, str1.length - 2))
                                    } else {
                                        textView2.setText(str1)
                                    }
                                }
                                //  b=a*c;
                            }
                        }
                    } else {
                        if (sum[sum.length - 1] == '+') {
                            sum = sum + "00"
                            textView.setText(sum)
                            sum1 = sum.substring(sum.length - 1, sum.length)
                            a = sum1.toDouble()
                            b = hi
                            b = b + a
                            val str1 = b.toString()
                            if (str1.substring(str1.length - 2) == ".0") {
                                textView2.setText(str1.substring(0, str1.length - 2))
                            } else {
                                textView2.setText(str1)
                                // textView2.setText("hi");
                            }
                        }
                    }
                }
            }
        bdot.setOnClickListener{

                val c: Int = sum.length - sum.replace(".", "").length
                if (sum === "" || sum === "-") {
                    sum = sum + "0."
                    textView.setText(sum)
                } else if (bhanu == 0) {
                    if (sum.endsWith(".")) {
                        textView.setText(sum)
                    } else if (c == 0) {
                        sum = "$sum."
                        textView.setText(sum)
                    } else {
                        sum = sum
                        textView.setText(sum)
                    }
                } else if (bhanu > 0) {
                    if (sum.length >= bhanu) {
                        val sum2: String = sum.substring(bhanu, sum.length)
                        val e: Int = sum2.length - sum2.replace(".", "").length
                        if (sum.endsWith(".")) {
                            textView.setText(sum)
                        } else if (sum === "") {
                            sum = "0."
                            textView.setText(sum)
                        } else if (sum === "-") {
                            sum = "-."
                            textView.setText(sum)
                            //textView2.setText(sum);
                        } else {
                            if (e == 0) {
                                sum = "$sum."
                                textView.setText(sum)
                                //textView2.setText(sum);
                                // e++;
                            } else if (e > 0) {
                                sum = sum
                                textView.setText(sum)
                                //  textView2.setText(String.valueOf(e));
                            }
                        }
                    } else {
                        textView.setText(sum)
                    }
                }
            }
        bdiv.setOnClickListener {
                if (sum === "") {
                    textView.setText("")
                    sum = ""
                } else if (sum.endsWith("=") || sum.endsWith("+") || sum.endsWith("/") || sum.endsWith("-") || sum.endsWith("x")) {
                    if (sum === "-") {
                        sum = "-"
                        textView.setText(sum)
                    } else {
                        if (sum.endsWith("/-")) {
                            sum = sum.substring(0, sum.length - 2) + "/"
                            textView.setText(sum)
                        } else if (sum.endsWith("x-")) {
                            sum = sum.substring(0, sum.length - 2) + "/"
                            textView.setText(sum)
                        } else if (sum.endsWith("/")) {
                            // j=c;
                            sum = sum.substring(0, sum.length - 1) + "/"
                            textView.setText(sum)
                            // j=a;
                            //hi = hi+j;
                            // textView2.setText(String.valueOf("hi"));
                            //  hi1=hi;
                        } else if (sum.endsWith("x")) {
                            // j=c;
                            sum = sum.substring(0, sum.length - 1) + "/"
                            textView.setText(sum)
                            // j=a;
                            //  hi = hi+j;
                            // textView2.setText(String.valueOf("hi"));
                            //  hi1=hi;
                        } else if (sum.endsWith("+")) {
                            // j=c;
                            sum = sum.substring(0, sum.length - 1) + "/"
                            textView.setText(sum)
                            hi = hi - c
                            hi1 = hi
                            j[num] = c
                            num++
                            //hi = hi;
                            // textView2.setText(String.valueOf("hi"));
                            //  hi1=hi;
                        } else if (sum.endsWith("-")) {
                            // j=c;
                            sum = sum.substring(0, sum.length - 1) + "/"
                            textView.setText(sum)
                            //j=a;
                            hi = hi - c
                            hi1 = hi
                            j[num] = c
                            num++
                            //hi = hi;
                            // textView2.setText(String.valueOf("hi"));
                            //  hi1=hi;
                        }
                    }
                } else {
                    if (sum === "-.") {
                        //sum="-.";
                        sum = sum.substring(0, 2)
                        textView.setText(sum)
                    } else {
                        sum = "$sum/"
                        textView.setText(sum)
                        //bhanu=sum.length()-1;
                        /* if (sum.charAt(0) == 'x') {
                            textView.setText("");
                            sum = "";
                        }*/if (bhanu > 0) {
                            if (sum[bhanu - 1] == 'x') {
                                if (bhanu == sum.length) {
                                    textView.setText(sum)
                                } else {
                                    // sum1 = sum.substring(bhanu, sum.length() - 1);
                                    // a = Double.parseDouble(sum1);
                                    // a = hi * a;
                                    //hi=0;
                                    j[num] = j[num - 1]
                                    num++
                                    // j=a*c;
                                    //a=a*c;
                                    //textView2.setText(String.valueOf(a));
                                    // String str1 = String.valueOf(hi);
                                    //  if (str1.substring(str1.length() - 2).equals(".0")) {
                                    // textView2.setText(str1.substring(0, str1.length() - 2));
                                    //  } else {
                                    //textView2.setText(str1);
                                    //  }
                                    bhanu = sum.length
                                    tej[k] = bhanu
                                    k++
                                    sai = sum.length
                                    // textView2.setText(String.valueOf(bhanu));
                                }
                            } else if (sum[bhanu - 1] == '%') {
                                if (bhanu == sum.length) {
                                    textView.setText(sum)
                                } else {
                                    //sum1 = sum.substring(bhanu, sum.length() - 1);
                                    //a = Double.parseDouble(sum1);
                                    //hi = (hi) * a;
                                    //  j=c;
                                    hi1 = hi
                                    j = j
                                    //  a=d;
                                    //hi=0;
                                    //textView2.setText("hi");
                                    // String str1 = String.valueOf(hi);
                                    //if (str1.substring(str1.length() - 2).equals(".0")) {
                                    //  textView2.setText(str1.substring(0, str1.length() - 2));
                                    //  } else {
                                    //   textView2.setText(str1);
                                    //  }
                                    bhanu = sum.length
                                    tej[k] = bhanu
                                    k++
                                    sai = sum.length
                                    // textView2.setText(String.valueOf(bhanu));
                                }
                            } else if (sum[bhanu - 1] == '/') {
                                if (bhanu == sum.length) {
                                    textView.setText(sum)
                                } else {
                                    // sum1 = sum.substring(bhanu, sum.length() - 1);
                                    // a = Double.parseDouble(sum1);
                                    // hi = 0;
                                    e = a / c
                                    j[num] = j[num - 1]
                                    num++
                                    //textView2.setText(String.valueOf("hi"));
                                    //  a=a/c;
                                    //textView2.setText(String.valueOf(e));
                                    // String str1 = String.valueOf(hi);
                                    //  if (str1.substring(str1.length() - 2).equals(".0")) {
                                    // textView2.setText(str1.substring(0, str1.lengt
                                    // h() - 2));
                                    //   } else {
                                    //textView2.setText(str1);
                                    //  }
                                    bhanu = sum.length
                                    tej[k] = bhanu
                                    k++
                                    sai = sum.length
                                    // textView2.setText(String.valueOf(bhanu));
                                }
                            } else if (sum[bhanu - 1] == '+') {
                                if (bhanu == sum.length) {
                                    textView.setText(sum)
                                } else {
                                    sum1 = sum.substring(bhanu, sum.length - 1)
                                    c = sum1.toDouble()
                                    //  hi = hi+a;
                                    //hi=hi-a;
                                    j[num] = c
                                    num++
                                    val str1 = hi.toString()
                                    if (str1.substring(str1.length - 2) == ".0") {
                                        // textView2.setText(str1.substring(0, str1.length() - 2));
                                    } else {
                                        // textView2.setText(str1);
                                    }
                                    bhanu = sum.length
                                    tej[k] = bhanu
                                    k++
                                    sai = sum.length
                                    // hi=hi-a;
                                    // textView2.setText(String.valueOf(bhanu));
                                }
                            } else if (sum[bhanu - 1] == '-') {
                                if (bhanu == sum.length) {
                                    textView.setText(sum)
                                } else {
                                    sum1 = sum.substring(bhanu, sum.length - 1)
                                    c = sum1.toDouble()
                                    j[num] = -c
                                    c = -c
                                    num++
                                    // textView2.setText(sum1);
                                    // a = Double.parseDouble(sum1);
                                    // textView2.setText(String.valueOf(hi));
                                    hi = hi
                                    // a=-a;
                                    //textView2.setText(String.valueOf(a-hi));
                                    //String str1 = String.valueOf(hi);
                                    // if (str1.substring(str1.length() - 2).equals(".0")) {
                                    // textView2.setText(str1.substring(0, str1.length() - 2));
                                    //  } else {
                                    //textView2.setText(str1);
                                }
                                bhanu = sum.length
                                tej[k] = bhanu
                                k++
                                sai = sum.length
                                //  hi=hi+a;
                                // textView2.setText(String.valueOf(bhanu));
                            }
                        } else {
                            sum1 = sum.substring(bhanu, sum.length - 1)
                            a = sum1.toDouble()
                            // hi = a;
                            j[num] = a
                            num++
                            textView2.setText("")
                            //textView2.setText(String.valueOf(hi));
                            bhanu = sum.length
                            tej[k] = bhanu
                            k++
                            sum2 = ""
                            sai = sum.length
                        }
                    }
                }
        }
        bx.setOnClickListener {
                if (sum === "") {
                    textView.setText("")
                    sum = ""
                } else if (sum.endsWith("=") || sum.endsWith("+") || sum.endsWith("/") || sum.endsWith("-") || sum.endsWith("x")) {
                    if (sum === "-") {
                        sum = "-"
                        textView.setText(sum)
                    } else {
                        if (sum.endsWith("/-")) {
                            sum = sum.substring(0, sum.length - 2) + "x"
                            textView.setText(sum)
                        } else if (sum.endsWith("x-")) {
                            sum = sum.substring(0, sum.length - 2) + "x"
                            textView.setText(sum)
                            //textView2.setText(String.valueOf(num));
                        } else if (sum.endsWith("/")) {
                            // j=c;
                            sum = sum.substring(0, sum.length - 1) + "x"
                            textView.setText(sum)
                            // j=a;
                            //hi = hi+j;
                            // textView2.setText(String.valueOf("hi"));
                            //  hi1=hi;
                        } else if (sum.endsWith("x")) {
                            // j=c;
                            sum = sum.substring(0, sum.length - 1) + "x"
                            textView.setText(sum)
                            // j=a;
                            //  hi = hi+j;
                            // textView2.setText(String.valueOf("hi"));
                            //  hi1=hi;
                        } else if (sum.endsWith("+")) {
                            // j=c;
                            sum = sum.substring(0, sum.length - 1) + "x"
                            textView.setText(sum)
                            hi = hi - c
                            hi1 = hi
                            j[num] = c
                            num++
                            //  textView2.setText(String.valueOf(j[num-1]));
                            // hi1=e;
                            //hi = hi;
                            //  textView2.setText(String.valueOf(hi1));
                            //  hi1=hi;
                        } else if (sum.endsWith("-")) {
                            // j=c;
                            sum = sum.substring(0, sum.length - 1) + "x"
                            textView.setText(sum)
                            hi = hi - c
                            hi1 = hi
                            j[num] = c
                            num++
                            //  hi1=e;
                            //hi = hi;
                            // textView2.setText(String.valueOf(j[num-1]));
                            //  hi1=hi;
                        }
                    }
                } else {
                    if (sum === "-.") {
                        //sum="-.";
                        sum = sum.substring(0, 2)
                        textView.setText(sum)
                    } else {
                        sum = sum + "x"
                        textView.setText(sum)
                        // textView2.setText("hiygygygyugygyugu");
                        /*if (sum.charAt(0) == 'x') {
                            textView.setText("");

                            sum = "";
                        }*/if (bhanu > 0) {
                            if (sum[bhanu - 1] == 'x') {
                                if (bhanu == sum.length) {
                                    textView.setText(sum)
                                } else {
                                    sum1 = sum.substring(bhanu, sum.length - 1)
                                    // a = Double.parseDouble(sum1);
                                    // hi = 0;
                                    //  e=a*c;
                                    // a=a*c;
                                    j[num] = j[num - 1]
                                    num++
                                    //   textView2.setText("hi");
                                    /* String str1 = String.valueOf(hi);
                                    if (str1.substring(str1.length() - 2).equals(".0")) {
                                       // textView2.setText(str1.substring(0, str1.length() - 2));
                                    } else {
                                      //  textView2.setText(str1);
                                    }*/bhanu = sum.length
                                    tej[k] = bhanu
                                    k++
                                    sai = sum.length
                                    // textView2.setText(String.valueOf(bhanu));
                                }
                            } else if (sum[bhanu - 1] == '%') {
                                // sum=sum+"x";
                                // bhanu=sum.length();
                                // textView2.setText("hi");
                                // bhanu=0;
                                // j=c;
                                hi1 = hi
                                j[num] = j[num]
                                // textView2.setText(String.valueOf(j));
                                /*  if(c==d){
                                    a=c;
                                    textView2.setText(String.valueOf(a));
                                   // textView2.setText("ji");
                                }
                                else if(sum.charAt(sai-1)=='+'){
                                    a=c;
                                }
                                else {
                                    a=d;
                                    //textView2.setText(String.valueOf(a));
                                    //textView2.setText("hi2");
                                }*/
                                //textView2.setText(String.valueOf(a));
                                // hi=0;
                                if (bhanu == sum.length) {
                                    // textView.setText(sum);
                                } else {
                                    sum1 = sum.substring(bhanu, sum.length - 1)
                                    // a = Double.parseDouble(sum1);
                                    // hi = (hi)/a;
                                    val str1 = hi.toString()
                                    //  textView2.setText("hi");
                                    if (str1.substring(str1.length - 2) == ".0") {
                                        // textView2.setText(str1.substring(0, str1.length() - 2));
                                    } else {
                                        // textView2.setText(str1);
                                    }
                                    bhanu = sum.length
                                    tej[k] = bhanu
                                    k++
                                    sai = sum.length
                                    // textView2.setText(String.valueOf(sai));
                                }
                            } else if (sum[bhanu - 1] == '/') {
                                if (bhanu == sum.length) {
                                    textView.setText(sum)
                                } else {
                                    //  sum1 = sum.substring(bhanu, sum.length() - 1);
                                    // a = Double.parseDouble(sum1);
                                    //hi = hi/a ;
                                    //hi=0;
                                    //e=a/c;
                                    //  j=a/c;
                                    j[num] = j[num - 1]
                                    num++
                                    //textView2.setText(String.valueOf(a));
                                    val str1 = hi.toString()
                                    if (str1.substring(str1.length - 2) == ".0") {
                                        //  textView2.setText(str1.substring(0, str1.length() - 2));
                                    } else {
                                        // textView2.setText(str1);
                                    }
                                    bhanu = sum.length
                                    tej[k] = bhanu
                                    k++
                                    sai = sum.length
                                    // textView2.setText(String.valueOf(bhanu));
                                }
                            } else if (sum[bhanu - 1] == '+') {
                                if (bhanu == sum.length) {
                                    textView.setText(sum)
                                } else {
                                    sum1 = sum.substring(bhanu, sum.length - 1)
                                    c = sum1.toDouble()
                                    // hi = hi + a;
                                    j[num] = c
                                    num++
                                    // textView2.setText(String.valueOf(hi));
                                    // String str1 = String.valueOf(hi);
                                    // textView2.setText("hi");
                                    /*  if (str1.substring(str1.length() - 2).equals(".0")) {
                                     //   textView2.setText(str1.substring(0, str1.length() - 2));
                                    } else {
                                       // textView2.setText(str1);
                                    }*/bhanu = sum.length
                                    tej[k] = bhanu
                                    k++
                                    // hi=hi-a;
                                    sai = sum.length
                                    // textView2.setText(String.valueOf(bhanu));
                                }
                            } else if (sum[bhanu - 1] == '-') {
                                if (bhanu == sum.length) {
                                    textView.setText(sum)
                                } else {
                                    sum1 = sum.substring(bhanu, sum.length - 1)
                                    c = sum1.toDouble()
                                    j[num] = -c
                                    c = -c
                                    num++
                                    //hi = hi - a;
                                    // hi=hi;
                                    hi = hi
                                    //a=-a;
                                    val str1 = hi.toString()
                                    if (str1.substring(str1.length - 2) == ".0") {
                                        // textView2.setText(str1.substring(0, str1.length() - 2));
                                    } else {
                                        //textView2.setText(str1);
                                    }
                                    bhanu = sum.length
                                    tej[k] = bhanu
                                    k++
                                    sai = sum.length
                                    // textView2.setText(String.valueOf(bhanu));
                                }
                            }
                        } else {
                            sum1 = sum.substring(bhanu, sum.length - 1)
                            a = sum1.toDouble()
                            // a=c;
                            j[num] = a
                            num++
                            //textView2.setText(String.valueOf(num));
                            //textView2.setText("");
                            // hi = a;
                            // textView2.setText(String.valueOf("hi"));
                            bhanu = sum.length
                            tej[k] = bhanu
                            k++
                            sum2 = ""
                            sai = sum.length
                        }
                    }
                }
        }
        bminus.setOnClickListener{
                if (sum === "" && f != 0) {
                    sum = "$sum-"
                    //bhanu=sum.length();
                    textView.setText(sum)
                    // sum = "";
                    // textView2.setText("hi");
                } else if (sum.endsWith("+")) {
                    //sum = sum.replace('+', '-');
                    sum = sum.substring(0, sum.length - 1) + "-"
                    textView.setText(sum)
                } else if (sum.endsWith("-")) {
                    sum = sum.replace('-', '-')
                    textView.setText(sum)
                } else if (sum.endsWith("x")) {
                    // sum = sum.replace('x','x' );
                    sum = "$sum-"
                    //textView2.setText(String.valueOf(j[num-1]));
                    textView.setText(sum)
                    //j[num-1] =hi1+j[num-1];
                    // num++;
                    //hi = hi+j;
                } else if (sum.endsWith("/")) {
                    //  sum = sum.replace('/','-' );
                    sum = "$sum-"
                    textView.setText(sum)
                    //j[num-1] =hi1+j[num-1];
                    // num++;
                    //hi = hi+j;
                } /*else if (sum.endsWith("%")) {
                    //sum = sum.replace('%','-' );
                    sum = sum + "-";
                    textView.setText(sum);
                  //  textView2.setText(sum);
                    bhanu=sum.length();
                }*/ else if (sum.endsWith("=")) {
                    sum = sum.replace('=', '-')
                    textView.setText(sum)
                } else {
                    if (sum === "-.") {
                        //sum="-.";
                        sum = sum.substring(0, 2)
                        textView.setText(sum)
                    } else {
                        if (f == 0 && sum === "") {
                            textView.setText("-")
                            sum = "-"
                            f++
                        } else {
                            // sum = sum + "-";
                            //textView.setText(sum);
                            sum = "$sum-"
                            textView.setText(sum)
                            if (bhanu > 0) {
                                if (sum[bhanu - 1] == '+') {
                                    if (bhanu == sum.length) {
                                        textView.setText(sum)
                                    } else {
                                        sum1 = sum.substring(bhanu, sum.length - 1)
                                        a = sum1.toDouble()
                                        // hi = hi + a;
                                        hi = d
                                        bye = hi
                                        hi1 = hi
                                        //a=a;
                                        e = d - c
                                        //textView2.setText(String.valueOf(e));
                                        //e=Math.round(e);
                                        //  DecimalFormat df=new DecimalFormat("#.###");
                                        // str1=df.format(e);
                                        // e=Double.valueOf(str1);
                                        //   textView2.setText(String.valueOf(e));
                                        /* String str1 = String.valueOf(hi);
                                       if (str1.substring(str1.length() - 2).equals(".0")) {
                                          // textView2.setText(str1.substring(0, str1.length() - 2));
                                       } else {
                                          // textView2.setText(str1);
                                       }*/bhanu = sum.length
                                        tej[k] = bhanu
                                        k++
                                        sai = sum.length
                                        // textView2.setText(String.valueOf(bhanu));
                                    }
                                } else if (sum[bhanu - 1] == '%') {
                                    if (bhanu == sum.length) {
                                        textView.setText(sum)
                                    } else {
                                        //sum1 = sum.substring(bhanu, sum.length() - 1);
                                        // a = Double.parseDouble(sum1);
                                        // hi = (hi) * a;
                                        if (hi == 0.0) {
                                            hi = d
                                            e = hi
                                            hi1 = e
                                        } else {
                                            hi = d
                                            e = hi - j[num] * hi
                                            a = j[num]
                                            num++
                                            e = java.lang.Math.round(e).toDouble()
                                            hi1 = e
                                        }
                                        //textView2.setText(String.valueOf(hi));
                                        val str1 = hi.toString()
                                        if (str1.substring(str1.length - 2) == ".0") {
                                            // textView2.setText(str1.substring(0, str1.length() - 2));
                                        } else {
                                            //  textView2.setText(str1);
                                        }
                                        bhanu = sum.length
                                        tej[k] = bhanu
                                        k++
                                        sai = sum.length
                                        // textView2.setText(String.valueOf(bhanu));
                                    }
                                } else if (sum[bhanu - 1] == '-') {
                                    if (bhanu == sum.length) {
                                        textView.setText(sum)
                                    } else {
                                        sum1 = sum.substring(bhanu, sum.length - 1)
                                        a = sum1.toDouble()
                                        hi = d
                                        bye = hi
                                        hi1 = hi
                                        //j=-a;
                                        //  hi = hi - a;
                                        //hi=hi;
                                        e = d - c
                                        a = -a
                                        //textView2.setText(String.valueOf(a));
                                        // a=-a;
                                        val str1 = hi.toString()
                                        if (str1.substring(str1.length - 2) == ".0") {
                                            //  textView2.setText(str1.substring(0, str1.length() - 2));
                                        } else {
                                            // textView2.setText(str1);
                                        }
                                        bhanu = sum.length
                                        tej[k] = bhanu
                                        k++
                                        sai = sum.length
                                        // textView2.setText(String.valueOf(bhanu));
                                    }
                                } else if (sum[bhanu - 1] == '/') {
                                    if (bhanu == sum.length) {
                                        textView.setText(sum)
                                    } else {
                                        // sum1 = sum.substring(bhanu, sum.length() - 1);
                                        //  a = Double.parseDouble(sum1);
                                        hi = b
                                        //num--;
                                        val str1 = hi.toString()
                                        if (str1.substring(str1.length - 2) == ".0") {
                                            //  textView2.setText(str1.substring(0, str1.length() - 2));
                                        } else {
                                            //  textView2.setText(str1);
                                        }
                                        bhanu = sum.length
                                        tej[k] = bhanu
                                        k++
                                        sai = sum.length
                                        // textView2.setText(String.valueOf(bhanu));
                                    }
                                } else if (sum[bhanu - 1] == 'x') {
                                    if (bhanu == sum.length) {
                                        textView.setText(sum)
                                    } else {
                                        // sum1 = sum.substring(bhanu, sum.length() - 1);
                                        //  a = Double.parseDouble(sum1);
                                        hi = b
                                        hi1 = hi
                                        // num--;
                                        // textView2.setText(String.valueOf(hi));
                                        //String str1 = String.valueOf(hi);
                                        //if (str1.substring(str1.length() - 2).equals(".0")) {
                                        //textView2.setText(str1.substring(0, str1.length() - 2));
                                        // } else {
                                        // textView2.setText(str1);
                                        // }
                                        bhanu = sum.length
                                        tej[k] = bhanu
                                        k++
                                        sai = sum.length
                                        // textView2.setText(String.valueOf(bhanu));
                                    }
                                }
                            } else {
                                sum1 = sum.substring(bhanu, sum.length - 1)
                                a = sum1.toDouble()
                                hi = a
                                c = a
                                bye = hi
                                hi1 = hi
                                textView2.setText("")
                                //textView2.setText(String.valueOf(hi));
                                bhanu = sum.length
                                tej[k] = bhanu
                                k++
                                sum2 = ""
                                sai = sum.length
                            }
                        }
                    }
                }
            }
        bplus.setOnClickListener {

                if (sum === "") {
                    textView.setText("")
                    sum = ""
                } else if (sum.endsWith("=") || sum.endsWith("+") || sum.endsWith("/") || sum.endsWith("-") || sum.endsWith("x")) {
                    if (sum === "-") {
                        sum = "-"
                        textView.setText(sum)
                    } else {
                        if (sum.endsWith("/-")) {
                            sum = sum.substring(0, sum.length - 2) + "+"
                            textView.setText(sum)
                            hi = hi1 + c
                            num--
                            textView2.setText(num.toString())
                            //textView2.setText(String.valueOf(hi1));
                            // num++;
                        } else if (sum.endsWith("x-")) {
                            sum = sum.substring(0, sum.length - 2) + "+"
                            textView.setText(sum)
                            hi = hi1 + c
                            num--
                            // num++;
                        } else if (sum.endsWith("/")) {
                            // j=c;
                            sum = sum.substring(0, sum.length - 1) + "+"
                            textView.setText(sum)
                            hi = hi1 + j[num - 1]
                            num++
                            // j=a;
                            // textView2.setText(String.valueOf("hi"));
                            //  hi1=hi;
                        } else if (sum.endsWith("x")) {
                            // j=c;
                            sum = sum.substring(0, sum.length - 1) + "+"
                            textView.setText(sum)
                            hi = hi1 + j[num - 1]
                            num++
                            // j=a;
                            // textView2.setText(String.valueOf("hi"));
                            //  hi1=hi;
                        } else if (sum.endsWith("-")) {
                            // j=c;
                            sum = sum.substring(0, sum.length - 1) + "+"
                            textView.setText(sum)
                            // j=a;
                            hi = hi
                            // textView2.setText(String.valueOf("hi"));
                            //  hi1=hi;
                        }
                    }
                } else {
                    if (sum === "-.") {
                        //sum="-.";
                        sum = sum.substring(0, 2)
                        textView.setText(sum)
                    } else {
                        sum = "$sum+"
                        /*  SpannableString ss=new SpannableString(sum);
                        ss.setSpan(new ForegroundColorSpan(Color.parseColor("#5b39c6")),bhanu+1,sum.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);*/textView.setText(sum)
                        /* if (sum.charAt(0) == 'x') {
                            textView.setText("");
                            sum = "";
                        }*/if (bhanu > 0) {
                            if (sum[bhanu - 1] == 'x') {
                                if (bhanu == sum.length) {
                                    textView.setText(sum)
                                } else {
                                    // sum1 = sum.substring(bhanu, sum.length() - 1);
                                    //  a = Double.parseDouble(sum1);
                                    hi = b
                                    hi1 = hi
                                    //num--;
                                    val str1 = hi.toString()
                                    if (str1.substring(str1.length - 2) == ".0") {
                                        // textView2.setText(str1.substring(0, str1.length() - 2));
                                    } else {
                                        // textView2.setText(str1);
                                    }
                                    bhanu = sum.length
                                    sai = sum.length
                                    tej[k] = bhanu
                                    k++
                                    // textView2.setText(String.valueOf(bhanu));
                                }
                            } else if (sum[bhanu - 1] == '%') {
                                if (bhanu == sum.length) {
                                    textView.setText(sum)
                                } else {
                                    // sum=sum+"+";
                                    // bhanu=sum.length();
                                    //  sum1 = sum.substring(bhanu, sum.length() - 1);
                                    // a = Double.parseDouble(sum1);
                                    // hi = (hi) * a;
                                    if (hi == 0.0) {
                                        hi = d
                                        e = hi
                                        hi1 = e
                                    } else {
                                        hi = d
                                        e = hi - j[num - 1] * hi
                                        a = j[num - 1]
                                        num++
                                        e = java.lang.Math.round(e).toDouble()
                                        hi1 = e
                                    }
                                    //DecimalFormat df=new DecimalFormat("#.###");
                                    //  str1=df.format(e);
                                    //e=Double.valueOf(str1);
                                    //textView2.setText(String.valueOf("hi"));
                                    val str1 = hi.toString()
                                    if (str1.substring(str1.length - 2) == ".0") {
                                        // textView2.setText(str1.substring(0, str1.length() - 2));
                                    } else {
                                        //  textView2.setText(str1);
                                    }
                                    bhanu = sum.length
                                    sai = sum.length
                                    tej[k] = bhanu
                                    k++
                                    // textView2.setText(String.valueOf(bhanu));
                                }
                            } else if (sum[bhanu - 1] == '/') {
                                if (bhanu == sum.length) {
                                    textView.setText(sum)
                                } else {
                                    // sum1 = sum.substring(bhanu, sum.length() - 1);
                                    //  a = Double.parseDouble(sum1);
                                    hi = b
                                    //textView2.setText(String.valueOf(j[num-1]));
                                    //  num--;
                                    val str1 = hi.toString()
                                    if (str1.substring(str1.length - 2) == ".0") {
                                        //  textView2.setText(str1.substring(0, str1.length() - 2));
                                    } else {
                                        //  textView2.setText(str1);
                                    }
                                    bhanu = sum.length
                                    sai = sum.length
                                    tej[k] = bhanu
                                    k++
                                    // textView2.setText(String.valueOf(bhanu));
                                }
                            } else if (sum[bhanu - 1] == '+') {
                                if (bhanu == sum.length) {
                                    textView.setText(sum)
                                } else {
                                    sum1 = sum.substring(bhanu, sum.length - 1)
                                    a = sum1.toDouble()
                                    hi = d
                                    bye = hi
                                    hi1 = hi
                                    e = d - c
                                    //  hi = hi + a;
                                    val str1 = hi.toString()
                                    if (str1.substring(str1.length - 2) == ".0") {
                                        // textView2.setText(str1.substring(0, str1.length() - 2));
                                    } else {
                                        // textView2.setText(str1);
                                    }
                                    bhanu = sum.length
                                    sai = sum.length
                                    tej[k] = bhanu
                                    k++
                                    // textView2.setText(String.valueOf(bhanu));
                                }
                            } else if (sum[bhanu - 1] == '-') {
                                if (bhanu == sum.length) {
                                    textView.setText(sum)
                                } else {
                                    sum1 = sum.substring(bhanu, sum.length - 1)
                                    hi = d
                                    bye = hi
                                    hi1 = hi
                                    a = sum1.toDouble()
                                    e = d - c
                                    a = -a
                                    //  hi = hi - a;
                                    val str1 = hi.toString()
                                    if (str1.substring(str1.length - 2) == ".0") {
                                        // textView2.setText(str1.substring(0, str1.length() - 2));
                                    } else {
                                        //textView2.setText(str1);
                                    }
                                    bhanu = sum.length
                                    sai = sum.length
                                    tej[k] = bhanu
                                    k++
                                    // textView2.setText(String.valueOf(bhanu));
                                }
                            }
                        } else {
                            sum1 = sum.substring(bhanu, sum.length - 1)
                            a = sum1.toDouble()
                            hi = a
                            c = a
                            bye = hi
                            hi1 = hi
                            textView2.setText("")
                            bhanu = sum.length
                            tej[k] = bhanu
                            k++
                            sum2 = ""
                            sai = sum.length
                        }
                    }
                }
            }
        bper.setOnClickListener {
                if (sum === "") {
                    textView.setText("")
                    sum = ""
                } else if (sum.endsWith("=") || sum.endsWith("+") || sum.endsWith("/") || sum.endsWith("-") || sum.endsWith(".") || sum.endsWith("x")) {
                    if (sum === "-") {
                        sum = "-"
                        textView.setText(sum)
                    } /* else {
                        sum = sum.substring(0, sum.length() - 1) + "%";
                        textView.setText(sum);
                        // textView2.setText("hi");
                    }*/
                } else {
                    if (sum === "-.") {
                        //sum="-.";
                        sum = sum.substring(0, 2)
                        textView.setText(sum)
                    } else {
                        sum = "$sum%"
                        textView.setText(sum)
                        if (bhanu > 0) {
                            if (sum[bhanu - 1] == '%') {
                                if (bhanu == sum.length) {
                                    textView.setText(sum)
                                } else {
                                    if (sum[bhanu] == '%') {
                                        textView2.setText(sai.toString())
                                        if (sum[sai - 1] == '+') {
                                            d = hi + j[num - 1] / 100
                                            j[num] = j[num - 1] / 100
                                            num++
                                            val str1 = d.toString()
                                            if (str1.substring(str1.length - 2) == ".0") {
                                                textView2.setText(str1.substring(0, str1.length - 2))
                                            } else {
                                                textView2.setText(str1)
                                            }
                                            bhanu = sum.length
                                            tej[k] = bhanu
                                            k++
                                            //}
                                        } else if (sum[sai - 1] == '-') {
                                            d = hi + j[num - 1] / 100
                                            // textView2.setText(String.valueOf(j[num]));
                                            //  textView2.setText(String.valueOf(hi));
                                            j[num] = j[num - 1] / 100
                                            num++
                                            //textView2.setText(String.valueOf(j[num]));
                                            val str1 = d.toString()
                                            if (str1.substring(str1.length - 2) == ".0") {
                                                textView2.setText(str1.substring(0, str1.length - 2))
                                            } else {
                                                textView2.setText(str1)
                                            }
                                            bhanu = sum.length
                                            tej[k] = bhanu
                                            k++
                                            //}
                                        } else if (sum[sai - 1] == 'x') {
                                            d = hi1 + j[num - 1] / 100
                                            j[num] = j[num - 1] / 100
                                            num++
                                            textView2.setText(num.toString())
                                            // c=d;
                                            //textView2.setText("hi");
                                            val str1 = d.toString()
                                            if (str1.substring(str1.length - 2) == ".0") {
                                                textView2.setText(str1.substring(0, str1.length - 2))
                                            } else {
                                                textView2.setText(str1)
                                            }
                                            bhanu = sum.length
                                            tej[k] = bhanu
                                            k++
                                            // sai = sum.length();
                                        } else if (sum[sai - 1] == '/') {
                                            d = hi1 + j[num - 1] * 100
                                            j[num] = j[num - 1] * 100
                                            num++
                                            // c=d;
                                            // textView2.setText("hi");
                                            val str1 = d.toString()
                                            if (str1.substring(str1.length - 2) == ".0") {
                                                textView2.setText(str1.substring(0, str1.length - 2))
                                            } else {
                                                textView2.setText(str1)
                                            }
                                            bhanu = sum.length
                                            tej[k] = bhanu
                                            k++
                                            //  sai = sum.length();
                                        } else if (sum[sai - 1] == '%') {
                                            // str=str1;
                                            //b=Double.parseDouble(str);
                                            // textView2.setText("hello"+String.valueOf(b));
                                            d = hi + j[num - 1] / 100
                                            j[num] = j[num - 1] / 100
                                            num++
                                            //b=e1/100;
                                            // j = j / 100;
                                            // textView2.setText(String.valueOf("hi"));
                                            val str1 = d.toString()
                                            if (str1.substring(str1.length - 2) == ".0") {
                                                textView2.setText(str1.substring(0, str1.length - 2))
                                            } else {
                                                textView2.setText(str1)
                                            }
                                            bhanu = sum.length
                                            tej[k] = bhanu
                                            k++
                                            // b=e1/100;
                                        }
                                    } else {
                                        b = hi + d / 100
                                        j[num] = d / 100
                                        num++
                                        //textView2.setText(String.valueOf(num));
                                        val str1 = b.toString()
                                        if (str1.substring(str1.length - 2) == ".0") {
                                            textView2.setText(str1.substring(0, str1.length - 2))
                                        } else {
                                            textView2.setText(str1)
                                        }
                                        bhanu = sum.length
                                        tej[k] = bhanu
                                        k++
                                        // sai=sum.length();
                                    }
                                }
                            } else if (sum[bhanu - 1] == 'x') {
                                if (bhanu == sum.length) {
                                    textView.setText(sum)
                                } else {
                                    //  sum1 = sum.substring(bhanu, sum.length() - 1);
                                    // a = Double.parseDouble(sum1);
                                    // d =(hi1)+(e)*(a/100);
                                    d = hi1 + j[num - 1] / 100
                                    j[num] = j[num - 1] / 100
                                    num++
                                    textView2.setText(num.toString())
                                    val str1 = d.toString()
                                    if (str1.substring(str1.length - 2) == ".0") {
                                        textView2.setText(str1.substring(0, str1.length - 2))
                                    } else {
                                        textView2.setText(str1)
                                    }
                                    bhanu = sum.length
                                    tej[k] = bhanu
                                    k++
                                    // c = b/100;
                                    //  d=c;
                                    // sai=sum.length();
                                    //  textView2.setText(String.valueOf(sai));
                                }
                            } else if (sum[bhanu - 1] == '/') {
                                if (bhanu == sum.length) {
                                    textView.setText(sum)
                                } else {
                                    //sum1 = sum.substring(bhanu, sum.length() - 1);
                                    // a = Double.parseDouble(sum1);
                                    //textView2.setText(String.valueOf(e));
                                    //  d = (hi1)+(e)/(a/100);
                                    d = hi1 + j[num - 1] * 100
                                    j[num] = j[num - 1] * 100
                                    num++
                                    //c = d;
                                    //d=c/100;
                                    val str1 = d.toString()
                                    if (str1.substring(str1.length - 2) == ".0") {
                                        textView2.setText(str1.substring(0, str1.length - 2))
                                    } else {
                                        textView2.setText(str1)
                                    }
                                    bhanu = sum.length
                                    tej[k] = bhanu
                                    k++
                                    // sai=sum.length();
                                    // textView2.setText(String.valueOf(bhanu));
                                }
                            } else if (sum[bhanu - 1] == '+') {
                                if (bhanu == sum.length) {
                                    textView.setText(sum)
                                } else {
                                    sum1 = sum.substring(bhanu, sum.length - 1)
                                    a = sum1.toDouble()
                                    b = hi + a / 100 * hi
                                    j[num] = a / 100
                                    num++
                                    textView2.setText(num.toString())
                                    d = b
                                    //  c=a;
                                    //  textView2.setText("hi");
                                    val str1 = b.toString()
                                    if (str1.substring(str1.length - 2) == ".0") {
                                        textView2.setText(str1.substring(0, str1.length - 2))
                                    } else {
                                        textView2.setText(str1)
                                    }
                                    bhanu = sum.length
                                    tej[k] = bhanu
                                    // textView2.setText(String.valueOf(tej[k]));
                                    k++
                                    //   sai=sum.length();
                                }
                            } else if (sum[bhanu - 1] == '-') {
                                if (bhanu == sum.length) {
                                    textView.setText(sum)
                                } else {
                                    sum1 = sum.substring(bhanu, sum.length - 1)
                                    a = sum1.toDouble()
                                    b = hi + -a / 100 * hi
                                    j[num] = -(a / 100)
                                    num++
                                    d = b
                                    //a=-a;
                                    // textView2.setText(String.valueOf(j[num]));
                                    //hi=hi;
                                    // d = c;
                                    //textView.setText(sum);
                                    val str1 = b.toString()
                                    if (str1.substring(str1.length - 2) == ".0") {
                                        textView2.setText(str1.substring(0, str1.length - 2))
                                    } else {
                                        textView2.setText(str1)
                                    }
                                    bhanu = sum.length
                                    tej[k] = bhanu
                                    k++
                                    //  sai=sum.length();
                                    // textView2.setText(String.valueOf(bhanu));
                                }
                            }
                        } else {
                            sum1 = sum.substring(bhanu, sum.length - 1)
                            a = sum1.toDouble()
                            d = a / 100
                            j[num] = d
                            num++
                            //b=c;
                            // d = c;
                            // hi=c;
                            // textView2.setText();
                            textView2.setText(d.toString())
                            bhanu = sum.length
                            tej[k] = bhanu
                            k++
                            sai = sum.length
                            sum2 = ""
                            hi = 0.0
                            hi1 = 0.0
                        }
                    }
                }

        }
        bequal.setOnClickListener{

                for (gm in 0 until sum.length) {
                    if (sum[gm] == '+' || sum[gm] == '-' || sum[gm] == '/' || sum[gm] == 'x') {
                        count++
                    }
                }
                if (count == 1 && (sum.endsWith("+") || sum.endsWith("/") || sum.endsWith("-") || sum.endsWith("x"))) {
                    Toast.makeText(this, "Please Enter an number", Toast.LENGTH_SHORT).show()
                    textView2.setText("")
                    count = 0
                } else if (bhanu == 0) {
                    Toast.makeText(this, "Please Enter an Operator", Toast.LENGTH_SHORT).show()
                    textView2.setText("")
                } else if (sum3.endsWith("=")) {
                    textView.setText("")
                    sum3 = ""
                } else {
                    sum3 = sum
                    sum3 = "$sum3="
                    sum2 = sum3
                    textView.setText("")
                    //   textView2.setText(String.valueOf(d));
                    str = "Ans:"
                    val str1 = mom.toString()
                    if (str1.substring(str1.length - 2) == ".0") {
                        textView2.setText(str + " " + str1.substring(0, str1.length - 2))
                        str2 = str1.substring(0, str1.length - 2)
                    } else {
                        textView2.setText("$str $str1")
                        str2 = str1
                    }
                    sum = str2
                    bhanu = 0
                    a = 0.0
                    b = 0.0
                    c = 0.0
                    d = 0.0
                    e = 0.0
                    e1 = 0.0
                    //i=0;
                    j[num] = 0.0
                    hi1 = 0.0
                    sum3 = ""
                    count = 0
                    hi = sum.toDouble()
                    // textView2.setText(sum);
                }

        }
        bwrong.setOnClickListener{
                // str2 = sum.substring(bhanu, sum.length());
                //g = str2.length();
                if (sum.length > 0) {
                    for (gm in 0 until sum.length) {
                        if (sum[gm] == '+' || sum[gm] == '-' || sum[gm] == '/' || sum[gm] == 'x' || sum[gm] == '%') {
                            count++
                        }
                    }
                    if (count == 0 && (sum.endsWith("1") || sum.endsWith("2") || sum.endsWith("3") || sum.endsWith("4") || sum.endsWith("5") || sum.endsWith("6") || sum.endsWith("7") || sum.endsWith("8") || sum.endsWith("9") || sum.endsWith("0") || sum.endsWith("00"))) {
                        sum = sum.substring(0, sum.length - 1)
                        textView.setText(sum)
                        if (sum.length == 0) {
                            sum = ""
                        }
                        count = 0
                    } else if (sum === "-.") {
                        sum = "-"
                        textView.setText(sum)
                        count = 0
                    } else if (sum.endsWith("/-") || sum.endsWith("x-")) {
                        sum = sum.substring(0, sum.length - 1)
                        textView.setText(sum)
                        count = 0
                    } else if (sum.endsWith("+")) {
                        count = 0
                        for (gm in 0 until sum.length) {
                            if (sum[gm] == '+' || sum[gm] == '-' || sum[gm] == '/' || sum[gm] == 'x' || sum[gm] == '%') {
                                count++
                            }
                        }
                        rey = sum.length
                        if (sum[rey - 1] == '+' && sum[0] == '-') {
                            sum = sum.substring(0, sum.length - 1)
                            textView.setText(sum)
                            textView2.setText("")
                            bhanu = 0
                            count = 0
                        } else {
                            sum = sum.substring(0, sum.length - 1)
                            textView.setText(sum)
                            if (count == 1) {
                                bhanu = 0
                                count = 0
                                hi = hi - a
                                hi1 = hi
                                textView2.setText("")
                            } else {
                                bhanu = tej[k - 2]
                                k = k - 1
                                if (k < 0) {
                                    k = 0
                                }
                                if (sum[bhanu - 1] == '+') {
                                    string = sum.substring(bhanu, sum.length)
                                    t = string.toDouble()
                                    hi = hi - t
                                } else if (sum[bhanu - 1] == '-') {
                                    string = sum.substring(bhanu, sum.length)
                                    t = string.toDouble()
                                    //textView2.setText(String.valueOf(hi));
                                    hi = hi + t
                                } else if (sum[bhanu - 1] == 'x' || sum[bhanu - 1] == '/') {
                                    hi = hi - j[num - 1]
                                    //  textView2.setText(String.valueOf(j[num-2]));
                                    hi1 = hi
                                } else if (sum[bhanu - 1] == '%') {
                                    //  ;
                                    hi = hi - j[num - 1]
                                    hi1 = hi
                                }
                            }
                        }
                        count = 0
                    } else if (sum.endsWith("-")) {
                        count = 0
                        for (gm in 0 until sum.length) {
                            if (sum[gm] == '+' || sum[gm] == '-' || sum[gm] == '/' || sum[gm] == 'x' || sum[gm] == '%') {
                                count++
                            }
                        }
                        rey = sum.length
                        if (sum[rey - 1] == '-' && sum[0] == '-') {
                            sum = sum.substring(0, sum.length - 1)
                            if (sum.length == 0) {
                                sum = ""
                                textView.setText(sum)
                                textView2.setText("")
                                bhanu = 0
                                count = 0
                            } else {
                                textView.setText(sum)
                                textView2.setText("")
                                bhanu = 0
                                count = 0
                            }
                        } else {
                            sum = sum.substring(0, sum.length - 1)
                            textView.setText(sum)
                            if (count == 1) {
                                bhanu = 0
                                count = 0
                                hi = hi - a
                                hi1 = hi
                                textView2.setText("")
                            } else {
                                bhanu = tej[k - 2]
                                k = k - 1
                                if (k < 0) {
                                    k = 0
                                }
                                if (sum[bhanu - 1] == '-') {
                                    string = sum.substring(bhanu, sum.length)
                                    t = string.toDouble()
                                    //textView2.setText(String.valueOf(hi));
                                    hi = hi + t
                                } else if (sum[bhanu - 1] == '+') {
                                    string = sum.substring(bhanu, sum.length)
                                    t = string.toDouble()
                                    //textView2.setText(String.valueOf(hi));
                                    hi = hi - t
                                } else if (sum[bhanu - 1] == 'x' || sum[bhanu - 1] == '/') {
                                    hi = hi - j[num - 1]
                                    hi1 = hi
                                } else if (sum[bhanu - 1] == '%') {
                                    //  textView2.setText(String.valueOf(bhanu));
                                    hi = hi - j[num - 1]
                                    hi1 = hi
                                }
                            }
                        }
                        count = 0
                    } else if (sum.endsWith("/")) {
                        count = 0
                        for (gm in 0 until sum.length) {
                            if (sum[gm] == '+' || sum[gm] == '-' || sum[gm] == '/' || sum[gm] == 'x' || sum[gm] == '%') {
                                count++
                            }
                        }
                        rey = sum.length
                        if (sum[rey - 1] == '/' && sum[0] == '-') {
                            sum = sum.substring(0, sum.length - 1)
                            textView.setText(sum)
                            textView2.setText("")
                            bhanu = 0
                            count = 0
                        } else {
                            sum = sum.substring(0, sum.length - 1)
                            textView.setText(sum)
                            if (count == 1) {
                                bhanu = 0
                                count = 0
                                textView2.setText("")
                            } else {
                                bhanu = tej[k - 2]
                                k = k - 1
                                if (k < 0) {
                                    k = 0
                                }
                                j[num] = j[num - 1]
                                num--
                                count = 0
                                //textView2.setText(String.valueOf(j[num-1]));
                                /*if (sum.charAt(bhanu - 1) == '+') {
             string = sum.substring(bhanu, sum.length());
             t = Double.parseDouble(string);
             hi = hi +(t);
             }
             else if(sum.charAt(bhanu - 1) == '-') {
             string = sum.substring(bhanu, sum.length());
             t = Double.parseDouble(string);
             hi = hi -(t);
             //textView2.setText(String.valueOf(hi));
             }
             // string = sum.substring(bhanu, sum.length());
             //   t = Double.parseDouble(string);
             //j = j * t;
             }*/
                            }
                        }
                    } else if (sum.endsWith("%")) {
                        count = 0
                        for (gm in 0 until sum.length) {
                            if (sum[gm] == '+' || sum[gm] == '-' || sum[gm] == '/' || sum[gm] == 'x' || sum[gm] == '%') {
                                count++
                            }
                        }
                        rey = sum.length
                        if (sum[rey - 1] == '%' && sum[0] == '-') {
                            sum = sum.substring(0, sum.length - 1)
                            textView.setText(sum)
                            textView2.setText("")
                            bhanu = 0
                            count = 0
                        } else {
                            sum = sum.substring(0, sum.length - 1)
                            textView.setText(sum)
                            if (count == 1) {
                                bhanu = 0
                                count = 0
                                textView2.setText("")
                            } else {
                                bhanu = tej[k - 2]
                                k = k - 1
                                if (k < 0) {
                                    k = 0
                                }
                                if (sum[bhanu - 1] == '/') {
                                    string = sum.substring(bhanu, sum.length)
                                    t = string.toDouble()
                                    j[num] = j[num - 1] / 100
                                    d = hi1 + j[num]
                                    num--
                                } else if (sum[bhanu - 1] == 'x') {
                                    //textView2.setText(String.valueOf(num));
                                    string = sum.substring(bhanu, sum.length)
                                    t = string.toDouble()
                                    j[num] = j[num - 1] * 100
                                    d = hi1 + j[num]
                                    num--
                                } else if (sum[bhanu - 1] == '+' || sum[bhanu - 1] == '-') {
                                    j[num - 1] = j[num - 1] * 100
                                    if (num - 1 == 1) {
                                        j[num] = j[num - 1] * 100
                                        d = hi + j[num]
                                    } else {
                                        d = hi + j[num - 1]
                                        // textView2.setText(String.valueOf(d));
                                        j[num] = j[num - 1]
                                    }
                                    num--
                                } else if (sum[bhanu - 1] == '%') {
                                    j[num] = j[num - 1] * 100
                                    d = hi + j[num]
                                    num--
                                }
                                mom = d
                                val str1 = mom.toString()
                                count = 0
                                if (str1.substring(str1.length - 2) == ".0") {
                                    textView2.setText(str1.substring(0, str1.length - 2))
                                } else {
                                    textView2.setText(str1)
                                }
                            }
                        }
                    } else if (sum.endsWith("x")) {
                        count = 0
                        for (gm in 0 until sum.length) {
                            if (sum[gm] == '+' || sum[gm] == '-' || sum[gm] == '/' || sum[gm] == 'x' || sum[gm] == '%') {
                                count++
                            }
                        }
                        rey = sum.length
                        if (sum[rey - 1] == 'x' && sum[0] == '-') {
                            sum = sum.substring(0, sum.length - 1)
                            textView.setText(sum)
                            textView2.setText("")
                            bhanu = 0
                            count = 0
                        } else {
                            sum = sum.substring(0, sum.length - 1)
                            textView.setText(sum)
                            if (count == 1) {
                                bhanu = 0
                                count = 0
                                textView2.setText("")
                            } else {
                                bhanu = tej[k - 2]
                                k = k - 1
                                if (k < 0) {
                                    k = 0
                                }
                                j[num] = j[num - 1]
                                num--
                                //  textView2.setText(String.valueOf(num));
                                count = 0
                                //textView2.setText(String.valueOf(hi));
                                /* if (sum.charAt(bhanu - 1) == '+') {
             string = sum.substring(bhanu, sum.length());
             t = Double.parseDouble(string);
             hi = hi + (t);
             }
             else if(sum.charAt(bhanu - 1) == '-') {
             string = sum.substring(bhanu, sum.length());
             t = Double.parseDouble(string);
             hi = hi - (t);
             }
             //string = sum.substring(bhanu, sum.length());
             //t = Double.parseDouble(string);
             //j=j/t;
             }*/
                            }
                        }
                    } else if (bhanu > 0 && sum[bhanu - 1] == '+') {
                        sum = sum.substring(0, sum.length - 1)
                        textView.setText(sum)
                        sum1 = sum.substring(bhanu, sum.length)
                        if (sum1.isEmpty()) {
                            d = hi
                        } else {
                            c = sum1.toDouble()
                            d = hi + c
                            hi1 = hi
                        }
                        mom = d
                        count = 0
                        val str1 = mom.toString()
                        if (str1.substring(str1.length - 2) == ".0") {
                            textView2.setText(str1.substring(0, str1.length - 2))
                        } else {
                            textView2.setText(str1)
                        }
                    } else if (bhanu > 0 && sum[bhanu - 1] == '-') {
                        sum = sum.substring(0, sum.length - 1)
                        textView.setText(sum)
                        sum1 = sum.substring(bhanu, sum.length)
                        if (sum1.isEmpty()) {
                            d = hi
                        } else {
                            c = sum1.toDouble()
                            d = hi - c
                            hi1 = hi
                        }
                        mom = d
                        count = 0
                        val str1 = mom.toString()
                        if (str1.substring(str1.length - 2) == ".0") {
                            textView2.setText(str1.substring(0, str1.length - 2))
                        } else {
                            textView2.setText(str1)
                        }
                    } else if (bhanu > 0 && sum[bhanu - 1] == 'x') {
                        c = sum.substring(bhanu, sum.length).toDouble()
                        // textView2.setText(String.valueOf(j[num-1]));
                        j[num - 1] = j[num - 1] / c
                        sum = sum.substring(0, sum.length - 1)
                        textView.setText(sum)
                        sum1 = sum.substring(bhanu, sum.length)
                        if (sum1.isEmpty()) {
                            b = hi1 + j[num - 1]
                        } else {
                            c = sum1.toDouble()
                            b = hi1 + j[num - 1] * c
                            j[num - 2] = j[num - 1] * c
                            if (num - 2 < 0) {
                                j[num - 2] = 0.0
                            }
                            //textView2.setText(String.valueOf(num-1));
                        }
                        num--
                        // textView2.setText(String.valueOf(num));
                        mom = b
                        count = 0
                        val str1 = mom.toString()
                        if (str1.substring(str1.length - 2) == ".0") {
                            textView2.setText(str1.substring(0, str1.length - 2))
                        } else {
                            textView2.setText(str1)
                        }
                    } else if (bhanu > 0 && sum[bhanu - 1] == '/') {
                        c = sum.substring(bhanu, sum.length).toDouble()
                        j[num - 1] = j[num - 1] * c
                        sum = sum.substring(0, sum.length - 1)
                        textView.setText(sum)
                        sum1 = sum.substring(bhanu, sum.length)
                        if (sum1.isEmpty()) {
                            b = hi1 + j[num - 1]
                        } else {
                            c = sum1.toDouble()
                            b = hi1 + j[num - 1] / c
                            j[num - 2] = j[num - 1] / c
                            if (num - 2 < 0) {
                                j[num - 2] = 0.0
                            }
                            //textView2.setText(String.valueOf(num-1));
                        }
                        num--
                        mom = b
                        count = 0
                        val str1 = mom.toString()
                        if (str1.substring(str1.length - 2) == ".0") {
                            textView2.setText(str1.substring(0, str1.length - 2))
                        } else {
                            textView2.setText(str1)
                        }
                    } else if (bhanu > 0 && sum[bhanu - 1] == '%') {
                        c = sum.substring(bhanu, sum.length).toDouble()
                        j[num - 1] = j[num - 1] / c
                        sum = sum.substring(0, sum.length - 1)
                        textView.setText(sum)
                        sum1 = sum.substring(bhanu, sum.length)
                        if (sum1.isEmpty()) {
                            b = hi1 + j[num - 1]
                        } else {
                            c = sum1.toDouble()
                            b = hi1 + j[num - 1] * c
                            j[num - 2] = j[num - 1] * c
                            if (num - 2 < 0) {
                                j[num - 2] = 0.0
                            }
                            //textView2.setText(String.valueOf(num-1));
                        }
                        num--
                        mom = b
                        count = 0
                        val str1 = mom.toString()
                        if (str1.substring(str1.length - 2) == ".0") {
                            textView2.setText(str1.substring(0, str1.length - 2))
                        } else {
                            textView2.setText(str1)
                        }
                    } else if (sum[0] == '-' && (sum.endsWith("1") || sum.endsWith("2") || sum.endsWith("3") || sum.endsWith("4") || sum.endsWith("5") || sum.endsWith("6") || sum.endsWith("7") || sum.endsWith("8") || sum.endsWith("9") || sum.endsWith("0") || sum.endsWith("00"))) {
                        sum = sum.substring(0, sum.length - 1)
                        textView.setText(sum)
                    }
                }
            }
        bc.setOnClickListener{
                textView.setText("")
                textView2.setText("")
                sum = ""
                bhanu = 0
                hi = 0.0
                a = 0.0
                b = 0.0
                c = 0.0
                d = 0.0
                e = 0.0
                e1 = 0.0
                mom = 0.0
                j[num] = 0.0
                z = 0.0
                num = 0
                y = 0.0
                t = 0.0
                p = 0.0
                bye = 0.0
                count = 0
                hi1 = 0.0
        }
    }
}
