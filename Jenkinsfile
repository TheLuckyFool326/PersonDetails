pipeline {
    agent {label 'master'}
    stages {
        stage('Build') {
            steps {
                bat "maven+ --version"  
				bat "maven+ clean install"
            }
        } 
		stage('Deploy') {
            steps {
                bat "copy C:\\Users\\deeraj.parwani\\.jenkins\\workspace\\JenkinsGettingStarted_master\\target\\ResourceDetails.war  C:\\tomcat6\\webapps"
				bat "chdir"
				bat "./start-tomcat.bat"
            }
        }
    }
}
