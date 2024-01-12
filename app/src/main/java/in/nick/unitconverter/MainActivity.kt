package `in`.nick.unitconverter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import `in`.nick.unitconverter.ui.theme.UnitConverterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UnitConverterTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    UnitConverter()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UnitConverter(){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Unit Converter", fontSize = 45.sp)
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = "", onValueChange = {
            //This is where the value of the text field changes when user enter the value.
        })
        Spacer(modifier = Modifier.height(10.dp))
        Row{
            Box(
                modifier = Modifier.padding(15.dp)
            ) {
                Button(onClick = {  }) {
                    Text("Select")
                    Icon(Icons.Default.ArrowDropDown, contentDescription = "Arrow Down")
                }
                    DropdownMenu(expanded = false, onDismissRequest = { /*TODO*/ }) {
                        DropdownMenuItem(text = { Text("Centimeters") }, onClick = { /*TODO*/ })
                        DropdownMenuItem(text = { Text("Meters") }, onClick = { /*TODO*/ })
                        DropdownMenuItem(text = { Text("Feet") }, onClick = { /*TODO*/ })
                        DropdownMenuItem(text = { Text("Millemeters") }, onClick = { /*TODO*/ })
                    }
            }
            Box(
                modifier = Modifier.padding(15.dp)
            ) {
                Button(onClick = { /*TODO*/ }) {
                    Text("Select")
                    Icon(Icons.Default.ArrowDropDown, contentDescription = "Arrow Down")
                }
                DropdownMenu(expanded = false, onDismissRequest = { /*TODO*/ }) {
                    DropdownMenuItem(text = { Text("Centimeters") }, onClick = { /*TODO*/ })
                    DropdownMenuItem(text = { Text("Meters") }, onClick = { /*TODO*/ })
                    DropdownMenuItem(text = { Text("Feet") }, onClick = { /*TODO*/ })
                    DropdownMenuItem(text = { Text("Millemeters") }, onClick = { /*TODO*/ })
                }
            }
        }
        Spacer(modifier = Modifier.height(5.dp))
        Text("Result:", fontSize = 25.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun UnitConverterPreview(){
    UnitConverter()
}