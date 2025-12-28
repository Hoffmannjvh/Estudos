package br.com.javainsider.other.api;

public class ExPhoneBook {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        String phone = phoneBook.findByName("Pedro")
                .orElseThrow(() -> new IllegalArgumentException("Contato não encontrado"));
        System.out.println(phone);
    }
}
