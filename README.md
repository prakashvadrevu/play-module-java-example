# Play Module Java Example

Clone the project and give this command to build and publish it locally

```
activator publish-local
```

Add this in your target app's build.sbt

```
"in.confest" % "play-module-java-example_2.11" % "1.0"
```

You're done. You can import "Message" using @Inject

```
@Inject
private Message message;

public Result getMessage() {
    return ok(message.getMessage());
}
```

Fore a detailed info on this project, look at [Writing a Play module](https://medium.com/confest/writing-a-play-module-e8cc95cb9285#.y7zt92vpa)
