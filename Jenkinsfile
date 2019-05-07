pipeline {
    agent any

    stages {

        environment{
        IS_GENERATE=params.isGenerate
        }
        
        stage('build') {
            steps {
                echo "hello"
                echo "$IS_GENERATE"
                IS_GENERATE ? echo "true" : echo "false"
            }
        }
    }
}
