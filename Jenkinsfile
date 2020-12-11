pipeline{
    
    agent {
        docker{
            image "maven:3.6.3-jdk-8-slim"
          
        }
    }
    
    stages{   
        stage("Build"){
            steps{
                bat "mvn -v"
            }
        }
   
    }
    
    
}
