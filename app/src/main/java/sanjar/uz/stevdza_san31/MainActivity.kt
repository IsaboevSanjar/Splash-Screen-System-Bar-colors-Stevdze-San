package sanjar.uz.stevdza_san31

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import sanjar.uz.stevdza_san31.ui.theme.StevdzaSan31Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StevdzaSan31Theme {
                val navController = rememberNavController()
                SetUpNavGraph(navController = navController)
            }
        }
    }
}

