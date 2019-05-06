pipeline {
    agent any
    checkout([$class:'GitSCM', branches: [[name: 'master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId:'github-api-key-personal', url:'https://github.com/student-06/JenkinsLearn.git']]])

    stages {
        stage('build') {
            steps {
                sh "echo hello"
            }
        }
    }
}