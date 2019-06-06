def T(){
    echo "true misty"
}

def F(){
    echo "false misty"
}

pipeline {
    agent any

    stages {

        stage('build') {
            steps {
                sh "echo hello pnr"
                sh "created dev!"
                //sh "echo env.BRANCH_NAME"
                sh "echo $env.BRANCH_NAME"
                // sh "echo env.CHANGE_ID"
            }
        }
    }
}
