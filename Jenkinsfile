pipeline {
    
    agent any
    
    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "Maven"
    }

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/abarpan3/TeamCity_Test1.git'

                // Run Maven on a Unix agent.
                //sh "mvn clean package"

                // To run Maven on a Windows agent, use
                bat "mvn clean package"
            }

            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    // junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.war'
                    
                   
                }
            }
        }
        
        stage('Deploy'){
            
            steps{
                
                deploy adapters: [tomcat9(credentialsId: '6c6ccadb-bf0f-41c6-9384-d0a0ca50ab76', path: '', url: 'http://localhost:9091/')], contextPath: null, onFailure: false, war: '**/EMS.war'
            }
        }
    }
}
