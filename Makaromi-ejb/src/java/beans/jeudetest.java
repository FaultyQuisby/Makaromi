/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entites.Artist;
import entites.Event;
import entites.Representation;
import entites.Section;
import entites.Venue;
import java.util.GregorianCalendar;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author cdi310
 */
@Stateless
public class jeudetest implements jeudetestLocal {

    @PersistenceContext(unitName = "Makaromi-ejbPU")
    private EntityManager em;

    @Override
    public void createbd() {
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
        Event e1 = new Event("Concert Retour des Rolling Stones", "http://www.gottahaverockandroll.com/ItemImages/000011/sep2013-340_lg.jpeg", (new GregorianCalendar(2017, 1, 15).getTime()), (new GregorianCalendar(2017, 2, 15).getTime()), "Un retour fracassant des rois du rock n roll. Les années passent mais le son reste parfait", "un évènement à ne pas manquer");
        Event e2 = new Event("Concert parisien des Red Hot Chili Peppers", "http://concertposter.org/2012-June/RHCP-Paris2011-drop.jpg", (new GregorianCalendar(2016, 12, 26).getTime()), (new GregorianCalendar(2017, 1, 14).getTime()), "Un groupe de légende, un concert d'exception", "un évènement inoubliable");
        Event e3 = new Event("Tournée française de The Chainsmokers", "http://www.clubglow.com/blog/wp-content/uploads/2015/08/103115-476ECHO-chainsmokersfzt1-400x276.png", (new GregorianCalendar(2017, 2, 25).getTime()), (new GregorianCalendar(2017, 4, 1).getTime()), "Concert", "Une énergie incroyable");
        Event e4 = new Event("Tournée exceptionnelle de Beyonce", "http://i1.cdnds.net/13/50/618x800/music-beyonce-mrs-carter-world-tour-2014-poster.jpg", (new GregorianCalendar(2017, 3, 25).getTime()), (new GregorianCalendar(2017, 5, 1).getTime()), "Tournée de concerts de la seule, l'unique QUEEN B", "Beyonce en forme olympique");
        Event e5 = new Event("Concert unique de Sting", "http://tout-metz.com/wp-content/uploads/2012/08/sting_affiche2.jpg", (new GregorianCalendar(2017, 6, 1).getTime()), (new GregorianCalendar(2017, 1, 7).getTime()), "Sting incroyable", "Le grand Sting en concert avec plein de duo et trio surprises");
        Event e6 = new Event("Finale Rugby TOP 14", "http://www.francebillet.com/static/0/visuel/600/348/FINALE-RUGBY-TOP-14_3484231325263405917.jpg?1479454061000", (new GregorianCalendar(2017, 1, 2).getTime()), (new GregorianCalendar(2017, 2, 1).getTime()), "C'est LE match de la saison, celui que toutes les équipes de TOP 14 rêvent de jouer pour espérer soulever le Bouclier de Brennus?Après 26 journées de combat, des barrages, des demi-finales, qui succèdera au Racing 92 de Dan Carter et sera sacré Champion de France 2017 le 4 juin prochain? La finale du TOP 14 fait son grand retour au Stade de France à l?occasion du week-end de Pentecôte : ne manquez pas l'événement !", "Une finale qui promet d'être inoubliable");
        Event e7 = new Event("Handball PARIS 2017, 25 eme championnat du monde masculin", "http://www.francebillet.com/static/0/visuel/600/346/CHAMPIONNAT-DU-MONDE-DE-HAND_3468345825731877348.jpg?1477573054000", (new GregorianCalendar(2017, 2, 3).getTime()), (new GregorianCalendar(2017, 2, 18).getTime()), "Après 1970 et 2001 (pour les hommes) et 2007 (pour les femmes), la France organise pour la quatrième fois le Championnat du Monde. Elle ne pouvait rêver d'un meilleur calendrier au relais d?un cinquième titre planétaire, record toutes catégories, obtenu il y a à peine quelques mois au Qatar.", "Regardez l'histoire s'écrire sous vos yeux");
        Event e8 = new Event("Finale coupe de la ligue", "http://www.francebillet.com/static/0/visuel/600/347/FINALE-COUPE-DE-LA-LIGUE-2017_3476961719077401827.jpg?1478605101000", (new GregorianCalendar(2017, 3, 3).getTime()), (new GregorianCalendar(2017, 3, 3).getTime()), "A lyon une tribune sera réservée au familles et comprendra une offre de restauration, l'organisation d'une multitude d'animations, des services dédiés et de nombreuses surprises !", " ");
        Event e9 = new Event("Mondial de hockey 2017", "http://www.francebillet.com/static/0/visuel/grand/348/MONDIAL-HOCKEY-2017_3489202436012305251.jpg?1479996593000", (new GregorianCalendar(2017, 2, 15).getTime()), (new GregorianCalendar(2017, 2, 30).getTime()), "La Finlande et la Biélorussie ouvriront les festivités à Paris, juste avant la rencontre de la soirée qui opposera les champions du monde en titre, le Canada, à la République Tchèque. L'équipe de France viendra clôturer la 2ème journée de rencontres avec son premier match contre la Norvège dans un remake du match du dernier Tournoi de Qualification Olympique. ", " ");
        Event e10 = new Event("Hergé", "http://www.francebillet.com/static/0/visuel/600/340/HERGE--2016-2017_3400616965982293754.jpg?1469697808000", (new GregorianCalendar(2017, 1, 1).getTime()), (new GregorianCalendar(2017, 1, 15).getTime()), "On ne présente plus la carrière de Georges Remi, dit Hergé, auteur belge de bande dessinée principalement connu pour Les Aventures de Tintin. Souvent considéré comme « le père de la bande dessinée européenne », il est l?un des premiers auteurs francophones à reprendre le style américain de la bande dessinée à bulles. ", " ");
        Event e11 = new Event("Rembrandt intime", "http://www.francebillet.com/static/0/visuel/300/338/REMBRANDT-INTIME_3384978728407846685.jpg?1467807653000", (new GregorianCalendar(2017, 12, 26).getTime()), (new GregorianCalendar(2017, 1, 28).getTime()), "L'exposition est conçue autour des trois chefs-d??uvre du Musée Jacquemart-André : les Pèlerins d?Emmaüs (1629), le Portrait de la princesse Amalia von Solms (1632), et le Portrait du Docteur Arnold Tholinx (1656). ", " ");
        Event e12 = new Event("Bouchardon (1698-1762)Une idée du beau", "http://www.francebillet.com/static/0/visuel/600/341/LOUVRE_3415892777709555559.jpg?1471532134000", (new GregorianCalendar(2017, 3, 25).getTime()), (new GregorianCalendar(2017, 4, 1).getTime()), "Edme Bouchardon fut considéré de son temps comme un artiste d?exception. Présentant près de 270 oeuvres et organisée avec le Getty Museum à Los Angeles, cette exposition sera la première monographie d?envergure réalisée autour de son oeuvre et l'occasion de souligner qu'il fut l'un des principaux protagonistes du néoclassicisme.", "une exposition du musée du Louvres");
        Event e13 = new Event("MAGRITTE LA TRAHISON DES IMAGES", "http://www.francebillet.com/static/0/visuel/600/341/MAGRITTE---CENTRE-POMPIDOU_3417696887323044936.jpg?1471871647000", (new GregorianCalendar(2016, 9, 25).getTime()), (new GregorianCalendar(2017, 8, 31).getTime()), "Exposition «Magritte, La trahison des images» pose un nouveau regard sur l'oeuvre, le rapport à l?image et à la peinture de l?artiste belge René Magritte", "Magritte au centre pompidou !");
        Event e14 = new Event("Norman sur scène", "http://www.francebillet.com/static/0/visuel/600/334/NORMAN-AU-ZENITH_3342081312054718028.jpg?1462952162000", (new GregorianCalendar(2016, 9, 15).getTime()), (new GregorianCalendar(2017, 2, 15).getTime()), "Norman, de « Norman fait des vidéos », arrive enfin sur scène avec son tout premier one-man show. Cette nouvelle aventure scénique est une suite logique pour ce pionner du « web man show » qui a déjà réussi en quelques années à réunir plusieurs millions de fans, en postant des vidéos qu?il filme lui-même depuis sa chambre. ", "un évènement à ne pas manquer");
        Event e15 = new Event("Romeo et Juliette", "http://www.francebillet.com/static/0/visuel/grand/230/WILLIAM-SHAKESPEARE_2309502666313431296.jpg?1342617736000", (new GregorianCalendar(2016, 12, 26).getTime()), (new GregorianCalendar(2017, 1, 14).getTime()), "Pièce légendaire du répertoire, Roméo et Juliette est devenue, au fil du temps et des multiples adaptations dont elle a été l?objet, l?incarnation de l?histoire d?amour absolue. Or sous les couches de sédiments accumulés se cache un soleil noir fait de déliquescence politique, de haines familiales, de personnages complexes et insulaires, bien éloigné de la lecture romantique dans laquelle on l'a cantonnée.", " ");
        Event e16 = new Event("Les femmes savantes", "http://www.francebillet.com/static/0/visuel/600/329/SAVANTES_3295969886362179914.jpg?1457444342000", (new GregorianCalendar(2017, 2, 25).getTime()), (new GregorianCalendar(2017, 1, 4).getTime()), "Une comédie de moeurs jubilatoire au coeur d'une famille bourgeoise menée par trois femmes savantes, excessives et fiévreuses, repoussant les limites de la raison, entraînent toute la maisonnée dans le vertige de leur orgueil, mais, malgré leurs débordements, leurs ridicules, et leurs folies, infiniment attendrissantes. Catherine Hiegel réunit une distribution prestigieuse, 30 ans après l'avoir mis en scène avec la Comédie Française, au Théâtre de la Porte Saint-Martin et apporte un regard neuf sur ce grand classique du répertoire.", "Une énergie incroyable");
        Event e17 = new Event("Richard III", "http://www.francebillet.com/static/0/visuel/600/347/RICHARD-III-JPG_3476596840506551705.jpg?1478507639000", (new GregorianCalendar(2017, 3, 25).getTime()), (new GregorianCalendar(2017, 1, 5).getTime()), "A leur naissance, des personnages comme Richard III semblent être de même constitution que nous. Aussi chaque mot que le tyran prononce sur le plateau peut-il trouver son accord avec les sentiments du public, en éveillant les pulsions inavouées de chacun.", " ");
        Event e18 = new Event("Madame Bovary", "http://www.francebillet.com/static/0/visuel/600/344/MADAME-BOVARY_3449184254722259952.jpg?1475425174000", (new GregorianCalendar(2017, 6, 6).getTime()), (new GregorianCalendar(2017, 7, 7).getTime()), "Une pièce qui donne chair à la sensibilité, l'ironie et la force poétique de l'écriture de Flaubert, qui nous parle de nous, hommes et femmes d'aujourd'hui. Sur scène quatre chaises, à portée de main quelques instruments. Ce pourrait être la place d'un village, un coin de campagne ou la dernière table d'un banquet de noces sous les arbres au fond du verger.", " ");
        Event e19 = new Event("Disneyland Paris", "http://www.francebillet.com/static/0/visuel/600/347/DISNEY-1J-2P-NOEL_3476596840507927667.jpg?1478534053000", (new GregorianCalendar(2016, 12, 1).getTime()), (new GregorianCalendar(2017, 2, 15).getTime()), "Les flocons de neige scintillent sur le Parc Disneyland®... Vous ne rêvez pas, c?est enfin déjà Noël à Disneyland® Paris ! Plus besoin d?attendre pour célébrer Noël, dès le 11 novembre 2016, laissez-vous émerveiller par notre sapin et nos illuminations féériques pour des souvenirs gravés à jamais. Vivez des fêtes de fin d?année enchantées jusqu?au 8 janvier 2017, avec le spectacle nocturne Disney Dreams® ! fête Noël et La Parade de Noël Disney qui vous réservent de fantastiques surprises.", "une expérience magique pour les petits comme pour les grands");
        Event e20 = new Event("Asterix", "http://www.francebillet.com/static/0/visuel/600/345/PARC-ASTERIX_3451025524347854774.jpg?1475560893000", (new GregorianCalendar(2017, 12, 26).getTime()), (new GregorianCalendar(2017, 1, 14).getTime()), "Rire, bonne humeur, partage en famille et entre amis, en 2017, venez vivre des expériences sensationnelles au Parc Astérix.", " ");
        Event e21 = new Event("Zoo Parc de Beauval", "http://www.francebillet.com/static/0/visuel/600/324/ZOOPARC-DE-BEAUVAL_3242548485784297073.jpg?1451253799000", (new GregorianCalendar(2017, 2, 25).getTime()), (new GregorianCalendar(2017, 4, 1).getTime()), "A seulement 600 m du ZooParc de Beauval, le nouvel hôtel*** Les Pagodes de Beauval propose 128 chambres, un restaurant, ainsi qu'une piscine-lagon extérieure et des meubles et éléments de décoration authentiquement chinois. Avec l'hôtel Les Jardins de Beauval et la résidence hôtelière Les Hameaux de Beauval, ce complexe offre désormais une capacité totale de 240 chambres et 16 appartements, ainsi que de vastes espaces dédiés au tourisme d?affaires, l'ensemble garantissant un dépaysement total.", " ");
        Event e22 = new Event("Musillac 2017", "http://www.francebillet.com/static/0/visuel/600/349/MUSILAC-2017_3492493875611862296.jpg?1480351243000", (new GregorianCalendar(2017, 7, 7).getTime()), (new GregorianCalendar(2017, 7, 10).getTime()), "Cette année, le festival pop-rock n°1 de la région Rhône-Alpes fête ses 15 ans...et durera 4 Jours, du 13 au 16 juillet 2017.", " ");
        Event e23 = new Event("We love Green", "http://cdn-images.deezer.com/images/cover/586a3b7a7555cfaefd6577931e1a2f78/500x500.jpg", (new GregorianCalendar(2017, 5, 26).getTime()), (new GregorianCalendar(2017, 5, 28).getTime()), " ", " ");
        Event e24 = new Event("Solidays", "http://media.melty.fr/affiche-des-solidays-2009-image-235151-article-ajust_930.jpg", (new GregorianCalendar(2017, 8, 25).getTime()), (new GregorianCalendar(2017, 8, 28).getTime()), " ", " ");
        ///////////////////////////////////////////////venue
        Venue v1 = new Venue("Stade de France", "Stade", "http://www.premiertickets.ie/event_map/1301318244_Stade-de-France-Premier-Tickets_medium.jpg");
        Venue v2 = new Venue("Bercy", "Salle de concert", "http://www.stadefrance.com/sites/stadefrance.com/files/styles/stadium_map/public/field/image/stadium-popup/plan-3d-billetterie-rihanna.jpg");
        Venue v3 = new Venue("Zenith", "Salle de concert", "http://www.about-tracy-chapman.net/wp-content/uploads/2009-paris-zenith-map.gif");
        Venue v4 = new Venue("Olympia", "Salle de concert", "http://lespagesdorothee.com/Olympia2010-plan-salle.jpg");
        Venue v5 = new Venue("Hotel de ville", "Mairie", " ");
        Venue v6 = new Venue("Centre Pompidou", "Musée", " ");
        Venue v7 = new Venue("Louvre", "Musée", " ");
        Venue v8 = new Venue("Théâtre du Châtelet", "Théâtre", "http://www.parisconcerts-tickets.com/img/38809Theatre-du-Chatelet-Scenic-Seating-Chart-C2.jpg");
        Venue v9 = new Venue("Théâtre du Palais Royal", "Théâtre", "http://media.ticketmaster.com/tm/en-au/tmimages/venue/maps/aus/39996s_a.gif");
        Venue v10 = new Venue("Théâtre du Rond-Point", "Théâtre", "http://www.music-opera.com/img/places/4059-map.jpg");
        Venue v11 = new Venue("Théâtre de la ville", "Théâtre", "http://www.theatrederoanne.fr/fileadmin/_processed_/d/f/csm_Plan_Theatre_Zone_47b8a2af87.jpg");
        Venue v12 = new Venue("Disneyland Paris", "Parc d'attraction", " ");
        Venue v13 = new Venue("Asterix", "Parc d'attraction", " ");
        Venue v14 = new Venue("Zoo de Beauval", "Zoo", " ");
        Venue v15 = new Venue("Parc de Seaux", "Parc", " ");
        Venue v16 = new Venue("Bois de Vincennes", "Bois", " ");
        Venue v17 = new Venue("Bois de Boulogne", "Bois", " ");
     ///////////////////////////////////////////representation

        Representation R1 = new Representation(2000, (new GregorianCalendar(2017, 1, 15, 19, 0).getTime() );
        Representation R2 = new Representation(2000, (new GregorianCalendar(2017, 1, 15, 19, 0).getTime() );
        Representation R3 = new Representation(2000, (new GregorianCalendar(2017, 1, 15, 19, 0).getTime() );
        Representation R4 = new Representation(2000, (new GregorianCalendar(2017, 1, 15, 19, 0).getTime() );
        Representation R5 = new Representation(2000, (new GregorianCalendar(2017, 1, 15, 19, 0).getTime() );
        Representation R6 = new Representation(2000, (new GregorianCalendar(2017, 1, 15, 19, 0).getTime() );
        Representation R7 = new Representation(2000, (new GregorianCalendar(2017, 1, 15, 19, 0).getTime() );
        Representation R8 = new Representation(2000, (new GregorianCalendar(2017, 1, 15, 19, 0).getTime() );
        Representation R9 = new Representation(2000, (new GregorianCalendar(2017, 1, 15, 19, 0).getTime() );
        Representation R10 = new Representation(2000, (new GregorianCalendar(2017, 1, 15, 19, 0).getTime() );
        Representation R11 = new Representation(2000, (new GregorianCalendar(2017, 1, 15, 19, 0).getTime() );
        Representation R12 = new Representation(2000, (new GregorianCalendar(2017, 1, 15, 19, 0).getTime() );
        Representation R13 = new Representation(2000, (new GregorianCalendar(2017, 1, 15, 19, 0).getTime() );
        Representation R14 = new Representation(2000, (new GregorianCalendar(2017, 1, 15, 19, 0).getTime() );
        Representation R15 = new Representation(2000, (new GregorianCalendar(2017, 1, 15, 19, 0).getTime() );
        Representation R16 = new Representation(2000, (new GregorianCalendar(2017, 1, 15, 19, 0).getTime() );
        Representation R17 = new Representation(2000, (new GregorianCalendar(2017, 1, 15, 19, 0).getTime() );
        Representation R18 = new Representation(2000, (new GregorianCalendar(2017, 1, 15, 19, 0).getTime() );
        Representation R19 = new Representation(2000, (new GregorianCalendar(2017, 1, 15, 19, 0).getTime() );
        Representation R20 = new Representation(2000, (new GregorianCalendar(2017, 1, 15, 19, 0).getTime() );
        
        

       ////////////////////////////////////////adress
        INSERT INTO Adress([street],[postcode],[city
        ]) VALUES("Zac du Cornillon Nord", "93200", "Saint-Denis"),
("Boulevard de Bercy", "75012", "PARIS"),
("bd serurier", "75019", "paris"),
("rue montaigne", "75005", "paris"),
("rue lefevre", "75002", "paris"),
("avenue leflandre", "75017", "paris"),
("boulevard de la bastille", "75012", "paris"),
("rue de l'ouest", "25065", "lyon"),
('P.O. Box 727, 6257 Cursus Road'
        ,'33006', 'Prince Albert'),('Ap #475-6304 Donec Street'
        ,'O6N 2VN','Pietraroja'),('P.O. Box 576, 5805 Arcu. Rd.','39-200','Aurora'),('Ap #979-195 Velit Road'
        ,'5443', 
        'Norfolk County'),( 
        '9571 Magna Av.','77277', 
        'Red Deer'),( '6510 Tristique Av.','S9J 9G4','Matagami'
        ),( '382-568 Pretium St.','31354','Villers-la-Ville'),('P.O. Box 610, 7900 Sem Road'
        ,'14-310', 
        'Castelluccio Superiore'),( '846-791 Fusce Ave','O72 3EH','Peutie'
        ),( '153-2157 Mauris Avenue','851268','Merdorp');
('5333 Dui. Road','918850','Manukau'
        ),( '395-1937 Nascetur St.','30-051','Garbsen'),('Ap #335-387 Dui, Rd.','74784','Navadwip'),('Ap #190-5326 Odio, Av.','5831','Sint-Joost-ten-Node'),('8994 Purus, Road','41117','Piegaro'),('P.O. Box 609, 8350 Sem Street'
        ,'80694', 'Drayton Valley'),('Ap #254-6553 Pede Avenue'
        ,'6400','Houtave'),('6524 Non, Rd.'
        ,'3068', 'Motta Sant''Anastasia'),('1715 Nec, Avenue','926691','Sant'
         'Eufemia a Maiella'
        ),( '332-8613 Malesuada Rd.','1234','Freire');
('5515 Sapien. Road'
        ,'37280', 
        'Lake Cowichan'),( '8530 Justo St.','41154','Libramont-Chevigny'),('Ap #811-463 At, Road','68853','Münster'),('P.O. Box 309, 3570 Lobortis Av.'
        ,'59974','Püttlingen'),('Ap #367-4818 Aliquet, Rd.','4239','Cairns'),('P.O. Box 794, 8036 Urna Street'
        ,'33665', 'Fraser Lake'),('P.O. Box 555, 4344 Sapien. Rd.','5316','Fishguard'),('Ap #364-9101 Malesuada Street'
        ,'60058','Chiaromonte'),('P.O. Box 993, 199 Lorem, Street','97596','Krefeld'
        ),( '180-8638 Sit Street','88-149','Armungia');
('P.O. Box 940, 149 Aliquam Rd.'
        ,'7230','Tramatza'),('Ap #567-6211 Nascetur St.'
        ,'98723','Waalwijk'),('Ap #521-1638 In Av.'
        ,'953088','Smithers'
        ),( '553-8176 Tempus Av.','0373HV','Sint-Genesius-Rode'),('Ap #176-4008 Tellus. Ave','51869-395','Moradabad'),('Ap #847-2651 Morbi St.'
        ,'22396','Collinas'
        ),( '207-7096 Consequat Av.','385872','Oyo'
        ),( '3684 Neque Avenue','41218','Leipzig'
        ),( '2630 Lacinia Av.','798160','Lauder'
        ),( '670-8810 Eu Rd.','11200','Siegendorf');
(
         '188-1537 Lobortis Rd.','7673','Colonnella'
        ),( '1728 Ultricies Ave','Q3Z 2WQ'
        , 'Smoky Lake'),('Ap #889-7028 Sit Rd.'
        ,'23302','Seydi?ehir'),('P.O. Box 655, 7008 Metus. St.','90436','Vejalpur'
        ),( '600-5890 Morbi Road','J6J 7B5','Charleroi'),('P.O. Box 987, 6254 Urna Av.'
        ,'11793','Linkhout'),('Ap #411-975 Eu Road'
        ,'00573','Zwettl-Niederösterreich'),('P.O. Box 131, 1595 Elit, Rd.','74755','Forst'),('Ap #832-2914 Cursus St.'
        ,'30204', 'Moose Jaw'),('884 Mattis. Street'
        ,'8588', 'New Haven');
(
         '566-3515 Nullam Street','E4B 9S7','Heerhugowaard'
        ),( 
        '369-1747 Condimentum Ave','290925', 
        'El Bosque'),( '7086 Accumsan Street','6069','Bayswater'),('838-9177 A, Rd.'
        ,'8145', 'Castelnovo del Friuli'),('234-4552 Curae; Rd.','72148','Girifalco'),('935-349 Velit. Ave','27278-133','Perwez'),('P.O. Box 344, 4029 Consequat Rd.'
        ,'6057','Penrith'),('Ap #337-6751 Semper St.'
        ,'49772','Pordenone'
        ),( '391-4696 Auctor St.','5608AZ','Poulseur'),('P.O. Box 454, 2807 Neque. Street','M6P 8G6','Oyo');
('P.O. Box 182, 1400 Pellentesque Street'
        ,'40733','Millport'),('Ap #623-3238 Dolor. St.'
        ,'863856', 'Castello dell''Acqua'),('P.O. Box 973, 5277 Nec, St.','13434','Bridgnorth'),('2502 Odio. Ave','44273','Bikaner'
        ),( '138-8168 Nascetur St.','66870-296','Ekeren'),('747-510 Scelerisque, Road','714540','Bollnäs'
        ),( 
        '3384 Elit Ave','86307-447', 'Alto del Carmen'
        ),( '283-4860 Id Av.','54835','Nurallao'),('P.O. Box 360, 9096 Cras Rd.'
        ,'69342','Vegreville'),('Ap #983-2834 Ipsum St.'
        ,'97162', 'Rae Lakes');
(
         '587-3285 Nibh Street','6541','Schagen'),('Ap #458-9110 Feugiat Street'
        ,'1193', 'Aquila d''Arroscia'),('P.O. Box 685, 5131 Eu St.'
        ,'45666','Vichte'),('2566 Cursus. Ave','53068','Sundrie'),('P.O. Box 751, 3772 Luctus St.'
        ,'8195TB','Racine'),('Ap #251-2527 Sed St.'
        ,'9773FT','Chimay'
        ),( '157-6970 Venenatis Road','9950','Caxias do Sul'
        ),( '4396 Id Ave','278394','Bernburg'
        ),( '865-104 Cras Avenue','6158','Markham'
        ),( '5097 Morbi Rd.','50043','Redwater');
('Ap #728-6658 Ultrices Rd.'
        ,'40515','Tramutola'
        ),( '4337 Nibh Rd.','98944','Lévis'),('Ap #190-5595 Sed Road'
        ,'45006','Bicinicco'),('Ap #353-7256 Viverra. Avenue','ZP4N 9LH','Seloignes'
        ),( '709-2378 Fusce Street','68351-909','Durness'),('Ap #404-9157 Hendrerit Ave'
        ,'J9C 1V9','Hallein'),('Ap #612-9261 Elit Street'
        ,'276252','Kearny'
        ),( '8284 Nulla Avenue','16037','Nemi'),('Ap #208-2861 Inceptos Avenue'
        ,'9844', 'Idaho Falls'),('P.O. Box 899, 4559 In Av.'
        ,'682281', 'Scanzano Jonico');
('P.O. Box 378, 8860 Sit St.'
        ,'83268', 
        'Newport News'),( '348-6603 At Road','60158','Stilo'
        ),( '5857 Donec Ave','08772','Halifax'
        ),( '748-8457 Duis Rd.','9980','Loverval'
        ),( '9396 Morbi St.','81-172','Ferrere'
        ),( 
        '4526 Donec St.','41471', 
        'Belo Horizonte'),( '542-4348 Consequat St.','59716','Ciplet'
        ),( '643-6154 Quis Avenue','3364','Dolgellau'),('P.O. Box 376, 4258 Cubilia Av.'
        ,'2042NB'
        , 'Bad Ischl'),('Ap #922-5096 Augue St.'
        ,'051667','Notre-Dame-de-la-Salette'
        );

/////////////////////////////pricing
INSERT INTO Pricing([namePricing]
        ) VALUES("tarif enfant")
        ,("tarif handicapé"),("tarif demandeur d'emploi"),("tarif réduit"),("tarif senior"),


////////////////////////////ticket

////////////////////////////user
INSERT INTO User([nameUser],[surnameUser],[dateBirthUser],[email],[commentRegisteredUser],[loginUser],[password
        ]) VALUES('Alfonso','Morse','17/07/1976','Quisque.purus.sapien@magnisdis.org'
        , 
         
        'amet ante. Vivamus non', 'Fletcher Stewart','DQY41KXO1MT'),('Ivor','Ellison','15/02/1961','fermentum.metus.Aenean@dictummiac.edu'
        , 
         
         'aliquet. Phasellus fermentum convallis ligula. Donec luctus aliquet'
        , 'Charles Calderon','SZS94IXT1FV'),('Clayton','Frazier','22/05/1977','metus@risusQuisquelibero.net','consequat'
        , 'Igor Aguirre','MKC72DCE9QM'),('Cameron','Ferguson','19/01/1955','pellentesque.massa.lobortis@odiosempercursus.com'
        , 'leo. Vivamus nibh dolor, nonummy ac, feugiat non, lobortis quis,'
        , 'Laith Stout','LXF47GGQ0RY'),('Amir','Buckley','23/02/1977','facilisis.eget.ipsum@risusDonec.net'
        , 
         
         
        'ante bibendum ullamcorper. Duis cursus, diam', 'Keane Jenkins','WYI25PIO3LB'),('Hector','Johnston','23/04/1954','Sed.nec.metus@felispurus.net'
        , 
         'diam lorem, auctor quis, tristique ac, eleifend vitae, erat. Vivamus'
        , 'Elton Coffey','VYL79NGF9TI'),('Ivan','Nicholson','05/10/1996','convallis.ante.lectus@nisl.ca'
        , 
         
         'libero at auctor ullamcorper, nisl arcu'
        , 'Bernard Tyson','WTV91HZB2TB'),('Barrett','Burt','12/05/1959','fringilla.purus@eleifendnunc.com'
        , 
         'In scelerisque scelerisque dui. Suspendisse'
        , 'Nissim Jackson','AFD22JCH8JN'),('Isaiah','Hoffman','10/07/1945','eget.venenatis.a@penatibusetmagnis.edu','ut, nulla. Cras eu tellus eu augue porttitor interdum.'
        , 'Odysseus Valencia','MMU44UUP9FC'),('Ryan','Prince','20/05/1963','eros@sed.com'
        , 
         
         'et arcu imperdiet ullamcorper. Duis at lacus. Quisque'
        , 'Noah Wilder','SGR98IAM7SM'),
('Herman','Galloway','21/12/1963','urna@magnamalesuada.com','nec, leo. Morbi neque tellus,'
        , 'Roth Grant','QMX57ONO1PY'),('Abraham','Mcguire','10/10/1946','vel@volutpat.org','laoreet, libero'
        , 'Hiram Heath','SFI96TCO0UF'),('Fuller','Turner','22/06/1982','quam@Nunclaoreetlectus.ca'
        , 
         
         
         
        'luctus et ultrices posuere cubilia Curae; Phasellus ornare.', 'Harlan Kirby','BOT40EBR5TU'),('Curran','Coleman','02/04/1939','augue.eu.tellus@hendrerit.com'
        , 
         'ac tellus. Suspendisse sed dolor.'
        , 'Lance Valentine','FXK91RUA6RJ'),('William','Marks','02/10/1959','arcu@nec.com'
        , 
         
         
         
         'faucibus leo, in lobortis tellus justo sit amet nulla. Donec'
        , 'Garth Weber','IAO77GAF2CH'),('John','Gould','29/07/1997','nisi.a@Duisami.ca'
        , 
         
         
         'egestas nunc sed libero. Proin sed turpis nec mauris'
        , 'Tarik Livingston','KHC56NQP9OY'),('Carson','Barton','26/03/1943','mi.ac.mattis@aliquetnec.org','nec, leo. Morbi neque'
        , 'Eaton Hewitt','HFQ35UXJ4AN'),('Isaac','Nguyen','27/08/1966','magna@aliquetdiam.edu'
        , 
         'et magnis dis parturient montes, nascetur'
        , 'Barrett Vargas','ORH17KGC3BI'),('Akeem','Kaufman','19/02/1971','dolor.quam.elementum@metusVivamus.edu','a, scelerisque sed, sapien. Nunc pulvinar arcu et pede.'
        , 'Ethan Brewer','PGL94JHT1LM'),('Cedric','Stark','26/09/1983','ut@non.org'
        , 
         
         
         
         
        'Ut sagittis lobortis mauris. Suspendisse aliquet molestie tellus. Aenean egestas', 'Harrison Strong','JWU43ASM7PT'),('Dexter','Dotson','24/08/1959','ultricies.ligula@musProinvel.com','montes, nascetur'
        , 'Derek Swanson','JVT77DPD9NF'),('Neville','Bolton','02/04/1973','porttitor@tortorNunccommodo.ca'
        , 
         
         
         
         'torquent per conubia nostra, per inceptos hymenaeos. Mauris ut quam'
        , 'Macon Vargas','BYF59YYV1JP'),('Rooney','Daugherty','21/06/1988','vestibulum@tristiquesenectuset.net'
        , 
         
         
         
        'egestas lacinia. Sed congue, elit sed consequat', 'Magee Landry','UPO70VTD1RO'),('Felix','Dudley','21/05/1937','tristique.aliquet@temporerat.org'
        , 
         'Nullam enim. Sed nulla ante, iaculis'
        , 'Zachary Mclaughlin','JDP32SWN6KD'),('Quinlan','Shelton','31/10/1940','per.conubia@posuere.ca','tincidunt'
        , 'Walter Acosta','CSP75DQC0NM'),('Brian','Hoover','29/10/1950','justo.Proin@Nullatempor.edu'
        , 
         
         'a nunc. In at pede. Cras vulputate velit'
        , 'Rashad Phillips','ZFT24GZY8QT'),('Evan','Davidson','08/03/1997','egestas@tinciduntduiaugue.co.uk','elementum, lorem ut aliquam iaculis, lacus pede sagittis augue,'
        , 'Henry Battle','GZU64ZWN2VI'),('Alec','Perry','26/08/1994','nunc@eu.org','ligula. Aenean'
        , 'Cody Nixon','FDA27WDO9KT'),('Neil','Bruce','21/02/1973','tellus.Phasellus@montesnasceturridiculus.com'
        , 'Sed nunc est, mollis non, cursus non, egestas a,'
        , 'Xanthus Battle','ELY20NVZ5DH'),('Connor','Norris','15/04/1970','tempor@egetvarius.ca'
        , 'Morbi neque tellus, imperdiet non, vestibulum nec, euismod in,'
        , 'Micah Turner','LEE19IEA9EG'),
('Joel','Miranda','10/10/1997','mi@lobortisaugue.co.uk','eget, volutpat ornare,'
        , 'Hyatt Walters','IYR94UUV3QL'),('Rahim','James','17/03/1973','id.magna@egestaslacinia.org','velit'
        , 'Kaseem Norman','HXA79DOX5JG'),('Davis','Watkins','17/02/1963','rhoncus.Nullam.velit@nonjusto.ca'
        , 
        'dis parturient', 'Hop Schultz','GVL76RZB3KZ'),('Damon','Pierce','16/01/1970','magnis.dis.parturient@perinceptoshymenaeos.org','at, velit. Cras lorem'
        , 'Oleg Dennis','VKJ72RLP4WV'),('Isaiah','Jones','20/02/1997','sit@enimNunc.co.uk'
        , 
         
         
        'nisi nibh lacinia orci, consectetuer', 'Shad Tyler','HTN58PNO8CE'),('Chester','Lancaster','11/03/1990','aliquet@eleifendnec.edu'
        , 
         
         
         'Proin vel arcu eu odio tristique pharetra. Quisque ac libero'
        , 'Evan Adkins','PRN18KJX4XD'),('Prescott','Walsh','14/11/1968','hendrerit.id.ante@metusAenean.co.uk'
        , 
         'aliquam eu, accumsan sed, facilisis vitae,'
        , 'Kieran Leblanc','IKH02ZHX4RP'),('Nero','Mason','19/07/1990','ullamcorper.viverra@auctorMaurisvel.org'
        , 
         
         
         
        'primis in faucibus orci luctus et ultrices posuere', 'Ezekiel Atkinson','VIN35QAR3OG'),('Tiger','Clay','07/10/1935','suscipit.nonummy.Fusce@ut.co.uk'
        , 
         
         
         'enim. Etiam imperdiet dictum magna. Ut tincidunt orci quis lectus.'
        , 'Judah Morris','MBT62HSW7XY'),('Flynn','Williams','19/08/1988','sem.consequat@egetmagna.edu','Nulla'
        , 'Jason Sears','CRM04ZHN3WC'),
('Clinton','Ramos','11/05/1941','Morbi@euturpis.edu'
        , 
        'nibh. Quisque nonummy', 'Ian Henry','ADZ95HWR7MS'),('Keefe','York','17/08/1947','Mauris.blandit.enim@purussapien.edu','at, libero. Morbi accumsan laoreet ipsum.'
        , 'Davis Brooks','DVQ21WAJ6WO'),('Scott','Gill','19/06/1987','a.mi.fringilla@inhendreritconsectetuer.com'
        , 
         
         
        'Phasellus nulla. Integer vulputate, risus', 'Fuller Garner','MTE64YZN1SR'),('Armando','Kelly','19/01/1946','et.rutrum.eu@velit.com'
        , 'eleifend. Cras sed leo. Cras'
        , 'Brent Love','GXE29EXY2KI'),('Carl','Keith','26/01/1950','lobortis.augue@Aenean.ca'
        , 
         'cursus in, hendrerit consectetuer,'
        , 'Brent Goodman','RGQ92PGD3VS'),('Barrett','Whitfield','06/11/1957','mollis.Integer@lobortisultrices.com'
        , 
         
        'tristique neque venenatis lacus.', 'Aidan Baldwin','PHA65ZIT2OC'),('Colin','Hinton','14/04/1978','imperdiet.dictum@pharetrafelis.net','ac, feugiat non, lobortis'
        , 'Igor Hoffman','MNN70BSR1LD'),('Lee','Kelley','24/12/1983','Morbi@lacuspede.com'
        , 
         
         'Donec luctus aliquet odio. Etiam ligula tortor, dictum'
        , 'Nigel Lynn','NRG94FBT7IU'),('Wallace','Daniels','26/09/1964','tempor.bibendum@sociisnatoque.net'
        , 
         
         
         'egestas lacinia. Sed congue, elit sed consequat auctor, nunc nulla'
        , 'Zeus Chase','ZAN52QHM2BU'),('Nash','Dennis','28/03/1986','a.felis.ullamcorper@musProin.edu'
        , 'tellus faucibus leo, in lobortis tellus justo sit'
        , 'Shad Acevedo','EKQ41EEW3JT'),
('Joel','Holt','17/11/1963','metus@gravida.ca','ipsum'
        , 'Joel Collier','VMQ62WLX2SE'),('Cody','Rowland','01/12/1937','pharetra.nibh@diam.com','Cras'
        , 'Chester Paul','JSR24HMA0CN'),('Dylan','Marsh','13/05/1947','est.arcu.ac@sagittis.edu'
        , 
         'dictum eu, eleifend nec,'
        , 'Darius Calhoun','ROU66WMR1VY'),('Bradley','Boyd','24/09/1948','Donec@fermentumconvallis.com'
        , 'nisi. Cum sociis natoque'
        , 'Kadeem Vazquez','OAY40PJT0GE'),('Erich','Luna','07/02/1973','Integer.id@nibh.co.uk'
        , 
         
        'Quisque tincidunt pede ac', 'Elvis Jarvis','PRC16WST1DY'),('Jared','Gallagher','14/04/1944','elementum@Integersemelit.net'
        , 
         
        'nunc interdum feugiat. Sed nec', 'Phelan Henderson','GGH40EQN0OX'),('Jasper','Keller','14/01/1959','quis.turpis.vitae@purus.edu'
        , 
         
         
         'dapibus gravida. Aliquam tincidunt, nunc ac mattis ornare, lectus ante'
        , 'Rogan Baldwin','MEK05VHJ8BG'),('Buckminster','Berg','11/09/1979','mauris.a.nunc@magnisdis.co.uk'
        , 
        'quis turpis', 'Jerry Pollard','WGH32ACH5RA'),('Nolan','Brewer','20/02/1989','orci.luctus.et@nonquam.edu'
        , 
         
         'eu erat semper rutrum. Fusce dolor quam, elementum at,'
        , 'Vaughan Atkins','ISN27WAE6FU'),('Magee','Waters','08/10/1966','mauris.ipsum.porta@felisadipiscingfringilla.ca'
        , 'sapien. Cras dolor dolor,'
        , 'Harrison Cleveland','CGV61GBL7QG'),
('Clayton','William','18/10/1937','scelerisque.mollis@DonecfringillaDonec.org'
        , 
         
         'dictum. Phasellus in felis. Nulla tempor augue ac ipsum.'
        , 'Lawrence Alvarado','RIT39KWQ8LD'),('Bradley','Richmond','17/01/1984','ultrices@magna.org'
        , 
         
         'Quisque imperdiet, erat nonummy ultricies ornare, elit elit'
        , 'Lyle Dodson','XVA68ULB0HI'),('Declan','Kennedy','30/11/1948','amet.faucibus.ut@semNulla.ca'
        , 'Nullam ut nisi'
        , 'Beck Orr','VRP78BJP0SS'),('Yasir','Pennington','25/09/1987','lobortis.nisi.nibh@Phasellusvitaemauris.co.uk'
        , 'Maecenas mi felis,'
        , 'Michael Kelley','TZX44YOI3GS'),('Guy','Mcgee','28/09/1994','venenatis@placeratvelit.co.uk'
        , 'elit fermentum risus, at fringilla purus'
        , 'Theodore Barrett','HLV12JUR1BR'),('Alec','Griffith','09/02/1960','at.pede@velarcuCurabitur.co.uk'
        , 
        'Suspendisse tristique', 'Chaim Hooper','AED88LDA7HA'),('Ryan','Peters','30/04/1958','ut.erat.Sed@ametrisusDonec.net','non'
        , 'Uriel Michael','MNV47SJU4CJ'),('Rudyard','Mcdaniel','16/10/1962','amet.ornare.lectus@non.edu'
        , 
         
         
        'eget tincidunt dui augue eu tellus.', 'Dale William','SCZ63XRA1YN'),('Aaron','Waller','10/09/1952','nec.tellus.Nunc@massaSuspendisseeleifend.com'
        , 
         
         
         'Donec sollicitudin adipiscing ligula. Aenean gravida nunc sed pede.'
        , 'Nathan Chaney','YTC67KUU0ZT'),('Austin','Vaughan','09/10/1977','enim@Intinciduntcongue.edu'
        , 
         'euismod et, commodo at, libero. Morbi accumsan laoreet ipsum. Curabitur'
        , 'Sebastian Good','BKQ85TCG4PP'),
('Stephen','Dickson','01/08/1984','metus.In.lorem@sociis.co.uk','aliquam'
        , 'Wylie Singleton','XFH89JZR7RB'),('Allen','Barton','01/04/1951','faucibus@Vestibulum.org'
        , 
         
        'egestas. Aliquam nec enim. Nunc ut', 'Macaulay Mejia','LDJ11KNL4LO'),('Reed','Dawson','07/07/1984','amet@purusMaecenaslibero.edu','felis, adipiscing fringilla, porttitor vulputate, posuere vulputate, lacus. Cras'
        , 'August Salinas','FJN57LRA3WC'),('Fuller','Keith','24/05/1943','torquent.per@esttemporbibendum.edu','montes, nascetur ridiculus'
        , 'Hunter Anthony','LUY00PDA3CK'),('Fritz','Alford','18/01/1936','semper.pretium@eueleifend.edu'
        , 
         
         
        'orci quis lectus. Nullam suscipit,', 'David Oneil','BQV00UMA9RG'),('Daquan','Hopper','27/04/1982','Nam.porttitor.scelerisque@nulla.com'
        , 
         
         'sodales. Mauris blandit enim consequat purus. Maecenas libero est, congue'
        , 'Harding Talley','GPK73CZU1FT'),('Alec','Bird','02/02/1994','Curae@nonegestasa.com'
        , 
         
         
        'tempor lorem, eget mollis lectus', 'Baxter Gallagher','QNS91LUW4SE'),('Axel','Burns','08/04/1958','eget.massa@ipsumsodales.co.uk'
        , 
         
         'eu augue porttitor interdum. Sed auctor odio'
        , 'Drew Greene','RHK72WYU2VA'),('Scott','Edwards','22/07/1970','Duis@nequepellentesquemassa.co.uk'
        , 'rhoncus. Proin nisl sem, consequat nec, mollis vitae, posuere at,'
        , 'Ulysses Cohen','JVL00DME0MZ'),('Warren','Mcpherson','14/10/1992','viverra.Maecenas@elitafeugiat.ca','non, sollicitudin a, malesuada'
        , 'Scott Phelps','WFU01FJQ1IU'),
('Jasper','Foley','02/02/1982','facilisis@tinciduntvehicula.edu'
        , 
         
         
         
        'Aliquam vulputate ullamcorper magna. Sed eu eros. Nam consequat', 'Holmes Barrera','OWF23NEV8XG'),('Brady','Carey','03/05/1995','et.magna.Praesent@pulvinar.org'
        , 
         'sed sem egestas blandit. Nam'
        , 'Tobias Cabrera','VDD32IPU4IL'),('Vladimir','Simpson','19/07/1989','dictum@interdumSedauctor.com'
        , 'lacus. Quisque purus sapien,'
        , 'Wesley Thompson','URL57RGR4AG'),('Nero','Park','16/10/1973','In@ullamcorpermagnaSed.co.uk'
        , 
         'semper rutrum. Fusce dolor quam, elementum at,'
        , 'Merrill Reeves','GDV33HIA9KE'),('Reuben','Kent','12/12/1981','mauris.ut.mi@faucibus.org'
        , 'urna convallis erat, eget tincidunt dui augue'
        , 'Keith Peck','CQF94WYB2GO'),('Allistair','Rojas','24/04/1954','dolor.sit@vitaemaurissit.ca'
        , 
         'ac libero nec ligula consectetuer'
        , 'Keith Daniel','FJR75AUN6ZN'),('Isaac','Randolph','12/03/1938','natoque@sollicitudinorcisem.net','a,'
        , 'Justin Wells','IYQ08CQZ1PV'),('Norman','Stewart','15/08/1987','congue.elit@sedfacilisisvitae.net'
        , 
         'sed orci lobortis augue scelerisque'
        , 'Aaron Crawford','WAO99IPV5XH'),('Cruz','Poole','23/11/1994','dignissim.lacus.Aliquam@sagittisNullamvitae.co.uk','pede, nonummy ut,'
        , 'Holmes Mccullough','XBW22WOT5EX'),('Demetrius','Cox','21/08/1940','fermentum.fermentum@loremac.ca'
        , 
         'scelerisque mollis. Phasellus libero mauris, aliquam eu, accumsan sed, facilisis'
        , 'Castor Rodriguez','AAA25WAT3FF'),
('Patrick','Stone','27/09/1958','scelerisque.sed.sapien@vel.org','condimentum'
        , 'Hector Gonzales','SUY86NWY2JW'),('Jerome','Webster','08/05/1996','arcu.Sed@neceuismod.edu'
        , 
         'semper rutrum. Fusce dolor quam, elementum at, egestas'
        , 'Jerry Perkins','UFH32NES9WB'),('Jermaine','Salinas','21/06/1978','ac.risus.Morbi@dolorFusce.ca'
        , 
         
         
         'et nunc. Quisque ornare tortor at risus. Nunc ac sem'
        , 'Honorato Dixon','EQV62XUS1FZ'),('Shad','Serrano','29/09/1966','lobortis.Class@cursusinhendrerit.net'
        , 'lectus convallis est, vitae sodales nisi magna sed'
        , 'Ethan Mason','CUF63YGE9XM'),('Camden','Long','10/10/1969','ut@arcuAliquam.com'
        , 
         'velit eu sem. Pellentesque ut ipsum'
        , 'Hilel Morgan','ZGE61JJS0YS'),('Hasad','Frost','09/03/1977','luctus.lobortis.Class@elementum.com','luctus'
        , 'Marsden Merrill','ABP67JUO6YF'),('Geoffrey','Colon','22/05/1997','non.lacinia@musProin.net'
        , 'at pretium aliquet, metus urna convallis erat,'
        , 'Rudyard Monroe','CHC44PLY3TC'),('Cade','Castro','13/10/1973','libero.at@sedfacilisisvitae.ca'
        , 
         'molestie in, tempus eu, ligula. Aenean euismod mauris'
        , 'Dillon Chambers','USX77OOI6ZV'),('Fritz','Kaufman','11/03/1936','sem@id.edu'
        , 
         'consequat purus. Maecenas libero est,'
        , 'Kibo Cabrera','SEO60ZOK9DO'),('Hashim','Tate','30/04/1955','sit.amet@cursus.com'
        , 'elit erat vitae'
        , 'Leo Bailey','UQJ30PJZ0FS'
        ),


///////////////////////////payment
INSERT INTO Payment([typePayment],[datePayment],[validationPayment
        ]) VALUES("CB", "25/01/2017", "true")
        ,
("Cheque", "01/02/2017", "false"),
("Cheque culture", "03/02/2017", "true"),
("CB", "06/03/2017", "true"),
("Cheque", "05/06/2017", "false"),
("Cheque culture", "11/09/2017", "true"),
("CB", "25/01/2017", "true"),
("Cheque", "01/02/2017", "false"),
("Cheque culture", "01/02/2017", "true"),
("CB", "25/01/2017", "true"),
("Cheque", "01/02/2017", "false"),
("Cheque culture", "01/02/2017", "true"),
("CB", "25/01/2017", "true"),
("Cheque", "01/02/2017", "false"),
("Cheque culture", "01/02/2017", "true"),
("CB", "25/01/2017", "true"),
("Cheque", "01/02/2017", "false"),
("Cheque culture", "01/02/2017", "true"),



        ///////////////////////////////////////////categorie
        Category c1 = new Category("A");
        Category c2 = new Category("B");
        Category c3 = new Category("C");
        Category c4 = new Category("D");
        Category c5 = new Category("Premier Balcon");
        Category c6 = new Category("Deuxième Balcon");
        Category c7 = new Category("Fosse");
        Category c8 = new Category("Corbeille");
        Category c9 = new Category("Orchestre");

        /////////////////////////////////////////////seat
        INSERT INTO Seat([numberSeat]
        ) VALUES("1")
        ,
("2"),
("3"),
("4"),
("5"),
("6"),
("7"),
("8"),
("9"),
("10"),
("11"),
("12"),
("13"),
("14"),
("15"),
("16"),
("17"),
("18"),
("19"),
("20"),
("21"),
("22"),
("23"),
("24"),
("25"),
("26"),
("27"),
("28"),
("29"),
("30"),
("31"),
("32"),
("33"),
("34"),
("35"),
("36"),
("37"),
("38"),
("39"),
("40"),
("41"),
("42"),
("43"),
("44"),
("45"),
("46"),
("47"),
("48"),
("49"),
       
     ////////////////////////////////////////////////creation  
       e1.getRepresentationsev().add(R1);
        e1.getRepresentationsev().add(R2);
        e1.getRepresentationsev().add(R3);
        e1.getRepresentationsev().add(R4);

        e1.getArtists().add(a3);
        e2.getArtists().add(a2);
        e3.getArtists().add(a1);

        e3.setSection(s3);
        e2.setSection(s2);
        e1.setSection(s1);

        e3.setName("rambo");
        e2.setName("miserable");
        e1.setName("coupeeurope");

        em.persist(e1);
        em.persist(e2);
        em.persist(e3);

    }
}
