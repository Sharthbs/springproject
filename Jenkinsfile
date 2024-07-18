pipeline{
    agent any
    tools {
        maven 'maven'
    }
   
    stages{
        stage('clean'){
            steps{
               echo 'clean done'
            }
        }
        
         stage('validate'){
            steps{
                echo 'validated'
            }
        }
         stage('compile'){
            steps{
                echo 'passed'
            }
        }
         stage('test'){
            steps{
                echo 'tested'
            }
        }
         stage('package'){
            steps{
                echo 'prepare build'
            }
        }
        
    }
}
