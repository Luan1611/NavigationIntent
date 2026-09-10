package br.edu.ifsp.scl.prdm.sc3029531.navigationintent.navigation

import android.content.Intent
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import br.edu.ifsp.scl.prdm.sc3029531.navigationintent.ui.composable.screen.IntentScreen
import br.edu.ifsp.scl.prdm.sc3029531.navigationintent.ui.composable.screen.ParameterScreen

@Composable
fun MainNavHost(navHostController: NavHostController, modifier: Modifier) {
    NavHost(
        navController = navHostController,
        startDestination = Screen.IntentScreen.route
    ) {
        //aqui ficam os nós que fazem parte do grafo

        composable(route = Screen.IntentScreen.route) {
            IntentScreen(modifier)
        }

        composable(route = Screen.ParameterScreen.route) {
            ParameterScreen(modifier)
        }

    }
}