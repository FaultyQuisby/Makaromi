<html>
<body>
tous les �v�nements d'une section donn�e

String nameSection = "Musique";
        String req1 = "select s.events from Section s "
                + "where s.nameSection = :paramName";
        Query qr1 = em.createQuery(req1);
        qr1.setParameter("paramName", nameSection);
        List<Events> listEvents = qr1.getResultList();
        for(Event e : listEvents){
            System.out.println(e);
        }
        

tous les �v�nements d'une date donn�e

tous les �v�nements d'un artiste donn�

tous les �v�nements d'un lieu donn�

tous les �v�nements d'une ville donn�e

tous les artistes d'un �v�nements

tous les lieux d'une ville donn�e

toutes les repr�sentations d'un �v�nement

toutes les repr�sentations d'un mois donn�?'

toutes les places disponibles d'une repr�sentation

toutes les places disponibles d'une cat�gorie

tous les pricing disponibles pour une place donn�e

affichage d'un �v�nement et de ses artistes, ses representations et ses/son lieu

affichage des artistes et de leurs evenements

affichage des lieux avec leurs adresses

affichage des sieges avec leur evenement, les artistes, le lieu, l adresse, leur categorie

affichage de ticket avec leur evenement, les artistes, le lieu, l adresse, leur categorie + pricing


</body>
</html>