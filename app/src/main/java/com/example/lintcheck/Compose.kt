package com.example.lintcheck

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lintcheck.ui.theme.LintCheckApplicationTheme


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

/**
 * I would expect a lint warning for this Composable function
 * This is a public Preview with NO parameters.
 */
@Preview(showBackground = true)
@Composable
fun PublicGreetingPreview() {
    LintCheckApplicationTheme {
        Greeting(name = "Android")
    }
}

@Preview(showBackground = true)
@Composable
private fun PrivateGreetingPreview() {
    LintCheckApplicationTheme {
        Greeting(name = "Android")
    }
}