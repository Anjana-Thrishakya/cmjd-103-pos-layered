/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.layerd.service.custom.impl;

import supermarket.layerd.dao.DaoFactory;
import supermarket.layerd.dao.custom.CustomerDao;
import supermarket.layerd.dto.CustomerDto;
import supermarket.layerd.entity.CustomerEntity;
import supermarket.layerd.service.custom.CustomerService;

/**
 *
 * @author anjanathrishakya
 */
public class CustomerServiceImpl implements CustomerService{
    
    CustomerDao customerDao = (CustomerDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CUSTOMER);

    @Override
    public String addCustomer(CustomerDto dto) throws Exception {
        CustomerEntity entity = new CustomerEntity(dto.getId(),
                dto.getTitle(), dto.getName(), dto.getDob(),
                dto.getSalary(), dto.getAddress(), dto.getCity(),
                dto.getProvince(), dto.getZip());
        
        
        
        return customerDao.add(entity) ? "Success" : "Fail";
    }
    
}
