# yafunc
Yet another collection of commonly used functional interfaces for java applications.

## Usage
First, you need to add the library to your project:

```gradle
// Add mavenCentral to your repositories
repositories {
    mavenCentral();
}

// Add the library (NOTE: Check the latest version on github)
depdendencies {
    implementation group: 'dk.yalibs', name: 'yafunc', version: '1.0.0';
}
```

Now you can access the function interfaces like so:

```java
import dk.yalibs.yafunc.IRunnable1; // Import it

public class Main {
    public static void main(String[] argv) throws Exception {
        IRunnable1<String> r = (String argument) -> System.out.println(argument);
        r.run("Hello World");
    }
}
```

