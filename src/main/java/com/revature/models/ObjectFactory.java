//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.19 at 10:29:18 AM EST 
//


package com.revature.models;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.revature.models package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.revature.models
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetHeroRequest }
     * 
     */
    public GetHeroRequest createGetHeroRequest() {
        return new GetHeroRequest();
    }

    /**
     * Create an instance of {@link GetHeroResponse }
     * 
     */
    public GetHeroResponse createGetHeroResponse() {
        return new GetHeroResponse();
    }

    /**
     * Create an instance of {@link SuperHero }
     * 
     */
    public SuperHero createSuperHero() {
        return new SuperHero();
    }

}
