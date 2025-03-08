pluginManagement {
    repositories {
<<<<<<< HEAD
        google()  // <- WAŻNE!
=======
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
>>>>>>> 02d750f (initial commit)
        mavenCentral()
        gradlePluginPortal()
    }
}
<<<<<<< HEAD

dependencyResolutionManagement {
    repositories {
        google()  // <- WAŻNE!
=======
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
>>>>>>> 02d750f (initial commit)
        mavenCentral()
    }
}

<<<<<<< HEAD
rootProject.name = "Pieski"
=======
rootProject.name = "Dogs"
>>>>>>> 02d750f (initial commit)
include(":app")
