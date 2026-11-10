package app.revenge.manager.utils

import app.revenge.manager.BuildConfig
import app.revenge.manager.domain.manager.PreferenceManager

object Constants {
    val TEAM_MEMBERS = listOf(
        TeamMember(
            "batrummm",
            "Shyncord",
            profileUrl = "https://instagram.com/batrummm",
            imageUrl = null
        ),
    )

    /** The Revenge team, whose bundle, loader and manager Shyncord for Android is built on. */
    val REVENGE_TEAM = listOf(
        TeamMember("Palm", "Lead developer of Revenge", "palmdevs"),
        TeamMember("oSumAtrIX", "Developer of Revenge", "osumatrix"),
        TeamMember("Nexpid", "Developer of Revenge", "nexpid"),
    )


    val DUMMY_VERSION = DiscordVersion(1, 0, DiscordVersion.Type.STABLE)
}

object Intents {

    object Actions {
        const val INSTALL = "${BuildConfig.APPLICATION_ID}.intents.actions.INSTALL"
    }

    object Extras {
        const val VERSION = "${BuildConfig.APPLICATION_ID}.intents.extras.VERSION"
        /** What the app's own update notification carries ([PreferenceManager.pendingInstallToken]) */
        const val TOKEN = "${BuildConfig.APPLICATION_ID}.intents.extras.TOKEN"
    }

}

object Channels {
    const val UPDATE = "${BuildConfig.APPLICATION_ID}.notifications.UPDATE"
}

data class TeamMember(
    val name: String,
    val role: String,
    val username: String = name,
    val profileUrl: String = "https://github.com/$username",
    val imageUrl: String? = "https://github.com/$username.png"
)