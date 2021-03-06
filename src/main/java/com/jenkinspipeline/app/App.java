node {
    stage('SCM-Checkout') {
	    git branch: 'main', credentialsId: 'git_credentials', url: 'https://github.com/namrata4447/jenkins-pipeline-script.git' 
	}
    stage('Maven-clean') {
        def mvnHome = tool name: 'Maven_home', type: 'maven'
        def mvnCMD = "${mvnHome}/bin/mvn"
        sh "${mvnCMD} clean"
	}
    stage('Maven-compile') {
        def mvnHome = tool name: 'Maven_home', type: 'maven'
        def mvnCMD = "${mvnHome}/bin/mvn"
        sh "${mvnCMD} compile"
	}
    stage('Maven-Package') {
        def mvnHome = tool name: 'Maven_home', type: 'maven'
        def mvnCMD = "${mvnHome}/bin/mvn"
        sh "${mvnCMD} package"
	}
}
