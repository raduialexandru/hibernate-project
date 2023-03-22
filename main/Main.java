package main;

import model.Motherboard;
import org.hibernate.SessionFactory;
import repository.MotherboardRepository;
import session.SessionFactoryUtil;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = SessionFactoryUtil.getFactory();
        MotherboardRepository motherboardRepository = new MotherboardRepository(sessionFactory.openSession());

        Motherboard motherboard1 = new Motherboard("e234","asus");
        Motherboard motherboard2 = new Motherboard("j34","lenovo");
        Motherboard motherboard3 = new Motherboard("HGJ","dell");

        motherboardRepository.save(motherboard1);
        motherboardRepository.save(motherboard2);
        motherboardRepository.save(motherboard3);

        Motherboard motherboard4 = motherboardRepository.findById(2);
        System.out.println(motherboard4);
        Motherboard motherboard5 = motherboardRepository.getById(2);
        System.out.println(motherboard5);

        motherboard5.setType("new type");
        motherboard5 = motherboardRepository.update(motherboard5);
        System.out.println(motherboard5);

        Motherboard motherboard6 = motherboardRepository.update(motherboard1);
        System.out.println(motherboard6);
    }
}
