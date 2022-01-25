package com.github.yiwangai1983.mytest.services

import com.intellij.openapi.project.Project
import com.github.yiwangai1983.mytest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
