# LintCheckIssue
A sample project demonstrating an issue with compose lint

# Test the problem
```groovy
./gradlew lintRelease
```

# Observe the issue
You can notice that there is a `PublicGreetingPreview` inside `Compose.kt` which I would expect to be reported by the linter. 
The problem is only reported once we configure 
```xml
<issue id="ComposePreviewPublic" severity="error">
    <option name="preview-public-only-if-params" value="false" />
</issue>
```
