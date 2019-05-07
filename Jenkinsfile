def T(){
    echo "true misty"
}

def F(){
    echo "false misty"
}

pipeline {
    agent any

    environment{
        IS_GENERATE="${params.isGenerate}"
        }
    
    stages {

        
        
        stage('build') {
            steps {
                
                script {
                    echo "hello"
                    echo "$IS_GENERATE"
                    
                    if (IS_GENERATE == true){
                        T()
                    }
                    else{
                        F()
                    }
                }
            }
        }
    }
}
