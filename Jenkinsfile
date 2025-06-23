pipeline {
    agent any
    tools {
        maven 'maven-3.2.5'
    }
	environment {
	    
	    ECR_REGISTRY = '603742353765.dkr.ecr.eu-west-3.amazonaws.com'
	    DOCKER_REPO = '603742353765.dkr.ecr.eu-west-3.amazonaws.com/dev/ci-repo'
        IMAGE_TAG = "${BUILD_NUMBER}"
	}
    stages{
        stage ("Checkout the project"){
            steps{
                git branch: 'main', credentialsId: 'github-credintials', url: 'https://github.com/hameed-muneef/weather-web-app.git'
            }
        }
        stage('Build the package'){
            steps{
                sh 'mvn clean package'
            }
        }
		stage ("Sonar Quality Check "){
		   steps{
		   script{
		   withSonarQubeEnv(installationName: 'sonar-9',credentialsId: 'jenkins-sonar'){
		   sh 'mvn sonar:sonar'
		   }
		      timeout(time: 1, unit: 'HOURS') {
              def qg = waitForQualityGate()
              if (qg.status != 'OK') {
                  error "Pipeline aborted due to quality gate failure: ${qg.status}"
              }
		   }
		   }
		}
        
    }
	stage('Building the image '){
	     steps{
		   sh "docker build -t ${DOCKER_REPO}:${IMAGE_TAG} ."
		 }
	
	}
	stage('Login to ECR') {
            steps {
                withCredentials([[$class: 'AmazonWebServicesCredentialsBinding', credentialsId: 'ecr-test']]) {
                    sh '''
                        aws ecr get-login-password --region $AWS_REGION | \
                        docker login --username AWS --password-stdin $ECR_REGISTRY
                    '''
                }
            }
        }
	stage('Push to ECR') {
            steps {
                sh """
                    docker push ${DOCKER_REPO}:${IMAGE_TAG}
                """
            }
        }
}
}
