pipeline {
    agent { 'master' } 
    stages {
        stage('Run job2') {
            steps {
                sh 'touch job2.txt'
            }
            steps {
                sh 'echo "12121">job2.txt'
            }
        }
    }
}