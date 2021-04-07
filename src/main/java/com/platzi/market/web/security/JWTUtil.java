package com.platzi.market.web.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.userdetails.UserDetails;
import java.util.Date;

public class JWTUtil {

    public String generateToken(UserDetails userDetails){

        final String KEY = "@0nF1r3@";

        return Jwts.builder().setSubject(userDetails.getUsername()).setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 6 * 10))
                .signWith(SignatureAlgorithm.HS256, KEY).compact();
    }
}
