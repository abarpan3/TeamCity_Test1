pipeline{
    
    agent {
        docker{
            image "maven:3.6.3-jdk-8-slim"
          
        }
    }
    
    stages{   
        stage("Build"){
            environment {
                  HOME="."
                }
            steps{
                bat "mvn -v"
            }
        }
   
    }
    
    
}
