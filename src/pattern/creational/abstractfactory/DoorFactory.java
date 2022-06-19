//package pattern.creational.abstractfactory;
//
//public class DoorFactory {
//
//    public static Door createDoor(String vendorID) {
//        Door door = null;
//
//        switch (vendorID) {
//            case "S":
//                door = new S_Door();
//                break;
//            case "K":
//                door = new K_Door();
//                break;
//        }
//        return door;
//    }
//}