pipeline {
    agent any
    triggers {
        cron('*/5 * * * *')
    }
    stages {
        stage('build') {
            steps {
                sh "echo hello"
            }
        }
    }
}