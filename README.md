# STATS-API Maven Dependency

The `STATS-API` is a Java library that provides functionality for statistics and analytics. To include this library in your Maven project, you can use the following dependency configuration in your `pom.xml` file.

**Maven Dependency:**
```xml
<dependency>
  <groupId>com.mobiera.ms.commons</groupId>
  <artifactId>stats-api</artifactId>
  <version>XXX</version>
</dependency>
```


## Import Notes

- Maven Dependency
Make sure to include the STATS-API dependency within the `<dependencies>` section of your `pom.xml` file. This allows Maven to fetch and manage the required JAR files during the build process.

- Maven Repositories
The two repositories specified in the configuration (`gitlab-maven-microservice-commons-group` and `microservice-commons-unauth`) provide access to the STATS-API library. Ensure that the URLs are correctly configured to point to the respective Maven repositories.

- Version Management
Keep in mind that the version mentioned in the configuration (`XXX`) may change over time. It is crucial to regularly check for updates and ensure that you are using the latest version of the STATS-API library.

## Conclusion
By following these instructions, you can seamlessly integrate the STATS-API library into your Java project using Maven. Pay attention to version updates and token management for a smooth development experience.

# Usage Guide
To make the most of the `stats-api` library, it is crucial to follow a specific set of steps. Below outlines the recommended usage:

## Prerequisites
Before integrating the library into your project, ensure you have the STATS container service created or deployed. For detailed information, refer to the README of the STATS project. This service will handle processing all sent statistics, and the `stats-api` library acts as an interface to facilitate communication between your application and the statistics service.

## Integration into Your Service
After importing the library correctly, follow these steps to set up your service:

1. Create Enum Classes
In your service, it is necessary to create at least two enum classes: `StatClass` and `StatEnum`. These classes are fundamental for organizing and defining the statistics your application will use.

### `StatClass`
The `StatClass` class should contain the attributes `index`, `className`, and `label`. These attributes are essential for identifying and controlling the names of the classes used for statistics. Each instance of `StatClass` represents a category of statistics.

### `StatEnum`
`StatEnum` classes represent specific statistics and are subject to your needs. Each `StatEnum` should have the attributes `index`, `label`, and `showByDefault`, where the latter determines if the statistic should be shown by default.

2. Details in `StatClass` and `StatEnum`
In the `StatClass` class, group the different classes of statistics you will use in your service. The `StatEnum` class provides specific details for each class of statistics, such as index, label, and whether it should be shown by default.

### Example:
```java
// StatClass
public enum StatClass {
    USERS(1, "User Statistics"),
    SALES(2, "Sales Statistics"),
    // ... Other classes as needed
    ;

    private final int index;
    private final String className;
    private final String label;

    StatClass(int index, String className) {
        this.index = index;
        this.className = className;
        this.label = className; // You can adjust the label as needed
    }
}

// StatEnum
public enum USERS {
    TOTAL_USERS(1, "Total Users", true),
    ACTIVE_USERS(2, "Active Users", false),
    // ... Other statistics as needed
    ;

    private final int index;
    private final String label;
    private final boolean showByDefault;

    USERS(int index, String label, boolean showByDefault) {
        this.index = index;
        this.label = label;
        this.showByDefault = showByDefault;
    }
}
```

## Note: 
For specific implementation details, refer to the README of the STATS project.