def T(){
    echo "true misty"
}

def F(){
    echo "false misty"
}

pipeline {
    agent any

    environment{
        IS_GENERATE=${params.isGenerate}
        }
    
    stages {

        
        
        stage('build') {
            steps {
                
                script {
                    
                    IS_GENERATE == "generate" ? T() : F()
                    //echo "hello"
                    //echo "$IS_GENERATE"
                    
                    //if (IS_GENERATE == "generate"){
                    //    T()
                    //}
                    //else{
                    //    F()
                    //}
                }
            }
        }
    }
}
