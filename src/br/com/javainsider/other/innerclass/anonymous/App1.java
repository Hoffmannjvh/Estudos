package br.com.javainsider.other.innerclass.anonymous;

public class App1 {

    public static void main(String[] args) {

//        class HiMessage implements Message {
//
//            @Override
//            public String get() {
//                return "Hi!";
//            }
//        }
//        HiMessage message = new HiMessage();

        Message message  = new Message() {
            @Override
            public String get() {
                return "Hi!";
            }
        };

        System.out.println(message.get());

    }
}
