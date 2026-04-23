import jetbrains.buildServer.configs.kotlin.*

version = "2025.07"

project {

    buildType(Tickets_Case7723102_ProjectB_BuildB)
}

object Tickets_Case7723102_ProjectB_BuildB : BuildType({
    id("BuildB")
    name = "Build B"

    vcs {
        root(DslContext.settingsRoot)
    }

    dependencies {
        dependency(AbsoluteId("Tickets_Case7723102_ProjectA_BuildA")) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }

            artifacts {
                cleanDestination = true
                artifactRules = "file_v* => deps"
            }
        }
    }
})
