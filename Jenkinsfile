pipeline {
    agent any

    stages {

        stage('build') {
            steps {
                sh "echo hello pnr"
                sh "created dev!"
                sh "echo $env.CHANGE_ID"
            }
        }
    }
}
