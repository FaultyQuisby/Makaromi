<html>
<body>
tous les évènements d'une section donnée

String nameSection = "Musique";
        String req1 = "select s.events from Section s "
                + "where s.nameSection = :paramName";
        Query qr1 = em.createQuery(req1);
        qr1.setParameter("paramName", nameSection);
        List<Events> listEvents = qr1.getResultList();
        for(Event e : listEvents){
            System.out.println(e);
        }
        

tous les évènements d'une date donnée

tous les évènements d'un artiste donné

tous les évènements d'un lieu donné

tous les évènements d'une ville donnée

tous les artistes d'un évènements

tous les lieux d'une ville donnée

toutes les représentations d'un évènement

toutes les représentations d'un mois donné?'

toutes les places disponibles d'une représentation

toutes les places disponibles d'une catégorie

tous les pricing disponibles pour une place donnée

affichage d'un évènement et de ses artistes, ses representations et ses/son lieu

affichage des artistes et de leurs evenements

affichage des lieux avec leurs adresses

affichage des sieges avec leur evenement, les artistes, le lieu, l adresse, leur categorie

affichage de ticket avec leur evenement, les artistes, le lieu, l adresse, leur categorie + pricing


</body>
</html>