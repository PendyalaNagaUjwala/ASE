# Java Addition CI

A small Java 17 project demonstrating addition, JUnit 5 tests, Checkstyle, and
GitHub Actions.

## Requirements

- JDK 17 or newer
- Maven 3.6.3 or newer
- Git
- Visual Studio Code with the Extension Pack for Java (optional)

## Run locally

From this directory, run:

```shell
mvn clean test
mvn checkstyle:check
```

## Open in Visual Studio Code

Open the `Java-Addition-CI` directory in VS Code. Maven will detect `pom.xml`
and import the project automatically.

## Run CI on GitHub

Create a GitHub repository, then run these commands from this directory. Replace
`YOUR_USERNAME` with your GitHub username:

```shell
git init
git branch -M main
git add .
git commit -m "Initial Java addition project"
git remote add origin https://github.com/YOUR_USERNAME/Java-Addition-CI.git
git push -u origin main
```

The workflow in `.github/workflows/ci.yml` runs Checkstyle and the unit tests on
pushes and pull requests targeting `main`.
