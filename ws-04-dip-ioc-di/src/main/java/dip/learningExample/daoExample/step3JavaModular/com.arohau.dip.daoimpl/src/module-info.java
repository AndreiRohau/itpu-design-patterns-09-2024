module com.arohau.dip.daoimpl {
    requires com.arohau.dip.entity;
    requires com.arohau.dip.dao;
//    todo do we really need below line?
//    provides com.arohau.dip.dao.CustomerDao with com.arohau.dip.daoimpl.SimpleCustomerDao;
    exports com.arohau.dip.daoimpl;
}