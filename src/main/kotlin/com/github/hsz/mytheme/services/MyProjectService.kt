package com.github.hsz.mytheme.services

import com.intellij.openapi.project.Project
import com.github.hsz.mytheme.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
