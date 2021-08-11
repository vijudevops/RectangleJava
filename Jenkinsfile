pipeline {
  agent {
    node {
	  label 'java_node_d'
	}
  
  }
  stages {
    
    stage('Junit Test'){
      steps{
        bat 'ant -f test.xml -v'
        junit 'reports/result.xml'
      }

    }
    
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
