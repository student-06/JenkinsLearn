def T(){
    echo "true misty"
}

def F(){
    echo "false misty"
}

pipeline {
    agent any
    environment {
        IS_PR_RAISED="$env.CHANGE_ID"
    }
    stages {

        stage('build') {
            steps {
		echo "this is dev4"
		echo "dev4 exclude pr branches and after raising pr"
                sh 'printenv'
                echo "hello pnr"
                echo "created dev!"
                echo "This branch is: $env.BRANCH_NAME"
                echo "final check for push"
                
                script {

                    echo "outside IS_PR_RAISED: $IS_PR_RAISED";

                    if (IS_PR_RAISED == "null"){
                        echo "pr is not raised";
                    }
                    else{
                        echo "pr is raised";
                        echo "IS_PR_RAISED: $IS_PR_RAISED";
                    }

                    if (!env.CHANGE_ID){
                        echo "commit based testing";
                    }
                    else{
                        echo "full testing";
                    }

                    if (!env.CHANGE_ID){
                        echo "yes changeid is integer"
                        echo "env.CHANGE_ID $env.CHANGE_ID"
                    }

                    if (env.CHANGE_ID){
                        echo "$env.CHANGE_ID";
                        echo "env.CHANGE_ID $env.CHANGE_ID"
                    }
                    else{
                        echo "env.CHANGE_ID does not exists.";
                    }

                    echo "$env"

                    if (env.BUILD_NUMBER){
                        echo "$env.BUILD_NUMBER";
                    }
                    else{
                        echo "env.BUILD_NUMBER does not exists.";
                    }


                }
                // sh "echo env.BRANCH_NAME"
                // sh "echo $env.BRANCH_NAME"
                // sh "echo env.CHANGE_ID"
            }
        }
    }
}
