pipeline {
    agent {label 'master'}
    stages {
        stage('build') {
            steps {
                echo "Hello World!"
                bat "echo Hello from the bat"
                bat "maven+ --version"  
				bat "maven+ clean install"
            }
        } 
		stage('Deploy') {
            steps {
                bat "copy C:\\Users\\deeraj.parwani\\.jenkins\\workspace\\JenkinsGettingStarted_master\\target\\ResourceDetails.war  C:\\tomcat6\\webapps"
            }
        }
    }
}
