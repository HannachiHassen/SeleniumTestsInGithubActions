pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building the application..'              
            }
        }
        stage('Testing') {
          parallel{
            stage("Unit Tests"){                
                steps {
                    echo 'Unit Tests the application..'
                }
            }
            stage("Functional Tests"){
                steps{
                    echo 'Functional Tests the application..'
                }
            }
            stage("Integration Tests"){
                steps{
                    echo 'Integration Tests the application..'
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

