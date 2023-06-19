package app.futured.academyproject.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val LightColorPalette = lightColors(
    primary = orange300,
    primaryVariant = orange100,
    secondary = blue400,
    secondaryVariant = blue200,
    background = cloud50,
    surface = pureWhite,
    onPrimary = pureWhite,
    onSecondary = pureWhite,
    onBackground = ink900,
    onSurface = ink900,
)

private val DarkColorPalette = darkColors(
    primary = orange300,
    primaryVariant = orange100,
    secondary = blue400,
    background = ink900,
    surface = ink700,
    onPrimary = pureWhite,
    onSecondary = pureWhite,
    onBackground = pureWhite,
    onSurface = pureWhite,
)

@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = typography,
        shapes = shapes,
        content = content,
    )
}
