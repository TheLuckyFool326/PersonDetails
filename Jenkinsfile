pipeline {
    agent {label 'master'}
    stages {
        stage('build') {
            steps {
                echo "Hello World!"
                bat "echo Hello from the bat"
                bat "maven+ --version"  
            }
        }
    }
}
