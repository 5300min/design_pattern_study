//package pattern.creational.abstractfactory;
//
//public class MotorFactory{
//
//    public static Motor createMotor(String vendorID) {
//        Motor motor = null;
//
//        switch (vendorID) {
//            case "S":
//                motor = new S_Motor();
//                break;
//            case "K":
//                motor = new K_Motor();
//                break;
//        }
//        return motor;
//    }
//}