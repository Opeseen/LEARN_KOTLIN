package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardAppTheme {
                Surface(
                    modifier = Modifier,
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCardComposable()
                }
            }
        }
    }
}

@Composable
fun BusinessCardComposable(){
    BusinessCardApp(
        imageLogo = painterResource(R.drawable.android_logo),
        name = "Jennifer Doe",
        occupation = "Android Developer Extraordinaire",
        phone = "+11 (123) 444 555 666",
        handle = "@AndroidDev",
        email = "jen.doe@android.com"
    )
}

@Composable
private fun BusinessCardApp(
    imageLogo: Painter,
    name: String,
    occupation: String,
    phone: String,
    handle: String,
    email: String,
    modifier: Modifier = Modifier
){
    val darkGreenColor = Color(0xFF006D3B)
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFD2E8D4))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ){
        Spacer(modifier = Modifier.height(32.dp))
        // -- header
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // android logo
            Box(
                modifier = Modifier
                    .size(120.dp)
                    .background(Color(0xFF073042))
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ){
                Image(
                    painter = imageLogo,
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize()
                )
            }
            Text(
                text = name,
                fontSize = 32.sp,
                fontWeight = FontWeight.Light,
                modifier = Modifier.padding(top = 16.dp)
            )
            Text(
                text = occupation,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(top = 8.dp),
                color = darkGreenColor
            )
        }

        // Contact section
        Column(modifier = Modifier
            .padding(bottom = 32.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            ContactRow(
                icon = Icons.Default.Phone,
                text = phone,
                iconColor = darkGreenColor
            )
            ContactRow(
                icon = Icons.Default.Share,
                text = handle,
                iconColor = darkGreenColor
            )
            ContactRow(
                icon = Icons.Default.Email,
                text = email,
                iconColor = darkGreenColor
            )
        }
    }
}

@Composable
private fun ContactRow(
    icon: ImageVector,
    text: String,
    iconColor: Color
){
    Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = iconColor,
            modifier = Modifier.size(20.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Text(
            text = text,
            fontSize = 14.sp,
            color = Color.Black
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardAppTheme {
        BusinessCardComposable()
    }
}