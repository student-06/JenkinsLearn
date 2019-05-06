pipeline {
    agent any

    stages {

    stage('Set environment') {
            steps {
                
                checkout([$class:'GitSCM', branches: [[name: env.BRANCH]], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId:'github-api-key-personal', url:'https://github.com/student-06/JenkinsLearn.git']]])
            }
        }


        stage('build') {
            steps {
                sh "echo hello pnr"
                sh "created dev!"
            }
        }
    }
}
