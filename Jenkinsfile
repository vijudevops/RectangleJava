pipeline {
  agent {
    node {
	  label 'master'
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
	    bat 'dir/a'
		echo "Build Number current: $BUILD_NUMBER OR $env.BUILD_NUMBER OR ${BUILD_NUMBER}"
		bat 'copy dist\\*.jar D:\\Softwares\\AppServer\\httpd-2.4.48-o111k-x64-vc15\\Apache24\\htdocs\\'	  
	  }
		
	}

 }
 post{
  always{
     archiveArtifacts artifacts: 'dist/*.jar', fingerprint: true                   
   }
 }
 
}
