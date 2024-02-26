def call(){
  pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script{
                    demo()
                }
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
}
