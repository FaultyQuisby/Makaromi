/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entites.Address;
import entites.Artist;
import entites.Event;
import entites.Pricing;
import entites.Representation;
import entites.Section;
import entites.UserReg;
import entites.Venue;
import java.util.GregorianCalendar;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author cdi310
 */
@Stateless
public class jeudetest implements jeudetestLocal {
 
 @PersistenceContext(unitName = "Makaromi-ejbPU")
 private EntityManager em;
  
 
 @Override
   public String createbd(){
       
       System.out.println("creatbd execute-------------------------------------->");
        Address ad1 = new Address("Zac du Cornillon Nord", "93200", "Saint-Denis");
        Address ad2 = new Address("Boulevard de Bercy", "75012", "PARIS");
        Address ad3 = new Address("bd serurier", "75019", "paris");
        Address ad4 = new Address("rue montaigne", "75005", "paris");
        Address ad5 = new Address("rue lefevre", "75002", "paris");
        Address ad6 = new Address("avenue leflandre", "75017", "paris");
        Address ad7 = new Address("boulevard de la bastille", "75012", "paris");
        Address ad8 = new Address("rue de l'ouest", "25065", "lyon");
        Address ad9 = new Address("P.O. Box 727, 6257 Cursus Road", "33006", "Prince Albert");
        Address ad10 = new Address("P.O. Box 576, 5805 Arcu. Rd.", "39-200", "Aurora");
        Address ad11 = new Address("Ap #979-195 Velit Road", "5443", "Norfolk County");
        Address ad12 = new Address("9571 Magna Av.", "77277", "Red Deer");
        Address ad13 = new Address("6510 Tristique Av.", "S9J 9G4", "Matagami");
        Address ad14 = new Address("382-568 Pretium St.", "31354", "Villers-la-Ville");
        Address ad15 = new Address("P.O. Box 610, 7900 Sem Road", "14-310", "Castelluccio Superiore");
        Address ad16 = new Address("846-791 Fusce Ave", "O72 3EH", "Peutie");
        Address ad17 = new Address("153-2157 Mauris Avenue", "851268", "Merdorp");
        Address ad18 = new Address("5333 Dui. Road", "918850", "Manukau");
        Address ad19 = new Address("395-1937 Nascetur St.", "30-051", "Garbsen");
        Address ad20 = new Address("Ap #335-387 Dui, Rd.", "74784", "Navadwip");
        Address ad21 = new Address("Ap #190-5326 Odio, Av.", "5831", "Sint-Joost-ten-Node");
        Address ad22 = new Address("8994 Purus, Road", "41117", "Piegaro");
        Address ad23 = new Address("P.O. Box 609, 8350 Sem Street", "80694", "Drayton Valley");
        Address ad24 = new Address("Ap #254-6553 Pede Avenue", "6400", "Houtave");
        Address ad25 = new Address("6524 Non, Rd.", "3068", "Motta Sant Anastasia");
        Address ad26 = new Address("1715 Nec, Avenue", "926691", "Eufemia a Maiella");
        Address ad27 = new Address("332-8613 Malesuada Rd.", "1234", "Freire");
        Address ad28 = new Address("5515 Sapien. Road", "37280", "Lake Cowichan");




        ////////////////////////////////////////////////////////////////user
        UserReg u1 = new UserReg(ad18,ad18,"Mr","Alfonso", "Morse", "17/07/1976", "Quisque.purus.sapien@magnisdis.org","admin", "root");
        UserReg u2 = new UserReg(ad19,ad19,"Mr","Ivor", "Ellison", "15/02/1961", "fermentum.metus.Aenean@dictummiac.edu", "Charles Calderon", "SZS94IXT1FV");
        UserReg u3 = new UserReg(ad20,ad20,"Mr","Clayton", "Frazier", "22/05/1977", "metus@risusQuisquelibero.net", "Igor Aguirre", "MKC72DCE9QM");
        UserReg u4 = new UserReg(ad21,ad21,"Mr","Cameron", "Ferguson", "19/01/1955", "pellentesque.massa.lobortis@odiosempercursus.com", "Laith Stout", "LXF47GGQ0RY");
        UserReg u5 = new UserReg(ad22,ad22,"Mr","Amir", "Buckley", "23/02/1977", "facilisis.eget.ipsum@risusDonec.net","Keane Jenkins", "WYI25PIO3LB");
        UserReg u6 = new UserReg(ad23,ad23,"Mr","Hector", "Johnston", "23/04/1954", "Sed.nec.metus@felispurus.net", "Elton Coffey", "VYL79NGF9TI");
        UserReg u7 = new UserReg(ad24,ad25,"Mr","Ivan", "Nicholson", "05/10/1996", "convallis.ante.lectus@nisl.ca", "Bernard Tyson", "WTV91HZB2TB");
        UserReg u8 = new UserReg(ad26,ad26,"Mr","Barrett", "Burt", "12/05/1959", "fringilla.purus@eleifendnunc.com", "Nissim Jackson", "AFD22JCH8JN");
        UserReg u9 = new UserReg(ad27,ad27,"Mr","Isaiah", "Hoffman", "10/07/1945", "eget.venenatis.a@penatibusetmagnis.edu", "Odysseus Valencia", "MMU44UUP9FC");
        UserReg u10 = new UserReg(ad28,ad28,"Mr","Ryan", "Prince", "20/05/1963", "eros@sed.com","Noah Wilder", "SGR98IAM7SM");
        

       //////////////////////////////////////////section
        Section s1 = new Section("Musique");
        Section s2 = new Section("Théâtre");
        Section s3 = new Section("Parc");
        Section s4 = new Section("Festival");
        Section s5 = new Section("Promotion");
        Section s6 = new Section("Musée");
        Section s7 = new Section("Sport");
       //////////////////////////////////////////acteur
       Artist a1 = new Artist("Mick", "Jagger", "Chanteur Rolling Stones", "");
        Artist a2 = new Artist("Keith", "Richards", "Guitariste Rolling Stones", "");
        Artist a3 = new Artist("Charlie", "Watts", "Batteur Rolling Stones", "");
        Artist a4 = new Artist("Ron", "Wood", "Guitariste Rolling Stones", "");
        Artist a5 = new Artist("Anthony", "Kiedis", "Chanteur Red Hot Chilli Peppers", "");
        Artist a6 = new Artist("Michael", "Balzary (Flea)", "Bassiste Red Hot Chilli Peppers", "");
        Artist a7 = new Artist("Chad", "Smith", "Batteur Red Hot Chilli Peppers", "");
        Artist a8 = new Artist("Andrew", "Taggart", "Dj Chainsmokers", "");
        Artist a9 = new Artist("Alex", "Pall", "Dj Chainsmokers", "");
        Artist a10 = new Artist("Andrew", "Taggart", "Dj Chainsmokers", "");
        Artist a11 = new Artist("Alex", "Pall", "Dj Chainsmokers", "");
        Artist a12 = new Artist("Beyonce", "Knowles Carter", "", "");
        Artist a13 = new Artist("Sting", "", "", "");
      ///////////////////////////////////////////evenement
        Event e1 = new Event("Concert Retour des Rolling Stones", "images/event1RollingStones.jpeg", (new GregorianCalendar(2017, 1, 15).getTime()), (new GregorianCalendar(2017, 2, 15).getTime()), "Un retour fracassant des rois du rock n roll.", "un évènement à ne pas manquer");
        Event e2 = new Event("Concert parisien des Red Hot Chili Peppers", "images/event2RedHor.jpg", (new GregorianCalendar(2016, 12, 26).getTime()), (new GregorianCalendar(2017, 1, 14).getTime()), "Un groupe de légende.", "un évènement inoubliable");
        Event e3 = new Event("Tournée française de The Chainsmokers", "images/event3Chainsmokers.png", (new GregorianCalendar(2017, 2, 25).getTime()), (new GregorianCalendar(2017, 4, 1).getTime()), "Concert", "Une énergie incroyable");
        Event e4 = new Event("Tournée exceptionnelle de Beyonce", "images/event4Beyonce.jpg", (new GregorianCalendar(2017, 3, 25).getTime()), (new GregorianCalendar(2017, 5, 1).getTime()), "Tournée de concerts de la seule, l'unique QUEEN B", "Beyonce en forme olympique");
        Event e5 = new Event("Concert unique de Sting", "images/event5Sting.jpg", (new GregorianCalendar(2017, 6, 1).getTime()), (new GregorianCalendar(2017, 1, 7).getTime()), "Sting incroyable", "Le grand Sting en concert avec plein de duo et trio surprises");
        Event e6 = new Event("Finale Rugby TOP 14", "images/event6Rugby.jpg", (new GregorianCalendar(2017, 1, 2).getTime()), (new GregorianCalendar(2017, 2, 1).getTime()), "C'est LE match de la saison, celui que toutes les équipes de TOP 14 rêvent de jouer.", "Une finale qui promet d'être inoubliable");
        Event e7 = new Event("Handball PARIS 2017, 25 eme championnat du monde masculin", "images/event7Handball.jpg", (new GregorianCalendar(2017, 2, 3).getTime()), (new GregorianCalendar(2017, 2, 18).getTime()), "Elle ne pouvait rêver d'un meilleur calendrier.", "Regardez l'histoire s'écrire sous vos yeux");
        Event e8 = new Event("Finale coupe de la ligue", "images/event8LigueLyon.jpg", (new GregorianCalendar(2017, 3, 3).getTime()), (new GregorianCalendar(2017, 3, 3).getTime()), "A lyon une tribune sera réservée au familles et comprendra une offre de restauration.", " ");
        Event e9 = new Event("Mondial de hockey 2017", "images/event9Hockey.jpg", (new GregorianCalendar(2017, 2, 15).getTime()), (new GregorianCalendar(2017, 2, 30).getTime()), "La Finlande et la Biélorussie ouvriront les festivités à Paris.", " ");
        Event e10 = new Event("Hergé", "images/event10Herge.jpg", (new GregorianCalendar(2017, 1, 1).getTime()), (new GregorianCalendar(2017, 1, 15).getTime()), "On ne présente plus la carrière de Georges Remi, dit Hergé.", " ");
        Event e11 = new Event("Rembrandt intime", "images/event11Rembrandt.jpg", (new GregorianCalendar(2017, 12, 26).getTime()), (new GregorianCalendar(2017, 1, 28).getTime()), "L'exposition est conçue autour des trois chefs-d'oeuvre du Musée Jacquemart-André.", " ");
        Event e12 = new Event("Bouchardon (1698-1762)Une idée du beau", "images/event12.jpg", (new GregorianCalendar(2017, 3, 25).getTime()), (new GregorianCalendar(2017, 4, 1).getTime()), "Edme Bouchardon fut considéré de son temps comme un artiste d'exception.", "une exposition du musée du Louvres");
        Event e13 = new Event("MAGRITTE LA TRAHISON DES IMAGES", "images/event13Magritte.jpg", (new GregorianCalendar(2016, 9, 25).getTime()), (new GregorianCalendar(2017, 8, 31).getTime()), "Exposition «Magritte, La trahison des images» pose un nouveau regard sur l'oeuvre.", "Magritte au centre pompidou !");
        Event e14 = new Event("Norman sur scène", "images/event14Norman.jpg", (new GregorianCalendar(2016, 9, 15).getTime()), (new GregorianCalendar(2017, 2, 15).getTime()), "Norman, de « Norman fait des vidéos », arrive enfin sur scène avec son tout premier one-man show.", "un évènement à ne pas manquer");
        Event e15 = new Event("Romeo et Juliette", "images/event15.jpg", (new GregorianCalendar(2016, 12, 26).getTime()), (new GregorianCalendar(2017, 1, 14).getTime()), "Pièce légendaire du répertoire, Roméo et Juliette est devenue l'incarnation de l'histoire d'amour absolue.", " ");
        Event e16 = new Event("Les femmes savantes", "images/event16FemmeSavante.jpg", (new GregorianCalendar(2017, 2, 25).getTime()), (new GregorianCalendar(2017, 1, 4).getTime()), "Une comédie de moeurs jubilatoire au coeur d'une famille bourgeoise menée par trois femmes savantes.", "Une énergie incroyable");
        Event e17 = new Event("Richard III", "images/event17Richard3.jpg", (new GregorianCalendar(2017, 3, 25).getTime()), (new GregorianCalendar(2017, 1, 5).getTime()), "A leur naissance, des personnages comme Richard III semblent être de même constitution que nous.", " ");
        Event e18 = new Event("Madame Bovary", "images/event18MadameBovary.jpg", (new GregorianCalendar(2017, 6, 6).getTime()), (new GregorianCalendar(2017, 7, 7).getTime()), "Une pièce qui donne chair à la sensibilité, l'ironie et la force poétique de l'écriture de Flaubert.", " ");
        Event e19 = new Event("Disneyland Paris", "images/event19Disney.jpg", (new GregorianCalendar(2016, 12, 1).getTime()), (new GregorianCalendar(2017, 2, 15).getTime()), "Les flocons de neige scintillent sur le Parc Disneyland... ", "une expérience magique pour les petits comme pour les grands");
        Event e20 = new Event("Asterix", "images/event20Asterix.jpg", (new GregorianCalendar(2017, 12, 26).getTime()), (new GregorianCalendar(2017, 1, 14).getTime()), "Rire, bonne humeur, partage en famille et entre amis, en 2017, venez vivre des expériences sensationnelles au Parc Astérix.", " ");
        Event e21 = new Event("Zoo Parc de Beauval", "images/event21Zoo.jpg", (new GregorianCalendar(2017, 2, 25).getTime()), (new GregorianCalendar(2017, 4, 1).getTime()), "A seulement 600 m du ZooParc de Beauval, le nouvel hôtel*** Les Pagodes de Beauval propose 128 chambres.", " ");
        Event e22 = new Event("Musillac 2017", "images/event22Musilac.jpg", (new GregorianCalendar(2017, 7, 7).getTime()), (new GregorianCalendar(2017, 7, 10).getTime()), "Cette année, le festival pop-rock n°1 de la région Rhône-Alpes fête ses 15 ans...et durera 4 Jours, du 13 au 16 juillet 2017.", " ");
        Event e23 = new Event("We love Green", "images/event23WeLoveGreen", (new GregorianCalendar(2017, 5, 26).getTime()), (new GregorianCalendar(2017, 5, 28).getTime()), " ", " ");
        Event e24 = new Event("Solidays", "images/event24Solidays.jpg", (new GregorianCalendar(2017, 8, 25).getTime()), (new GregorianCalendar(2017, 8, 28).getTime()), " ", " ");
       
        System.out.println("----------------------------------------------->instancie evenement" +e1);
       
         ///////////////////////////////////////////////venue
        Venue v1 = new Venue("Stade de France", "Stade", "images/venue1StadeFrance.jpg",ad1);
        Venue v2 = new Venue("Bercy", "Salle de concert", "images/venue2.jpg",ad2);
        Venue v3 = new Venue("Zenith", "Salle de concert", "images/venue3.gif",ad3);
        Venue v4 = new Venue("Olympia", "Salle de concert", "images/venue3.jpg",ad4);
        Venue v5 = new Venue("Hotel de ville", "Mairie", " ",ad5);
        Venue v6 = new Venue("Centre Pompidou", "Musée", " ",ad6);
        Venue v7 = new Venue("Louvre", "Musée", " ",ad7);
        Venue v8 = new Venue("Théâtre du Châtelet", "Théâtre", "images/venue7.jpg",ad8);
        Venue v9 = new Venue("Théâtre du Palais Royal", "Théâtre", "images/venue8.jpg",ad9);
        Venue v10 = new Venue("Théâtre du Rond-Point", "Théâtre", "images/venue9.jpg",ad10);
        Venue v11 = new Venue("Théâtre de la ville", "Théâtre", "images/venue10.jpg",ad11);
        Venue v12 = new Venue("Disneyland Paris", "Parc d'attraction", " ",ad12);
        Venue v13 = new Venue("Asterix", "Parc d'attraction", " ",ad13);
        Venue v14 = new Venue("Zoo de Beauval", "Zoo", " ",ad15);
        Venue v15 = new Venue("Parc de Seaux", "Parc", " ",ad16);
        Venue v16 = new Venue("Bois de Vincennes", "Bois", " ",ad17);
        Venue v17 = new Venue("Bois de Boulogne", "Bois", " ",ad18);

      ///////////////////////////////////////////////////tarif 
        Pricing p1 = new Pricing("tarif enfant",6,"");
        Pricing p2 = new Pricing("tarif handicapé",6,"");
        Pricing p3 = new Pricing("tarif demandeur d'emploi",6,"");
        Pricing p4 = new Pricing("tarif réduit",8,"");
        Pricing p5 = new Pricing("tarif senior",10,"");
      ///////////////////////////////////////////representation
        Representation r1 = new Representation(2000,(new GregorianCalendar(2017, 1, 15, 19, 0).getTime()),(new GregorianCalendar(2017, 1, 15, 19, 0).getTime()));
        Representation r2 = new Representation(2000,(new GregorianCalendar(2017, 1, 15, 19, 0).getTime()), (new GregorianCalendar(2017, 1, 16, 19, 0).getTime()));
        Representation r3 = new Representation(2000, (new GregorianCalendar(2017, 1, 15, 19, 0).getTime()),(new GregorianCalendar(2017, 1, 17, 19, 0).getTime()));
        Representation r4 = new Representation(2000, (new GregorianCalendar(2017, 1, 15, 19, 0).getTime()),(new GregorianCalendar(2017, 1, 18, 19, 0).getTime()));
        Representation r5 = new Representation(2000,(new GregorianCalendar(2017, 1, 15, 19, 0).getTime()), (new GregorianCalendar(2017, 1, 19, 19, 0).getTime()));
        Representation r6 = new Representation(2000,(new GregorianCalendar(2017, 1, 15, 19, 0).getTime()), (new GregorianCalendar(2017, 1, 20, 19, 0).getTime()));
        Representation r7 = new Representation(2000,(new GregorianCalendar(2017, 1, 15, 19, 0).getTime()), (new GregorianCalendar(2017, 1, 21, 19, 0).getTime()));
        Representation r8 = new Representation(2000, (new GregorianCalendar(2017, 1, 15, 19, 0).getTime()),(new GregorianCalendar(2017, 1, 22, 19, 0).getTime()));
        Representation r9 = new Representation(2000, (new GregorianCalendar(2017, 1, 15, 19, 0).getTime()),(new GregorianCalendar(2017, 1, 23, 19, 0).getTime()));
        Representation r10 = new Representation(5000,(new GregorianCalendar(2017, 1, 15, 19, 0).getTime()), (new GregorianCalendar(2017, 1, 24, 19, 0).getTime()));
        Representation r11 = new Representation(5000,(new GregorianCalendar(2017, 1, 15, 19, 0).getTime()), (new GregorianCalendar(2017, 1, 25, 19, 0).getTime()));
        Representation r12 = new Representation(5000,(new GregorianCalendar(2017, 1, 15, 19, 0).getTime()), (new GregorianCalendar(2017, 1, 26, 19, 0).getTime()));
        Representation r13 = new Representation(5000,(new GregorianCalendar(2017, 1, 15, 19, 0).getTime()), (new GregorianCalendar(2017, 1, 27, 19, 0).getTime()));
        Representation r14 = new Representation(5000,(new GregorianCalendar(2017, 1, 15, 19, 0).getTime()), (new GregorianCalendar(2017, 1, 28, 19, 0).getTime()));
        Representation r15 = new Representation(5000,(new GregorianCalendar(2017, 1, 15, 19, 0).getTime()), (new GregorianCalendar(2017, 1, 29, 19, 0).getTime()));
        Representation r16 = new Representation(5000,(new GregorianCalendar(2017, 1, 15, 19, 0).getTime()), (new GregorianCalendar(2017, 1, 30, 19, 0).getTime()));
        Representation r17 = new Representation(5000, (new GregorianCalendar(2017, 1, 15, 19, 0).getTime()),(new GregorianCalendar(2017, 2, 1, 19, 0).getTime()));
        Representation r18 = new Representation(10000, (new GregorianCalendar(2017, 1, 15, 19, 0).getTime()),(new GregorianCalendar(2017, 2, 2, 19, 0).getTime()));
        Representation r19 = new Representation(10000,(new GregorianCalendar(2017, 1, 15, 19, 0).getTime()), (new GregorianCalendar(2017, 2, 3, 19, 0).getTime()));
        Representation r20 = new Representation(10000,(new GregorianCalendar(2017, 1, 15, 19, 0).getTime()), (new GregorianCalendar(2017, 2, 4, 19, 0).getTime()));
        Representation r21 = new Representation(10000, (new GregorianCalendar(2017, 1, 15, 19, 0).getTime()),(new GregorianCalendar(2017, 2, 2, 19, 0).getTime()));
        Representation r22 = new Representation(10000, (new GregorianCalendar(2017, 1, 15, 19, 0).getTime()),(new GregorianCalendar(2017, 2, 3, 19, 0).getTime()));
        Representation r23 = new Representation(10000, (new GregorianCalendar(2017, 1, 15, 19, 0).getTime()),(new GregorianCalendar(2017, 2, 4, 19, 0).getTime()));
        Representation r24 = new Representation(10000,(new GregorianCalendar(2017, 1, 15, 19, 0).getTime()), (new GregorianCalendar(2017, 2, 5, 19, 0).getTime()));
        Representation r25 = new Representation(10000,(new GregorianCalendar(2017, 1, 15, 19, 0).getTime()), (new GregorianCalendar(2017, 2, 6, 19, 0).getTime()));
        Representation r26 = new Representation(10000,(new GregorianCalendar(2017, 1, 15, 19, 0).getTime()), (new GregorianCalendar(2017, 2, 7, 19, 0).getTime()));
      
/////////////////////////////////////////////////ad tarif representation
       r1.getTarifs().add(p3);
       r1.getTarifs().add(p2);
       r1.getTarifs().add(p1);
       
       r2.getTarifs().add(p3);
       r2.getTarifs().add(p2);
       r2.getTarifs().add(p1);
       
       r3.getTarifs().add(p3);
       r3.getTarifs().add(p2);
       r3.getTarifs().add(p1);
       
       r4.getTarifs().add(p3);
       r4.getTarifs().add(p2);
       r4.getTarifs().add(p1);
       
       r5.getTarifs().add(p3);
       r5.getTarifs().add(p2);
       r5.getTarifs().add(p1);
       
       r6.getTarifs().add(p3);
       r7.getTarifs().add(p2);
       r8.getTarifs().add(p1);
       ///////////////////////////////////////////////////////ajout des lieu au representation
       r1.setMyvenue(v1);
       r2.setMyvenue(v2);
       r3.setMyvenue(v3);
       
       r4.setMyvenue(v1);
       r5.setMyvenue(v2);
       r6.setMyvenue(v3);
       
       r7.setMyvenue(v1);
       r8.setMyvenue(v2);
       r9.setMyvenue(v3);
       r10.setMyvenue(v4);
       
       
     ////////////////////////////////////////////////creation representation-evenement 
       e1.getRepresentationsev().add(r1);
       e1.getRepresentationsev().add(r2);
       e1.getRepresentationsev().add(r3);
       e1.getRepresentationsev().add(r4);
       
       e2.getRepresentationsev().add(r1);
       e3.getRepresentationsev().add(r2);
       e4.getRepresentationsev().add(r3);
       e5.getRepresentationsev().add(r4);
       e6.getRepresentationsev().add(r5);
       e7.getRepresentationsev().add(r6);
       e8.getRepresentationsev().add(r7);
       e9.getRepresentationsev().add(r8);
       e10.getRepresentationsev().add(r9);
      
      //////////////////////////////////////////////////////// 
       e1.getArtists().add(a3);
       e2.getArtists().add(a2);
       e3.getArtists().add(a1);
       e4.getArtists().add(a3);
       e5.getArtists().add(a2);
       e6.getArtists().add(a1);
       e7.getArtists().add(a3);
       e8.getArtists().add(a2);
       e9.getArtists().add(a1);
       ///////////////////////////////////////////////////////affectation de la section a l'evenement
       e1.setSection(s1);
       e2.setSection(s1);
       e3.setSection(s1);
       
       e4.setSection(s1);
       e5.setSection(s1);
       e6.setSection(s5);
       e7.setSection(s5);
       e8.setSection(s5);
       e9.setSection(s5);
       
       e4.setSection(s2);
       e5.setSection(s2);
       e6.setSection(s2);
       e7.setSection(s2);
       e8.setSection(s2);
       e9.setSection(s2);
       
       ///////////////////////////////////////////////////////persist evenement et user
       em.persist(e1);
       em.persist(e2);
       em.persist(e3);
       em.persist(e3);
       em.persist(e4);
       em.persist(e5);
       em.persist(e6);
       em.persist(e7);
       em.persist(e8);
       em.persist(e9);
       
       em.persist(u1);
       em.persist(u2);
       em.persist(u3);
       em.persist(u4);
       em.persist(u5);
       em.persist(u6);
       em.persist(u7);
       em.persist(u8);
       em.persist(u9);
       em.persist(u10);
      ///////////////////////////////////////////////////////////requete
        String mess ="les evenement du stade de france-----------------------------------------> ";
        String req031 = "select distinct e from Event e"
                + " join e.representationsev r where r.myvenue.name = :paramvenu";
        Query qr031 = em.createQuery(req031);
        qr031.setParameter("paramvenu", "Stade de France");
        List<Event> ls = qr031.getResultList();
        for(Event e : ls){
            mess = mess+"<br>"+e.getName();
        }
        
       //" select s from Soigneur s "
         //       + "join s.animaux a where a.id= :paramId";
      /* 
        String req031 = " select s from Soigneur s "
                + "join s.animaux a where a.id= :paramId";
        Query qr031 = em.createQuery(req031);
        qr031.setParameter("paramId", idAnimal);
        ls = qr031.getResultList();
        for(Soigneur s : ls){
            System.out.println(s);
        }
       
     */
    return mess;
 
}
}
  