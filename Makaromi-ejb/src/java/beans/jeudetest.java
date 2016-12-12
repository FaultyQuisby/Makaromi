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
   public void createbd(){
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
       Artist a12 = new Artist("Beyonce","Knowles Carter", ""),
       Artist a13 = new Artist(("Sting", "","");
      ///////////////////////////////////////////evenement
        Event e1 = new Event("Concert Retour des Rolling Stones", "http://www.gottahaverockandroll.com/ItemImages/000011/sep2013-340_lg.jpeg", 15/01/2017, 15/02/2017, "Un retour fracassant des rois du rock n roll. Les années passent mais le son reste parfait", "un évènement à ne pas manquer");
        Event e2 = new Event("Concert parisien des Red Hot Chili Peppers", "http://concertposter.org/2012-June/RHCP-Paris2011-drop.jpg", 26/12/2016, 14/01/2017, "Un groupe de légende, un concert d'exception", "un évènement inoubliable");
        Event e3 = new Event("Tournée française de The Chainsmokers", "http://www.clubglow.com/blog/wp-content/uploads/2015/08/103115-476ECHO-chainsmokersfzt1-400x276.png", 25/02/2017, 01/04/2017, "Concert", "Une énergie incroyable");
        Event e4 = new Event("Tournée exceptionnelle de Beyonce", "http://i1.cdnds.net/13/50/618x800/music-beyonce-mrs-carter-world-tour-2014-poster.jpg", 25/03/2017, 01/05/2017, "Tournée de concerts de la seule, l'unique QUEEN B", "Beyonce en forme olympique");
        Event e5 = new Event("Concert unique de Sting", "http://tout-metz.com/wp-content/uploads/2012/08/sting_affiche2.jpg", 01/06/2017, 01/07/2017, "Sting incroyable", "Le grand Sting en concert avec plein de duo et trio surprises");
        Event e6 = new Event("Finale Rugby TOP 14", "http://www.francebillet.com/static/0/visuel/600/348/FINALE-RUGBY-TOP-14_3484231325263405917.jpg?1479454061000", 02/01/2017, 02/01/2017, "C ?est LE match de la saison, celui que toutes les équipes de TOP 14 rêvent de jouer pour espérer soulever le Bouclier de Brennus?Après 26 journées de combat, des barrages, des demi-finales, qui succèdera au Racing 92 de Dan Carter et sera sacré Champion de France 2017 le 4 juin prochain ? La finale du TOP 14 fait son grand retour au Stade de France à l?occasion du week-end de Pentecôte : ne manquez pas l?événement !", "Une finale qui promet d'être inoubliable");
        Event e7 = new Event("Handball PARIS 2017, 25 eme championnat du monde masculin", "http://www.francebillet.com/static/0/visuel/600/346/CHAMPIONNAT-DU-MONDE-DE-HAND_3468345825731877348.jpg?1477573054000", 03/02/2017, 18/02/2017, "Après 1970 et 2001 (pour les hommes) et 2007 (pour les femmes), la France organise pour la quatrième fois le Championnat du Monde. Elle ne pouvait rêver d'un meilleur calendrier au relais d?un cinquième titre planétaire, record toutes catégories, obtenu il y a à peine quelques mois au Qatar.", "Regardez l'histoire s'écrire sous vos yeux");
        Event e8 = new Event("Finale coupe de la ligue", "http://www.francebillet.com/static/0/visuel/600/347/FINALE-COUPE-DE-LA-LIGUE-2017_3476961719077401827.jpg?1478605101000", 03/03/2017, 03/03/2017, "A lyon une tribune sera réservée au familles et comprendra une offre de restauration, l'organisation d'une multitude d'animations, des services dédiés et de nombreuses surprises !", " ");
        Event e9 = new Event("Mondial de hockey 2017", "http://www.francebillet.com/static/0/visuel/grand/348/MONDIAL-HOCKEY-2017_3489202436012305251.jpg?1479996593000", 15/02/2017, 30/02/2017, "La Finlande et la Biélorussie ouvriront les festivités à Paris, juste avant la rencontre de la soirée qui opposera les champions du monde en titre, le Canada, à la République Tchèque. L'équipe de France viendra clôturer la 2ème journée de rencontres avec son premier match contre la Norvège dans un remake du match du dernier Tournoi de Qualification Olympique. ", " ");
        Event e10 = new Event("Hergé", "http://www.francebillet.com/static/0/visuel/600/340/HERGE--2016-2017_3400616965982293754.jpg?1469697808000", 01/01/2017, 15/01/2017, "On ne présente plus la carrière de Georges Remi, dit Hergé, auteur belge de bande dessinée principalement connu pour Les Aventures de Tintin. Souvent considéré comme « le père de la bande dessinée européenne », il est l?un des premiers auteurs francophones à reprendre le style américain de la bande dessinée à bulles. ", " ");
        Event e11 = new Event("Rembrandt intime", "http://www.francebillet.com/static/0/visuel/300/338/REMBRANDT-INTIME_3384978728407846685.jpg?1467807653000", 26/12/2016, 28/01/2017, "L'exposition est conçue autour des trois chefs-d??uvre du Musée Jacquemart-André : les Pèlerins d?Emmaüs (1629), le Portrait de la princesse Amalia von Solms (1632), et le Portrait du Docteur Arnold Tholinx (1656). ", " ");
        Event e12 = new Event("Bouchardon (1698-1762)Une idée du beau", "http://www.francebillet.com/static/0/visuel/600/341/LOUVRE_3415892777709555559.jpg?1471532134000", 25/03/2017, 01/04/2017, "Edme Bouchardon fut considéré de son temps comme un artiste d?exception. Présentant près de 270 oeuvres et organisée avec le Getty Museum à Los Angeles, cette exposition sera la première monographie d?envergure réalisée autour de son oeuvre et l'occasion de souligner qu'il fut l'un des principaux protagonistes du néoclassicisme.", "une exposition du musée du Louvres");
        Event e13 = new Event("MAGRITTE LA TRAHISON DES IMAGES", "http://www.francebillet.com/static/0/visuel/600/341/MAGRITTE---CENTRE-POMPIDOU_3417696887323044936.jpg?1471871647000", 25/09/2016, 31/08/2017, "Exposition «Magritte, La trahison des images» pose un nouveau regard sur l'oeuvre, le rapport à l?image et à la peinture de l?artiste belge René Magritte", "Magritte au centre pompidou !");
        Event e14 = new Event("Norman sur scène" ,"http://www.francebillet.com/static/0/visuel/600/334/NORMAN-AU-ZENITH_3342081312054718028.jpg?1462952162000", 15/09/2016, 15/02/2017, "Norman, de « Norman fait des vidéos », arrive enfin sur scène avec son tout premier one-man show. Cette nouvelle aventure scénique est une suite logique pour ce pionner du « web man show » qui a déjà réussi en quelques années à réunir plusieurs millions de fans, en postant des vidéos qu?il filme lui-même depuis sa chambre. ", "un évènement à ne pas manquer");
        Event e15 = new Event("Romeo et Juliette", "http://www.francebillet.com/static/0/visuel/grand/230/WILLIAM-SHAKESPEARE_2309502666313431296.jpg?1342617736000", 26/12/2016, 14/01/2017, "Pièce légendaire du répertoire, Roméo et Juliette est devenue, au fil du temps et des multiples adaptations dont elle a été l?objet, l?incarnation de l?histoire d?amour absolue. Or sous les couches de sédiments accumulés se cache un soleil noir fait de déliquescence politique, de haines familiales, de personnages complexes et insulaires, bien éloigné de la lecture romantique dans laquelle on l'a cantonnée.", " ");
        Event e16 = new Event("Les femmes savantes", "http://www.francebillet.com/static/0/visuel/600/329/SAVANTES_3295969886362179914.jpg?1457444342000", 25/02/2017, 01/04/2017, "Une comédie de moeurs jubilatoire au coeur d'une famille bourgeoise menée par trois femmes savantes, excessives et fiévreuses, repoussant les limites de la raison, entraînent toute la maisonnée dans le vertige de leur orgueil, mais, malgré leurs débordements, leurs ridicules, et leurs folies, infiniment attendrissantes. Catherine Hiegel réunit une distribution prestigieuse, 30 ans après l'avoir mis en scène avec la Comédie Française, au Théâtre de la Porte Saint-Martin et apporte un regard neuf sur ce grand classique du répertoire.", "Une énergie incroyable");
        Event e17 = new Event("Richard III", "http://www.francebillet.com/static/0/visuel/600/347/RICHARD-III-JPG_3476596840506551705.jpg?1478507639000", 25/03/2017, 01/05/2017, "A leur naissance, des personnages comme Richard III semblent être de même constitution que nous. Aussi chaque mot que le tyran prononce sur le plateau peut-il trouver son accord avec les sentiments du public, en éveillant les pulsions inavouées de chacun.", " ");
        Event e18 = new Event("Madame Bovary", "http://www.francebillet.com/static/0/visuel/600/344/MADAME-BOVARY_3449184254722259952.jpg?1475425174000", 01/06/2017, 01/07/2017, "Une pièce qui donne chair à la sensibilité, l'ironie et la force poétique de l'écriture de Flaubert, qui nous parle de nous, hommes et femmes d'aujourd'hui. Sur scène quatre chaises, à portée de main quelques instruments. Ce pourrait être la place d'un village, un coin de campagne ou la dernière table d'un banquet de noces sous les arbres au fond du verger.", " ");
        Event e19 = new Event("Disneyland Paris", "http://www.francebillet.com/static/0/visuel/600/347/DISNEY-1J-2P-NOEL_3476596840507927667.jpg?1478534053000", 01/12/2016, 15/02/2017, "Les flocons de neige scintillent sur le Parc Disneyland®... Vous ne rêvez pas, c?est enfin déjà Noël à Disneyland® Paris ! Plus besoin d?attendre pour célébrer Noël, dès le 11 novembre 2016, laissez-vous émerveiller par notre sapin et nos illuminations féériques pour des souvenirs gravés à jamais. Vivez des fêtes de fin d?année enchantées jusqu?au 8 janvier 2017, avec le spectacle nocturne Disney Dreams® ! fête Noël et La Parade de Noël Disney qui vous réservent de fantastiques surprises.", "une expérience magique pour les petits comme pour les grands");
        Event e20 = new Event("Asterix", "http://www.francebillet.com/static/0/visuel/600/345/PARC-ASTERIX_3451025524347854774.jpg?1475560893000", 26/12/2016, 14/01/2017, "Rire, bonne humeur, partage en famille et entre amis, en 2017, venez vivre des expériences sensationnelles au Parc Astérix.", " ");
        Event e21 = new Event("Zoo Parc de Beauval", "http://www.francebillet.com/static/0/visuel/600/324/ZOOPARC-DE-BEAUVAL_3242548485784297073.jpg?1451253799000", 25/02/2017, 01/04/2017, "A seulement 600 m du ZooParc de Beauval, le nouvel hôtel*** Les Pagodes de Beauval propose 128 chambres, un restaurant, ainsi qu'une piscine-lagon extérieure et des meubles et éléments de décoration authentiquement chinois. Avec l'hôtel Les Jardins de Beauval et la résidence hôtelière Les Hameaux de Beauval, ce complexe offre désormais une capacité totale de 240 chambres et 16 appartements, ainsi que de vastes espaces dédiés au tourisme d?affaires, l'ensemble garantissant un dépaysement total.", " ");
        Event e22 = new Event("Musillac 2017", "http://www.francebillet.com/static/0/visuel/600/349/MUSILAC-2017_3492493875611862296.jpg?1480351243000", 07/07/2017, 10/07/2017, "Cette année, le festival pop-rock n°1 de la région Rhône-Alpes fête ses 15 ans...et durera 4 Jours, du 13 au 16 juillet 2017.", " ");
        Event e23 = new Event("We love Green", "http://cdn-images.deezer.com/images/cover/586a3b7a7555cfaefd6577931e1a2f78/500x500.jpg", 26/05/2017, 28/05/2017, " ", " "),
        Event e24 = new Event("Solidays", "http://media.melty.fr/affiche-des-solidays-2009-image-235151-article-ajust_930.jpg", 25/08/2017, 28/08/2017, " ", " ");
         ///////////////////////////////////////////////venue
       Venue v1 = new Venue("odeon");
       Venue v2 = new Venue("velodrom");
       Venue v3 = new Venue("grandrex");
       
     ///////////////////////////////////////////representation
       Representation R1= new Representation(v1);
       Representation R2= new Representation(v2);
       Representation R3= new Representation(v3);
       Representation R4= new Representation(v1);
      
       
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
