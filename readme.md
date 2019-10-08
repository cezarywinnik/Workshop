WINDOWS 7 configuration:
1. Download gradle version 4.10.2 (click download binary-only link) https://gradle.org/releases/
2. Install gradle on C:\Gradle
3. Install google chrome version 77
4. Download jdk version 1.8.0_221 on your pc link to download
   https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
   (you need to create oracle account to proceed)
5. Install downloaded jdk on your pc (link to tutorial with whole setup: 
   https://codenotfound.com/java-download-install-jdk-8-windows.html)
6. Download repository
7. Open project from build.gradle file
8. In project settings (File -> settings-> Build, Execution, Deployment ->Gradle ->)
   set directory to gradle installation folder (C:/Gradle/gradle-4.10.2)
9. Wait until all dependencies are resolved
10. Click View -> Tool Windows -> Gradle (on the right panel you should see gradle project)
11. Select run configurations and click Workshop [clean]
12. Select run configurations and click Workshop [test]