pipeline {
    agent {label 'master'}
    stages {
        stage('build') {
            steps {
                echo "Hello World!"
                sh "echo Hello from the shell"
                bat "echo Hello from the bat"
                bat "maven+ --version"  
            }
        }
    }
}
