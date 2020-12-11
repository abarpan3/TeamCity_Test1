pipeline{
    
    agent {
        docker{
            
            label 'windows'
            image 'mcr.microsoft.com/powershell'
          
        }
    }
    
    stages{   
        stage("Build"){
            steps{
                bat "docker pull maven:3.6.3-jdk-8-slim
                bat "mvn -v"
            }
        }
   
    }
    
    
}
