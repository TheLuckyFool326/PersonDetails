pipeline {
    agent {label 'master'}
    stages {
        stage('Build') {
            steps {
				bat "maven+ clean install"
            }
        } 
		stage('Deploy') {
            steps {
                bat "copy C:\\Users\\deeraj.parwani\\.jenkins\\workspace\\JenkinsGettingStarted_master\\target\\ResourceDetails.war  C:\\tomcat6\\webapps"
				bat "./start-tomcat.bat"
            }
        }
    }
	
	post {
		always {
			echo "This is displayed as part of every new build."
		}
		
		success {
			echo "Jenkins Build Successful!"
		}
		
		failure {
			echo "Jenkins Build Failed!"
		}
		
		changed {
			echo "The state of the Jenkins Build changed from failed to successful or vice-versa."
		}
	}
}
