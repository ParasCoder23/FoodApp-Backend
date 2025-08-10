package in.paras.budhiraja.foodieapp.config;

import com.cloudinary.Cloudinary;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class CloudinaryConfig {

//    @Value("${cloudinary.cloud_name}")
    private String cloudName = "dnso5rwr2";

//    @Value("${cloudinary.api_key}")
    private String api_key = "597233919155867";

//    @Value("${cloudinary.api_secret}")
    private String api_secret = "-tgWRwytinV6S1TC70CBn_a-wHg";

    @Bean
    public Cloudinary getCloudinary(){
        Map config = new HashMap();

//        String cloudName = System.getenv("cloud_name");
        config.put("cloud_name", cloudName);

//        String api_key = System.getenv("api_key");
        config.put("api_key", api_key);

//        String api_secret = System.getenv("api_secret");
        config.put("api_secret", api_secret);

        config.put("secure", true);

        return new Cloudinary(config);
    }

}
