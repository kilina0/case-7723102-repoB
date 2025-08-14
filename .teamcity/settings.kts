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
})
