pipeline {
    agent any
    stages {
        stage("Compile Stage") {
            steps {
                sh "./gradlew compileJava"
            }
        }
        stage("Unit test") {
            steps {
             sh "./gradlew test"
            }
        }
       stage("Code coverage") {
         steps {
           sh "./gradlew jacocoTestReport"
           publishHTML (target: [
           reportDir: 'build/reports/jacoco/test/html',
           reportFiles: 'index.html',
           reportName: "JaCoCo Report"
           ])
           sh "./gradlew jacocoTestCoverageVerification"
         }
       }
       stage("Static code analysis") {
         steps {
           sh "./gradlew checkstyleMain"
           publishHTML (target: [
           reportDir: 'build/reports/checkstyle/',
           reportFiles: 'main.html',
           reportName: "Checkstyle Report"
           ])
         }
       }
       stage("Package") {
       	steps {
       		sh "./gradlew build"
       	}
       }
       stage("Docker build") {
       	steps {
       		sh "docker build -t registry:5000/calculator ."
       	}
       }
       stage("Deploy to env") {
       	steps {
       		sh "docker run -d --rm -p 9999:9999 --name calculator registry:5000/calculator"
       	}
       }
    }
}