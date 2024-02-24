package com.test.parissportifs.models

class Team(
    val idTeam: String,
    val idSoccerXML: String,
    val idAPIfootball: String,
    val intLoved: String?,
    val strTeam: String,
    val strTeamShort: String,
    val strAlternate: String,
    val intFormedYear: String,
    val strSport: String,
    val strGender: String,
    val strCountry: String,
    val strTeamBadge: String,
    val strTeamJersey: String,
    val strTeamLogo: String,
    val strTeamBanner: String,
    val strKeywords: String,

    /* Fan Arts */
    val strTeamFanart1: String,
    val strTeamFanart2: String,
    val strTeamFanart3: String,
    val strTeamFanart4: String,

    /* Leagues */
    val strLeague: String,
    val idLeague: String,
    val strLeague2: String,
    val idLeague2: String?,
    val strLeague3: String,
    val idLeague3: String?,
    val strLeague4: String,
    val idLeague4: String?,
    val strLeague5: String,
    val idLeague5: String?,
    val strLeague6: String,
    val idLeague6: String?,
    val strLeague7: String,
    val idLeague7: String?,

    /* Stadium */
    val strStadium: String,
    val strStadiumThumb: String,
    val strStadiumDescription: String,
    val strStadiumLocation: String,
    val intStadiumCapacity: String,

    /* Social Networks */
    val strWebsite: String,
    val strFacebook: String,
    val strTwitter: String,
    val strInstagram: String,
    val strYoutube: String,
    val strRSS: String,

    /* Descriptions */
    val strDescriptionEN: String,
    val strDescriptionDE: String?,
    val strDescriptionFR: String?,
    val strDescriptionCN: String?,
    val strDescriptionIT: String?,
    val strDescriptionJP: String?,
    val strDescriptionRU: String?,
    val strDescriptionES: String?,
    val strDescriptionPT: String?,
    val strDescriptionSE: String?,
    val strDescriptionNL: String?,
    val strDescriptionHU: String?,
    val strDescriptionNO: String?,
    val strDescriptionIL: String?,
    val strDescriptionPL: String?,

    /* Kit Colours */
    val strKitColour1: String,
    val strKitColour2: String,
    val strKitColour3: String,

    /* Divers */
    val strLocked: String
)