pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'Source code checked out from GitHub'
            }
        }

        stage('Build and Test') {
            steps {
                bat 'mvn clean test'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn -DskipTests package'
            }
        }

        stage('Run Program') {
            steps {
                bat 'java -cp target/classes StudentGradeCalculator'
            }
        }
    }

    post {
        success {
            echo 'Student Grade Calculator completed successfully'
        }
        failure {
            echo 'Student Grade Calculator build failed'
        }
    }
}
