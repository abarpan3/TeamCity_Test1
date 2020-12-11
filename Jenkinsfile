pipeline{
    
    agent {
        docker{
            image "maven:3.6.3-jdk-8-slim"
            label "docker"
        }
    }
    
    stages{   
        stage("Build"){
            steps{
                bat "mvn clean package"
            }
        }
        
        stage("Build Docker Image"){
            bat "docker build -t abarpan3/myapp:1.0.0 ."
        }
        
        stage("Push Docker Image"){
        
            withCredentials([string(credentialsId: 'docker-pass', variable: 'dockerpwd')]) {
        
                    bat "docker login -u abarpan3 -p ${dockerpwd}"
            }
            bat "docker push abarpan3/myapp:1.0.0"
        
        }
    }
    
    
}
