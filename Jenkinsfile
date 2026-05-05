pipeline {
    agent any

    tools {
        maven 'maven-3.9'
    }

    options {
        timestamps()
        buildDiscarder(logRotator(numToKeepStr: '10'))
    }

    stages {
        stage('Checkout') {
            steps {
                echo "Checkout depuis le SCM (Git ${sh(script: 'git --version', returnStdout: true).trim()})"
                checkout scm
            }
        }

        stage('Build') {
            steps {
                dir('app') {
                    sh 'mvn -B -ntp clean compile'
                }
            }
        }

        stage('Test') {
            steps {
                dir('app') {
                    sh 'mvn -B -ntp test'
                }
            }
            post {
                always {
                    junit testResults: 'app/target/surefire-reports/*.xml', allowEmptyResults: true
                }
            }
        }

        stage('Package — Artefact') {
            steps {
                dir('app') {
                    sh 'mvn -B -ntp package -DskipTests'
                }
            }
            post {
                success {
                    archiveArtifacts artifacts: 'app/target/*.jar', fingerprint: true
                }
            }
        }
    }

    post {
        success { echo 'Pipeline OK — artefact mis à disposition.' }
        failure { echo 'Pipeline KO — voir logs.' }
    }
}
