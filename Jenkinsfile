node {
    
    def mvnHome
    stage('Preparation') { // for display purposes
        // Get some code from a GitHub repository
        git 'https://github.com/abarpan3/TeamCity_Test1'
        // Get the Maven tool.
        // ** NOTE: This 'M3' Maven tool must be configured
        // **       in the global configuration.
        // mvnHome = tool 'Maven'
    }
    stage('Build') {
        // Run the maven build
        sh "mvn clean package"
    }
    
    stage('Build Docker Image'){
        
        sh "docker build -t abarpan3/myapp:1.0.0 ."
        
    }
    
    stage('Push Docker Image'){
        
    withCredentials([string(credentialsId: 'Docker_PWD', variable: 'docker_pwd')]) {
        
        sh "docker login -u abarpan3 -p ${docker_pwd}"
    }
        sh "docker push abarpan3/myapp:1.0.0"
        
    }
      
  

    
}
