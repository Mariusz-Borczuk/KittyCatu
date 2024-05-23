package main.java.com.example.demo;

public class huia {

    @Autowired
    private Environment env;

    public void printDataSourceUrl() {
        String dataSourceUrl = env.getProperty("spring.datasource.url");
        System.out.println(dataSourceUrl);
    }

}
