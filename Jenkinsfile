pipeline {
  agent {
    node {
      label 'java_node_d'
    }

  }
  stages {
    stage('Build') {
      steps {
        sh 'ant -f build.xml -v'
      }
    }

  }
}