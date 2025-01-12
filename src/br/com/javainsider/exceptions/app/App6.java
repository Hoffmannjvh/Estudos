package br.com.javainsider.exceptions.app;

import br.com.javainsider.exceptions.account.AccountService;
import br.com.javainsider.exceptions.account.ServiceException;

public class App6 {

    public static void main(String[] args) {

        AccountService accountService = new AccountService();

        try {
            accountService.createAndWhithdraw("1234", 1200);

        } catch (ServiceException e) {
            e.printStackTrace();
        }


    }

}
