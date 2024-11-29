pipeline{
  agent any
  stages{
    stage('code'){
      steps{
        echo "code"
      }
    }
    stage('build'){
      steps{
        echo "build new"
      }
    }
    stage('push'){
      steps{
        echo "push new"
      }
    }
  }
}
