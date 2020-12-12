pipeline {
    
    agent{
        docker{

            image "maven:3.6.3-jdk-8-slim"

        }
    }

    stages{

        stage('Preparation') { // for display purposes
        // Get some code from a GitHub repository
        steps{
            
            git 'https://github.com/abarpan3/TeamCity_Test1'
        }
 
      
    }
    stage('Build') {
        // Run the maven build
        steps{
            sh "mvn clean package"
        }
        
    }
    
    stage('Build Docker Image'){
        
        steps{

            sh "docker build -t abarpan3/myapp:1.0.0 ."
        }
        
        
        
    }
    
    stage('Push Docker Image'){

        steps{

               withCredentials([string(credentialsId: 'Docker_PWD', variable: 'docker_pwd')]) {
        
        sh "docker login -u abarpan3 -p ${docker_pwd}"
    }
        sh "docker push abarpan3/myapp:1.0.0"
        
    }
      
  
        }
        

    }
}
