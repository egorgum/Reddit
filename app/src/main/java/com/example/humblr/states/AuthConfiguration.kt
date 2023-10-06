package com.example.humblr.states
//Константы для получения авторизации
object AuthConfiguration {
    const val CLIENT_ID = " "
    const val SECRET = ""
    const val RESPONSE_TYPE = "code"
    const val REDIRECT_URL = ""
    const val AUTH_URL = "https://www.reddit.com/api/v1/authorize"
    const val TOKEN_URL = "https://www.reddit.com/api/v1/access_token"
    const val SCOPE = "identity," +
            "edit," + "flair," + "history," +
            "modconfig," + "modflair," + "modlog," +
            "modposts," + "modwiki," + "mysubreddits," +
            "privatemessages," + "read," + "report," +
            "save," + "submit," + "subscribe," +
            "vote," + "wikiedit," + "wikiread"
}