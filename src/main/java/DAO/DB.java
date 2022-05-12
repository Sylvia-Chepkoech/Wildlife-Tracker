package DAO;

import org.sql2o.Sql2o;

public class DB {
    public static Sql2o sql2o = new Sql2o("jdbc:postgresql://ec2-52-5-110-35.compute-1.amazonaws.com:5432/d2kk6di8ji9ch", "lzbeheumqexkes", "f3b63c8cefe083cfd44c62b624dcc395230874557f547e1b34bdde25ae4eaf5d");
//    public static Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker", "chechesylvia", "0718500898");
}
//postgres://lzbeheumqexkes:f3b63c8cefe083cfd44c62b624dcc395230874557f547e1b34bdde25ae4eaf5d@ec2-52-5-110-35.compute-1.amazonaws.com:5432/d2kk6di8ji9ch