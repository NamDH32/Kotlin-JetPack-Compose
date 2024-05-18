package com.dhnph34455.fpt.edu.kotlinjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dhnph34455.fpt.edu.kotlinjetpackcompose.R
import com.dhnph34455.fpt.edu.kotlinjetpackcompose.ui.theme.MyApplicationTheme

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Black
                ) {
                    Text(text = "Hello")
                }
            }
        }
    }

    @Composable
    fun PaymentScreen() {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = colorResource(id = R.color.Main)
        ) {
            Column {
                GettingTitle(msg = "Thanh toán")
                Divider(
                    color = Color.Black, // Màu của đường kẻ
                    thickness = 2.dp // Độ dày của đường kẻ
                )
                Spacer(modifier = Modifier.height(15.dp))
                Column(modifier = Modifier.padding(start = 10.dp, end = 10.dp)) {
                    Text(
                        text = "Địa chỉ nhận hàng",
                        color = Color.White,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.map),
                            contentDescription = null
                        )
                        Column(
                            modifier = Modifier
                                .height(130.dp)
                                .padding(16.dp),
                            verticalArrangement = Arrangement.SpaceBetween // Căn cách các composable theo chiều dọc
                        ) {
                            Text(
                                text = "Đinh Hoài Nam | 3004",
                                color = Color.White,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "xóm 3 An Lễ",
                                color = Color.White,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "Huyện Quỳnh Phụ",
                                color = Color.White,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "Tỉnh Thái Bình",
                                color = Color.White,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Vui lòng chọn một trong những phương thức sau",
                        color = Color.White,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold
                    )
                    PaymentFunction(
                        painter = painterResource(id = R.drawable.paypal),
                        color = colorResource(id = R.color.Orange),
                        msg = "Paypal"
                    )
                    PaymentFunction(
                        painter = painterResource(id = R.drawable.visa),
                        color = colorResource(id = R.color.purple_200),
                        msg = "Visa"
                    )
                    PaymentFunction(
                        painter = painterResource(id = R.drawable.images),
                        color = colorResource(id = R.color.Red),
                        msg = "Momo"
                    )
                    PaymentFunction(
                        painter = painterResource(id = R.drawable.zalo),
                        color = colorResource(id = R.color.Blue2),
                        msg = "Zalo Pay"
                    )
                    PaymentFunction(
                        painter = painterResource(id = R.drawable.payment),
                        color = colorResource(id = R.color.Blue1),
                        msg = "Thanh toán trực tiếp"
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Button(
                            onClick = { },
                            modifier = Modifier
                                .width(350.dp)
                                .background(
                                    color = colorResource(id = R.color.Yellow),
                                    shape = RoundedCornerShape(12.dp)
                                ),
                            colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.Yellow))
                        ) {
                            Text(text = "Tiếp theo", fontSize = 20.sp)
                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                }
                Divider(
                    color = Color.Black, // Màu của đường kẻ
                    thickness = 3.dp // Độ dày của đường kẻ
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    PaymentFun(
                        painter = painterResource(id = R.drawable.icon_home),
                        msg = "Trang Chủ"
                    )
                    PaymentFun(
                        painter = painterResource(id = R.drawable.icon_home),
                        msg = "Thông Tin"
                    )
                    PaymentFun(
                        painter = painterResource(id = R.drawable.icon_home),
                        msg = "Trang Chủ"
                    )
                    PaymentFun(
                        painter = painterResource(id = R.drawable.icon_home),
                        msg = "Thông Tin"
                    )
                }
            }
        }
    }

    @Composable
    fun GettingTitle(msg: String) {
        Text(
            text = msg,
            modifier = Modifier
                .padding(0.dp, 20.dp)
                .fillMaxWidth(),
            color = Color.White,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
    }

    @Composable
    fun PaymentFun(painter: Painter, msg: String) {
        Column(
            modifier = Modifier.padding(end = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(painter = painter, contentDescription = null)
            Text(text = msg, color = Color.White)
        }
    }

    @Composable
    fun PaymentFunction(painter: Painter, color: Color, msg: String) {
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .background(color, shape = RoundedCornerShape(12.dp))
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(painter = painter, contentDescription = null)
            Text(text = msg, color = Color.White)
            RadioButton(selected = false, onClick = { /*TODO*/ })
        }
    }

    @Preview(showBackground = true, showSystemUi = true)
    @Composable
    fun GreetingPreview() {
        MyApplicationTheme {
            PaymentScreen()
        }
    }
}
