def T(){
    echo "true misty"
}

def F(){
    echo "false misty"
}

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
                if (IS_GENERATE){
                    T()
                }
                else{
                    F()
                }
            }
        }
    }
}
