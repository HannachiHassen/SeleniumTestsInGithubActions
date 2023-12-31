
# Overview of GitHub Actions

GitHub Actions is a continuous integration and continuous delivery (CI/CD) platform that allows you to automate your build, test, and deployment pipeline. You can create workflows that build and test every pull request to your repository, or deploy merged pull requests to production.

GitHub Actions goes beyond just DevOps and lets you run workflows when other events happen in your repository. For example, you can run a workflow to automatically add the appropriate labels whenever someone creates a new issue in your repository.

GitHub provides Linux, Windows, and macOS virtual machines to run your workflows, or you can host your own self-hosted runners in your own data center or cloud infrastructure.

# Run a workflow on any GitHub event

Kick off workflows with GitHub events like push, issue creation, or a new release. 
Combine and configure actions for the services you use, built and maintained by the community.

Whether you want to build a container, deploy a web service, or automate welcoming new users to your open source projects—there's an action for that. 

Pair GitHub Packages with Actions to simplify package management, including version updates, fast distribution with GitHub global CDN, and dependency resolution, using your existing GITHUB_TOKEN.

# Workflows

A workflow is a configurable automated process that will run one or more jobs. Workflows are defined by a YAML file checked in to your repository and will run when triggered by an event in your repository, or they can be triggered manually, or at a defined schedule.

Workflows are defined in the .github/workflows directory in a repository, and a repository can have multiple workflows, each of which can perform a different set of tasks. For example, you can have one workflow to build and test pull requests, another workflow to deploy your application every time a release is created, and still another workflow that adds a label every time someone opens a new issue.

# Events

An event is a specific activity in a repository that triggers a workflow run. For example, activity can originate from GitHub when someone creates a pull request, opens an issue, or pushes a commit to a repository. You can also trigger a workflow to run on a schedule, by posting to a REST API, or manually.

# Jobs

A job is a set of steps in a workflow that is executed on the same runner. Each step is either a shell script that will be executed, or an action that will be run. Steps are executed in order and are dependent on each other. Since each step is executed on the same runner, you can share data from one step to another. For example, you can have a step that builds your application followed by a step that tests the application that was built.

You can configure a job's dependencies with other jobs; by default, jobs have no dependencies and run in parallel with each other. When a job takes a dependency on another job, it will wait for the dependent job to complete before it can run. For example, you may have multiple build jobs for different architectures that have no dependencies, and a packaging job that is dependent on those jobs. The build jobs will run in parallel, and when they have all completed successfully, the packaging job will run.

# Actions

An action is a custom application for the GitHub Actions platform that performs a complex but frequently repeated task. Use an action to help reduce the amount of repetitive code that you write in your workflow files. An action can pull your git repository from GitHub, set up the correct toolchain for your build environment, or set up the authentication to your cloud provider.

You can write your own actions, or you can find actions to use in your workflows in the GitHub Marketplace.

# Runners

A runner is a server that runs your workflows when they're triggered. Each runner can run a single job at a time. GitHub provides Ubuntu Linux, Microsoft Windows, and macOS runners to run your workflows; each workflow run executes in a fresh, newly-provisioned virtual machine. GitHub also offers larger runners, which are available in larger configurations.

 If you need a different operating system or require a specific hardware configuration, you can host your own runners.
 
## Part 9-1 Android Test In GitHub Runner
 
we can run the andriod tests in the Github Runner itself and it can save lot of money

  1. Setup project
  2. Setup java
  3. Setup Node
  4. Download appium
  5. Run appium
  6. Start emulator
  7. Run the test

## Part 9-2 IOS Test In GitHub Runner
we can run the ios tests in the Github Runner itself and it can save lot of money

   1. Setup project
   2. Setup java
   3. Setup Node
   4. Download appium
   5. Run appium
   6. Start emulator
   7. Run the test
   
## Part 12 Manage Dependencies using DependaBot
 Automatically create PR to update the dependencies from lower versions to newer version
 
## Part 13 Automatically Merge dependaBot Pull Request
 Automatically merge PR when the unit test/smoke test passed
 