package ru.bsuedu.cad.lab;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component("provider")
public class ConcreteProductProvider implements ProductProvider {
   private final Reader reader;
   private final Parser parser;

   public ConcreteProductProvider(Reader reader, @Qualifier("parser") Parser parser) {
      this.reader = reader;
      this.parser = parser;
   }

   public List<Product> getProducts() {
      List<Product> productsList = this.parser.parse(this.reader.read());
      return productsList;
   }
}