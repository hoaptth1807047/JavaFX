package model;

import entity.Account;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountModel {

    public Account findByAccountAndPassword(String account, String password) {
        try {
            String sqlCommand = "select * from balance where account = ? and password = ?";
            PreparedStatement preparedStatement = ConnectionHelper.getConnection().prepareStatement(sqlCommand);
            preparedStatement.setString(1, account);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String rsAccount = resultSet.getString(1);
                String rsPassword = resultSet.getString(2);
                int rsBalance = resultSet.getInt(3);
                int rsStatus = resultSet.getInt(4);
                Account existAccount = new Account();
                existAccount.setAccount(rsAccount);
                existAccount.setPassword(rsPassword);
                existAccount.setBalance(rsBalance);
                return existAccount;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

//    public boolean save(Account account) {
//        try {
//            String sqlCommand = "insert into balance (account, password, balance, status) values (?,?,?,?)";
//            PreparedStatement preparedStatement = ConnectionHelper.getConnection().prepareStatement(sqlCommand);
//            preparedStatement.setString(1, account.getAccount());
//            preparedStatement.setString(2, account.getPassword());
//            preparedStatement.setInt(3, account.getBalance());
//            preparedStatement.setInt(4, account.getStatus());
//            preparedStatement.execute();
//            return true;
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//        return false;
//    }

    public boolean saveUser(Account account) {
        try {
            String sqlCommand = "insert into balance (account, password, confirmPassword, email, phone, address, balance) values (?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = ConnectionHelper.getConnection().prepareStatement(sqlCommand);
            preparedStatement.setString(1, account.getAccount());
            preparedStatement.setString(2, account.getPassword());
            preparedStatement.setString(3, account.getConfirmPassword());
            preparedStatement.setString(4, account.getEmail());
            preparedStatement.setString(5, account.getPhone());
            preparedStatement.setString(6, account.getAddress());
            preparedStatement.setInt(7, account.getBalance());
            preparedStatement.execute();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

//    public static void main(String[] args) {
//        AccountModel model = new AccountModel();
//        Account account = new Account();
//        LoginStage loginStage = new LoginStage();
//        if (loginStage.t.equals(account) && account.equals()) {
//
//        }
//        model.save(account);
//    }

}
