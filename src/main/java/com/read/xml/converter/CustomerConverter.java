package com.read.xml.converter;

import com.read.xml.model.Customer;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

public class CustomerConverter implements Converter {

    @Override
    public boolean canConvert(Class type) {
        return type.equals(Customer.class);
    }

    @Override
    public void marshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) {
        // Don't do anything
    }

    @Override
    public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
        reader.moveDown();
        Customer customer = new Customer();
        customer.setFirstName(reader.getValue());

        reader.moveUp();
        reader.moveDown();
        customer.setLastName(reader.getValue());

        return customer;
    }
}