pipeline {
  agent {
    node {
	  label 'java_node_d'
	}
  
  }
  stages {
    stage('Build') {
      steps {
        bat 'ant -f build.xml -v'
      }
    }
 }
 post{
  always{
     archiveArtifacts artifacts: 'dist/*.jar', fingerprint: true                   
   }
 }
 
}
