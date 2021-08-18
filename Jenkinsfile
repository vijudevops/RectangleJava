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
	  post{
         always{
            archiveArtifacts artifacts: 'dist/*.jar', fingerprint: true                   
			}
		}
 
    }
	
	stage ('Deploy'){
	  steps{
	    bat 'dir/a'
		echo "Build Number current: $BUILD_NUMBER OR $env.BUILD_NUMBER OR ${BUILD_NUMBER}"
		bat 'copy dist\\*.jar D:\\Softwares\\AppServer\\httpd-2.4.48-o111k-x64-vc15\\Apache24\\htdocs\\'	  
	  }
		post{
		success {
			emailext(
			 subject : "${env.JOB_NAME} [${env.BUILD_NUMBER}] Deployed code to http webserver ", 
			 body :""" <p> '${env.JOB_NAME} [${env.BUILD_NUMBER}] Deployed code to http webserver": </p>
			 <p> Check Console output at &QUOT; <a href='${env.BUILD_URL}'> ${env.JOB_NAME} [${env.BUILD_NUMBER}] </a>&QUOT;</p>""",
			 to : "vijay.vadagole@candelalabs.io"		 
			 )
		
			}
		
		}
	}
	
	stage('Promote develop branch to master'){
	   agent {
		  label 'java_node_d' 
		}
	   when {
		  branch 'develop'
       }	   
	   steps{
		  echo "Stashing any local changes"
		  bat 'git stash'
	      echo "Checkout Develop btanch"
		  bat 'git checkout develop'
		  echo "Checkout master branch"
		  bat 'git checkout master'
		  echo "merging development into master"
		  bat 'git merge develop'
		  echo "Push changes to origin master"
		  bat 'git push origin master'		 
	   }
	   post{

		success {
			emailext(
			 subject : "${env.JOB_NAME} [${env.BUILD_NUMBER}] Develop prompted to master ", 
			 body :""" <p> '${env.JOB_NAME} [${env.BUILD_NUMBER}] Develop prompted to master": </p>
			 <p> Check Console output at &QUOT; <a href='${env.BUILD_URL}'> ${env.JOB_NAME} [${env.BUILD_NUMBER}] </a>&QUOT;</p>""",
			 to : "vijay.vadagole@candelalabs.io"		 
			 )
		
			}
		
		}
	
	}
  }//end of stages section.
 
	post {
	failure {
		emailext(
		 subject : "${env.JOB_NAME} [${env.BUILD_NUMBER}] Failed !", 
		 body :""" <p> '${env.JOB_NAME} [${env.BUILD_NUMBER}] Failed !": </p>
		 <p> Check Console output at &QUOT; <a href='${env.BUILD_URL}'> ${env.JOB_NAME} [${env.BUILD_NUMBER}] </a>&QUOT;</p>""",
		 to : "vijay.vadagole@candelalabs.io"		 
		 )
	
		}
	
	}
 
}
