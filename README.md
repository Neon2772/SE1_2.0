## Übung 1 Fragen

    Was ist der Vorteil einer separaten Test-Klasse?
    Eine separate Test-Klasse trennt Testcode vom eigentlichen Produktivcode.
    Dadurch bleibt der Programmcode übersichtlich und die Tests können unabhängig vom Programm entwickelt und ausgeführt werden.
    Außerdem können mehrere Tests für eine Klasse gesammelt und strukturiert verwaltet werden.

    Was ist bei einem Blackbox-Test der Sinn von Äquivalenzklassen?
    Äquivalenzklassen teilen die möglichen Eingabewerte in Gruppen ein, bei denen man erwartet, dass sie sich gleich verhalten.
    Dadurch muss man nicht jeden möglichen Wert testen, sondern kann repräsentative Werte aus jeder Klasse auswählen und
    mit wenigen Tests trotzdem eine gute Abdeckung erreichen.

    Warum ist ein Blackbox-Test mit JUnit auf der Klasse Client nicht unmittelbar durchführbar?
    Weil ein Blackbox-Test nur die öffentliche Schnittstelle bzw. das beobachtbare Verhalten der Klasse testen soll.
    Wenn Client beispielsweise von anderen Klassen, Objekten oder einer bestimmten Umgebung abhängig ist,
    kann man sie nicht einfach isoliert mit JUnit testen. Diese Abhängigkeiten müssen zunächst bereitgestellt
    bzw. simuliert werden.
