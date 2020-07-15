package helpers;

import static java.lang.Boolean.parseBoolean;


public class EnvironmentHelper {

// BROWSERSTACK CONFIG
    public static final String
        bsLogin = System.getProperty("bs_login", ""),
        bsPassword = System.getProperty("bs_password", "");

// CI CONFIG (jenkins)
    public static final String
            buildNumber = System.getProperty("build_number", "0"),
            jobBaseName = System.getProperty("job_base_name", "local");
}
