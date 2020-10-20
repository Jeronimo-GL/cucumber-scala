val params = List("default_summary", "html", "json", "junit",
     "message", "null_summary", "pretty", "progress", "rerun",
      "summary", "teamcity", "testng", "timeline", "unused", "usage")

params.map(x => x + ":target/" + x).mkString(", ")

