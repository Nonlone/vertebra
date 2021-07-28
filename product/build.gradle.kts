group = "per.nonlone.vertebra"
version = "1.0-SNAPSHOT"

dependencies{
    implementation(project(":common"))
    implementation("org.springframework.boot:spring-boot-starter-web")
    // Hikari 连接池
    implementation("com.zaxxer:HikariCP")
    // MyBatisPlus ORM 框架增强
    implementation("com.baomidou:mybatis-plus-boot-starter")
    // MySQL 数据库连接
    runtimeOnly("mysql:mysql-connector-java")
}