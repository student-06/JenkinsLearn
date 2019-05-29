pipeline {
    agent any

    stages {

        stage('build') {
            steps {
                sh "echo hello pnr"
                sh "created dev!"
                sh 'env'
                sh "echo $env.CHANGE_ID"
            }
        }
    }
}
