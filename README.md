# HelloKotlinNDK

A "Hello World" Kotlin + NDK Android project.

From the command line, do something like this to make sure that repository is in working order.

```sh
./gradlew --refresh-dependencies
./gradlew test
./gradlew clean check build
```

From the command line, the following can be used to build the APK, install it on a device and start the MainActivity.

```sh
./gradlew assembleDebug installDebug
PACKAGE_NAME=$(cat app/src/main/AndroidManifest.xml | grep package | sed 's/">.*$//' | sed 's/^.*"//')
ACTIVITY_NAME=".MainActivity"
adb shell am start -n "${PACKAGE_NAME}/${ACTIVITY_NAME}"
```

A couple of potentially useful commands to uninstall or reinstall the APK with **adb**.

```sh
adb uninstall "${PACKAGE_NAME}"
adb install -r app/build/outputs/apk/app-debug.apk
```

The following tasks can be used to run tests on a connected device or emulator.

```sh
./gradlew connectedCheck
./gradlew connectedAndroidTest
./gradlew connectedDebugAndroidTest
```

