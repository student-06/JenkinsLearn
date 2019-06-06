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
                echo "hello pnr"
                echo "created dev!"
                echo "This branch is: $env.BRANCH_NAME"
                script {
                    if (env.CHANGE_ID){
                        echo "$env.CHANGE_ID";
                    }
                    else{
                        echo "env.CHANGE_ID does not exists."
                    }
                }
                // sh "echo env.BRANCH_NAME"
                // sh "echo $env.BRANCH_NAME"
                // sh "echo env.CHANGE_ID"
            }
        }
    }
}
