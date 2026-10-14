

pipeline {
    agent any

    environment {
        JAVA_HOME = 'C:\\Users\\DELL\\AppData\\Local\\Programs\\Eclipse Adoptium\\jdk-21.0.12.8-hotspot'
        PATH = "${JAVA_HOME}\\bin;${PATH}"
    }

    stages {
        stage('Checkout') {
            steps {
                echo 'Source code checked out from GitHub'
            }
        }

        stage('Check Java and Maven') {
            steps {
                bat 'java -version'
                bat '"C:\\Users\\DELL\\Downloads\\apache-maven-3.10.0-bin\\apache-maven-3.10.0\\bin\\mvn.cmd" -version'
            }
        }

        stage('Build and Test') {
            steps {
                bat '"C:\\Users\\DELL\\Downloads\\apache-maven-3.10.0-bin\\apache-maven-3.10.0\\bin\\mvn.cmd" clean test'
            }
        }

        stage('Package') {
            steps {
                bat '"C:\\Users\\DELL\\Downloads\\apache-maven-3.10.0-bin\\apache-maven-3.10.0\\bin\\mvn.cmd" -DskipTests package'
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
