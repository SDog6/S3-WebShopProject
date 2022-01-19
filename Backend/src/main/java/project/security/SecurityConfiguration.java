package project.security;


import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final AuthenticationUserDetailService authenticationUserDetailService;

    @Override protected void configure(HttpSecurity http) throws Exception {
        http.cors().and().csrf().disable().authorizeRequests()
                .antMatchers(HttpMethod.POST, AuthenticationConfigConstants.SIGN_UP_URL).permitAll()
                .antMatchers(HttpMethod.POST,"/CPU").hasAnyAuthority("ADMIN")
                .antMatchers(HttpMethod.POST,"/CPUCooler").hasAnyAuthority("ADMIN")
                .antMatchers(HttpMethod.POST,"/GPU").hasAnyAuthority("ADMIN")
                .antMatchers(HttpMethod.POST,"/Motherboard").hasAnyAuthority("ADMIN")
                .antMatchers(HttpMethod.POST,"/PowerSupply").hasAnyAuthority("ADMIN")
                .antMatchers(HttpMethod.POST,"/Storage").hasAnyAuthority("ADMIN")
                .antMatchers(HttpMethod.POST,"/RAM").hasAnyAuthority("ADMIN")
                .antMatchers(HttpMethod.GET,"/Order").hasAnyAuthority("ADMIN")
                .antMatchers(HttpMethod.GET,"/Order/ByUser").hasAnyAuthority("ADMIN","USER")
                .antMatchers(HttpMethod.GET,"/Inventory").hasAnyAuthority("ADMIN")
                .antMatchers(HttpMethod.POST,"/IncreaseAmount/{prodId}/{amount}").hasAnyAuthority("ADMIN")
                .antMatchers("/ws").hasAnyAuthority("ADMIN","USER")
                .antMatchers("/app/topics").hasAnyAuthority("ADMIN","USER")
                .antMatchers("/topic/chat").hasAnyAuthority("ADMIN","USER")


                .anyRequest().permitAll()
                .and()
                .addFilter(new JWTAuthenticationFilter(authenticationManager()))
                .addFilter(new JWTAuthorizationFilter(authenticationManager()))
                // this disables session creation on Spring Security
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
    }

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(authenticationUserDetailService).passwordEncoder(bCryptPasswordEncoder);
    }


    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("http://localhost:3000")
                                .allowedMethods("GET", "PUT", "POST", "PATCH", "DELETE", "OPTIONS");
            }
        };
    }

}
