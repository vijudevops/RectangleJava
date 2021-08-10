pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        bat 'ant -f build.xml -v'
      }
    }
 }
 post{
  always{
     archive 'dist/*.jar'
	 archiveArtifacts artifacts: 'dist/*.jar',
                   allowEmptyArchive: false,
                   fingerprint: false,
                   onlyIfSuccessful: false
   }
 }
 
}
