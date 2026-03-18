pipeline{
    agent any
    tools {
        maven 'Maven-3.9'
        jdk 'JDK-17'
    }
    stages{
        stage('Chekout'){
            steps{
                echo 'Checking out git repository ...'
                git branch: 'main', url:'https://github.com/13XAVI/jenkins_pipelines'
            }
        }
        stage('Build'){
            steps{
                echo 'Building ...'
                bat 'mvn clean compile'
            }
        }
        stage('Test'){
            steps{
                echo 'Teting main java ...'
                bat 'mvn test'
            }
        }
        stage('Package'){
            steps{
                echo 'Packaging Jar ...'
                bat 'mvn package'
            }
        }
        stage('Deploy'){
            steps{
                echo 'Deploying ...'
                bat ' java -cp target/Capitalize-1.0-SNAPSHOT.jar'
            }
        }
    }
}