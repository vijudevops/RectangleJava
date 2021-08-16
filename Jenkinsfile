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
	
	stage ('Deploy'){
	  steps{
		bat 'copy dist/Rectangle_${env.BUILD-NUMBER}.jar D:/Softwares/AppServer/httpd-2.4.48-o111k-x64-vc15/Apache24/htdocs/'	  
	  }
		
	}

 }
 post{
  always{
     archiveArtifacts artifacts: 'dist/*.jar', fingerprint: true                   
   }
 }
 
}
