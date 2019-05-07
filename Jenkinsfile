pipeline {
    agent any

    stages {

        stage('build') {
            steps {
                echo "hello"
                params.isGenerate ? echo "true" : echo "false"
            }
        }
    }
}
