pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building the application..'
                sh 'mvn -v'                 
            }
        }
        stage('Testing') {
          parallel{
            stage("Unit Tests"){                
                steps {
                    echo 'Unit Tests the application..'
                    sh 'java -version'
                }
            }
            stage("Functional Tests"){
                steps{
                    echo 'Functional Tests the application..'
                    sh 'java -version'
                }
            }
            stage("Integration Tests"){
                steps{
                    echo 'Integration Tests the application..'
                    sh 'java -version'
                }
            }
          }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying the application....'
            }
        }
    }
}

