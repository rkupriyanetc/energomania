name := "energomania"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

resolvers ++= Seq(
  Resolver.url("Objectify Play Repository", url("http://deadbolt.ws/releases/"))(Resolver.ivyStylePatterns),
  "play-easymail (release)" at "http://joscha.github.io/play-easymail/repo/releases/",
  "play-easymail (snapshot)" at "http://joscha.github.io/play-easymail/repo/snapshots/",
  "play-authenticate (release)" at "http://joscha.github.io/play-authenticate/repo/releases/",
  "play-authenticate (snapshot)" at "http://joscha.github.io/play-authenticate/repo/snapshots/"
)

libraryDependencies ++= Seq(
  javaCore,
  cache,
  javaWs,
  "be.objectify"         %% "deadbolt-java"           % "2.4.0",
  "com.feth"             %% "play-authenticate"       % "0.6.8",
  "org.mongodb"          %  "mongo-java-driver"       % "3.0.4",
  "org.apache.poi"       %  "poi"                     % "3.12",
  "org.apache.poi"       %  "poi-ooxml"               % "3.12",
  "org.webjars"          %  "select2"                 % "4.0.0-2"
)

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

//fork in run := true